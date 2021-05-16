package com.felipe.mrbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.felipe.mrbank.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addBalance()
        addInvoice()
        addTransfer()
        addSavings()
    }

    private fun addBalance() {
        binding.balanceImg.setOnClickListener {
            val intent = Intent(this, Balance::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun addInvoice() {
        binding.invoicesImg.setOnClickListener {
            val intent = Intent(this, Invoice::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun addTransfer() {
        binding.transferImg.setOnClickListener {
            val intent = Intent(this, Transfer::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun addSavings() {
        binding.savingsImg.setOnClickListener {
            val intent = Intent(this, Savings::class.java)
            startActivity(intent)
            finish()
        }
    }
}