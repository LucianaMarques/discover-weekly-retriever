(ns discover-weekly-retriever.components.spotify
  (:require [com.stuartsierra.component :as component]))

(defrecord SpotifyApiClient [token]
  component/Lifecycle

  (start [component]
    (print token))

  (stop [component]
    (print "bye")))

(defn new-spotify-api-client [token]
  (component/using
    (map->SpotifyApiClient {:token token})))