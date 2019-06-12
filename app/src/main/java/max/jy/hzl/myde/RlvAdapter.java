package max.jy.hzl.myde;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import max.jy.hzl.myde.bean.MaxBean;

public class RlvAdapter extends RecyclerView.Adapter<RlvAdapter.ViewHolder> {
    private Context context;
    private ArrayList<MaxBean> list;
    private final SparseBooleanArray booleanArray= new SparseBooleanArray();

    public ArrayList<MaxBean> getList() {
        return list;
    }






    public RlvAdapter(Context context, ArrayList<MaxBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(View.inflate(context,R.layout.rlv_item,null));
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final MaxBean maxBean = list.get(position);
        holder.tv.setText(maxBean.getPrice()+"");



        holder.cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                booleanArray.put(position,b);

            }

        });

        holder.cb.setChecked(booleanArray.get(position));
        holder.cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onClick!=null){
                    onClick.click(view,position);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv;
        private CheckBox cb;
        public ViewHolder(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tvPrice);
            cb=itemView.findViewById(R.id.cb);
        }
    }

    private onClick onClick;

    public void setOnClick(RlvAdapter.onClick onClick) {
        this.onClick = onClick;
    }

    public interface onClick{
        void click(View v,int position);
    }
}
