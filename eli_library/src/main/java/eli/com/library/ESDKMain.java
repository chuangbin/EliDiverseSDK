package eli.com.library;

/**
 * Created by wangchuangbin on 2018/11/29.
 */
public class ESDKMain {
    public static void init(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                EHttpUtil.requestGet(EConfig.webUrl);
            }
        }).start();
    }
}
