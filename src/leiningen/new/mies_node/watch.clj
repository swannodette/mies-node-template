(require '[cljs.build.api :as b])

(b/watch "src"
  {:main '{{name}}.core
   :output-to "{{sanitized}}.js"
   :output-dir "out"
   :target :nodejs
   :verbose true})
