&lt;flag-icon&gt;
===========

Polymer Web Component for geographic country flag icons.

Currently shows 16x11 images, but later may include larger SVG renders.
Images come from [famfamfam](http://www.famfamfam.com/lab/icons/flags/) icon library.
ISO 3166-1 Country code list is available on [Wikipedia](http://en.wikipedia.org/wiki/ISO_3166-1).

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
	```

## Options

Attribute			| Type			| Default		| Description
---					| ---			| ---			| ---
`iso`				| *string*		| `null`		| ISO 3166-1 alpha-2, alpha-3, or numeric country code

## Todo
- different image resolutions
- create iconset single image to save multiple requests

## Bugs
- some missing flags

## History

For detailed changelog, check [Releases](https://github.com/stevenrskelton/flag-icon/releases).

## License

[MIT License](http://opensource.org/licenses/MIT) © Steven Skelton