package com.example.mylifecycle.utils

import android.view.View
import android.widget.EditText
import android.widget.ImageView

/*class ViewExtensions {
}*/
fun View.show(){
    this.visibility=View.VISIBLE
}
fun View.hide(){
    this.visibility= View.GONE
}
fun EditText.textString():String{
    return this.text.toString()
}

fun EditText.clear() {
    setText("")
}
/*fun ImageView.loadImage(url: String?) {
    Glide.with(this.context)
        .load(url)
        .into(this)
}*/

