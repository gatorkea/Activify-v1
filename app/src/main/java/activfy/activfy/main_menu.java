package activfy.activfy;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class main_menu extends ListActivity {
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        lv = (ListView)findViewById(android.R.id.list);
        ArrayList<String> list = new ArrayList<String>();
        //Add your new Activity menu item here
        list.add("Urge Surfing");
        list.add("Nutritional Balancing");
        list.add("Testimonies");
        list.add("Your brain on porn");
        Collections.sort(list);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout
                                                    .simple_list_item_1,list);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String selected = String.valueOf(adapterView.getItemAtPosition(position));
                if(selected == ("Nutritional Balancing")){
                    Intent intent = new Intent(main_menu.this,NutritionalBalancing.class);
                    startActivity(intent);
                }
                else if(selected == ("Urge Surfing")){
                    Intent intent = new Intent(main_menu.this,MainActivity.class);
                    startActivity(intent);
                }
                else if(selected == ("Testimonies")){
                    Intent intent = new Intent(main_menu.this,Testimonies.class);
                    startActivity(intent);
                }
                else if(selected == ("Your brain on porn")){
                    Intent intent = new Intent(main_menu.this,BrainOnPorn.class);
                    startActivity(intent);
                }
            }
        });
    }
}
