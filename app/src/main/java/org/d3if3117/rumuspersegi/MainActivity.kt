package org.d3if3117.rumuspersegi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import org.d3if3117.rumuspersegi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnKeliling.setOnClickListener { keliling() }
        binding.btnLuas.setOnClickListener { luas() }
}
    private fun keliling() {
        val sisi = binding.etSisi.text.toString()
        if (TextUtils.isEmpty(sisi)) {
            Toast.makeText(this, R.string.sisi_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val hasilKeliling = (sisi.toDouble()*4)
        binding.tvKeliling.text=getString (R.string.keliling_x,hasilKeliling)
        }
    private fun luas() {
        val sisi = binding.etSisi.text.toString()
        if (TextUtils.isEmpty(sisi)) {
            Toast.makeText(this, R.string.sisi_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val hasilLuas= (sisi.toDouble() * sisi.toDouble())
        binding.tvLuas.text=getString (R.string.luas_x,hasilLuas)
    }
}