package com.example.pangea

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/* This class controls the swipe-adapter used in
   DashboardsActivity for swiping and switching between tabs
   IMPORTANT: The names of the tabs are defined here (not in @strings)!*/
internal class SwipeAdapter(var context: Context, fm: FragmentManager, var amount_tabs: Int) : FragmentPagerAdapter(fm)
{
    val tabNames = arrayOf("Accounts", "Posts", "Bookmarked")
    override fun getItem(index: Int): Fragment
    {
        return when (index)
        {
            0 -> {Accounts()}
            1 -> {Posts()}
            2 -> {Bookmarked()}
            else -> getItem(index)
        }
    }

    override fun getCount(): Int
    {
        return amount_tabs
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabNames[position]
    }
}