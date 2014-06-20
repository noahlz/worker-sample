(defproject worker-sample "1.0.0-SNAPSHOT"
  :description "Sample Heroku worker dyno app."
  :url "http://github.com/noahlz/worker-sample"
  :license {:name "Creative Commons CC0 1.0 Universal"
            :url "http://creativecommons.org/publicdomain/zero/1.0/legalcode"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [overtone/at-at "1.2.0"]
                 [org.clojure/tools.logging "0.3.0"]
                 [ch.qos.logback/logback-classic "1.1.2"]]
  :main ^:skip-aot worker.main 
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "worker-standalone.jar"
  :profiles {:production {:env {:production true}}})
