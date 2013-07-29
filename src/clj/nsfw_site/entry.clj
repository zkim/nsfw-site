(ns nsfw-site.entry
  (:require [nsfw.app :as app]))

(defonce session (app/session-store :encrypted-cookie))

(def app
  (app/clojurescript
   :entry 'nsfw-site.app/entry
   :session-store session
   :css [:nsfw :app]
   :data (fn [r]
           ;; Key / val pairs are embedded into the page as js vars
           {:unique-value (str (gensym))})
   :api (app/route
         ;; Routes mounted at /api
         ["name"] (fn [r] {:body (pr-str (rand))}))))