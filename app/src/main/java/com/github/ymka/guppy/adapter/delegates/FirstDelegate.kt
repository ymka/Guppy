package com.github.ymka.guppy.adapter.delegates

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.github.ymka.guppy.ItemDelegate
import com.github.ymka.guppy.R
import com.github.ymka.guppy.adapter.Item

/**
 * Created by Alexander Kondenko.
 */
class FirstDelegate : ItemDelegate<Item.FirstItem, FirstDelegate.Holder> {

    override fun itemType() = Item.FirstItem::class.java

    override fun createVewHolder(parent: ViewGroup) = Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_first, parent, false))

    override fun bindView(position: Int, item: Item.FirstItem, holder: Holder) {
        holder.label.text = item.name
    }

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val label = view.findViewById<TextView>(R.id.firstLabel)!!
    }

}
