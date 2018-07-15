package desipline.layoutsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameLayout extends AppCompatActivity {

    ImageView imageView01;
    ImageView imageView02;
    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        Button btn = (Button) findViewById(R.id.frmBtn);
        imageView01 = (ImageView) findViewById(R.id.imageView01);
        imageView02 = (ImageView) findViewById(R.id.imageView02);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeImage();

            }
        });
    }//end onCreate

    private void changeImage(){
        if(imageIndex == 0 ){
            imageView01.setVisibility(View.INVISIBLE);
            imageView02.setVisibility(View.VISIBLE);
            imageIndex=1;
        }else{
            imageView01.setVisibility(View.VISIBLE);
            imageView02.setVisibility(View.INVISIBLE);
            imageIndex=0;
        }
    }
}
