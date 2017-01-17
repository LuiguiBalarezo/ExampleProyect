package com.balascript.www.exampleproyect.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.balascript.www.exampleproyect.R;
import com.balascript.www.exampleproyect.baseclass.BaseFragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class SignInFragment extends BaseFragment {

    public SignInFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_signin, container, false);
    }
}
