package com.dongxie.music.ui.home.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.dongxie.music.model.CHANNEL;
import com.dongxie.music.ui.discovery.DiscoveryFragment;
import com.dongxie.music.ui.friend.FriendFragment;
import com.dongxie.music.ui.my.MyFragment;

/**
 * @author dongxie
 */
public class HomePagerAdapter extends FragmentPagerAdapter {

    private CHANNEL[] mList;

    public HomePagerAdapter(FragmentManager manager, CHANNEL[] data) {
        super(manager);
        mList = data;
    }

    /**
     * 这种方式，避免一次性创建所有的fragment
     *
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        int type = mList[position].getValue();
        switch (type) {
            case CHANNEL.MINE_ID:
                return MyFragment.newInstance();
            case CHANNEL.DISCORY_ID:
                return DiscoveryFragment.newInstance();
            case CHANNEL.FRIEND_ID:
                return FriendFragment.newInstance();
//            case CHANNEL.VIDEO_ID:
//                return VideoFragment.newInstance();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.length;
    }
}
