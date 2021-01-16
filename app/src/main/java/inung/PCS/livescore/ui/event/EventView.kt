package inung.PCS.livescore.ui.event

import inung.PCS.livescore.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}