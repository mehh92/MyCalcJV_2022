package com.example.mycalcjv_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button [] numberButton = new Button[10];
    private Button [] functionButton = new Button [9];

    private Button  button0,button1, button2, button3, button4, button5,
                    button6, button7, button8, button9;

    private Button  buttonplus, buttonmoin, buttonmultiplier, buttondiviser,
                    buttonac, buttonpourcent, buttonegale, buttonvirgule, buttonplusmoin;

    private EditText txtNombre;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Editable x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //remplissage du tableau de button function et button number
        //avec correspondance entre objet prog et graphique

        this.txtNombre = (EditText) findViewById(R.id.buttontext);
        this.txtNombre.setEnabled(false);
        this.txtNombre.setClickable(false);

        this.button0 = (Button) findViewById(R.id.button0);
        this.button1 = (Button) findViewById(R.id.button1);
        this.button2 = (Button) findViewById(R.id.button2);
        this.button3 = (Button) findViewById(R.id.button3);
        this.button4 = (Button) findViewById(R.id.button4);
        this.button5 = (Button) findViewById(R.id.button5);
        this.button6 = (Button) findViewById(R.id.button6);
        this.button7 = (Button) findViewById(R.id.button7);
        this.button8 = (Button) findViewById(R.id.button8);
        this.button9 = (Button) findViewById(R.id.button9);

        this.buttonplus = (Button) findViewById(R.id.buttonplus);
        this.buttonmoin = (Button) findViewById(R.id.buttonmoin);
        this.buttonmultiplier = (Button) findViewById(R.id.buttonmultiplier);
        this.buttondiviser = (Button) findViewById(R.id.buttondiviser);
        this.buttonac = (Button) findViewById(R.id.buttonac);
        this.buttonpourcent = (Button) findViewById(R.id.buttonpourcent);
        this.buttonegale = (Button) findViewById(R.id.buttonegale);
        this.buttonvirgule = (Button) findViewById(R.id.buttonvirgule);
        this.buttonplusmoin = (Button) findViewById(R.id.buttonplusmoin);

        numberButton[0] = this.button0;
        numberButton[1] = this.button1;
        numberButton[2] = this.button2;
        numberButton[3] = this.button3;
        numberButton[4] = this.button4;
        numberButton[5] = this.button5;
        numberButton[6] = this.button6;
        numberButton[7] = this.button7;
        numberButton[8] = this.button8;
        numberButton[9] = this.button9;

        functionButton[0] = this.buttonplus;
        functionButton[1] = this.buttonmoin;
        functionButton[2] = this.buttonmultiplier;
        functionButton[3] = this.buttondiviser;
        functionButton[4] = this.buttonac;
        functionButton[5] = this.buttonpourcent;
        functionButton[6] = this.buttonegale;
        functionButton[7] = this.buttonvirgule;
        functionButton[8] = this.buttonplusmoin;

        //rendre les bouton function et number ecoutable
        for(int i=0; i<9; i++)
        {
            functionButton[i].setOnClickListener(this);
        }

        for(int i=0; i<10; i++)
        {
            numberButton[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.buttonac)
        {
            this.txtNombre.setText("");
        }

        if (v.getId() == R.id.buttonvirgule)
        {
            this.txtNombre.setText(this.txtNombre.getText()+ ".");
        }

        if (v.getId() == R.id.button0)
        {
            this.txtNombre.setText(this.txtNombre.getText()+ "0");
        }

        if (v.getId() == R.id.button1)
        {
            this.txtNombre.setText(this.txtNombre.getText()+ "1");
        }

        if (v.getId() == R.id.button2)
        {
            this.txtNombre.setText(this.txtNombre.getText()+ "2");
        }

        if (v.getId() == R.id.button3)
        {
            this.txtNombre.setText(this.txtNombre.getText()+ "3");
        }

        if (v.getId() == R.id.button4)
        {
            this.txtNombre.setText(this.txtNombre.getText()+ "4");
        }

        if (v.getId() == R.id.button5)
        {
            this.txtNombre.setText(this.txtNombre.getText()+ "5");
        }

        if (v.getId() == R.id.button6)
        {
            this.txtNombre.setText(this.txtNombre.getText()+ "6");
        }

        if (v.getId() == R.id.button7)
        {
            this.txtNombre.setText(this.txtNombre.getText()+ "7");
        }

        if (v.getId() == R.id.button8)
        {
            this.txtNombre.setText(this.txtNombre.getText()+ "8");
        }

        if (v.getId() == R.id.button9)
        {
            this.txtNombre.setText(this.txtNombre.getText()+ "9");
        }

        if (v.getId() == R.id.buttonplus)
        {
            num1 = Double.parseDouble(String.valueOf(this.txtNombre.getText()));
            operator = '+';
            this.txtNombre.setText("");
        }

        if (v.getId() == R.id.buttonmoin)
        {
            num1 = Double.parseDouble(String.valueOf(this.txtNombre.getText()));
            operator = '-';
            this.txtNombre.setText("");
        }

        if (v.getId() == R.id.buttonmultiplier)
        {
            num1 = Double.parseDouble(String.valueOf(this.txtNombre.getText()));
            operator = 'x';
            this.txtNombre.setText("");
        }

        if (v.getId() == R.id.buttondiviser)
        {
            num1 = Double.parseDouble(String.valueOf(this.txtNombre.getText()));
            operator = '/';
            this.txtNombre.setText("");
        }

        if (v.getId() == R.id.buttonpourcent)
        {
            num1 = Double.parseDouble(String.valueOf(this.txtNombre.getText()));
            operator = '%';
            this.txtNombre.setText("");
        }

        if (v.getId() == R.id.buttonplusmoin)
        {
            double s = Double.parseDouble(String.valueOf(this.txtNombre.getText()));
            s *= -1;
            this.txtNombre.setText(String.valueOf(s));
        }

        if (v.getId() == R.id.buttonegale)
        {
            num2 = Double.parseDouble(String.valueOf(this.txtNombre.getText()));

            switch(operator)
            {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case 'x': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
                case '%': result = num1/100 * num2; break;

            }

            // convertion de double à string pour afficher dans le champs txtNombre
            this.txtNombre.setText(String.valueOf(result));

            // stockage du resultat final
            num1 = result;
        }

    }
}

