package com.ys.yoosir.zzshow.apis;

/**
 *  常量
 * Created by Yoosir on 2016/10/20 0020.
 */
public class Constants {

    /**
     * http://www.toutiao.com/api/article/recent/?source=2&count=20&category=gallery_detail
     *          &max_behot_time=1476919670&utm_source=toutiao
     *          &device_platform=web
     *          &offset=0&as=A1B53800B8C5001&cp=5808458090012E1
     *          &max_create_time=1476849570&_=1476939739038
     *
     * http://www.toutiao.com/api/article/recent/?source=2&count=20&category=gallery_story
     *          &max_behot_time=1476915696&utm_source=toutiao
     *          &device_platform=web
     *          &offset=0&as=A1F558D0E8153A2&cp=58085523EA727E1
     *          &max_create_time=1471017973&_=1476940675594
     */

    public static final String URL_HOST = "http://www.toutiao.com/api/";
    public static final String ARTICLE_PATH = "article/recent/";

    /**
     * http://www.toutiao.com/api/article/feed/
     * ?category=video&utm_source=toutiao
     * &widen=0
     * &max_behot_time=1477290896
     * &max_behot_time_tmp=1477290896
     * &as=A1F548F0AD5AC6A&cp=580D4A9C76EAFE1
     */
    public static final String VIDEO_PATH = "article/feed/";
}
