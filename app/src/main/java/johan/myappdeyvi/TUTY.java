package johan.myappdeyvi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TUTY extends AppCompatActivity  {

    private Button btnCambiarActividad; // Crear la variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuty);

        btnCambiarActividad = (Button) findViewById(R.id.btnCambiardeActividad);
        btnCambiarActividad.setOnClickListener(new View.OnClickListener(){


    @Override
    public void onClick(View v){
                //Acciones

                Intent loadActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(loadActivity);

            }

        });

    }

}

