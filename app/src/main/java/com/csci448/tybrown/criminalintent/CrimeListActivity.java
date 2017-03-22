package com.csci448.tybrown.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Tyler's PC on 2/15/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

}
