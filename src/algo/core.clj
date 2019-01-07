(ns algo.core
  (:gen-class))

(require '[algo.sort :as asort])

(defn -main []
  (def l (asort/insert_sort '(2 3 1 55 148 658 77 74)))
  (print l)
)

(-main)