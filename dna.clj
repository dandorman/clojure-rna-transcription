(ns dna)

(def ^:private dna-to-rna {\A \A \C \C \G \G \T \U})

(defn to-rna [sequence]
  (apply str (map dna-to-rna sequence)))
