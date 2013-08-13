(ns nsfw-site.app
  (:use [nsfw.util :only [log]])
  (:require [nsfw.dom :as $]
            [nsfw.bind :as bind]
            [nsfw.util :as util]
            [nsfw.storage :as storage]
            [nsfw.geo :as geo]
            [nsfw.components :as comp]
            [nsfw.chart :as chart]
            [cljs.reader :as reader]
            [clojure.string :as str]
            [nsfw.console :as console]
            [nsfw-site.anim :as anim]
            [nsfw-site.common :as common]
            [nsfw-site.overview :as overview]
            [nsfw.affix :as affix]
            [nsfw.scroll-to :as scroll-to]))

(defn ^:export entry []
  (affix/init)
  (scroll-to/init))
