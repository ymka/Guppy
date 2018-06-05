package com.github.ymka.guppy

import android.view.ViewGroup

class TestDelegate(): ItemDelegate<First, TestViewHolder>{
    override fun itemType() = First::class.java

    override fun createVewHolder(parent: ViewGroup): TestViewHolder = TestViewHolder(parent)

    override fun bindView(position: Int, item: First, holder: TestViewHolder) {

    }
}