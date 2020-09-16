package com.healthkart.healthkart

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsConstants
import com.healthkart.healthkart.TrackingConstant.Attribute.ITEM_SECONDARY_CATEGORY
import java.lang.String

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

    private fun tempFacebookEventParam(): Bundle? {
        try {
            // Facebook event tracking for analytics
            val parameters = Bundle()
            parameters.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, "INR")
            parameters.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, "product")
            parameters.putString(AppEventsConstants.EVENT_PARAM_CONTENT_ID, "temp123")
            parameters.putString("Product Name", "temp123")
            parameters.putString("Brand Name", "temp123")
            parameters.putString("Category Name", "temp123")
//            val variantAttributes: List<VariantAttribute> = variantInfo.getAttributeList()
//            if (variantAttributes != null) {
            var primaryAttrName = "temp123"
            var primaryAttrValue = "temp123"
            var secondaryAttrName = "temp123"
            var secondaryAttrValue = "temp123"
//                val len: Int = variantInfo.getAttributeList().size()
//                for (i in 0 until len) {
//                    val variantAttribute: VariantAttribute = variantAttributes[i]
//                    if (i == 0) {
//                        primaryAttrName = primaryAttrName + variantAttribute.getDisplayName()
//                        primaryAttrValue =
//                            primaryAttrValue + variantAttribute.getSelectedValue().getValueName()
//                    } else {
//                        if (i + 1 == len) {
//                            secondaryAttrName =
//                                secondaryAttrName + variantAttribute.getDisplayName()
//                            secondaryAttrValue =
//                                secondaryAttrValue + variantAttribute.getSelectedValue()
//                                    .getValueName()
//                        } else {
//                            secondaryAttrName =
//                                secondaryAttrName + variantAttribute.getDisplayName()
//                                    .toString() + ","
//                            secondaryAttrValue =
//                                secondaryAttrValue + variantAttribute.getSelectedValue()
//                                    .getValueName().toString() + ","
//                        }
//                    }
//                }
            parameters.putString(
                TrackingConstant.Attribute.PRIMARY_ATTRIBUTE_NAME,
                primaryAttrName
            )
            parameters.putString(
                TrackingConstant.Attribute.PRIMARY_ATTRIBUTE_VALUE,
                primaryAttrValue
            )
            parameters.putString(
                TrackingConstant.Attribute.SECONDARY_ATTRIBUTE_NAME,
                secondaryAttrName
            )
            parameters.putString(
                TrackingConstant.Attribute.SECONDARY_ATTRIBUTE_VALUE,
                secondaryAttrValue
            )
//            }
            parameters.putString(
                TrackingConstant.Attribute.VARIANT_ID,
                "temp123"
            )
            parameters.putString(TrackingConstant.Attribute.LEAF_NODE, "temp123")
            parameters.putString(TrackingConstant.Attribute.VENDOR, "temp123")
            parameters.putString(
                TrackingConstant.Attribute.PRICE,
                "112233"
            )

            parameters.putString(EventConstants.CAT_PREFIX, "temp123")
            parameters.putString(ITEM_SECONDARY_CATEGORY, "temp123")
            parameters.putString(EventConstants.AWS_PAGE_NAME, "temp123")
            return parameters
        } catch (e: Exception) {
            println("Exception in facebook event tracking")
            Log.d("Exception", e.localizedMessage)
            return null
        }
    }
}