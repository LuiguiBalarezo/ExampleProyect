package com.balascript.www.exampleproyect;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.balascript.www.exampleproyect.baseclass.BaseAppCompatActivity;
import com.balascript.www.exampleproyect.fragment.ForgotPasswordFragment;
import com.balascript.www.exampleproyect.fragment.SignInFragment;
import com.balascript.www.exampleproyect.fragment.SignUpFragment;

public class CredentialActivity extends BaseAppCompatActivity {

    //Declarando todos los fragmentos a utilizarse en la actividad
    Fragment signin_fragment, sigup_fragment, forgotpassword_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credential);

        initInstanceFragments();

        /*Inicializa el Framelayout Contenedor*/
        initContainerFragment(R.id.container_main);

          /*Clases, Metodos Asociados a Goggle*/
        if (savedInstanceState == null) {
            transactionFragment(signin_fragment, null, "add", false);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void initInstanceFragments() {
        signin_fragment = new SignInFragment();
        sigup_fragment = new SignUpFragment();
        forgotpassword_fragment = new ForgotPasswordFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_credential, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
