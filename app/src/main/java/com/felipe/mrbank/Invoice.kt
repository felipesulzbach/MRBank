package com.felipe.mrbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.felipe.mrbank.databinding.ActivityBalanceBinding
import com.felipe.mrbank.databinding.ActivityInvoiceBinding

class Invoice : AppCompatActivity() {

    private lateinit var binding: ActivityInvoiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInvoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolBar = binding.invoiceTbr
        toolBar.title = "Invoice"
        toolBar.setTitleTextColor(getColor(R.color.white))
        toolBar.setBackgroundColor(getColor(R.color.dark_green))
        toolBar.navigationIcon = getDrawable(R.drawable.ic_back_page)
        toolBar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}