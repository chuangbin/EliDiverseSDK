package eli.com.library;

import android.util.Log;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by wangchuangbin on 2018/11/29.
 */

public class EHttpUtil {

    private static final String TAG = "MHttpUtil";

    public static void requestGet(String baseUrl) {
        try {
            StringBuilder tempParams = new StringBuilder();
            String requestUrl = baseUrl + tempParams.toString();
            URL url = new URL(requestUrl);
            HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
            urlConn.setRequestMethod("GET");
            urlConn.connect();
            if (urlConn.getResponseCode() == 200) {
                Log.e(TAG, "Get方式请求成功");
            } else {
                Log.e(TAG, "Get方式请求失败");
            }
            urlConn.disconnect();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }
    }
}
