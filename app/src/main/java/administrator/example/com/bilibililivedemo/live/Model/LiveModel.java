package administrator.example.com.bilibililivedemo.live.Model;

import administrator.example.com.bilibililivedemo.Bean.LiveBean;
import administrator.example.com.bilibililivedemo.Http.Api;
import administrator.example.com.bilibililivedemo.Http.RetrofitHelper;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by admin on 2018/6/13.
 */

public class LiveModel implements ILiveModel{
    @Override
    public void loadLive( final IOnLoadListener iOnLoadListener) {
        RetrofitHelper retrofitHelper= new RetrofitHelper(Api.LIVE_HOST);

        retrofitHelper.getLiveUrl(api)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<LiveBean>() {

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        iOnLoadListener.fail(e);
                    }

                    @Override
                    public void onNext(LiveBean liveBean) {
                        iOnLoadListener.success(liveBean);

                    }
                });
    }
}
