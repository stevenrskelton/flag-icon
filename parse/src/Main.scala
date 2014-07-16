import scala.io.Source
import java.io.File
import org.jsoup.Jsoup
import org.jsoup.nodes.{ Element, Document }
import java.util.Iterator
import org.jsoup.nodes._
import scala.collection.JavaConversions._

object Main extends App {

  val file = Source.fromFile(new File("List of countries and dependencies and their capitals in native languages - Wikipedia, the free encyclopedia.htm"))
  val doc = Jsoup.parse(file.getLines.mkString("\n"));
  val trs = doc.getElementsByTag("tr")
  val data = trs.filter(_.childNodeSize == 11).filter(_.child(0).tag.toString != "th")
  for (d <- data) yield {
    val exonym = d.child(0)
    val endonyms = d.child(2)
    val langs = d.child(4)

    val names = parse1(endonyms)
    val filteredNames = names.distinct.map(_.trim).filterNot(_.isEmpty).filterNot(_ == exonym.text.trim)
    if (!filteredNames.isEmpty) {
      println("--------" + exonym.child(0).text + "-------- ")
      println(", endonym: [" + filteredNames.map(mapUnicode).map(escapseJs).map("'" + _ + "'").mkString(",") + "]")
    }
  }

  def escapseJs(s: String): String = s.replaceAllLiterally("'", "\\'")

  def parse1(endonyms: Element): Seq[String] = endonyms.children.size match {
    case 0 => Seq((endonyms.text))
    case 1 => Seq((endonyms.child(0).text))
    case _ => {
      endonyms.html.split("<br />").flatMap {
        w =>
          if (w.contains("<b>")) {
            val wdoc = Jsoup.parse(w)
            wdoc.getElementsByTag("b").map(_.text)
          } else Seq(w)
      }
        .flatMap {
          w =>
            if (w.contains(" / ")) {
              w.split(" / ")
            } else Seq(w)
        }
        .flatMap {
          w =>
            if (w.contains(" or ")) {
              w.split(" or ")
            } else Seq(w)
        }
        .flatMap {
          w =>
            if (w.contains(", ")) {
              w.split(", ")
            } else Seq(w)
        }
        .map {
          w => Jsoup.parse(w).text()
        }
        .flatMap {
          w =>
            if (w.contains(" (") && w.endsWith(")")) {
              val i = w.indexOf('(')
              Seq(w.substring(0, i - 1), w)
            } else Seq(w)
        }
    }
  }

  def mapUnicode(s: String): String = s.map {
    c =>
      {
        val l = c.toLong
        if (l > 122)
          "\\u" + c.toLong.toHexString.reverse.padTo(4, '0').reverse.toUpperCase
        else c.toString
      }
  }.mkString
  val text = "A©ééक्तु"

  //println(text)
  //println(mapUnicode(text))
}