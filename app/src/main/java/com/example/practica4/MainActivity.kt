package com.example.practica4

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var cnum1:EditText
    lateinit var cnum2:EditText
    lateinit var cresult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //cnum1=findViewById(R.id.gnum1)
        //cnum2=findViewById(R.id.gnum2)
        //cresult=findViewById(R.id.gresul)
        cnum1=findViewById<EditText>(R.id.gnum1)
        cnum2=findViewById<EditText>(R.id.gnum2)
        cresult=findViewById<TextView>(R.id.gresul)
    }
    public fun valida (){

    }

    public fun aceptar(vista:View){
        //var num1=cnum1.text.toString().toInt()
        //var num2=cnum2.text.toString().toInt()
        //var res=num1+num2
        //cresult.text=res.toString()
        val txt1 = cnum1.text.toString()
        val txt2 = cnum2.text.toString()
        if (txt1.isEmpty() || txt2.isEmpty()){
            cresult.text = "Ingresa ambos numeros"
            return
        }
        var num1: Int
        var num2: Double
        var res: Double //cambie de Int a Double

        num1 = Integer.parseInt(txt1)
        num2 = txt2.toDouble()  //cambie el Integer.parseInt(txt2)
        when (num1){
            !in 1..50 ->  {cresult.text = "El numero debe estar entre 1 y 50"
                return}
        }
        when (num2){
            !in 7.5..12.3 -> {cresult.text = "El numero debe estar entre 7.5 y 12.3"
                return}
        }
        res = num1 + num2
        cresult.text = res.toString()
    }
}