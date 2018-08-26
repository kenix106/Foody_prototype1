package cl.evilgenius.foody_prototype1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MenuActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        txt = findViewById(R.id.TV_text);

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

      //  String name = user.getDisplayName();
        String email = user.getEmail();

        // Toma el nombre del correo (primera parte) y lo presenta en el titulo como nombre oficial.
        String base = email.replaceAll("@", " ");
        String[] newName=  base.split(" ");
        for (int i = 0; i <newName.length ; i++) {
            //txt.setText(newName[0]);
            setTitle("Bienvenido " + newName[0]);
        }// fin de titulo con el nombre del correo.








    }
}
