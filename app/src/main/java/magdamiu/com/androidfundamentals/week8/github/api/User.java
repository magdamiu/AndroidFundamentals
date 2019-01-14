package magdamiu.com.androidfundamentals.week8.github.api;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("name")
    private String mName;

    public User(String name) {
        this.mName = name;
    }

    public String getUser() {
        return mName;
    }

    public void setUser(String name) {
        this.mName = name;
    }
}
