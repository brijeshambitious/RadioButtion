package e.hg.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radioID);
        radioButton=findViewById(R.id.yes);
        radioButton=findViewById(R.id.mayID);
        radioButton=findViewById(R.id.no);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton=findViewById(checkedId);

                switch (radioButton.getId()){
                    case R.id.yes:
                    {
                        if(radioButton.isChecked()){
                            Log.d("RD","YES");
                        }
                    }

                    case R.id.mayID:
                    {
                        if(radioButton.isChecked()){
                            Log.d("RD","MAY BE");
                        }
                    }

                    case R.id.no:
                    {
                        if(radioButton.isChecked()){
                            Log.d("RD","NO");
                        }
                    }

                }
            }
        });


    }
}
