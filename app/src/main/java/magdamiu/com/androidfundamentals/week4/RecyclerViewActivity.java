package magdamiu.com.androidfundamentals.week4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import magdamiu.com.androidfundamentals.R;
import magdamiu.com.androidfundamentals.week4.models.Contact;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewContacts;
    private List<Contact> mContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        // get recycler view from xml layout
        mRecyclerViewContacts = findViewById(R.id.recyclerview_contacts);

        // define and set layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewContacts.setLayoutManager(layoutManager);

        // get data source
        mContacts = getContacts();

        // get the adapter instance
        ContactsAdapter contactsAdapter = new ContactsAdapter(mContacts);

        // set the adapter to the recycler view
        mRecyclerViewContacts.setAdapter(contactsAdapter);

    }

    private List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ion", "Ionescu"));
        contacts.add(new Contact("Android", "Cupcake"));
        contacts.add(new Contact("Android", "Donut"));
        contacts.add(new Contact("Android", "Pie"));
        contacts.add(new Contact("Ioana", "Ionescu"));
        contacts.add(new Contact("John", "Doe"));
        contacts.add(new Contact("John1", "Doe1"));
        contacts.add(new Contact("John2", "Doe2"));
        contacts.add(new Contact("John3", "Doe3"));
        contacts.add(new Contact("John4", "Doe4"));
        return contacts;
    }
}
