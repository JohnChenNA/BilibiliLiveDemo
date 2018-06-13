package administrator.example.com.bilibililivedemo.live.Model;

import java.util.List;

import administrator.example.com.bilibililivedemo.Bean.LiveBean;

/**
 * Created by admin on 2018/6/13.
 */

public interface IOnLoadListener {
    void videoUrlSuccess(LiveBean liveBean);
    void fail(Throwable throwable);
}
