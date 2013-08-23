(ns dna
  (:use [clojure.string :only [join]]))

(defn to-rna [sequence]
  (join (map {\A \A \C \C \G \G \T \U} sequence)))
