package com.ronil

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ronil.readmoretextview.R


class MainActivity : AppCompatActivity() {
//    private val textView by lazy { findViewById<ReadMoreTextView>(R.id.readMoreTextView) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     /*   textView.setCollapsedText("Less")
        textView.setCollapsedTextColor(R.color.red)
        textView.setExpandedText("More")
        textView.setExpandedTextColor(R.color.blue)
        textView.wantExpend(true)//  by default its true and when you click on it
        //it will expend the text but if you set it false
        // you will have perform the action in the listener
        textView.setOnTextViewClickListener(object : TextViewClickListener {
            override fun onReadMoreClick() {
                // Handle "Read More" click event
            }

            override fun onReadLessClick() {
                // Handle "Read Less" click event
            }
        })*/
    }
}