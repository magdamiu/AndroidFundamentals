package magdamiu.com.androidfundamentals.week8;

import android.support.annotation.NonNull;

import magdamiu.com.androidfundamentals.BuildConfig;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MoviesRepository {

    private static final String LANGUAGE = "en-US";

    private static MoviesRepository sRepository;

    private TmdbApi mTMDbApi;

    private MoviesRepository(TmdbApi api) {
        this.mTMDbApi = api;
    }

    public static MoviesRepository getInstance() {
        if (sRepository == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            sRepository = new MoviesRepository(retrofit.create(TmdbApi.class));
        }

        return sRepository;
    }

    public void getMovies(final OnGetMoviesCallback callback) {
        mTMDbApi.getPopularMovies("<YOUR_KEY>", LANGUAGE, 1)
                .enqueue(new Callback<MoviesResponse>() {
                    @Override
                    public void onResponse(@NonNull Call<MoviesResponse> call, @NonNull Response<MoviesResponse> response) {
                        if (response.isSuccessful()) {
                            MoviesResponse moviesResponse = response.body();
                            if (moviesResponse != null && moviesResponse.getMovies() != null) {
                                callback.onSuccess(moviesResponse.getMovies());
                            } else {
                                callback.onError();
                            }
                        } else {
                            callback.onError();
                        }
                    }

                    @Override
                    public void onFailure(Call<MoviesResponse> call, Throwable t) {
                        callback.onError();
                    }
                });
    }
}