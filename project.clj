(defproject webmacs "0.0.1-SNAPSHOT"
  :description "View your Emacs buffers in a browser. Live."
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [server-socket "1.0.0"]
                 [commons-codec "1.5"]
                 [compojure "1.0.1"]
                 [hiccup "1.0.0"]
                 [aleph "0.3.0-alpha2"]
                 [clj-stacktrace "0.2.4"]]
  :cljsbuild {:crossovers [webmacs.buffer],
              :builds [{:source-path "src-cljs/",
                        :compiler {:output-to "resources/public/js/main.js",
                                   :optimizations :whitespace,
                                   :pretty-print true}}]}
  :profiles {:dev {:dependencies [[midje "1.3.1"]
                                  [ring-mock "0.1.2"]]
                   :plugins [[org.clojars.the-kenny/lein-midje "1.0.9"]]}}
  ;; :main webmacs.core
  :plugins [[lein-cljsbuild "0.1.10"]])
