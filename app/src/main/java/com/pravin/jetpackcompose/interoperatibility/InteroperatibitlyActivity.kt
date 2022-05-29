package com.pravin.jetpackcompose.interoperatibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.pravin.jetpackcompose.ExpandableCard
import com.pravin.jetpackcompose.LazyDataList
import com.pravin.jetpackcompose.R
import com.pravin.jetpackcompose.databinding.ActivityInteroperatibitlyBinding

class InteroperatibitlyActivity : AppCompatActivity() {
    lateinit var binding:ActivityInteroperatibitlyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInteroperatibitlyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.comopsableView.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                LazyDataList()
            }
        }
    }
}