package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.databinding.databinding.MainActivityBinding;
import com.example.databinding.viewmodels.Mainviewmodel;

public class MainActivity extends AppCompatActivity {

    private Mainviewmodel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        mViewModel= ViewModelProviders.of(this)
                .get(Mainviewmodel.class);

        binding.setUser(mViewModel.getUser());
       // binding.setText2("Its Second number");



    }
}
