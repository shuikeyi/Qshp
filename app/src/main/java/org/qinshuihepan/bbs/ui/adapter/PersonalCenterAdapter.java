package org.qinshuihepan.bbs.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.qinshuihepan.bbs.R;
import org.qinshuihepan.bbs.util.Utils;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by liurongchan on 14-9-21.
 */
public class PersonalCenterAdapter extends BaseAdapter {

    private String[] personal_items = Utils.PERSONAL_CENTER;
    private Context mContext;

    public PersonalCenterAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return personal_items.length;
    }

    @Override
    public Object getItem(int position) {
        return personal_items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        TextView option;
        Holder holder;
        if(view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.listitem_personal, null);
            option = (TextView) view.findViewById(R.id.option);
            holder = new Holder(option);
            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
            option = holder.option;
        }
        option.setText(personal_items[position]);
        return view;
    }

    class Holder {
       @InjectView(R.id.option)
       TextView option;

        public Holder(View view) {
            ButterKnife.inject(this, view);
        }
    }
}
