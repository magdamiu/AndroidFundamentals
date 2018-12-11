package magdamiu.com.androidfundamentals.week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import magdamiu.com.androidfundamentals.R;
import magdamiu.com.androidfundamentals.week4.models.Contact;


public class ContactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> {

    private List<Contact> mContacts;

    public ContactsAdapter(List<Contact> contacts) {
        mContacts = contacts;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout
                .contact_item, viewGroup, false);
        return new ContactsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
        Contact currentContact = mContacts.get(i);
        contactsViewHolder.mTextViewFirstName.setText(currentContact.getFirstName());
        contactsViewHolder.mTextViewLastName.setText(currentContact.getLastName());

    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
