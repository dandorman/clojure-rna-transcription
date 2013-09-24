(ns dna)

(def ^:private dna->rna {\A \A \C \C \G \G \T \U})

(defn to-rna [sequence]
  (apply str (map dna->rna sequence)))
