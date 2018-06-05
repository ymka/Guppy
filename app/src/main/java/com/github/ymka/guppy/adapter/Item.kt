package com.github.ymka.guppy.adapter

/**
 * Created by Alexander Kondenko.
 */
sealed class Item {

    data class FirstItem(val name: String) : Item()
    data class SecondItem(val name: String) : Item()
    object Empty : Item()

}
