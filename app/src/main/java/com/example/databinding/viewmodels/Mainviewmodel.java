package com.example.databinding.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.databinding.User;

public class Mainviewmodel extends AndroidViewModel {

     private User mUser;
     public Mainviewmodel(@NonNull Application application) {
         super(application);

         mUser=new User("Temp",35);
     }
     public User getUser(){
         return  this.mUser;
     }
 }
