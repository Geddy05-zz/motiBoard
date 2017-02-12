package motiBoard;

import com.google.api.server.spi.Constant;

/**
 * Created by Geddy on 10-2-2017.
 */
public class Constants {
    public static final String WEB_CLIENT_ID = "298888933426-r7o4c6972ab4v5s0f7c1qtlf1ggnknrt.apps.googleusercontent.com";
    public static final String ANDROID_CLIENT_ID = "replace this with your Android client ID";
    public static final String IOS_CLIENT_ID = "replace this with your iOS client ID";
    public static final String ANDROID_AUDIENCE = WEB_CLIENT_ID;
    public static final String EMAIL_SCOPE = Constant.API_EMAIL_SCOPE;
    public static final String API_EXPLORER_CLIENT_ID = Constant.API_EXPLORER_CLIENT_ID;

    public static final String MEMCACHE_ANNOUNCEMENTS_KEY = "RECENT_ANNOUNCEMENTS";
}
