package net.cloud95.android.lession.appwidget05;

import java.util.Date;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class AppWidget05 extends AppWidgetProvider {

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);
        // 建立每分鐘更新時間服務元件的Intent物件
        // 啟動服務
    }

    // 覆寫 onUpdate 方法，執行更新畫面的工作
    @Override
    public void onUpdate(Context context,
            AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    
            // 建立 RemoteViews 物件
            // 取得現在的時間
            // 設定現在的時間
    
            // 讀取指定小工具編號的文字顏色設定
            // 設定文字元件的顏色
            // 讀取指定小工具編號的背景資源設定
            // 設定指定畫面元件的背景圖形資源(物件,此物件的函式,參數)==>特殊用法
    
            // 更新畫面
        super.onUpdate(context, appWidgetManager, appWidgetIds);
    }

    @Override
    public void onDisabled(Context context) {
        // 建立服務元件的Intent物件
        // 停止服務
    }

}
