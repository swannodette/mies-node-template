(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2755"]
                 [figwheel "0.2.3-SNAPSHOT"]]

  :node-dependencies [[source-map-support "0.2.8"]
                      [ws "0.7.1"]]

  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-npm "0.4.0"]
            [lein-figwheel "0.2.3-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "{{name}}"
              :source-paths ["src"]
              :compiler {
                :output-to "resources/public/out/{{sanitized}}.js"
                :output-dir "resources/public/out"
                :target :nodejs
                :optimizations :none
                :source-map true}}]})
