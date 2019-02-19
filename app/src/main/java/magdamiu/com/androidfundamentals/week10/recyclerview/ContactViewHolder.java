package magdamiu.com.androidfundamentals.week10.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import magdamiu.com.androidfundamentals.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextViewFullName;
    private TextView mTextViewAddres;
    private TextView mTextViewGroup;
    private ImageView mImageViewProfilePicture;
    private Button mButtonClick;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);

        mTextViewFullName = itemView.findViewById(R.id.text_view_full_name);
        mTextViewAddres = itemView.findViewById(R.id.text_view_address);
        mTextViewGroup = itemView.findViewById(R.id.text_view_group);
        mImageViewProfilePicture = itemView.findViewById(R.id.image_view_profile_picture);
        mButtonClick = itemView.findViewById(R.id.button_click);
    }

    public TextView getTextViewFullName() {
        return mTextViewFullName;
    }

    public void setTextViewFullName(TextView textViewFullName) {
        mTextViewFullName = textViewFullName;
    }

    public TextView getTextViewAddres() {
        return mTextViewAddres;
    }

    public void setTextViewAddres(TextView textViewAddres) {
        mTextViewAddres = textViewAddres;
    }

    public TextView getTextViewGroup() {
        return mTextViewGroup;
    }

    public void setTextViewGroup(TextView textViewGroup) {
        mTextViewGroup = textViewGroup;
    }

    public ImageView getImageViewProfilePicture() {
        return mImageViewProfilePicture;
    }

    public void setImageViewProfilePicture(ImageView imageViewProfilePicture) {
        mImageViewProfilePicture = imageViewProfilePicture;
    }

    public Button getmButtonClick() {
        return mButtonClick;
    }

    public void setmButtonClick(Button mButtonClick) {
        this.mButtonClick = mButtonClick;
    }
}