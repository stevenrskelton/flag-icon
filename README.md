[![Published on webcomponents.org](https://img.shields.io/badge/webcomponents.org-published-blue.svg)](https://www.webcomponents.org/element/Protoss78/flag-icon)

flag-icon
===========
A fork of the original [stevenrskelton/flag-icon](https://github.com/stevenrskelton/flag-icon) web component.

A collection of SVG flags, conveniently usable as a Polymer Web Component.
If you don't care about extra features, a simple CSS implementation of country flags can be found at https://github.com/lipis/flag-icon-css

## Usage
<!---
```
<custom-element-demo>
  <template>
    <script src="../webcomponentsjs/webcomponents-lite.js"></script>
    <link rel="import" href="../polymer/polymer.html">
    <link rel="import" href="../iron-flex-layout/iron-flex-layout-classes.html">
    <link rel="import" href="../paper-card/paper-card.html">
    <link rel="import" href="../paper-styles/demo-pages.html">
    <link rel="import" href="../paper-input/paper-input.html">
    <link rel="import" href="flag-icon.html">
        
    <custom-style>
        <style is="custom-style" include="iron-flex">
            /* When no size is specified for flag-icon it won't display */

            flag-icon {
                min-width: 4em;
                min-height: 4em;
            }

            .bigFlag {
                height: 50vh;
                width: 50vw;
            }

            paper-input {
                width: 50%;
            }

            .card-actions {
                background-color: #dddddd;
            }
        </style>
    </custom-style>
    <next-code-block></next-code-block>
  </template>
</custom-element-demo>
```
-->
```html
<dom-bind id="app">
    <template id="t">
        <paper-card heading="Flag Icon Search Demo">
            <div class="card-content">
                <paper-input id="searchBox" label="Search a country" value="{{searchValue}}"></paper-input>
                <p>JSON Result:</p>
                <p id="output"></p>
            </div>
            <div class="card-actions">
                <flag-icon id="flagIcon" class="bigFlag" key="{{searchValue}}">Big Flag Sample</flag-icon>
            </div>
        </paper-card>
    </template>
</dom-bind>
<script>
    var t = document.querySelector('#t');
    var flag = document.querySelector('#flagIcon');
    var searchBox = document.querySelector('#searchBox');
    var output = document.querySelector('#output');
    var searchFunction = function () {
        output.innerText = JSON.stringify(flag.findCountry(searchBox.value));
    };
    searchBox.addEventListener('change', searchFunction);
    searchBox.addEventListener('keyup', searchFunction);
</script>
```

## License

[MIT License](http://opensource.org/licenses/MIT) © Steven Skelton
