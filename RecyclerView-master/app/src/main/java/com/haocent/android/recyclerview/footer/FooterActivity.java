package com.haocent.android.recyclerview.footer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.haocent.android.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tnno Wu on 2018/03/20.
 */

public class FooterActivity extends AppCompatActivity {

    private static final String TAG = FooterActivity.class.getSimpleName();

    private List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.footer_activity);

        initData();

        initView();
    }

    private void initData() {
        mList.add("亚特兰大老鹰");
        mList.add("夏洛特黄蜂");
        mList.add("迈阿密热火");
        mList.add("奥兰多魔术");
        mList.add("华盛顿奇才");
        mList.add("波士顿凯尔特人");
        mList.add("布鲁克林篮网");
        mList.add("纽约尼克斯");
        mList.add("费城76人");
        mList.add("多伦多猛龙");
        mList.add("芝加哥公牛");
        mList.add("克里夫兰骑士");
        mList.add("底特律活塞");
        mList.add("印第安纳步行者");
        mList.add("密尔沃基雄鹿");
        mList.add("达拉斯独行侠");
        mList.add("休斯顿火箭");
        mList.add("孟菲斯灰熊");
        mList.add("新奥尔良鹈鹕");
        mList.add("圣安东尼奥马刺");
        mList.add("丹佛掘金");
        mList.add("明尼苏达森林狼");
        mList.add("俄克拉荷马城雷霆");
        mList.add("波特兰开拓者");
        mList.add("犹他爵士");
        mList.add("金州勇士");
        mList.add("洛杉矶快船");
        mList.add("洛杉矶湖人");
        mList.add("菲尼克斯太阳");
        mList.add("萨克拉门托国王");
    }

    private void initView() {
        final FooterAdapter adapter = new FooterAdapter(this);

        RecyclerView rcvFooter = findViewById(R.id.rcv_footer);

        rcvFooter.setLayoutManager(new LinearLayoutManager(this));
        rcvFooter.setHasFixedSize(true);
        rcvFooter.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rcvFooter.setAdapter(adapter);

        // 网格类型（关键字：setSpanSizeLookup）
//        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
//        rcvFooter.setLayoutManager(gridLayoutManager);
//        rcvFooter.setHasFixedSize(true);
//        rcvFooter.setAdapter(adapter);
//        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//                int spanSize = 1;
//                if (position == mList.size()) {
//                    spanSize = gridLayoutManager.getSpanCount();
//                }
//                return spanSize;
//            }
//        });

        adapter.setFooterListData(mList);
    }
}
