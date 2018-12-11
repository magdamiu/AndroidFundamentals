package magdamiu.com.androidfundamentals.week4.group2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import magdamiu.com.androidfundamentals.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewGifts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_group2);

        initView();
    }

    private void initView() {
        mRecyclerViewGifts = findViewById(R.id.recyclerview_gifts);

        //set the layout manager for the current recycler view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewGifts.setLayoutManager(layoutManager);

        //create the adapter
        GiftAdapter giftAdapter = new GiftAdapter(getGiftsList());

        //set the adapter to the recycler view
        mRecyclerViewGifts.setAdapter(giftAdapter);
    }

    //get the data source
    private List<Gift> getGiftsList() {
        List<Gift> gifts = new ArrayList<>();
        Gift gift1 = new Gift("red", 3, "Book", 200,
                "https://images.unsplash.com/photo-1510546462255-979b0e0ca1b5?w=800&q=60");
        Gift gift2 = new Gift("pink", 2, "Scarf", 20,
                "https://images.unsplash.com/photo-1514207994142-98522b5a2b23?w=800&q=60");
        Gift gift3 = new Gift("blue", 5, "T-shirt", 160,
                "https://images.unsplash.com/photo-1512909481869-0eaa1e9817ba?w=800&q=60");
        Gift gift4 = new Gift("white", 1, "Scarf", 80,
                "https://images.unsplash.com/photo-1514192631-251f5f0b14f2?w=800&q=60");
        Gift gift5 = new Gift("green", 2, "Book", 250,
                "https://images.unsplash.com/photo-1519894520384-1ee1adbe7bd8?w=800&q=60");
        Gift gift6 = new Gift("yellow", 1, "Toy car", 400,
                "https://images.unsplash.com/photo-1511837008003-71eca36ceb70?w=800&q=60");
        Gift gift7 = new Gift("blue", 1, "Chocolate", 560,
                "https://images.unsplash.com/photo-1481391319762-47dff72954d9?w=800&q=60");
        Gift gift8 = new Gift("magenta", 1, "Phone", 530,
                "https://images.unsplash.com/photo-1480717846107-87837abec1e9?w=800&q=60");
        Gift gift9 = new Gift("black", 3, "Blazer", 520,
                "https://images.unsplash.com/photo-1513796430146-c91cf8e4d65c?w=800&q=60");
        Gift gift10 = new Gift("orange", 7, "Shoes", 720,
                "https://images.unsplash.com/photo-1480632563560-30f503c09195?w=800&q=60");
        gifts.add(gift1);
        gifts.add(gift2);
        gifts.add(gift3);
        gifts.add(gift4);
        gifts.add(gift5);
        gifts.add(gift6);
        gifts.add(gift7);
        gifts.add(gift8);
        gifts.add(gift9);
        gifts.add(gift10);
        return gifts;
    }
}
