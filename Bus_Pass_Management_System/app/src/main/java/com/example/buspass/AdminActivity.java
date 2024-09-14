public class AdminActivity extends AppCompatActivity {
    private Button managePassesButton;
    private Button handleNotificationsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        managePassesButton = findViewById(R.id.manage_passes_button);
        handleNotificationsButton = findViewById(R.id.handle_notifications_button);

        managePassesButton.setOnClickListener(v -> {
            // Code to manage passes
        });

        handleNotificationsButton.setOnClickListener(v -> {
            // Code to handle notifications
        });
    }
}
