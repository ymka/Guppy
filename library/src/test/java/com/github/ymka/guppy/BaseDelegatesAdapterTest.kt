package com.github.ymka.guppy

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class BaseDelegatesAdapterTest{

    lateinit var baseDelegatesAdapter: TestDelegateAdapter

    @Before
    fun setup(){
        baseDelegatesAdapter = TestDelegateAdapter(TestDelegate())
        baseDelegatesAdapter.items = listOf(First(), Second(), Third())
    }

    @Test
    fun testSetupItems(){
        assertEquals(baseDelegatesAdapter.itemCount, 3)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testUnexpectedTypeOfItem(){
        baseDelegatesAdapter.getItemViewType(1)
    }

    @Test()
    fun testExpectedTypeOfItem(){
        assertEquals(baseDelegatesAdapter.getItemViewType(0), 0)
    }
}