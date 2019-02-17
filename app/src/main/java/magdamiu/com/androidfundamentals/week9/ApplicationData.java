package magdamiu.com.androidfundamentals.week9;

import android.content.Context;
import android.content.SharedPreferences;

public class ApplicationData {
    private static final String APP_KEY = "android_course_key";

    // save a String value by key
    public static void setStringValueInSharedPreferences(Context ctx, String key, String value) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(ApplicationData.APP_KEY,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    // get a String value by key
    public static String getStringValueFromSharedPreferences(Context ctx, String key) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(ApplicationData.APP_KEY,
                Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, "");
    }

    // save an int value by key
    public static void setIntValueInSharedPreferences(Context ctx, String key, int value) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(ApplicationData.APP_KEY,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    // get an int value by key
    public static int getIntValueFromSharedPreferences(Context ctx, String key) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(ApplicationData.APP_KEY,
                Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key, 0);
    }


    // delete a value by key
    public static void deleteValueFromSharedPreferences(Context ctx, String key) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(ApplicationData.APP_KEY,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(key);
        editor.apply();
    }

    // delete all values
    public static void deleteAllValuesFromSharedPreferences(Context ctx) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(ApplicationData.APP_KEY,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
