(ns mario.style.desktop.main
  (:require [mario.style.desktop.article :as article]
            [mario.style.desktop.media-util :as media-util]
            [mario.style.desktop.activatable-video-view :as activatable-video-view]
            [mario.style.desktop.spoiler-warning :as spoiler-warning]
            [mario.style.desktop.entity-explorer :as entity-explorer]
            [mario.style.desktop.video-to-image :as video-to-image]
            [mario.style.desktop.hud-explorer :as hud-explorer]
            [mario.style.desktop.music-player :as music-player]
            [mario.style.desktop.level-explorer :as level-explorer]
            [garden.def :refer [defstylesheet defstyles]]
            [garden.units :refer [px]]))

(defstyles stylesheet
  (media-util/export)
  (article/export)
  (spoiler-warning/export)
  (video-to-image/export)
  (activatable-video-view/export)
  (hud-explorer/export)
  (music-player/export)
  (level-explorer/export)
  (entity-explorer/export))

  