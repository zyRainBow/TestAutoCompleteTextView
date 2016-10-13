package com.example.testautocompletetextview;

import java.util.ArrayList;

import com.example.testwallper.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
	private ArrayList<String> list ;
	private MyAdapter  mAdapter;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		list= new ArrayList<String>();
		list.add("百度网页");
		list.add("百度知道");
		list.add("百度视频");
		list.add("酷狗音乐");
		list.add("百度音乐");
		list.add("多米音乐");
		list.add("搜狗网页");
		list.add("搜狗音乐");
		list.add("搜狗视频");
		list.add("天天音乐");
		list.add("小米音乐");
		list.add("叮咚音乐");
		
		mAdapter=new MyAdapter(getApplicationContext(),list, 10);
		
		//注意，这里为了使体验效果更好，这个list的数据会很多，越多越好，这里仅仅作为演示。这里使用String的数组也可以作为参数传进去。
//		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listitem,R.id.textview, list);
		
		AutoCompleteTextView autoComplete = (AutoCompleteTextView)findViewById(R.id.autoComplete);
//		autoComplete.setAdapter(adapter);
		
		autoComplete.setAdapter(mAdapter);
		autoComplete.setThreshold(0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
