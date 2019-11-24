package com.example.myapplication;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Main4Activity extends AppCompatActivity {

    EditText editText1 = null;
    ImageButton imageButton3 = null;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageButton3 = findViewById(R.id.imageButton3);
        editText1 = findViewById(R.id.editText1);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                editText1.setText("" + count);
            }
        });
    }
}
class SoundFoolActivity2 extends Activity {

    ImageButton imageButton3;

    protected String mRecordingFile;
    SoundPool sound;
    int soundId;
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sound = new SoundPool(5, AudioManager.STREAM_MUSIC, 0 );
        soundId = sound.load(this, R.raw.mj,1);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO auto-generated method stub
                sound.play(soundId, 1f, 1f, 0, 0, 1f);



            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sound_fool, menu);
        return true;
    }

}
