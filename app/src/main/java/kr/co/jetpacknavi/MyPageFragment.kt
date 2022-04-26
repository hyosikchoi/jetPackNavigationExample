package kr.co.jetpacknavi

import android.os.Bundle
import android.view.View
import kr.co.jetpacknavi.databinding.FragmentMyapgeBinding

class MyPageFragment : BaseFragment<FragmentMyapgeBinding>() {

    override fun getViewBinding(): FragmentMyapgeBinding = FragmentMyapgeBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}