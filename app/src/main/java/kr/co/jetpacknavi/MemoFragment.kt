package kr.co.jetpacknavi

import android.os.Bundle
import android.view.View
import kr.co.jetpacknavi.databinding.FragmentMemoBinding

class MemoFragment : BaseFragment<FragmentMemoBinding>() {

    override fun getViewBinding(): FragmentMemoBinding = FragmentMemoBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}