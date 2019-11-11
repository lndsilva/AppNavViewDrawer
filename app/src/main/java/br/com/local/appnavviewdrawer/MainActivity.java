package br.com.local.appnavviewdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                Toast.makeText(getApplicationContext(), "Adicionar", Toast.LENGTH_SHORT).show();

                return (true);
            case R.id.reset:
                Toast.makeText(getApplicationContext(), "Reset", Toast.LENGTH_SHORT).show();
                return (true);
            case R.id.about:
                Toast.makeText(getApplicationContext(), "About", Toast.LENGTH_SHORT).show();
                return (true);
            case R.id.exit:
                Toast.makeText(getApplicationContext(), "Exit", Toast.LENGTH_SHORT).show();
                finish();
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }

}
