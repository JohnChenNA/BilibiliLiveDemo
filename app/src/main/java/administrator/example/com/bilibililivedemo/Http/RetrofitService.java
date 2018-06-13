package administrator.example.com.bilibililivedemo.Http;



import administrator.example.com.bilibililivedemo.Bean.LiveBean;
import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by admin on 2018/6/12.
 */

public interface RetrofitService {
    @GET
    Observable<LiveBean> getLiveUrl(@Url String url);
}
