package com.brunoleonardo.brunoleonardo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brunoleonardo.brunoleonardo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // le lien entre le fichier xml et l'activité
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // le lien entre le fichier xml et l'activité
        setContentView(binding.root) // le lien entre le fichier xml et l'activité
    }
    // Action du bouton convertir

    fun actionConversion(view: android.view.View) {
        var mesureDe = binding.spinnerM.selectedItem.toString()
        var mesureA = binding.spinnerI.selectedItem.toString()
        var valeur = binding.entrerDonnes.text.toString().toDouble()

        var resultat = 0.0


        if (mesureDe == "kilomètre" && mesureA == "mille") {
            resultat = valeur * 0.621371
        }
        else if (mesureDe == "metre" && mesureA == "mille") {
            resultat = valeur * 0.000621371
        }
        else if (mesureDe == "centimetre" && mesureA == "mille") {
            resultat = valeur * 0.00000621371
        }
        else if (mesureDe == "millimetre" && mesureA == "mille") {
            resultat = valeur * 0.000000621371
        }

        if (mesureDe == "kilomètre" && mesureA == "yard"){
            resultat = valeur * 1093.61
        }
        else if (mesureDe == "metre" && mesureA == "yard") {
            resultat = valeur * 1.09361
        }
        else if (mesureDe == "centimetre" && mesureA == "yard") {
            resultat = valeur * 0.0109361
        }
        else if (mesureDe == "millimetre" && mesureA == "yard") {
            resultat = valeur * 0.00109361
        }

        if (mesureDe == "kilomètre" && mesureA == "pied") {
            resultat = valeur * 3280.84
        }
        else if (mesureDe == "metre" && mesureA == "pied") {
            resultat = valeur * 3.28084
        }
        else if (mesureDe == "centimetre" && mesureA == "pied") {
            resultat = valeur * 0.0328084
        }
        else if (mesureDe == "millimetre" && mesureA == "pied") {
            resultat = valeur * 0.00328084
        }

        if (mesureDe == "kilomètre" && mesureA == "pouce") {
            resultat = valeur * 39370.1
        }
        else if (mesureDe == "metre" && mesureA == "pouce") {
            resultat = valeur * 39.3701
        }
        else if (mesureDe == "centimetre" && mesureA == "pouce") {
            resultat = valeur * 0.393701
        }
        else if (mesureDe == "millimetre" && mesureA == "pouce") {
            resultat = valeur * 0.0393701
        }


        binding.textViewResultat.text = resultat.toString()

        if(binding.checkBoxAjoutter.isChecked){
            binding.textViewR1.text = resultat.toString()
        }
        else {
            binding.textViewResultat.text = resultat.toString()
        }

    }

    // function reinitianiler
    fun actionReinitialiser(view: android.view.View) {
        binding.entrerDonnes.text.clear()
        binding.textViewResultat.text = ""
        binding.textViewR1.text = ""
        binding.checkBoxAjoutter.isChecked = false
    }








}

