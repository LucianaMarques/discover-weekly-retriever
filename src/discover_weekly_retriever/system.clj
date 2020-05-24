(ns discover-weekly-retriever.system
  (:require [com.stuartsierra.component :as component]
            [common-core.visibility :as vis]
            [discover-weekly-retriever.components.spotify :as components.spotify]))

(defn- new-system [token]
  (-> (component/system-map
        :spotify-api-clien (components.spotify/new-spotify-api-client token))
      (component/system-using {})))

(defn start-system [token]
  (new-system token))

