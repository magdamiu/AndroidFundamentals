package magdamiu.com.androidfundamentals.week4.group2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import magdamiu.com.androidfundamentals.R;

//create a class that extends RecyclerView.Adapter<GiftViewHolder>
public class GiftAdapter extends RecyclerView.Adapter<GiftViewHolder> {
    private List<Gift> mGifts;

    public GiftAdapter(List<Gift> gifts) {
        mGifts = gifts;
    }

    @NonNull
    @Override
    public GiftViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View giftView = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.gift_item, viewGroup, false);
        return new GiftViewHolder(giftView);
    }

    @Override
    public void onBindViewHolder(@NonNull GiftViewHolder giftViewHolder, int i) {
        Gift gift = mGifts.get(i);
        giftViewHolder.mTextViewName.setText(gift.getName());
        giftViewHolder.mTextViewColorAndWeight.setText(gift.getColor() + " /" +
                gift.getWeight());
        giftViewHolder.mTextViewPrice.setText(gift.getPrice() + " RON");
        Picasso.get().load(gift.getPicture())
                .into(giftViewHolder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mGifts.size();
    }
}
