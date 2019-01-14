package magdamiu.com.androidfundamentals.week8.github.api;

import java.util.List;

public interface OnGetUsersCallback {

    void onSuccess(List<User> users);

    void onError();
}
