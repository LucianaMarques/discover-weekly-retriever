(ns discover-weekly-retriever.system
  (:require [com.stuartsierra.component :as component]
            [discover-weekly-retriever.components.spotify :as components.spotify]))

(defn- new-system [token]
  (component/system-map :spotify-api-client (components.spotify/new-spotify-api-client token)))

(defn start-system [token]
  (new-system token))

