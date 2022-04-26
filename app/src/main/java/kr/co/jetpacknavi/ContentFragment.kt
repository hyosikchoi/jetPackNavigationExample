package kr.co.jetpacknavi

import android.os.Bundle
import android.view.View
import kr.co.jetpacknavi.databinding.FragmentContentBinding

class ContentFragment : BaseFragment<FragmentContentBinding>() {

    override fun getViewBinding(): FragmentContentBinding  = FragmentContentBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}