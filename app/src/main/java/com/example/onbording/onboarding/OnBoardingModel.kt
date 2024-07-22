package com.example.onbording.onboarding

import androidx.annotation.DrawableRes
import com.example.onbording.R

sealed class OnBoardingModel (
    @DrawableRes  val image: Int,
    val title : String,
    val description: String
){
    data object FirstPages : OnBoardingModel(
        image = R.drawable.img_into_1,
        title = "Your Reading Partner",
        description = "Read as many book as you want, anywhere you want"
    )data object SecondPages : OnBoardingModel(
        image = R.drawable.img_into_2,
        title = "Your Personal Library",
        description = "Organize books in different ways, make your own library"
    )data object ThirdPages : OnBoardingModel(
        image = R.drawable.img_into_3,
        title = "Search and Filter",
        description = "Get any book you want within a simple search across your device"
    )
}