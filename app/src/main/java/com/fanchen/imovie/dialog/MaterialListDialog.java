package com.fanchen.imovie.dialog;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;
import java.util.Objects;

/**
 * MaterialListDialog
 * Created by fanchen on 2017/7/24.
 */
public class MaterialListDialog extends MaterialDialog implements AdapterView.OnItemClickListener{

    private ListView mListView;

    private ArrayAdapter<?> mAdapter;

    private AdapterView.OnItemClickListener itemClickListener;

    public MaterialListDialog(Context context,Object titles) {
        super(context, new ListView(context));
        if(titles instanceof Object[]){
            mAdapter = new ArrayAdapter<>(context,android.R.layout.simple_list_item_1,(Object[])titles);
        }else if(titles instanceof List){
            mAdapter = new ArrayAdapter<>(context,android.R.layout.simple_list_item_1,(List)titles);
        }
        mListView = (ListView) view;
        mListView.setAdapter(mAdapter);
        mListView.setDivider(null);
        mListView.setOnItemClickListener(this);
        setButtonVisble(View.GONE);
        setTitleVisble(View.GONE);
    }

    @Override
    public MaterialDialog title(String title) {
        setTitleVisble(View.VISIBLE);
        return super.title(title);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(itemClickListener != null)
            itemClickListener.onItemClick(parent,view,position,id);
        dismiss();
    }

    public void setItemClickListener(AdapterView.OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public ListView getListView() {
        return mListView;
    }

    public ArrayAdapter<?> getAdapter() {
        return mAdapter;
    }
}
