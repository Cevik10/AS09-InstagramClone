package com.hakancevik.instagramclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.hakancevik.instagramclone.databinding.ActivityUploadBinding;

public class UploadActivity extends AppCompatActivity {

    private ActivityUploadBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUploadBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }




    public void selectImage(View view){



    }

    public void uploadButton(View view){



    }

}