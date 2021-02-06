package easv.oe.bindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import easv.oe.bindingtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHeader.text = "ole"

        //findViewById<TextView>(R.id.tvHeader).text = "peter"
        //setContentView(R.layout.activity_main)

    }
}