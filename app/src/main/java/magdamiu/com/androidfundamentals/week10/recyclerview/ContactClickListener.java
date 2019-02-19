package magdamiu.com.androidfundamentals.week10.recyclerview;

import android.view.View;

public interface ContactClickListener{
     void onClick(View view, int position);
     void onLongClick(View view,int position);
}