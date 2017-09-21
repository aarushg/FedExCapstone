package fedex.fedexfirsttest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the button */
    public void generateID(View view) {
        String ID = "";
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 20; ++idx){
            int randomInt = randomGenerator.nextInt(10);
            ID = ID + randomInt;
        }
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(ID);
        ConstraintLayout bg = (ConstraintLayout)findViewById(R.id.bg);

        int switchColor;
        int switchTextColor;
        char lastNum =  ID.charAt(ID.length() - 1);

        if (lastNum == '0') {switchColor = Color.BLACK; switchTextColor = Color.WHITE;}
        else if (lastNum == '1') {switchColor = Color.WHITE; switchTextColor = Color.BLACK;}
        else if (lastNum == '2') {switchColor = Color.RED; switchTextColor = Color.WHITE;}
        else if (lastNum == '3') {switchColor = Color.BLUE; switchTextColor = Color.WHITE;}
        else if (lastNum == '4') {switchColor = Color.YELLOW; switchTextColor = Color.BLACK;}
        else if (lastNum == '5') {switchColor = Color.CYAN; switchTextColor = Color.BLACK;}
        else if (lastNum == '6') {switchColor = Color.GREEN; switchTextColor = Color.BLACK;}
        else if (lastNum == '7') {switchColor = Color.LTGRAY; switchTextColor = Color.BLACK;}
        else if (lastNum == '8') {switchColor = Color.GRAY; switchTextColor = Color.WHITE;}
        else {switchColor = Color.MAGENTA; switchTextColor = Color.WHITE;}

        // Need to add a way to vibrate, may need to add vibration permission in AndroidManifest.xml
        bg.setBackgroundColor(switchColor);
        textView.setTextColor(switchTextColor);
    }

}
