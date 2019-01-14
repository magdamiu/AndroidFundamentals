package magdamiu.com.androidfundamentals.week8.github.api;

import java.util.List;

import magdamiu.com.androidfundamentals.BuildConfig;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UsersRepository {

    private static UsersRepository sRepository;

    private GithubApi mGithubAoi;

    private UsersRepository(GithubApi api) {
        this.mGithubAoi = api;
    }

    public static UsersRepository getInstance() {
        if (sRepository == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_GITHUB_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            sRepository = new UsersRepository(retrofit.create(GithubApi.class));
        }

        return sRepository;
    }

    public void getUsers(final OnGetUsersCallback callback) {
        mGithubAoi.getAllUsers()
                .enqueue(new Callback<List<User>>() {
                    @Override
                    public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                        if (response.isSuccessful()) {
                            List<User> users = response.body();
                            if (users != null) {
                                callback.onSuccess(users);
                            } else {
                                callback.onError();
                            }
                        } else {
                            callback.onError();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<User>> call, Throwable t) {
                        callback.onError();
                    }
                });
    }
}
