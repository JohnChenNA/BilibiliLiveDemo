package administrator.example.com.bilibililivedemo.live.Presenter;

import administrator.example.com.bilibililivedemo.Bean.LiveBean;
import administrator.example.com.bilibililivedemo.live.Model.ILiveModel;
import administrator.example.com.bilibililivedemo.live.Model.IOnLoadListener;
import administrator.example.com.bilibililivedemo.live.Model.LiveModel;
import administrator.example.com.bilibililivedemo.live.View.ILiveView;

/**
 * Created by admin on 2018/6/13.
 */

public class LivePresenter implements IOnLoadListener,ILivePresenter{
    private ILiveModel iLiveModel;
    private ILiveView iLiveView;

    public LivePresenter(ILiveView iLiveView) {
        this.iLiveView = iLiveView;
        this.iLiveModel = new LiveModel();
    }




    @Override
    public void videoUrlSuccess(LiveBean liveBean) {
        iLiveView.hideDialog();
        if (liveBean != null) {
            iLiveView.showMovie(liveBean);
        }

    }

    @Override
    public void fail(Throwable throwable) {
        iLiveView.hideDialog();
        iLiveView.showErrorMsg(throwable);
    }


    @Override
    public void loadLiveUrl() {
        iLiveView.showDialog();
        iLiveModel.loadLive(this);
    }
}
