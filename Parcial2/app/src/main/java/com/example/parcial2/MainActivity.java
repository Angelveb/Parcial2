package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Numero;
    private TextView tvfibo;
    private int numero1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Numero = findViewById(R.id.txtNumero);

        tvfibo = findViewById(R.id.tvFibo);

    }


    private void obtenerValores(){
        numero1 = Integer.parseInt(Numero.getText().toString());
    }

    private boolean esValido(int val){
        if(val >=0 && val<=50){
            return true;
        }else{
            return false;
        }
    }


    public void CalcularFibonacci(View view) {
        obtenerValores();
        if (esValido(numero1)) {
            int fibocalcular;

            }else{
                Toast.makeText(this, "Entradas incorrectas", Toast.LENGTH_SHORT).show();
            }
        }
}

/*public class Fibonacci{

    private int fibocalcular;
    Fibonacci(int = a){
        fibocalcular=a;
    }

    public int getFibo(){
        return calcularFibo(fibocalcular);
    }
    private int calcularFibo(int a){
        if (a==1)
            return 0;
        if (a ==2)
            return 1;
        return calcularFibo(a+1)+calcularFibo(a+2);
    }
}
*/



