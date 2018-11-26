package com.fanchen.imovie.retrofit.service;

import com.fanchen.imovie.annotation.JsoupSource;
import com.fanchen.imovie.annotation.JsoupType;
import com.fanchen.imovie.annotation.MethodSource;
import com.fanchen.imovie.annotation.MethodType;
import com.fanchen.imovie.annotation.RetrofitSource;
import com.fanchen.imovie.annotation.RetrofitType;
import com.fanchen.imovie.entity.face.IBangumiMoreRoot;
import com.fanchen.imovie.entity.face.IHomeRoot;
import com.fanchen.imovie.entity.face.IPlayUrls;
import com.fanchen.imovie.entity.face.IVideoDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * JrenService
 * Created by fanchen on 2017/9/24.
 */
@RetrofitType(RetrofitSource.JREN_API)
public interface JrenService {
//    /**
//     * @param path
//     * @param page
//     * @return
//     */
//    @GET("archives/category/dm/{path}/page/{page}")
//    @JsoupType(JsoupSource.JREN)
//    @RetrofitType(isJsoupResponse = JsoupSource.TYPE_VIDEO)
//    @MethodType(value = MethodSource.HOME)
//    Call<IHomeRoot> home(@Path("path") String path, @Path("page") Integer page);
//
//    /**
//     * @param Referer
//     * @param query
//     * @return
//     */
//    @POST("wp-admin/admin-ajax.php?_nonce=5dff0382bf&action=fb3c8529e9820fef2769456c19d04292")
//    @JsoupType(JsoupSource.JREN)
//    @RetrofitType(isJsoupResponse = JsoupSource.TYPE_VIDEO)
//    @MethodType(value = MethodSource.SEARCH)
//    @Headers({"Connection: keep-alive",
//            "Accept: */*",
//            "User-Agent: Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1",
//            "Accept-Encoding: deflate, br",
//            "Accept-Language: zh-CN,zh;q=0.8",
//            "Cookie: vpid[16562]=1; wordpress_test_cookie=WP+Cookie+check; wordpress_logged_in_655c5bda33877be6d5d9650e5342f445=Sa79XtcUv80jGlA1%7C1508319436%7CcyBpgafx6txNN5gQD2teJzetvCoQSiLeavdXuPvgcez%7C4d0a5b375846d1d7d91bfe319b49fac54a389c81f38c1787157d48d540671e13; PHPSESSID=kf2cfgsj9dd6rrtkdou0i7lfmt; Hm_lvt_5672553e8af14393d309ed5014151ae0=1507109704; Hm_lpvt_5672553e8af14393d309ed5014151ae0=1507109774"})
//    Call<IBangumiMoreRoot> search(@Header("Referer") String Referer, @Query("query") String query);
//
//    /**
//     * @param path
//     * @return
//     */
//    @GET("archives/{id}")
//    @RetrofitType(isJsoupResponse = JsoupSource.TYPE_VIDEO)
//    @JsoupType(JsoupSource.JREN)
//    @MethodType(value = MethodSource.DETAILS)
//    @Headers({"Connection: keep-alive",
//            "Accept: */*",
//            "User-Agent: Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1",
//            "Accept-Encoding: deflate, br",
//            "Accept-Language: zh-CN,zh;q=0.8",
//            "Cookie: vpid[16562]=1; wordpress_test_cookie=WP+Cookie+check; wordpress_logged_in_655c5bda33877be6d5d9650e5342f445=Sa79XtcUv80jGlA1%7C1508319436%7CcyBpgafx6txNN5gQD2teJzetvCoQSiLeavdXuPvgcez%7C4d0a5b375846d1d7d91bfe319b49fac54a389c81f38c1787157d48d540671e13; PHPSESSID=kf2cfgsj9dd6rrtkdou0i7lfmt; Hm_lvt_5672553e8af14393d309ed5014151ae0=1507109704; Hm_lpvt_5672553e8af14393d309ed5014151ae0=1507109774"})
//    Call<IVideoDetails> details(@Path("id") String path);

//    /**
//     *
//     * @param type
//     * @param page
//     * @return
//     */
//    @GET("vod-type-id-{type}-pg-{page}.html")
//    @JsoupType(JsoupSource.JREN)
//    @RetrofitType(isJsoupResponse = JsoupSource.TYPE_VIDEO)
//    @MethodType(value = MethodSource.HOME)
//    @Headers({"User-Agent: Mozilla/5.0 (Linux; Android 5.1.1; Nexus 6 Build/LYZ28E) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Mobile Safari/537.36"})
//    Call<IHomeRoot> home(@Path("type") String type, @Path("page") Integer page);

    /**
     *
     * @param path
     * @return
     */
    @GET("{path}")
    @JsoupType(JsoupSource.JREN)
    @RetrofitType(isJsoupResponse = JsoupSource.TYPE_VIDEO)
    @MethodType(value = MethodSource.HOME)
    @Headers({"User-Agent: Mozilla/5.0 (Linux; Android 5.1.1; Nexus 6 Build/LYZ28E) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Mobile Safari/537.36"})
    Call<IHomeRoot> home(@Path("path") String path);

    /**
     *
     * @param m
     * @return
     */
    @GET("index.php")
    @JsoupType(JsoupSource.JREN)
    @RetrofitType(isJsoupResponse = JsoupSource.TYPE_VIDEO)
    @MethodType(value = MethodSource.SEARCH)
    @Headers({"User-Agent: Mozilla/5.0 (Linux; Android 5.1.1; Nexus 6 Build/LYZ28E) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Mobile Safari/537.36"})
    Call<IBangumiMoreRoot> search(@Query("m") String m);

    /**
     *
     * @param path
     * @return
     */
    @GET("rr/{path}.html")
    @JsoupType(JsoupSource.JREN)
    @RetrofitType(isJsoupResponse = JsoupSource.TYPE_VIDEO)
    @MethodType(value = MethodSource.DETAILS)
    @Headers({"User-Agent: Mozilla/5.0 (Linux; Android 5.1.1; Nexus 6 Build/LYZ28E) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Mobile Safari/537.36"})
    Call<IVideoDetails> details(@Path("path") String path);

    /**
     *
     * @param path
     * @return
     */
    @GET("play/{path}")
    @JsoupType(JsoupSource.JREN)
    @RetrofitType(isJsoupResponse = JsoupSource.TYPE_VIDEO)
    @MethodType(value = MethodSource.PLAYURL)
    @Headers({"User-Agent: Mozilla/5.0 (Linux; Android 5.1.1; Nexus 6 Build/LYZ28E) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Mobile Safari/537.36"})
    Call<IPlayUrls> playUrl(@Path("path") String path);
}
