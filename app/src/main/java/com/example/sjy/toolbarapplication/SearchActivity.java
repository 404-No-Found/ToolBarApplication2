package com.example.sjy.toolbarapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity {

    @BindView(R.id.re_tv)
    RecyclerView reTv;
    HomeAdapter mAdapter;
    private HashMap<Integer,Object> MyData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        reTv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        reTv.setAdapter(mAdapter=new HomeAdapter());
    }

    private class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>{
        @NonNull
        @Override
        public HomeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

            MyViewHolder myViewHolder=new MyViewHolder(LayoutInflater.from(SearchActivity.this).
                    inflate(R.layout.item_home,parent,false));
            return myViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull HomeAdapter.MyViewHolder viewHolder, int i) {


        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder{
            Object obj;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                obj=itemView.findViewById(R.id.id_num);
            }
        }
    }
}
