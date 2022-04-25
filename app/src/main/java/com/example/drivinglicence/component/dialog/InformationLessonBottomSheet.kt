package com.example.drivinglicence.component.dialog

import com.example.drivinglicence.R
import com.example.drivinglicence.databinding.InformationLessonBottomSheetBinding
import com.example.drivinglicence.utils.LICENSE

class InformationLessonBottomSheet : BaseBottomSheetDialog<InformationLessonBottomSheetBinding>() {
    override fun initView() {
        initData()
    }

    override fun initData() {
        when (arguments?.getString(LICENSE) ?: "A1") {
            "A1" -> {
                binding.textContentBottomSheet.text =
                    getString(R.string.text_content_information_A1_license)
            }
            "A2" -> {
                binding.textContentBottomSheet.text =
                    getString(R.string.text_content_information_A2_license)
            }
        }
    }

    override fun getTheme(): Int = R.style.BottomSheetDialogTheme
}