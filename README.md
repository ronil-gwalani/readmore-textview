# Readmore-Textview
this is the library for the readmore textview.

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
     implementation 'com.github.ronil-gwalani:readmore-textview:VersionName' // here VersionName = v1.0.2
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
