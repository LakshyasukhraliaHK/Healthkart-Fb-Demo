package com.healthkart.healthkart;

public interface TrackingConstant {

  interface EventName {
    String PRODUCT_SEARCHED = "ProductSearched";
    String PRODUCT_VIEWED = "ProductViewed";
    String CATEGORY_VIEWED = "CategoryViewed";
    String PRODUCT_REVIEWED = "ProductReviewed";
    String ADDED_TO_CART = "AddedToCart";
    String CART_REMOVAL = "CartRemoval";
    String CART_UPDATED = "CartUpdated";
    String COUPON_CODE_APPLIED = "CouponCodeApplied";
    String CHECKOUT_STARTED = "CheckoutStarted";
    String CHECKOUT_COMPLETED = "CheckoutCompleted";
    String FILTER_APPLIED = "FilterApplied";
    String SORT_APPLIED = "SortApplied";
    String SIGN_UP = "SignUp";
    String PAYMENT_CREATE = "PaymentCreate";
    String PAYMENT_REQUEST = "PaymentRequest";
    String PAYMENT_GATEWAY = "PaymentGateway";
    String PAYMENT_RESPONSE = "PaymentResponse";
    String PAYMENT_ACCEPT = "PaymentAccept";
    String PAYMENT_NOTIFICATION_RECEIVED = "PaymentNotificationReceived";
    String PAYMENT_NOTIFICATION_OPENED = "PaymentNotificationOpened";
  }

  interface Attribute {
    String KEYWORD = "keyword";
    String CATEGORY = "category";
    String CATEGORY_ID = "categoryId";
    String SORT = "sort";
    String FILTERS = "filters";
    String HK_COACH_PROFILE = "hkCoachProfile";
    String RESULT_COUNT = "resultCount";
    String VARIANT_ID = "variantId";
    String PACK_ID = "packId";
    String NAME = "name";
    String ITEM_NAME = "itemName";
    String PRICE = "price";
    String LEAF_NODE = "leafNode";
    String BRAND = "brand";
    String VENDOR = "vendor";
    String ACTION = "action";
    String PRODUCT_IMAGE_URL = "productImageUrl";
    String USER_RATING = "userRating";
    String CART_VALUE = "cartValue";
    String QUANTITY = "quantity";
    String ORDER_DATE  = "orderDate";
    String OFFER = "offer";
    String COUPON_CODE = "couponCode";
    String CART_ITEMS = "cartItems";
    String FIREBASE_ITEMS_NOS = "item_nos";
    String TOTAL_VALUE = "totalValue";
    String TRANSACTION_ID = "transactionId";
    String PAYMENT_MODE = "paymentMode";
    String PAYMENT_TYPE = "paymentType";
    String CANCEL_REASON  =  "cancelReason";
    String SHIPPING_PRICE = "shippingPrice";
    String PRODUCTS = "products";
    String AIM = "aim";
    String EMAIL = "email";
    String USER_ID = "userId";
    String ACTIVITY = "activity";
    String WORKOUT_EXPERIENCE = "workoutExperience";
    String WEIGHT = "weight";
    String HEIGHT = "height";
    String PHONE = "phone";
    String DATE_OF_BIRTH = "dateOfBirth";
    String GENDER = "gender";
    String FIRST_NAME = "firstName";
    String PRIMARY_ATTRIBUTE_NAME = "primaryAttributeName";
    String PRIMARY_ATTRIBUTE_VALUE = "primaryAttributeValue";
    String SECONDARY_ATTRIBUTE_NAME = "secondaryAttributeName";
    String SECONDARY_ATTRIBUTE_VALUE = "secondaryAttributeValue";
    String ITEM_SECONDARY_CATEGORY="item_seccategory";
    String TYPE = "type";
    String ENTITY_ID = "entityId";
    String BANK_NAME = "bankName";
    String GATEWAY_ID = "payuGatewayId";
    String ORDER_GATEWAY_ID   = "gatewayId";
    String FAILURE_REASON = "failureReason";
    String STATUS = "status";
    String BY_PAYMENT_NOTIFICATION = "byPaymentNotification";
    String EXPECTED_TAT="expectedTat";
    String CFA_STORE_TAT="cfaStoreTat";
    String RETAIL_STORE_TAT="retailStoreTat";
    String SAME_DAY_DELIVERY="sameDayDelivery";
    String PINCODE="pin";
    String LOCATION="location";
    String FOOD_NAME = "foodName";
    String consultNotificationEventType = "consultNotificationEventType";
    String IS_PROFILE_CREATED_FROM_ORDER_PAGE = "isProfileCreatedFromOrderPage";
  }
}
