package magdamiu.com.androidfundamentals.week8;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import magdamiu.com.androidfundamentals.R;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    TextView mTextViewReleaseDate;
    TextView mTextViewTitle;
    TextView mTextViewRating;
    TextView mTextViewGender;

    public MovieViewHolder(View itemView) {
        super(itemView);
        mTextViewReleaseDate = itemView.findViewById(R.id.textview_release_date);
        mTextViewTitle = itemView.findViewById(R.id.textview_title);
        mTextViewRating = itemView.findViewById(R.id.textview_rating);
        mTextViewGender = itemView.findViewById(R.id.textview_gender);
    }

    public void bind(Movie movie) {
        mTextViewReleaseDate.setText(movie.getReleaseDate().split("-")[0]);
        mTextViewTitle.setText(movie.getTitle());
        mTextViewRating.setText(String.valueOf(movie.getRating()));
        mTextViewGender.setText("");
    }
}