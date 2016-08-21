package activfy.activfy;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textview = (TextView) findViewById(R.id.textView);
        final List<String> list = new ArrayList<>();

        list.add("Read a book.");
        list.add("Wash the car.");
        list.add("Wash the dog.");
        list.add("Go for a walk.");
        list.add("Knit a scarf.");
        list.add("Do a crossword puzzle.");
        list.add("Take a nap.");
        list.add("Call a friend.");
        list.add("Play with the family pet.");
        list.add("Turn the bathroom into a sauna.");
        list.add("Listen to your favorite music.");
        list.add("Go to the store.");
        list.add("Give yourself a manicure.");
        list.add("Try out a new hair-do.");
        list.add("Go to the movies.");
        list.add("Pick up women at the mall.");
        list.add("Solve a puzzle.");
        list.add("Breathe deeply.");
        list.add("Swig down some ice water.");
        list.add("Go to the gym.");
        list.add("Give someone you love a huge hug.");
        list.add("Plant some flowers.");
        list.add("Do some exercise - swimming, aerobics, yoga, etc.");
        list.add("Take up a new hobby/interest.");
        list.add("Work in the garden.");
        list.add("Retail therapy.");
        list.add("Eat a popscicle.");
        list.add("Floss and brush your teeth.");
        list.add("Chew gum.");
        list.add("Chew a toothpick.");
        list.add("Spend time with a kid.");
        list.add("Give yourself a treat.");
        list.add("Play several games of Internet Scrabble.");
        list.add("Walk in an old graveyard with the one you love.");
        list.add("Feed the dog.");
        list.add("Clean out your closet.");
        list.add("Wear clothes you never knew you had in said closet.");
        list.add("Paint the closet.");
        list.add("Sing loud.");
        list.add("Practice smiling in the mirror.");
        list.add("Make lists of pros and cons of your addiction");
        list.add("Whistle \"Don't Worry - Be Happy by Bob Marley\"");
        list.add("Get a camera, and take some pictures.");
        list.add("Write a letter.");
        list.add("Build a dog house.");
        list.add("Turn up the volume and sing at the top of your lungs.");
        list.add("Turn up the volume and dance like no one is watching.");
        list.add("Make a puzzle.");
        list.add("Organize your boxes of pictures.");
        list.add("Alphabetize your CD rack.");
        list.add("Get a haircut.");
        list.add("Take a cold shower.");
        list.add("Take a bubble bath.");
        list.add("Clean out a messy drawer.");
        list.add("Take a day trip.");
        list.add("Try making home-made candles or soap.");
        list.add("Run in place.");
        list.add("Do some jumping jacks.");
        list.add("Start a reward fund.");
        list.add("Write a poem.");
        list.add("Go shopping for something that interests you.");
        list.add("Spend quality time with family.");
        list.add("Cook something.");
        list.add("Call your Grandmother.");
        list.add("Paint a room.");
        list.add("Eat a hot fudge sundae.");
        list.add("Go play mini-golf.");
        list.add("Clean the basement or garage.");
        list.add("Wax the car.");
        list.add("Scrub the floor.");
        list.add("Make love with your significant other.");
        list.add("Treat yourself to a massage.");
        list.add("Chop up some veggies for a stir-fry.");
        list.add("Clean out the litter box.");
        list.add("Check your car's tire pressure.");
        list.add("Call a radio show and request a song.");
        list.add("Go ride a few roller coasters.");
        list.add("Take a walk in nature.");
        list.add("Watch the sun set.");
        list.add("Write a goodbye letter to your addiction.");
        list.add("Donate blood.");
        list.add("Color your hair.");
        list.add("Make a greeting card.");
        list.add("Write a list of things you are grateful for.");
        list.add("Get her number.");
        list.add("Declutter.");
        list.add("Walk around your home and identify 100 things you’ve been tolerating; fix one each day.");
        list.add("Make a list of 20 small things that you enjoy doing.");
        list.add("Choose a book that requires effort and concentration and read a little of it every day.");
        list.add("Make it a point to learn at least one new thing each day.");
        list.add("Scour the internet for frugality tips.");
        list.add("Create a spending plan.");
        list.add("Connect with someone new.");
        list.add("Make it a point to associate with people you admire, respect and want to be like.");
        list.add("Check out a book from the library and read the afternoon away.");
        list.add("Break out the old mix-tapes and mix-CDs of yesteryear… soak up the memories and sing your heart out.");
        list.add("Picnic in secluded areas.");
        list.add("Bake and eat homemade cookies.");
        list.add("Start a blog. ");
        list.add("Hike outdoors and explore Mother Nature.");
        list.add("Head downtown with a friend and two digital cameras.  Shoot as many funny and interesting photos as you can. ");
        list.add("Find old stuff in your attic, put it up on eBay and watch the bids role in.");
        list.add("Play old-school board games like Monopoly and Scrabble.");
        list.add("Read interesting articles online… Reddit, StumbleUpon, Digg, Metafilter, etc.");
        list.add("Brew a fresh pot of coffee (or tea) and share it with someone over an interesting conversation.");
        list.add("Take a candlelight bubble bath.");
        list.add("Learn to play guitar (or any musical instrument) online.");
        list.add("Go swimming.");
        list.add("Crank up the tunes, break out the Wii and invite some friends over.");
        list.add("Fly a kite.");
        list.add("Research and discover new bands and musicians similar to the music you already like.");
        list.add("Stargaze.");
        list.add("Re-watch a great movie you haven’t seen in years.");
        list.add("Host a long night of $10 Texas Hold’em Poker with 9 of your friends.  Make sure you understand poker odds.");
        list.add("Find and pick beautiful wild flowers.");
        list.add("Test-drive a really expensive car.");
        list.add("Drink cheap beer and share funny stories with your friends.");
        list.add("Fire up the backyard BBQ.");
        list.add("Browse around thrift stores.");
        list.add("Take a moonlight stroll holding hands with someone you love.");
        list.add("Make a pizza pie from scratch.");
        list.add("Craft some artwork.");
        list.add("Go camping.");
        list.add("People-watch in high traffic areas.");
        list.add("Learn to juggle.");
        list.add("Plan your next vacation.");
        list.add("Host a paper airplane distance competition.");
        list.add("Make a rope and tire swing.");


        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.milkshake);
        Button button = (Button) findViewById(R.id.button);
        button.setAnimation(myAnim);



        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Random random = new Random();
                int index = random.nextInt(list.size());
                textview.setText(list.get(index));
                v.startAnimation(myAnim);

            }
        });

        Button one = (Button) findViewById(R.id.mediaButton);
        final MediaPlayer mp = new MediaPlayer();

        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if(mp.isPlaying())
                {
                    mp.stop();
                    return;
                }

                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("Urge_Surfing.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.setLooping(false);
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        });

    }
}
