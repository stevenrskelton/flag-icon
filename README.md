&lt;flag-icon&gt;
===========

Polymer Web Component for geographic country flag icons.

![Canada](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/ca.png "Canada")
![Korea](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/kr.png "Korea")
![Germany](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/de.png "Germany")
![Australia](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/au.png "Australia")
![France](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/fr.png "France")
![European Union](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/europeanunion.png "European Union")
![Angola](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/ao.png "Angola")
![Belgium](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/be.png "Belgium")
![Austria](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/at.png "Austria")
![Mozambique](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/mz.png "Mozambique")
![Norway](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/no.png "Norway")
![Philippines](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/ph.png "Philippines")
![Spain](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/es.png "Spain")
![United Kingdom](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/gb.png "United Kingdom")
![India](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/in.png "India")
![Costa Rica](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/cr.png "Costa Rica")
![South Africa](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/za.png "South Africa")
![Thailand](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/th.png "Thailand")
![Sri Lanka](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/lk.png "Sri Lanka")
![Sweden](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/se.png "Sweden")
![Slovenia](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/si.png "Slovenia")
![Papua New Guinea](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/pg.png "Papua New Guinea")
![Maldives](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/mv.png "Maldives")
![United States](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/us.png "India")
![Japan](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/jp.png "Japan")
![Ireland](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/ie.png "Ireland")
![Bermuda](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/bm.png "Bermuda")
![Italy](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/it.png "Italy")
![Brazil](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/br.png "Brazil")
![Iceland](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/country-4x3/is.png "Iceland")

Currently includes both 16x11 images, and larger SVG renders.
* Images come from [famfamfam](http://www.famfamfam.com/lab/icons/flags/) icon library, or generated from SVG.
* SVGs come from [Wikimedia Commons](http://commons.wikimedia.org/wiki/Category:SVG_sovereign_state_flags).
* [ISO 3166-1 Country Code](http://en.wikipedia.org/wiki/ISO_3166-1) list is available on Wikipedia.

Maintained by [Steven Skelton](https://github.com/stevenrskelton)

> [Live Demo - World Country Flags](http://files.stevenskelton.ca/flag-icon/examples/countries.html)

> [Live Demo - US State Flags](http://files.stevenskelton.ca/flag-icon/examples/us-states.html)

> [Live Demo - Canada Province and Territory Flags](http://files.stevenskelton.ca/flag-icon/examples/canada-provinces.html)

## Usage

1. Add the library using the Javascript package manager [Bower](http://bower.io/):

	```bower install --save flag-icon```

2. Import Web Components' polyfill:

	```html
	<script src="bower_components/platform/platform.js"></script>
	```

3. Import Custom Element:

	```html
	<link rel="import" href="bower_components/flag-icon/flag-icon.html">
	```

4. Start using it!

	```html
	<flag-icon key="ca"></flag-icon>
	<flag-icon key="can"></flag-icon>
	<flag-icon key="canada"></flag-icon>
	<flag-icon key="124"></flag-icon>
	<!-- specify to use SVGs -->
	<flag-icon key="ca" svg></flag-icon>
	<!-- specify a specific size -->
	<flag-icon key="ca" svg width="100px"></flag-icon>
	```

Or use it unrendered in scripts:

	```JavaScript
	var f = new FlagIcon();

	//get country info
	f.findCountry('canada')
	//returns { name: 'Canada', alpha2: 'CA', alpha3: 'CAN', numeric: 124 }

	//convert between 2 -> 3 letter character codes
	f.findCountry('ca').alpha3
	//returns 'CAN'

	//get full names of states or provinces
	f.findUSState('ca')
	//returns { name: 'California', iso: 'US-CA', alpha2: 'CA', numeric: 6, gpo: 'Calif.' }

	f.findCanadianProvince('ON')
	//returns { name: 'Ontario', alpha2: 'ON' }
	```

## Options

Attribute			| Type			| Default		| Description
---					| ---			| ---			| ---
`key`				| *string*		| `null`		| Proper, common, ISO 3166-1 alpha-2, alpha-3, or numeric country code
`svg`				| *attribute*	| `false`		| Use larger filesize SVG files instead of PNGs
`width`				| *string*		| `16px`		| Width of icon (aspect ratio is maintained)
`usstate`			| *boolean*		| `false`		| US State flags
`canada`			| *boolean*		| `false`		| Canadian Province and Territory flags

## Todo
- state, provinces, and other types of flags
- create iconset single image to save multiple requests
- maybe: different image resolutions
- maybe: squared flags

## Bugs
- No images of US State, Canadian Province flags (only SVG)
- some PNG flags are missing, or out of date
- some GIFs are smaller than PNGs

## History

For detailed changelog, check [Releases](https://github.com/stevenrskelton/flag-icon/releases).

## License

[MIT License](http://opensource.org/licenses/MIT) © Steven Skelton