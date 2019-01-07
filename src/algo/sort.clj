(ns algo.sort
  (:gen-class))

(defn insert_sort [l]
  "Simple insert-sort algorithm implementation. We use java list because sequences are immutable in Clojure.

    Input: Unnordonned Vector
    Output: Ordonned Vector"

  (with-local-vars [key nil, i nil]
    (def jarray (into-array Integer/TYPE l))
    (doseq [x (range 1 (count jarray))]
      (var-set key (int (nth jarray x)))
      (var-set i (dec x ))
      (while (and (>(int @i) -1) (<(int @key) (nth jarray (int @i))))
        (do
          (aset jarray (inc @i) (nth jarray @i))
          (var-set i (dec @i))
        )
      )
      (aset jarray (inc @i) @key)
    )
    (into [] jarray)
  )
)