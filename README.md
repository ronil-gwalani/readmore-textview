


# ReadMoreTextView Library for Android

**Features**


ReadMoreTextView is an Android library that provides a convenient way to implement a "Read More / Read Less" functionality within TextViews. This library is particularly useful when dealing with long text content in limited space, commonly encountered in messaging applications such as WhatsApp.

1. **Easily integrate "Read More / Read Less" functionality into TextViews.**
 
2. **Seamlessly handle long text content by truncating and expanding text as needed.**

3. **Customizable options for controlling the appearance and behavior of the "Read More / Read Less" functionality.** 

4. **Lightweight and efficient implementation for smooth performance.** 


>Step 1. Add the JitPack repository to your build file

```gradel
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
		}
	}
  ```
  >Step 2. Add the dependency

 ```gradel
dependencies {
     implementation 'com.github.ronil-gwalani:readmore-textview:VersionName' // here VersionName = v1.0.3
	}
  ```
  
   > Step 3 Implement the Readmore image view in your Layout xml file like this
  ```xml 
  <com.ronil.readmoretextview.ReadMoreTextView
        android:layout_width="match_parent"
        android:id="@+id/readmoreTv"
        android:textColor="@color/black"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="@string/long_text" />
  ```

> Step 4.In the main activity you can get the object and peform the various operations and also use the rest of the properties of the Textview
  ```kotlin
 class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val readMoreTextView: ReadMoreTextView =findViewById(R.id.readmoreTv)
        readMoreTextView.setCollapsedText("Show Less")
        readMoreTextView.setExpandedText("Show More")
        readMoreTextView.setCollapsedTextColor(R.color.red)
        readMoreTextView.setTrimLines(4) //By Default its 5
        readMoreTextView.setExpandedTextColor(R.color.blue)
        readMoreTextView.wantExpend(true)//  by default its true and when you click it will expend the text but if you set it false you will have perform the action in the listener
        readMoreTextView.setOnTextViewClickListener(object : TextViewClickListener {
            override fun onReadMoreClick() {
                // Handle "Read More" click event
            }

            override fun onReadLessClick() {
                // Handle "Read Less" click event
            }
        })


   }
 }
```



## Contributing

Contributions to Readmore Textview Library are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

## License

 Readmore Textview Library is released under the **MIT License**. See the [LICENSE](https://en.wikipedia.org/wiki/MIT_License) file for more details.

## Support

For any questions or support related to Chatting Library, you can reach out to us at ronilgwalani@gmail.com or join my community forum.

## Credits

The Readmore Textview Library is developed by [Ronil Gwalani](https://github.com/ronil-gwalani) feel free to contact in case of any query.
