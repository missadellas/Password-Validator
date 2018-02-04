package ca.dal.sbutler.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText passwordInput = (EditText) findViewById(R.id.PasswordEditText);
        Button validateBtn = (Button)findViewById(R.id.ValidateBtn);
        final TextView strengthView = (TextView) findViewById(R.id.StrengthTextView);

        validateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validator v = new Validator();
                String password = passwordInput.getText().toString();
                strengthView.setText(v.determineStrength(v.validate(password)));
            }
        });

    }
}
