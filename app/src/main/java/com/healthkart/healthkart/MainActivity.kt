package com.healthkart.healthkart

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsConstants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FacebookSdk.setApplicationId("1472859052935932")
        FacebookSdk.sdkInitialize(this)

        val hkFacebookEvent = HKFacebookEvent(this)

        val btnFbContent = findViewById<Button>(R.id.button1)
        val btnFbPurchase = findViewById<Button>(R.id.button2)

        btnFbContent.setOnClickListener {
            hkFacebookEvent.tagFacebookEvent(
                AppEventsConstants.EVENT_NAME_VIEWED_CONTENT,
                123.0,
                tempFacebookEventParam()
            )
        }
        btnFbPurchase.setOnClickListener {
            hkFacebookEvent.tagFacebookPurcahseEvent(123.0, tempFacebookEventParam())
        }

    }

    private fun tempFacebookEventParam() : Bundle?{
        try {
            // Facebook event tracking for analytics
            val parameters = Bundle()
            parameters.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, "INR")
            parameters.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, "product")
            parameters.putString(AppEventsConstants.EVENT_PARAM_CONTENT_ID, "temp123")
            parameters.putString("Product Name", "temp123")
            parameters.putString("Brand Name", "temp123")
            parameters.putString("Category Name", "temp123")

            parameters.putString(
                "temp123",
                "temp123"
            )
            parameters.putString(
                "temp123",
                "temp123"
            )
            parameters.putString(
                "temp123",
                "temp123"
            )
            parameters.putString(
                "temp123",
                "temp123"
            )

            parameters.putString(
                "temp123",
                "temp123"
            )
            parameters.putString("temp123", "temp123")
            parameters.putString("temp123", "temp123")
            parameters.putString(
                "temp123",
                "123.0"
            )

            parameters.putString("temp123", "temp123")
            parameters.putString("temp123", "temp123")

            parameters.putString("temp123", "temp123")

            return parameters
        } catch (e: Exception) {
            println("Exception in facebook event tracking")
            Log.d("Exception", e.localizedMessage)
        }

        return null
    }
}