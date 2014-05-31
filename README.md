&lt;flag-icon&gt;
===========

Polymer Web Component for geographic country flag icons.

![Canada](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/ca.png "Canada")
![Korea](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/kr.png "Korea")
![Germany](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/de.png "Germany")
![Australia](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/au.png "Australia")
![France](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/fr.png "France")
![European Union](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/europeanunion.png "European Union")
![Angola](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/ao.png "Angola")
![Belgium](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/be.png "Belgium")
![Austria](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/at.png "Austria")
![Mozambique](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/mz.png "Mozambique")
![Norway](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/no.png "Norway")
![Philippines](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/ph.png "Philippines")
![Spain](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/es.png "Spain")
![United Kingdom](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/gb.png "United Kingdom")
![India](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/in.png "India")
![Costa Rica](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/cr.png "Costa Rica")
![South Africa](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/za.png "South Africa")
![Thailand](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/th.png "Thailand")
![Sri Lanka](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/lk.png "Sri Lanka")
![Sweden](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/se.png "Sweden")
![Slovenia](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/si.png "Slovenia")
![Papua New Guinea](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/pg.png "Papua New Guinea")
![Maldives](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/mv.png "Maldives")
![United States](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/us.png "India")
![Japan](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/jp.png "Japan")
![Ireland](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/ie.png "Ireland")
![Bermuda](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/bm.png "Bermuda")
![Italy](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/it.png "Italy")
![Brazil](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/br.png "Brazil")
![Iceland](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/is.png "Iceland")

Currently includes both 16x11 images, and larger SVG renders.
* Images come from [famfamfam](http://www.famfamfam.com/lab/icons/flags/) icon library, or generated from SVG.
* SVGs come from [koppi/iso-country-flags-svg-collection](https://github.com/koppi/iso-country-flags-svg-collection), or Wikipedia.
* [ISO 3166-1 Country Code](http://en.wikipedia.org/wiki/ISO_3166-1) list is available on Wikipedia.

Maintained by [Steven Skelton](https://github.com/stevenrskelton)

> [Live Demo](http://files.stevenskelton.ca/flag-icon/examples/index.html)

## Usage

1. Add to your _bower.json_, then run ```bower update```

	```json
	"dependencies": {
		"flag-icon": "flag-icon#~0.2.0"
	}
	```

2. Import Web Components' polyfill:

	```html
	<script src="bower_components/platform/platform.js"></script>
	```

3. Import Custom Element:

	```html
	<link rel="import" href="src/flag-icon.html">
	```

4. Start using it!

	```html
	<flag-icon iso="ca"></flag-icon>
	<flag-icon iso="can"></flag-icon>
	<flag-icon iso="124"></flag-icon>
	<!-- specify to use SVGs -->
	<flag-icon iso="ca" svg></flag-icon>
	<!-- specify a specific size -->
	<flag-icon iso="ca" svg width="100px"></flag-icon>
	```

## Options

Attribute			| Type			| Default		| Description
---					| ---			| ---			| ---
`iso`				| *string*		| `null`		| ISO 3166-1 alpha-2, alpha-3, or numeric country code
`svg`				| *attribute*	| `false`		| Use larger filesize SVG files instead of PNGs
`width`				| *string*		| `16px`		| Width of icon (aspect ratio is maintained)

## Todo
- state, provinces, and other types of flags
- create iconset single image to save multiple requests
- maybe: different image resolutions
- maybe: squared flags

## Bugs
- some PNG flags are missing, or out of date
- fixed paths to images
- some GIFs are smaller than PNGs

## History

For detailed changelog, check [Releases](https://github.com/stevenrskelton/flag-icon/releases).

## License

[MIT License](http://opensource.org/licenses/MIT) © Steven Skelton