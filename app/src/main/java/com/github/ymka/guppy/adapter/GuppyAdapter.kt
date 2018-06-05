package com.github.ymka.guppy.adapter

import com.github.ymka.guppy.BaseDelegatesAdapter
import com.github.ymka.guppy.adapter.delegates.EmptyDelegate
import com.github.ymka.guppy.adapter.delegates.FirstDelegate
import com.github.ymka.guppy.adapter.delegates.SecondDelegate

/**
 * Created by Alexander Kondenko.
 */
class GuppyAdapter : BaseDelegatesAdapter<Item>(
        FirstDelegate(),
        SecondDelegate(),
        EmptyDelegate()
)
