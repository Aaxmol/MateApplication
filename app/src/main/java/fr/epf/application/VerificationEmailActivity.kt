package fr.epf.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class VerificationEmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_email)
    }
}

//PENSEZ A PASSER LA SESSION ACTIVVE EN TRUE POUR RECUP LES INFOS DU COLOC CONNECTE