 package com.example.appforpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View.OnCreateContextMenuListener
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.appforpractice.databinding.ActivityMainBinding


 class MainActivity : AppCompatActivity() {

    lateinit var mToolbar: Toolbar
    lateinit var mNavController: NavController
    private var _binding:ActivityMainBinding? = null
    val mBinding get() = _binding!!

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         _binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(mBinding.root)
         mToolbar = mBinding.toolbar
         mNavController = Navigation.findNavController(this, androidx.navigation.fragment.R.id.nav_host_fragment_container)
         setSupportActionBar(mToolbar)
         title = getString(R.string.title)

    }

     override fun onDestroy() {
         super.onDestroy()
         _binding = null
     }
 }