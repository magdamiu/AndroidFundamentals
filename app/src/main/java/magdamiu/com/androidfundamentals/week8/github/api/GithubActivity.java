package magdamiu.com.androidfundamentals.week8.github.api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import magdamiu.com.androidfundamentals.R;
import magdamiu.com.androidfundamentals.utils.Logging;
import magdamiu.com.androidfundamentals.week8.Movie;
import magdamiu.com.androidfundamentals.week8.MoviesActivity;
import magdamiu.com.androidfundamentals.week8.MoviesAdapter;
import magdamiu.com.androidfundamentals.week8.MoviesRepository;
import magdamiu.com.androidfundamentals.week8.OnGetMoviesCallback;

public class GithubActivity extends AppCompatActivity {

    private UsersRepository mUsersRepository;

    private TextView mTextViewGithub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        mTextViewGithub = findViewById(R.id.textview_github);

        mUsersRepository = UsersRepository.getInstance();

        mUsersRepository.getUsers(new OnGetUsersCallback() {
            @Override
            public void onSuccess(List<User> users) {
                Logging.show("Github users = ", users.toString());
                mTextViewGithub.setText(users.toString());
            }

            @Override
            public void onError() {
                Logging.show("error Github users = ", "check the code :D ");
                mTextViewGithub.setText(getString(R.string.error_occured));
            }
        });
    }
}
