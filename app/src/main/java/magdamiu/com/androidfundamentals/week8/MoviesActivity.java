package magdamiu.com.androidfundamentals.week8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import magdamiu.com.androidfundamentals.R;

public class MoviesActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewMovies;
    private MoviesAdapter mAdapter;

    private MoviesRepository mMoviesRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        mMoviesRepository = MoviesRepository.getInstance();

        mRecyclerViewMovies = findViewById(R.id.recyclerview_movies);
        mRecyclerViewMovies.setLayoutManager(new LinearLayoutManager(this));

        mMoviesRepository.getMovies(new OnGetMoviesCallback() {
            @Override
            public void onSuccess(List<Movie> movies) {
                mAdapter = new MoviesAdapter(movies);
                mRecyclerViewMovies.setAdapter(mAdapter);
            }

            @Override
            public void onError() {
                Toast.makeText(MoviesActivity.this, getString(R.string.check_internet_error), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
