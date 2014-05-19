&lt;flag-icon&gt;
===========

Polymer Web Component for geographic country flag icons.

![Canada](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/ca.png "Canada")![Korea](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/kr.png "Korea")![Germany](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/de.png "Germany")![Australia](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/au.png "Australia")![France](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/fr.png "France")![European Union](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/europeanunion.png "European Union")

Currently includes both 16x11 images, and larger SVG renders.
* Images come from [famfamfam](http://www.famfamfam.com/lab/icons/flags/) icon library, or generated from SVG.
* SVGs come from [koppi/iso-country-flags-svg-collection](https://github.com/koppi/iso-country-flags-svg-collection), or Wikipedia.
* ISO 3166-1 Country code list is available on [Wikipedia](http://en.wikipedia.org/wiki/ISO_3166-1).

Maintained by [Steven Skelton](https://github.com/stevenrskelton)

> [Live Demo](http://files.stevenskelton.ca/flag-icon/examples/index.html)

## Usage

1. Import Web Components' polyfill:

	```html
	<script src="//cdnjs.cloudflare.com/ajax/libs/polymer/0.2.4/platform.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/polymer/0.2.4/polymer.js"></script>
	```

2. Import Custom Element:

	```html
	<link rel="import" href="src/flag-icon.html">
	```

3. Start using it!

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