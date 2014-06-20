# Heroku Clojure Worker Sample

This is a very trivial example of creating a Heroku worker application in Clojure. It prints "Hello world!" every 3 seconds, and does not otherwise have any external interface.

## Libraries Used:

- At-At (https://github.com/overtone/at-at)
- tools.logging (https://github.com/clojure/tools.logging)
- Logback (http://logback.qos.ch/)

For kicks, the logging format uses color-highlighted log formats. Betcha didn't know logback could do that, eh?

## Usage

To run locally:

    $ lein run -m worker.main

To run on Heroku, follow their very well-written tutorial:

https://devcenter.heroku.com/articles/getting-started-with-clojure#local-workstation-setup

## License

    Copyright © 2014 Noah Zucker (@noahlz / nzucker AT gmail DOT com) 

Creative Commons CC0 1.0 Universal 

See: http://creativecommons.org/publicdomain/zero/1.0/legalcode

Noah Zucker (nzucker at gmail.com / [@noahlz](http://twitter.com/noahlz))

