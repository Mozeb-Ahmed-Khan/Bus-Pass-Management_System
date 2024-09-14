public class ClientActivity extends AppCompatActivity {
    private Button registerButton;
    private Button viewPassButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        registerButton = findViewById(R.id.register_button);
        viewPassButton = findViewById(R.id.view_pass_button);

        registerButton.setOnClickListener(v -> {
            // Code to register for a bus pass
        });

        viewPassButton.setOnClickListener(v -> {
            // Code to view bus pass details
        });
    }
}
