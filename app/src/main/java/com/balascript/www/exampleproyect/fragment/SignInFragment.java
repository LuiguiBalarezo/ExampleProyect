package com.balascript.www.exampleproyect.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.balascript.www.exampleproyect.R;
import com.balascript.www.exampleproyect.baseclass.BaseFragment;

import butterknife.BindView;

/**
 * A placeholder fragment containing a simple view.
 */
public class SignInFragment extends BaseFragment {


    @BindView(R.id.img_logo)
    ImageView img_logo;
    @BindView(R.id.edt_user)
    EditText edt_user;
    @BindView(R.id.edt_pass)
    EditText edt_pass;
    @BindView(R.id.btn_enter)
    Button btn_enter;
    @BindView(R.id.btn_forgot_password)
    Button btn_forgot_password;
    @BindView(R.id.btn_signup)
    Button btn_signup;
    @BindView(R.id.btn_facebook)
    Button btn_facebook;
    @BindView(R.id.btn_twitter)
    Button btn_twitter;
    @BindView(R.id.btn_google)
    Button btn_google;

    public SignInFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_signin, container, false);
    }
}
