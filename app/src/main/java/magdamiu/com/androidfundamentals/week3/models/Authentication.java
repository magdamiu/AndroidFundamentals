package magdamiu.com.androidfundamentals.week3.models;

public class Authentication {

    private String mEmail;
    private String mPhone;
    private boolean mIsAccepted;

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public boolean isAccepted() {
        return mIsAccepted;
    }

    public void setAccepted(boolean accepted) {
        mIsAccepted = accepted;
    }

    @Override
    public String toString() {
        return "Authentication{" +
                "mEmail='" + mEmail + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mIsAccepted=" + mIsAccepted +
                '}';
    }
}
