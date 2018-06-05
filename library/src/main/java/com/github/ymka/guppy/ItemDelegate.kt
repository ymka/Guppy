package com.github.ymka.guppy

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

interface ItemDelegate<I, H : RecyclerView.ViewHolder> {

    fun itemType(): Class<out I>

    fun createVewHolder(parent: ViewGroup): H

    fun bindView(position: Int, item: I, holder: H)

}
