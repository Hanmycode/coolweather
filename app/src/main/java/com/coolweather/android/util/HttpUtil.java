package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    /*
     * 由于OKHttp的出色封装，和服务器进行交互的代码非常简单，仅仅3行就完成了。
     * 现在我们发起一条Http请求只需要调用sendOKHttpRequest()方法，传入请求地址，并注册一个回调来处理服务器响应就可以了。
     * 服务器返回的省市县数据都是JSON格式的。
     *
     * */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
