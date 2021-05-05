package com.example.singlecardviewnavigationtemplate;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SelectedFragment extends Fragment {
    
    public SelectedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selected, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CompleteViewModel completeViewModel = new ViewModelProvider(requireActivity()).get(CompleteViewModel.class);
        TextView textView = view.findViewById(R.id.textView);
        textView.setText("You selected Card " + completeViewModel.adapterPosition.getValue());
    }
}
