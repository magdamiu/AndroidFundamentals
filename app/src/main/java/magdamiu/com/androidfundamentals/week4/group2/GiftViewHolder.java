package magdamiu.com.androidfundamentals.week4.group2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import magdamiu.com.androidfundamentals.R;

//create a class ViewHolder that extends RecyclerView.ViewHolder
//this class is associated to the item
public class GiftViewHolder extends RecyclerView.ViewHolder {

    public ImageView mImageView;
    public TextView mTextViewName;
    public TextView mTextViewColorAndWeight;
    public TextView mTextViewPrice;

    public GiftViewHolder(@NonNull View itemView) {
        super(itemView);

        mImageView = itemView.findViewById(R.id.imageview_picture);
        mTextViewName = itemView.findViewById(R.id.textview_name);
        mTextViewColorAndWeight = itemView.findViewById(R.id.textview_color_and_weight);
        mTextViewPrice = itemView.findViewById(R.id.textview_price);
    }
}
