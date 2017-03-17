package com.reserva;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TimePicker;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.RatingBar;

public class Actividad2 extends Activity {

	String nombre = "", fecha = "", hora = "";
	int personas = 0;
	TextView muestraDatos;
	EditText correo;

	RatingBar mBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actividad2);

		muestraDatos = (TextView) findViewById(R.id.muestraDatos);
		mBar = (RatingBar) findViewById(R.id.ratingBar);

		Bundle recibe = new Bundle();
		recibe = this.getIntent().getExtras();

		nombre = recibe.getString("nombre");
		personas = recibe.getInt("personas");
		fecha = recibe.getString("fecha");
		hora = recibe.getString("hora");

		muestraDatos.setText("Reservacion a nombre de:\n" + nombre + "\n" + personas
				+ " personas\nFecha: " + fecha + "\nHora: " + hora + "\n");

	}

	protected void mesa(View xx ){
		Intent intento = new Intent(this, MainActivity.class);
		Bundle info = new Bundle();
		finish();
		startActivity(intento);
	}

	public void hacerOtraReserva(View v) {
		Intent envia = new Intent(this, MainActivity.class);
		finish();
		startActivity(envia);
	}

	public void enviaCorreo (View v) {
		Intent enviaCorreo = new Intent(this, MainActivity.class);
		Bundle info = new Bundle();
		RatingBar bar = (RatingBar) v;
		info.putString("rating", String.valueOf(bar.getRating()));
		enviaCorreo.putExtras(info);
		finish();
		startActivity(enviaCorreo);
	}

}
