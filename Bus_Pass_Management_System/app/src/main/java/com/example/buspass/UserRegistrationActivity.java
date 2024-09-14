public class UserRegistrationActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        usernameEditText = findViewById(R.id.username_edittext);
        passwordEditText = findViewById(R.id.password_edittext);
        registerButton = findViewById(R.id.register_button);

        registerButton.setOnClickListener(v -> {
            // Code to handle registration
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            // Perform registration
        });
    }
}
