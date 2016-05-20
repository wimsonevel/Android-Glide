package com.example.wim.android_glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imgLocal, imgUrl, imgGif;

    private String url = "https://4.bp.blogspot.com/-CHdeqUH3E0M/Vz7-ROLuIOI/AAAAAAAABuU/ofsk7JwRmig-PmFaEUzaeb-24-ZdLn66ACLcB/s1600/Civ_gxGU4AAyPKK.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLocal = (ImageView) findViewById(R.id.imgLocal);
        imgUrl = (ImageView) findViewById(R.id.imgUrl);
        imgGif = (ImageView) findViewById(R.id.imgGif);

        // Load from local
        Glide.with(this).load(R.drawable.yupi_luvchu).into(imgLocal);

        // Load from url
        Glide.with(this)
                .load(url)
                // cropping
                .centerCrop()
                //resize
                .override(800,600)
                .placeholder(R.drawable.placeholder)
                //animation
                .crossFade()
                .into(imgUrl);

        // Load GIF
        Glide.with(this)
                .load(R.drawable.gif_luvchu)
                .asGif()
                .crossFade()
                .into(imgGif);

    }

}
