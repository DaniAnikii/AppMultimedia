package institute.immune.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.cancion);
    }

    public void pause(View view) {
        Toast.makeText(this, "Se ha pausado la canción", Toast.LENGTH_SHORT).show();
        mp.pause();

    }
    public void play(View view) {
        Toast.makeText(this, "Se ha iniciado la canción", Toast.LENGTH_SHORT).show();
        mp.start();

    }

    public void stop(View view) {
        Toast.makeText(this, "Se ha parado la canción", Toast.LENGTH_SHORT).show();
        mp.stop();
        mp = MediaPlayer.create(this, R.raw.cancion);
    }


}
