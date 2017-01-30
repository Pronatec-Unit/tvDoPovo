package com.example.leo.atvdopovo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TV2Activity extends AppCompatActivity {
    VideoView myVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv2);
        myVideoView = (VideoView)this.findViewById(R.id.myVideoView); MediaController mc = new MediaController(this); myVideoView.setMediaController(mc);
        final String urlStream = "http://163.172.39.15/loadbalance/canal-discovery-kids-hd/chunks.m3u8?nimblesessionid=6428341&wmsAuthSign=c2VydmVyX3RpbWU9MS8zMC8yMDE3IDQ6NTc6MzggQU0maGFzaF92YWx1ZT0rSXhVVGkxQmpVRHV3QTYvRW55MG5nPT0mdmFsaWRtaW51dGVzPTE=";
        runOnUiThread(new Runnable() { @Override public void run() { myVideoView.setVideoURI(Uri.parse(urlStream)); } });
        myVideoView.start();
    }
}
