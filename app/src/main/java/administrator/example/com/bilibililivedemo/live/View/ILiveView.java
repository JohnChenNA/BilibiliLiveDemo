package administrator.example.com.bilibililivedemo.live.View;

import administrator.example.com.bilibililivedemo.Bean.LiveBean;

/**
 * Created by admin on 2018/6/13.
 */

public interface ILiveView {
    void showLive(LiveBean liveBean);
    void hideDialog();
    void showDialog();
    void showErrorMsg(Throwable throwable);
}
