package mychatapp.com.example.mistre83.mychatapp.adapters

import android.support.v4.app.FragmentManager
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import mychatapp.com.example.mistre83.mychatapp.fragments.ChatsFragment
import mychatapp.com.example.mistre83.mychatapp.fragments.UsersFragment

class SectionPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return UsersFragment()
            }
            1 -> {
                return ChatsFragment()
            }
        }

        return null!!
    }

    override fun getCount(): Int {
        return 2
    }
}