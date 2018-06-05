package com.github.ymka.guppy.adapter.delegates

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.ymka.guppy.ItemDelegate
import com.github.ymka.guppy.R
import com.github.ymka.guppy.adapter.Item

/**
 * Created by Alexander Kondenko.
 */
class EmptyDelegate : ItemDelegate<Item.Empty, EmptyDelegate.Holder> {

    override fun itemType() = Item.Empty::class.java

    override fun createVewHolder(parent: ViewGroup) = Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_empty, parent, false))

    override fun bindView(position: Int, item: Item.Empty, holder: Holder) {

    }

    class Holder(view: View) : RecyclerView.ViewHolder(view)

}
