package kg.geektech.kotlin2.extentions

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.glide(uri:String){
    Glide.with(this).load(uri).into(this)
}