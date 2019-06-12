package max.jy.hzl.myde;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

import max.jy.hzl.myde.bean.MaxBean;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRlv;
    private ArrayList<MaxBean> list;
    private RlvAdapter adapter;
    private int newPrice = 0;
    private TextView mResult;
private int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mRlv = (RecyclerView) findViewById(R.id.rlv);
        mResult = (TextView) findViewById(R.id.result);
        mRlv.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            MaxBean maxBean = new MaxBean();
            maxBean.setPrice(i + 10);

            list.add(maxBean);
        }

        adapter = new RlvAdapter(this, list);
        mRlv.setAdapter(adapter);

        adapter.setOnClick(new RlvAdapter.onClick() {
            @Override
            public void click(View v, int position) {
                CheckBox cb = v.findViewById(R.id.cb);
                if (cb.isChecked()) {
                    sum+=adapter.getList().get(position).getPrice();

                }else {
                    sum-=adapter.getList().get(position).getPrice();
                }

                mResult.setText("总价是:"+sum);
            }
        });







    }
}
