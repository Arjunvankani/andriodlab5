package com.example.andriodlab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static class MusicManager implements MediaPlayer.OnPreparedListener {

        static MediaPlayer mPlayer;
        Context context;
        private int mySoundId;

        public MusicManager(Context ctx, int musicID) {
            context = ctx;
            mySoundId = musicID;
            mPlayer = MediaPlayer.create(context, mySoundId);
            mPlayer.setOnPreparedListener(this);
        }

        public void play() {
            mPlayer = MediaPlayer.create(context, mySoundId);

        }

        public void stop() {
            mPlayer.stop();
            mPlayer.release();
        }

        @Override
        public void onPrepared(MediaPlayer player) {
            player.start();
            mPlayer.setLooping(true);
            mPlayer.setVolume(80, 80);

        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Arjun");
        Log.i("Arjun","on Create Called");
        Toast.makeText(getApplicationContext(),Html.fromHtml("<font color='yellow' ><b>" + "onCreate Called"  + "</b></font>"),
                Toast.LENGTH_LONG).show();

    }
    protected void onStart() {
        super.onStart();
        Log.i("Arjun", "on Start Called");
        Toast.makeText(getApplicationContext(), Html.fromHtml("<font color='green' ><b>" + "on Start Called"  + "</b></font>"),
                Toast.LENGTH_LONG).show();
        MusicManager mm = new MusicManager(this, R.raw.back);
        mm.play();
    }
    protected void onRestart() {

        super.onRestart();
        Log.i("Arjun", "on Restart Called");
        Toast.makeText(getApplicationContext(),Html.fromHtml("<font color='pink' ><b>" + "on retsart Called"  + "</b></font>"),
                Toast.LENGTH_LONG).show();
        MusicManager mm = new MusicManager(this, R.raw.back2);
        mm.play();
    }
    protected void onResume() {

        super.onResume();
        Log.i("Arjun","On Resume Called");
        Toast.makeText(getApplicationContext(), Html.fromHtml("<font color='black' ><b>" + "on Resume Called"  + "</b></font>"),
                Toast.LENGTH_LONG).show();
        MusicManager mm = new MusicManager(this, R.raw.back3);
        mm.play();
    }
    protected void onPause() {

        super.onPause();
        Log.i("Arjun","On Pause Called");
        Toast.makeText(getApplicationContext(), Html.fromHtml("<font color='purple' ><b>" + "on Pause Called"  + "</b></font>"),
                Toast.LENGTH_LONG).show();
        MusicManager mm = new MusicManager(this, R.raw.back4);
        mm.play();
    }

    protected void onStop() {

        super.onStop();
        Log.i("Arjun","On Stop Called");
        Toast.makeText(getApplicationContext(), Html.fromHtml("<font color='red' ><b>" + "on Stop Called"  + "</b></font>"),
                Toast.LENGTH_LONG).show();
        MusicManager mm = new MusicManager(this, R.raw.back5);
        mm.play();
    }
    protected void onDestroy() {

        super.onDestroy();
        Log.i("Arjun","On Destroy Called");
        System.out.println("Arjun");
        Toast.makeText(getApplicationContext(),Html.fromHtml("<font color='red' ><b>" + "on Destroy Called"  + "</b></font>"),
                Toast.LENGTH_LONG).show();
    }

}