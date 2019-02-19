package magdamiu.com.androidfundamentals.week10.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import magdamiu.com.androidfundamentals.R;

public class ComplexRecyclerView extends AppCompatActivity {
    private static final int CONTACTS_COUNT = 25;

    private RecyclerView mRecyclerViewContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_recycler_complex);

        initView();
    }

    private void initView() {
        mRecyclerViewContacts = findViewById(R.id.recycler_view_contacts_complex);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewContacts.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter = new ContactAdapter(getContacts(), ComplexRecyclerView.this);
        mRecyclerViewContacts.setAdapter(contactAdapter);

        mRecyclerViewContacts.addOnItemTouchListener(new RecyclerTouchListener(this,
                mRecyclerViewContacts, new ContactClickListener() {
            @Override
            public void onClick(View view, final int position) {
                Toast.makeText(ComplexRecyclerView.this, getString(R.string.single_click) + position,
                        Toast.LENGTH_SHORT).show();

                // TODO button click inside of recycler view
                Button button = view.findViewById(R.id.button_click);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // implement button click
                        Toast.makeText(ComplexRecyclerView.this, getString(R.string.button_item) + position,
                                Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onLongClick(View view, int position) {
                Toast.makeText(ComplexRecyclerView.this, getString(R.string.long_click) + position,
                        Toast.LENGTH_LONG).show();
            }
        }));
    }

    private List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        Contact contact;
        for (int i = 0; i < CONTACTS_COUNT; i++) {
            contact = new Contact();
            contact.setFullName("Android Name " + i);
            contact.setAddresse("Address " + i);
            contact.setGroup("Family " + i);
            contact.setImageUrl("https://cdn.guidingtech.com/media/assets/WordPress-Import/2012" +
                    "/10/Smiley-Thumbnail.png");
            contacts.add(contact);
        }
        return contacts;
    }
}