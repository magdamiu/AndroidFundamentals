package magdamiu.com.androidfundamentals.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import magdamiu.com.androidfundamentals.R;

public class SendTextActivity extends AppCompatActivity {

    public static final String CAROL = "carol";

    private static final String CAROL_1 = "Have yourself a merry little Christmas\n" +
            "\n" +
            "Have yourself a merry little Christmas\n" +
            "Let your heart be light\n" +
            "From now on\n" +
            "our troubles will be out of sight\n" +
            "\n" +
            "Have yourself a merry little Christmas\n" +
            "Make the Yule-tide gay\n" +
            "From now on your troubles will be miles away\n" +
            "\n" +
            "Here were are as in olden days\n" +
            "happy golden days of yore\n" +
            "Faithful friends who are dear to us\n" +
            "to gather near to us once more\n" +
            "\n" +
            "Through the years we all will be together\n" +
            "If the Fates allow\n" +
            "Hang a shining star upon the highest bough\n" +
            "And have yourself a merry little Christmas now.";

    private static final String CAROL_2 = "A Holly Jolly Christmas\n " +
            "\n" +
            "Have a holly, jolly " +
            "Christmas;\n" +
            "It's the best time of the year\n" +
            "I don't know if there'll be snow\n" +
            "but have a cup of cheer\n" +
            "Have a holly, jolly Christmas;\n" +
            "And when you walk down the street\n" +
            "Say Hello to friends you know\n" +
            "and everyone you meet\n" +
            "\n" +
            "Oh ho\n" +
            "the mistletoe\n" +
            "hung where you can see;\n" +
            "Somebody waits for you;\n" +
            "Kiss her once for me\n" +
            "Have a holly jolly Christmas\n" +
            "and in case you didn't hear\n" +
            "Oh by golly\n" +
            "have a holly\n" +
            "jolly Christmas this year";


    private static final String CAROL_3 = "Let it Snow\n" +
            "\n" +
            "Oh the weather outside is frightful\n" +
            "But the fire is so delightful\n" +
            "And since we've no place to go\n" +
            "Let It Snow! Let It Snow! Let It Snow!\n" +
            "\n" +
            "It doesn't show signs of stopping\n" +
            "And I've bought some corn for popping\n" +
            "The lights are turned way down low\n" +
            "Let It Snow! Let It Snow! Let It Snow!\n" +
            "\n" +
            "When we finally kiss good night\n" +
            "How I'll hate going out in the storm!\n" +
            "But if you'll really hold me tight\n" +
            "All the way home I'll be warm\n" +
            "\n" +
            "The fire is slowly dying\n" +
            "And, my dear, we're still goodbying\n" +
            "But as long as you love me so\n" +
            "Let It Snow! Let It Snow! Let It Snow!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_text);
    }

    public void btnTextOneOnClick(View view) {
        Intent secondActivity = new Intent(this, ReceiveTextActivity.class);
        secondActivity.putExtra(SendTextActivity.CAROL, CAROL_1);
        startActivity(secondActivity);
    }

    public void btnTextTwoOnClick(View view) {
        Intent secondActivity = new Intent(this, ReceiveTextActivity.class);
        secondActivity.putExtra(SendTextActivity.CAROL, CAROL_2);
        startActivity(secondActivity);
    }

    public void btnTextThreeOnClick(View view) {
        Intent secondActivity = new Intent(this, ReceiveTextActivity.class);
        secondActivity.putExtra(SendTextActivity.CAROL, CAROL_3);
        startActivity(secondActivity);
    }
}
