package net.cloud95.android.lession.appwidget05;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

// 繼承自Service的服務元件
public class MyService05 extends Service {

    // 廣播接收元件
	private MyTimeTick05 myTimeTick;
	
	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		
		// 建立廣播接收元件物件
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
	    // 準備註冊與移除廣播接收元件的IntentFilter物件
		// 註冊廣播接收元件
		return START_STICKY;
	}

	@Override
	public void onDestroy() {
		// 移除廣播接收元件
		super.onDestroy();
	}
	
}
