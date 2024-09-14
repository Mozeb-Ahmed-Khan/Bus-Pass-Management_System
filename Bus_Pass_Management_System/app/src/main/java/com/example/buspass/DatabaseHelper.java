public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "bus_pass.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE passes (id INTEGER PRIMARY KEY AUTOINCREMENT, student_name TEXT, qr_code TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS passes");
        onCreate(db);
    }

    // Method to insert data
    public long insertPass(String studentName, String qrCode) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("student_name", studentName);
        values.put("qr_code", qrCode);
        return db.insert("passes", null, values);
    }

    // Method to update data
    public int updatePass(int id, String studentName, String qrCode) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("student_name", studentName);
        values.put("qr_code", qrCode);
        return db.update("passes", values, "id = ?", new String[]{String.valueOf(id)});
    }

    // Method to delete data
    public int deletePass(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("passes", "id = ?", new String[]{String.valueOf(id)});
    }

    // Method to query data
    public Cursor getPassById(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query("passes", new String[]{"id", "student_name", "qr_code"}, "id = ?", new String[]{String.valueOf(id)}, null, null, null);
    }

    // Method to get all passes
    public Cursor getAllPasses() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query("passes", new String[]{"id", "student_name", "qr_code"}, null, null, null, null, null);
    }
}
