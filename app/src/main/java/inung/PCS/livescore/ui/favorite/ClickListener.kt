package inung.PCS.livescore.ui.favorite

import inung.PCS.livescore.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}