# mies-node-template

A minimal ClojureScript Node.js template.

## Usage

Run the following to create a project and start auto building.

```
lein new mies-node hello-world
cd hello-world
lein npm install
lein figwheel
```

Changes to your source files will trigger incremental compilation.
Figwheel leiningen plugin will hot swap your code inside running process.
To run your code use the provided loader file in the project directory:

```
node run.js
```

## License

Copyright © 2014 David Nolen

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
