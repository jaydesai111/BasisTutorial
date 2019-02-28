package com.delaroystudios.swipecards;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;


import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static MyAppAdapter myAppAdapter;
    private ArrayList<String> array = new ArrayList<>();
    private SwipeFlingAdapterView flingContainer;
    TextView tv_forMeasurment,tv_progress ;
    int currentPage=1, totalPage=0;
    private ArrayList<String> removedData = new ArrayList<>();
    Button bt_reset;

    final String str ="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Laoreet id donec ultrices tincidunt. Egestas fringilla phasellus faucibus scelerisque eleifend donec pretium vulputate. Purus in mollis nunc sed id semper risus. Lectus proin nibh nisl condimentum id venenatis a condimentum. Tristique sollicitudin nibh sit amet commodo nulla facilisi nullam. At tempor commodo ullamcorper a lacus vestibulum sed arcu. Vestibulum lectus mauris ultrices eros in cursus turpis massa tincidunt. Et ultrices neque ornare aenean euismod elementum nisi quis eleifend. Mi ipsum faucibus vitae aliquet nec ullamcorper sit amet risus. Enim ut tellus elementum sagittis vitae. Cursus vitae congue mauris rhoncus. Erat pellentesque adipiscing commodo elit at imperdiet. Maecenas sed enim ut sem viverra aliquet eget sit amet. Cursus metus aliquam eleifend mi in nulla posuere sollicitudin. Nulla pharetra diam sit amet nisl suscipit adipiscing bibendum. Volutpat lacus laoreet non curabitur gravida. Maecenas pharetra convallis posuere morbi leo urna molestie at. Placerat duis ultricies lacus sed turpis tincidunt id aliquet risus. Ut tellus elementum sagittis vitae. Nisl pretium fusce id velit ut tortor pretium viverra suspendisse. Leo in vitae turpis massa sed elementum. Ultrices sagittis orci a scelerisque purus semper eget duis at. Massa ultricies mi quis hendrerit dolor magna eget est. Gravida neque convallis a cras. Pulvinar proin gravida hendrerit lectus. Sit amet aliquam id diam maecenas. At quis risus sed vulputate. Porta lorem mollis aliquam ut porttitor leo a diam. Nulla malesuada pellentesque elit eget. Scelerisque eu ultrices vitae auctor eu augue ut lectus. Massa vitae tortor condimentum lacinia quis vel eros donec ac. Sed viverra tellus in hac. Et egestas quis ipsum suspendisse ultrices gravida. Ultricies lacus sed turpis tincidunt id. Nec ullamcorper sit amet risus nullam eget felis. Nullam eget felis eget nunc lobortis. Luctus venenatis lectus magna fringilla urna porttitor. Facilisis mauris sit amet massa vitae. At in tellus integer feugiat. Euismod nisi porta lorem mollis aliquam ut porttitor leo. Pellentesque sit amet porttitor eget dolor morbi non arcu. Maecenas volutpat blandit aliquam etiam erat velit. Non diam phasellus vestibulum lorem sed risus ultricies tristique nulla. Quis enim lobortis scelerisque fermentum dui faucibus in. Purus in massa tempor nec. Facilisis leo vel fringilla est ullamcorper eget nulla facilisi. Ultricies mi eget mauris pharetra. Vel quam elementum pulvinar etiam non quam lacus suspendisse. Viverra orci sagittis eu volutpat odio facilisis mauris sit amet. Blandit volutpat maecenas volutpat blandit. Sit amet facilisis magna etiam tempor orci eu lobortis elementum. Facilisis volutpat est velit egestas. Dignissim suspendisse in est ante in nibh. Suspendisse ultrices gravida dictum fusce ut. Sodales ut eu sem integer vitae justo eget magna. Leo integer malesuada nunc vel risus commodo. Imperdiet sed euismod nisi porta lorem mollis aliquam ut porttitor. Adipiscing elit pellentesque habitant morbi tristique. Enim sit amet venenatis urna cursus eget nunc. At elementum eu facilisis sed odio morbi quis commodo. Dictum non consectetur a erat nam. Nulla aliquet porttitor lacus luctus accumsan tortor. Sit amet purus gravida quis blandit turpis cursus. Parturient montes nascetur ridiculus mus mauris vitae ultricies. Dui vivamus arcu felis bibendum ut tristique et egestas quis. Urna condimentum mattis pellentesque id nibh tortor id aliquet. Est ullamcorper eget nulla facilisi etiam dignissim diam. Morbi tincidunt augue interdum velit euismod in pellentesque massa placerat. Proin sagittis nisl rhoncus mattis rhoncus urna. Nullam vehicula ipsum a arcu cursus vitae congue mauris rhoncus. Elit ut aliquam purus sit amet luctus venenatis. Porttitor massa id neque aliquam vestibulum. Posuere lorem ipsum dolor sit amet. Lacus laoreet non curabitur gravida arcu ac. Tempor id eu nisl nunc. Auctor eu augue ut lectus arcu bibendum at varius. Vitae et leo duis ut diam quam nulla porttitor. Sed arcu non odio euismod lacinia at quis risus sed. In vitae turpis massa sed elementum tempus. Congue quisque egestas diam in arcu cursus euismod quis. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus. Placerat in egestas erat imperdiet sed euismod nisi. Nulla aliquet enim tortor at auctor urna nunc. Vel elit scelerisque mauris pellentesque. Nullam ac tortor vitae purus faucibus ornare suspendisse sed nisi. Etiam non quam lacus suspendisse faucibus interdum. Senectus et netus et malesuada fames ac turpis egestas. Est ultricies integer quis auctor. Placerat orci nulla pellentesque dignissim enim sit amet venenatis urna. Massa vitae tortor condimentum lacinia quis vel. Ac feugiat sed lectus vestibulum mattis ullamcorper velit sed ullamcorper. In massa tempor nec feugiat. Tortor dignissim convallis aenean et tortor at. Volutpat commodo sed egestas egestas fringilla phasellus faucibus scelerisque. Condimentum id venenatis a condimentum vitae sapien pellentesque. Urna condimentum mattis pellentesque id nibh tortor id aliquet. Turpis tincidunt id aliquet risus feugiat in ante metus dictum. Nisi lacus sed viverra tellus in. Potenti nullam ac tortor vitae purus faucibus ornare. ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flingContainer = (SwipeFlingAdapterView) findViewById(R.id.frame);
        tv_forMeasurment = (TextView) findViewById(R.id.tv_forMeasurment);
        tv_progress = (TextView) findViewById(R.id.tv_progress);
        bt_reset = (Button) findViewById(R.id.bt_reset);
        bt_reset.setOnClickListener(this);
        tv_forMeasurment.setText(str);

        tv_forMeasurment.post(new Runnable() {
            @Override
            public void run() {
                int end = tv_forMeasurment.getLayout().getLineEnd((tv_forMeasurment.getHeight()/tv_forMeasurment.getLineHeight()) - 6);
                Log.i("MainActivity ","this is value of end "+end);
                getArrayList(end,str);
            }
        });



    }



    public void getArrayList(int end, String str)
    {
        int tempStartIndex = 0;
        int rearLengh=0;

        while(str.length() > tempStartIndex)
        {

            if(tempStartIndex + end > str.length())
            {
                array.add(str.substring(tempStartIndex,str.length()-1));
                totalPage++;
                break;
            }
            String s = str.substring(tempStartIndex,tempStartIndex+end);
            rearLengh = s.lastIndexOf('.')+1;
            array.add(str.substring(tempStartIndex,tempStartIndex+rearLengh));
            tempStartIndex = tempStartIndex+rearLengh;
            totalPage++;

        }
        myAppAdapter = new MyAppAdapter(array, MainActivity.this);
        flingContainer.setAdapter(myAppAdapter);
        tv_progress.setText(currentPage+"/"+totalPage);



        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {

            }

            @Override
            public void onLeftCardExit(Object dataObject) {
                if(removedData.size() > 0) {
                    array.add(0, removedData.get(0));
                    removedData.remove(0);
                    myAppAdapter.notifyDataSetChanged();
                    currentPage--;
                    tv_progress.setText(currentPage + "/" + totalPage);
                }
                myAppAdapter.notifyDataSetChanged();

            }

            @Override
            public void onRightCardExit(Object dataObject) {
                removeCard();

            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {

            }

            @Override
            public void onScroll(float scrollProgressPercent) {


            }
        });

    }

    public void removeCard()
    {
        removedData.add(0,array.get(0));
        array.remove(0);
        myAppAdapter.notifyDataSetChanged();
        currentPage++;
        tv_progress.setText(currentPage+"/"+totalPage);
        if(currentPage>totalPage)
        {
            tv_progress.setVisibility(View.GONE);
            bt_reset.setVisibility(View.VISIBLE);

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.bt_reset:
                while (removedData.size()>0)
                {
                    array.add(0, removedData.get(0));
                    removedData.remove(0);

                }
                currentPage =1;
                myAppAdapter.notifyDataSetChanged();
                tv_progress.setText(currentPage + "/" + totalPage);
                tv_progress.setVisibility(View.VISIBLE);
                bt_reset.setVisibility(View.GONE);


        }
    }
}
