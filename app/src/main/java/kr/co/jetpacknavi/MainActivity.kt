package kr.co.jetpacknavi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kr.co.jetpacknavi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private var _binding : ActivityMainBinding ?= null

   private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        val navController = navHostFragment.findNavController()

        /** KeepStateNavigator navController에 추가 */
        val navigator = KeepStateNavigator(this , navHostFragment.childFragmentManager, R.id.nav_host_fragment_container)
        navController.navigatorProvider.addNavigator(navigator)
        navController.setGraph(R.navigation.bottom_nav)

        binding.bottomNavi.setupWithNavController(navController = navController)

    }
}