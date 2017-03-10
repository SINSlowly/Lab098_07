(ns sandbox.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn factorial
  [n]
  (reduce * (range 1 (+ n 1))))
(println (factorial 20))

