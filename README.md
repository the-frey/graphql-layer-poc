# GraphQL Layer POC

generated using Luminus version "2.9.11.89"

This is a luminus re-frame application aimed at being a quick proof of concept for a GraphQL layer.

For GraphQL functionality, it uses [Lacinia](https://github.com/walmartlabs/lacinia), and is thus locked (for now) to Clojure 1.8.0.

Yes, this could have been a Swagger app or a Lacinia-pedestal app instead. So shoot me.

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

### Development

    lein repl

Then, to start the server via mount:

    (user/start)

Then start figwheel in a separate window

    lein figwheel

To start a web server for the application, run:

    lein run 

## License

Copyright © 2017 FIXME
