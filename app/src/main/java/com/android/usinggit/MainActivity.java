package com.android.usinggit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String hello = "Hello Git";
        //сразу после добавления кода вдоль номеров строк проходит зеленая линия, показывающая то, что этих строк нет в той версии, которая была сохранена в git
    }

    //Connect Firebase to the Project
    //Еще одна строка, чтоб понять обновляется все или нет
}