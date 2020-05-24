(ns discover-weekly-retriever.core
  (:require [com.stuartsierra.component :as component]
            [discover-weekly-retriever.system :as system]))

(defn -main []
  (component/start (system/start-system "abc")))
