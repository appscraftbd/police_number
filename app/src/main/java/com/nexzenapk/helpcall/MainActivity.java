package com.nexzenapk.helpcall;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout;
    LayoutInflater layoutInflater;
    ListView listView;
    HashMap <String,String> hashMap;
    ArrayList <HashMap<String,String>> arrayList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /////////////////////////////////////////////////
        relativeLayout = findViewById(R.id.firstpage);
        relativeLayout.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                relativeLayout.setVisibility(View.GONE);
            }
        }, 4000);
        ///////////////////////////////////////////////////////

        listView = findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);


        /////number class date//////
        numberdata();





    }
    //////////////////////////////
    //////My Adapter /////////////

    public class MyAdapter extends BaseAdapter{

        RelativeLayout itemlayout;


        @Override
        public int getCount() {

            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {

            return null;
        }

        @Override
        public long getItemId(int i) {

            return 0;
        }

        @SuppressLint("MissingInflatedId")
        @Override
        public View getView(int possion, View view, ViewGroup viewGroup) {

            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myview = layoutInflater.inflate(R.layout.inclube,viewGroup,false);

            TextView thana = myview.findViewById(R.id.thana);
            TextView city = myview.findViewById(R.id.city);
            itemlayout = myview.findViewById(R.id.itemlayout);

            HashMap <String,String> hashMap = arrayList.get(possion);

            String sthaba = hashMap.get("name");
            String scity = hashMap.get("city");
            String snumber = hashMap.get("number");

            if (possion <2 ){
                thana.setText(sthaba);

            } else if (possion >1) {
                thana.setText(sthaba+"(OC)");

            } else {

            }

            city.setText(scity);

            itemlayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:"+snumber));
                    startActivity(intent);


                }
            });



            return myview;
        }
    }



    ////////////////////////
    ////////////data //////
    public void numberdata(){


        hashMap = new HashMap<>();
        hashMap.put("name","Police HQ(IGP)");
        hashMap.put("number","01713373000");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Police HQ(IGP)");
        hashMap.put("number","01713373001");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Ramna Thana");
        hashMap.put("number","01713373125");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Dhanmondi Thana");
        hashMap.put("number","01713373126");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Shahabag Thana");
        hashMap.put("number","01713373127");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","New Market Thana");
        hashMap.put("number","01713373128");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Lalbag Thana");
        hashMap.put("number","01713373134");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Kotowali Thana");
        hashMap.put("number","01713373135");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Hajaribag Thana");
        hashMap.put("number","01713373136");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Kalabagan Thana");
        hashMap.put("number","01713398339");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Kamrangirchar Thana");
        hashMap.put("number","01713373137");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Shutrapur Thana");
        hashMap.put("number","01713373143");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("name","Demra Thana");
        hashMap.put("number","01713373144");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Shampur Thana");
        hashMap.put("number","01713373145");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Jatrabari Thana");
        hashMap.put("number","01713373146");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Motijheel Thana");
        hashMap.put("number","01713373152");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Sabujbag Thana");
        hashMap.put("number","01713373153");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Khilgaon Thana");
        hashMap.put("number","01713373154");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Paltan Thana");
        hashMap.put("number","01713373155");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Uttara Model Thana");
        hashMap.put("number","01713373161");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Airport Thana");
        hashMap.put("number","01713373162");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Turag Thana");
        hashMap.put("number","01713373163");
        hashMap.put("city","Dhaka Metropolitan Police");
        arrayList.add(hashMap);





    }

}