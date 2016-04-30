&lt;flag-icon&gt;
===========

A collection of SVG flags, conveniently usable as a Polymer Web Component.

If you don't care about extra features, a simple CSS implementation of country flags can be found at https://github.com/lipis/flag-icon-css


Typical file sizes:

> **SVG** files: **2kb** to **75kb**

* Images come from [famfamfam](http://www.famfamfam.com/lab/icons/flags/) icon library, or generated from SVG.
* SVGs come from [Wikimedia Commons](http://commons.wikimedia.org/wiki/Category:SVG_sovereign_state_flags).
* [ISO 3166-1 Country Code](http://en.wikipedia.org/wiki/ISO_3166-1) list is available on Wikipedia.

## Demos

> [Live Demo - General Use](http://files.stevenskelton.ca/flag-icon/flag-icon/examples/index.html)

> [Live Demo - Themes and Popover](http://files.stevenskelton.ca/flag-icon/flag-icon/examples/themes.html)

## Usage

1. Add the library using the Javascript package manager [Bower](http://bower.io/):

	```bower install --save flag-icon```

2. Import Web Components' polyfill:

	```html
	<script src="bower_components/webcomponentsjs/webcomponents.min.js"></script>
	```

3. Import Custom Element:

	```html
	<link rel="import" href="bower_components/flag-icon/flag-icon.html">
	```

4. Start using it!

	```html
	<flag-icon key="ca"></flag-icon>
	<flag-icon key="canada"></flag-icon>
	<flag-icon key="124"></flag-icon>
	<!-- specify to use PNGs -->
	<flag-icon key="ca" img></flag-icon>
	<!-- specify a specific size -->
	<flag-icon key="ca" width="100"></flag-icon>

	<!-- Specify alt & title text,
	     otherwise it defaults to the official country name -->
	<flag-icon key="can">Flag of Canada</flag-icon>
	```

5. Or use it unrendered in scripts:

	```javascript
	var f = new FlagIcon();

	//get country info
	f.findCountry('canada')
	//> { name: 'Canada', alpha2: 'CA', alpha3: 'CAN', numeric: 124 }

	//convert between 2 -> 3 letter character codes
	f.findCountry('ca').alpha3
	//> 'CAN'

	//get full names of states or provinces
	f.findUSState('ca')
	//> { name: 'California', iso: 'US-CA', alpha2: 'CA', numeric: 6, gpo: 'Calif.' }

	f.findCanadianProvince('ON')
	//> { name: 'Ontario', alpha2: 'ON' }
	```

## Options

Attribute	| Type			| Default	| Description
---			| ---			| ---		| ---
`key`		| *string*		| `null`	| Proper, common, ISO 3166-1 alpha-2, alpha-3, or country code
`img`		| *attribute*	| `false`	| Use PNGs instead of larger filesize SVG
`width`		| *integer*		| `16`		| Width of icon (aspect ratio maintained if `height` omitted).
`height`	| *integer*		| _auto_	| Height of icon (aspect ratio maintained if `width` omitted).
`au`		| *boolean*		| `false`	| ![Australia](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/16/country-4x3/au.png "Australia") Australian State flags
`br`		| *boolean*		| `false`	| ![Brazil](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/16/country-4x3/br.png "Brazil") Brazilian State flags
`ca`		| *boolean*		| `false`	| ![Canada](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/16/country-4x3/ca.png "Canada") Canadian Province and Territory flags
`de`		| *boolean*		| `false`	| ![Germany](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/16/country-4x3/de.png "Germany") German State flags
`es`		| *boolean*		| `false`	| ![Spain](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/16/country-4x3/es.png "Spain") Spain Autonomous Community flags
`ru`		| *boolean*		| `false`	| ![Russia](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/16/country-4x3/ru.png "Russia") Russian Republics, Krais, and Oblast flags
`us`		| *boolean*		| `false`	| ![United States](https://raw.githubusercontent.com/stevenrskelton/flag-icon/master/png/16/country-4x3/us.png "United States") US State flags
`maritime`	| *boolean*		| `false`	| Maritime and ICS flags
`racing`	| *boolean*		| `false`	| NASCAR and IndyCar racing flags
`square`	| *boolean*		| `false`	| Use square version instead of 4:3 aspect (only valid for country flags)
`aspect`	| *float*		| 			| Override aspect ratio used to render the flag

## Aspect Ratios for Flags

Flags come in all different shapes and sizes, attempts were made to standardize to the following aspect ratios (width:height)

Attribute		| Aspect
---				| ---
Country			| 4:3
Austrialia		| 2:1
Brazil			| 3:2
Canada			| 2:1
Germany			| 5:3
Spain			| 3:2
US				| 3:2
Russia			| 3:2
NASCAR, IndyCar	| 4:3
Maritime		| 1:1

## Todo

- Loading notification, or default image.
- Compact/minify SVG files

## History

For detailed changelog, check [Releases](https://github.com/stevenrskelton/flag-icon/releases).

## License

[MIT License](http://opensource.org/licenses/MIT) © Steven Skelton
