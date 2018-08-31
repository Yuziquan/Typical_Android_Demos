package com.wsw.view.weibodemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by WZJSB-01 on 2017/12/5.
 */

public class Fragment_Two extends Fragment
{

    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.diary_viewpager_layout, null);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rec);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        initList();
        return view;
    }

    private void initList()
    {
        ArrayList<String> dataList = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        {
            dataList.add("日记" + i);
        }
        Adapter_Diary mAdapter = new Adapter_Diary(dataList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
