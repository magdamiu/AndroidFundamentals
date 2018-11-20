package magdamiu.com.androidfundamentals.week3.utils;

import android.text.TextUtils;
import android.util.Patterns;

public class EmailHelper {

    public static boolean isEmailAddressPattern(String email) {
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    public static boolean isEmailValid(String email) {
        if (email != null && isEmailAddressPattern(email)) {
            return true;
        } else {
            return false;
        }
    }
}
