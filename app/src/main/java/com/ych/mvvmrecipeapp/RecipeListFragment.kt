package com.ych.mvvmrecipeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment


class RecipeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        //1.Kotlin中Fragment使用
//        var rootView = inflater.inflate(R.layout.fragment_recipe_list,container,false)
//        return rootView

//        //2.Compose中Fragment使用
//        return ComposeView(requireContext()).apply {
//            setContent {
//                Text(text = "Compose Recipe List")
//            }
//        }
        //3.当某些自定义View不支持Compose时，我们还得使用layout文件，只是可以采用ComposeView声明在XML中
        var view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
        view.findViewById<ComposeView>(R.id.compose_view).setContent {
            Column(
                modifier = Modifier
                    .padding(all = 10.dp)
                    .border(border = BorderStroke(width = 1.dp, color = Color.LightGray))
            ) {
                Text(text = "自定义View，不支持Compose时，采用ComposeView")
                Spacer(modifier = Modifier.padding(10.dp))

                //进度条旋转的
                CircularProgressIndicator()
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = "NEAT")
//                val customView = HorizontalDott
            }
            
        }
        return view
    }
}