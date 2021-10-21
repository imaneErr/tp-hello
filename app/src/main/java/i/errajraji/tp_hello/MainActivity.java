package i.errajraji.tp_hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button heyButton = findViewById(R.id.buttonsayhi);
            final TextView textViewDisplay = findViewById(R.id.textViewdisplay);
            final EditText editText = findViewById(R.id.editTextName);

       heyButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
          String name = editText.getText().toString();
          if (name.isEmpty())
              textViewDisplay.setText("please provide a name!");
          else
              textViewDisplay.setText("hello"+name);
          editText.setText("");
           }
       });




        }




    }