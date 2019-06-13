package com.example.a41845.liyanlei.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.a41845.liyanlei.Main2Activity;
import com.example.a41845.liyanlei.R;
import com.example.a41845.liyanlei.bean.RootBean;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Main2Activity main2Activity;
    private final ArrayList<RootBean.ResultBean> list;

    public MyAdapter(Main2Activity main2Activity, ArrayList<RootBean.ResultBean> list) {

        this.main2Activity = main2Activity;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0){
            View view = View.inflate(main2Activity,R.layout.banner_item,null);
            return new ViewHolder1(view);
        }else if (i == 1){
            View view = View.inflate(main2Activity,R.layout.layout_item1,null);
            return new ViewHolder2(view);

        }else if (i == 2){
            View view = View.inflate(main2Activity,R.layout.layout_item2,null);
            return new ViewHolder3(view);
        }else {
            View view = View.inflate(main2Activity,R.layout.layout_item3,null);
            return new ViewHolder4(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        int type = getItemViewType(i);
        final RootBean.ResultBean resultBean = list.get(i);
        if (type == 0){
            ViewHolder1 holder1 = (ViewHolder1) viewHolder;
            holder1.ban.setImages(list)
                    .setImageLoader(new ImageLoader() {
                        @Override
                        public void displayImage(Context context, Object path, ImageView imageView) {
                            RootBean.ResultBean resultBean1 = (RootBean.ResultBean) path;
                            Glide.with(main2Activity)
                                    .load(resultBean1)
                                    .placeholder(R.mipmap.ic_launcher)
                                    .into(imageView);
                        }
                    }).start();
        }else if (type == 1){
            ViewHolder2 holder2 = (ViewHolder2) viewHolder;
            holder2.title1.setText(resultBean.getPasstime());
            holder2.tv1.setText(resultBean.getText());
            Glide.with(main2Activity)
                    .load(resultBean.getThumbnail())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(holder2.img1);
        }else if (type == 2){
            ViewHolder3 holder3 = (ViewHolder3) viewHolder;
            holder3.title2.setText(resultBean.getPasstime());
            holder3.tv2.setText(resultBean.getText());
            Glide.with(main2Activity)
                    .load(resultBean.getThumbnail())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(holder3.img2);
            Glide.with(main2Activity)
                    .load(resultBean.getHeader())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(holder3.img3);
        }else {
            ViewHolder4 holder4 = (ViewHolder4) viewHolder;
            holder4.title3.setText(resultBean.getPasstime());
            holder4.tv3.setText(resultBean.getText());
            Glide.with(main2Activity)
                    .load(resultBean.getThumbnail())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(holder4.img4);
            Glide.with(main2Activity)
                    .load(resultBean.getHeader())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(holder4.img5);
            Glide.with(main2Activity)
                    .load(resultBean.getThumbnail())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(holder4.img6);

        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick.onItem(i,resultBean);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0){
            return 0;
        }else if (position == 1){
            return 1;
        }else if (position == 2){
            return 2;
        }else {
            return 3;
        }

    }

    public class ViewHolder1 extends RecyclerView.ViewHolder{
        private Banner ban;
        public ViewHolder1(@NonNull View itemView) {
            super(itemView);
            ban = itemView.findViewById(R.id.ban);
        }
    }
    public class ViewHolder2 extends RecyclerView.ViewHolder{
        private TextView title1;
        private ImageView img1;
        private TextView tv1;
        public ViewHolder2(@NonNull View itemView) {
            super(itemView);
            title1 = itemView.findViewById(R.id.title1);
            img1 = itemView.findViewById(R.id.img1);
            tv1 = itemView.findViewById(R.id.tv1);
        }
    }
    public class ViewHolder3 extends RecyclerView.ViewHolder{
        private TextView title2;
        private ImageView img2,img3;
        private TextView tv2;
        public ViewHolder3(@NonNull View itemView) {
            super(itemView);
            title2 = itemView.findViewById(R.id.title2);
            img2 = itemView.findViewById(R.id.img2);
            img3 = itemView.findViewById(R.id.img3);
            tv2 = itemView.findViewById(R.id.tv2);
        }
    }
    public class ViewHolder4 extends RecyclerView.ViewHolder{
        private TextView title3;
        private ImageView img4,img5,img6;
        private TextView tv3;
        public ViewHolder4(@NonNull View itemView) {
            super(itemView);
            title3 = itemView.findViewById(R.id.title3);
            img4 = itemView.findViewById(R.id.img4);
            img5 = itemView.findViewById(R.id.img5);
            img6 = itemView.findViewById(R.id.img6);
            tv3 = itemView.findViewById(R.id.tv3);
        }
    }
    private OnClick onClick;

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    public interface OnClick{
        void onItem(int position,RootBean.ResultBean resultBean);
    }
}
