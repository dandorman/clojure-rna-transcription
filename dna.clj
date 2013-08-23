(ns dna)

(defn to-rna [sequence]
  (apply str (map {\A \A \C \C \G \G \T \U} sequence)))
