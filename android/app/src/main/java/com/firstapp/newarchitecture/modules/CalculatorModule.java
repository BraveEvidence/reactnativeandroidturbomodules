package com.firstapp.newarchitecture.modules;

import android.util.Log;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.firstapp.codegen.NativeCalculatorSpec;

import java.util.Map;
import java.util.HashMap;

public class CalculatorModule extends NativeCalculatorSpec {
    public static final String NAME = "Calculator";

    public CalculatorModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void add(double a, double b, Promise promise) {
        Log.i("here123","Values are"+a+" "+b);
        promise.resolve(a + b);
    }
}
