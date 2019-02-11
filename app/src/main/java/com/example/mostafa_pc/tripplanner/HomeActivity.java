package com.example.mostafa_pc.tripplanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {

    RecyclerView rv;
    LinearLayoutManager glm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        rv = findViewById(R.id.mRec);
        rv.setHasFixedSize(true);
        glm = new LinearLayoutManager(this);
        rv.setLayoutManager(glm);
        String[] x = {"hello","hello","hello","hello","hello","hello","hello","hello"};
        RecViewAdapter rva = new RecViewAdapter(x);
        rv.setAdapter(rva);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        FirebaseAuth.getInstance().signOut();
        disconnectFromFacebook();
        finish();
    }

    public void disconnectFromFacebook() {

        if (AccessToken.getCurrentAccessToken() == null) {
            return; // already logged out

        }else {
            LoginManager.getInstance().logOut();
        }
    }
}
