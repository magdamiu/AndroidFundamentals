package magdamiu.com.androidfundamentals.week4.models;

public class Contact {
    private String mFirstName;
    private String mLastName;

    public Contact(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "mFirstName='" + mFirstName + '\'' +
                ", mLastName='" + mLastName + '\'' +
                '}';
    }
}
