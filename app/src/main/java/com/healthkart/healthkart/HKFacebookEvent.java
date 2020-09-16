package com.healthkart.healthkart;

import android.content.Context;
import android.os.Bundle;

import com.facebook.appevents.AppEventsLogger;

import java.math.BigDecimal;
import java.util.Currency;

public class HKFacebookEvent {

  private Context mContext;

  public HKFacebookEvent(Context context){
    mContext = context;
  }

  // FACEBOOK - Tagging events
  public void tagFacebookEvent(String event) {
    AppEventsLogger logger = AppEventsLogger.newLogger(mContext);
    logger.logEvent(event);
  }

  // FACEBOOK - Tagging events
  public void tagFacebookEvent(String event, Double valueToSum) {
    AppEventsLogger logger = AppEventsLogger.newLogger(mContext);
    logger.logEvent(event, valueToSum);
  }

  // FACEBOOK - Tagging events
  public void tagFacebookEvent(String event, Bundle parameters) {
    AppEventsLogger logger = AppEventsLogger.newLogger(mContext);
    logger.logEvent(event, parameters);
  }

  // FACEBOOK - Tagging events
  public void tagFacebookEvent(String event, Double valueToSum, Bundle parameters) {
    AppEventsLogger logger = AppEventsLogger.newLogger(mContext);
    logger.logEvent(event, valueToSum, parameters);
  }
  public void tagFacebookPurcahseEvent(Double valueToSum, Bundle parameters) {
    AppEventsLogger logger = AppEventsLogger.newLogger(mContext);
    logger.logPurchase(BigDecimal.valueOf(valueToSum), Currency.getInstance("INR"),parameters);
  }

}
