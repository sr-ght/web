package com.tibe.web.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.inputmethodservice.KeyboardView;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;

import com.tibe.web.R;
import com.tibe.web.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Web);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        binding = DataBindingUtil.
        setContentView(this, R.layout.activity_home);

        click();
    }

    private void click(){
        binding.layoutHome.setOnClickListener(v ->{
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(binding.layoutHome.getWindowToken(), 0);
        });

        binding.searchEngine.setOnClickListener(v ->{

        });
    }
}