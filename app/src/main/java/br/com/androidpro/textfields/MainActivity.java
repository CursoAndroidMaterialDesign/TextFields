package br.com.androidpro.textfields;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;

    private AppCompatEditText editTextEmail;
    private AppCompatEditText editTextPassword;

    private TextInputLayout textLayoutEmail;
    private TextInputLayout textLayoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = (AppCompatEditText) findViewById(R.id.et_email);
        textLayoutEmail = (TextInputLayout) findViewById(R.id.txtlayout_email);

        editTextPassword = (AppCompatEditText) findViewById(R.id.et_password);
        textLayoutPassword = (TextInputLayout) findViewById(R.id.txtlayout_password);

        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateForm();
            }
        });
    }

    private void validateForm() {
        if (editTextEmail.getText().toString().isEmpty()) {
            textLayoutEmail.setErrorEnabled(true);
            textLayoutEmail.setError("Preencha com seu email");
        } else {
            textLayoutEmail.setErrorEnabled(false);
        }

        if (editTextPassword.getText().toString().isEmpty()) {
            textLayoutPassword.setErrorEnabled(true);
            textLayoutPassword.setError("Preencha com seu password");
        } else {
            textLayoutPassword.setErrorEnabled(false);
        }
    }
}
