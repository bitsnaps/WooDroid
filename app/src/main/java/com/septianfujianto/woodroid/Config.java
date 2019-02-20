package com.septianfujianto.woodroid;

import android.util.Log;

import com.woocommerse.OAuth1.services.HMACSha1SignatureService;
import com.woocommerse.OAuth1.services.TimestampServiceImpl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by Septian A. Fujianto on 10/31/2016.
 */
public class Config {
    public static final String SITE_URL = "http://192.168.1.4/woocommerce/";
    public static final String CURRENCY_SYMBOL = "Rp ";
    public static final char DECIMAL_SEPARATOR = ',';
    public static final char GROUPING_SPEARATOR = '.';
    public static final String WEIGHT_UNITS = " gr";
    public static final String HEIGHT_UNITS = " cm";
    public static final String ITEM_UNITS = " pcs";

    /* API KEY */
    public static final String RAJAONGKIR_STARTER_URL = "http://192.168.1.4/woocommerce/";
    public static final String RAJAONGKIR_KEY = "APP_KEY";
    public static final String DEFAULT_COURIER = "jne"; // "jne", "tiki", "pos"
    public static final int ORIGIN_CITY_ID = 152; // Jakarta Pusat
    public static final String COSTUMER_KEY = "CONSUMER_KEY";
    public static final String COSTUMER_SECRET = "CONSUMER_SECRET";
}
