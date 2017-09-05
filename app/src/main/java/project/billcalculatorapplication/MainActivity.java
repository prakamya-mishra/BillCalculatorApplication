package project.billcalculatorapplication;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    private EditText mEditText;
    private EditText mEditPercentage;
    private Button mDone;
    private double tip_result;
    private CoordinatorLayout mSnackBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = (EditText) findViewById(R.id.total_amount);
        mEditPercentage = (EditText) findViewById(R.id.tip_percentage);
        mDone = (Button) findViewById(R.id.done);
        mSnackBarLayout = (CoordinatorLayout) findViewById(R.id.Snackbarcontainer);

        mDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double amount = Double.parseDouble(mEditText.getText().toString());
                double tip_percentage = Double.parseDouble(mEditPercentage.getText().toString());
                tip_result = (amount*tip_percentage)/100;

                final Snackbar snackbar = Snackbar.make(mSnackBarLayout,"Tip is "+tip_result, Snackbar.LENGTH_INDEFINITE);
                snackbar.show();
            }
        });

    }
}
