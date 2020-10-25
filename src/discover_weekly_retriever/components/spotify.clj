(ns discover-weekly-retriever.components.spotify
  (:require [com.stuartsierra.component :as component]))

(defrecord SpotifyApiClient [token]
  component/Lifecycle

  (start [this]
    (print token))

  (stop [this]
    (print "bye")))

(defn new-spotify-api-client [token]
  (map->SpotifyApiClient {:token token}))