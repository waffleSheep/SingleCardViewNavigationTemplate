package com.example.singlecardviewnavigationtemplate;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CompleteViewModel extends ViewModel {
    public MutableLiveData<Integer> adapterPosition = new MutableLiveData<>(0);
}
