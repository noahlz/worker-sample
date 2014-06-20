(ns worker.main 
  (:require [overtone.at-at :as at] 
            [clojure.tools.logging :refer :all]))

(def exec-pool (at/mk-pool))

(defn -main [& [port]]
  (at/every 3000 #(info "Hello world!") exec-pool))

