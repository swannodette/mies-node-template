(ns leiningen.new.mies-node
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]))

(def render (renderer "mies-node"))

(defn mies-node [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
      ["project.clj" (render "project.clj" data)]
      ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
      ["script/compile" (render "compile" data) :executable true]
      ["script/compile.clj" (render "compile.clj" data)]
      ["script/watch" (render "watch" data) :executable true]
      ["script/watch.clj" (render "watch.clj" data)]
      ["script/repl" (render "repl" data) :executable true]
      ["script/repl.clj" (render "repl.clj" data)]
      [".gitignore" (render "gitignore" data)])))
