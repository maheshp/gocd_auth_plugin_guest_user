package cd.go.plugin.auth.util;

public class Constants {
    public static final String SETTINGS_USERNAME_KEY = "GUEST_USER_USERNAME";
    public static final String SETTINGS_USER_DISPLAY_NAME_KEY = "GUEST_USER_DISPLAY_NAME";
    public static final String SETTINGS_USER_EMAIL_KEY = "GUEST_USER_EMAIL";

    public static final String CONFIG_WEB_AUTH = "supports-web-based-authentication";
    public static final String CONFIG_DISPLAY_IMAGE_URL = "display-image-url";
    public static final String CONFIG_DISPLAY_NAME = "display-name";
    public static final String CONFIG_PASSWORD_AUTH = "supports-password-based-authentication";

    public static final String API_CALL_PLUGIN_SETTINGS_GET = "go.processor.plugin-settings.get";
    public static final String API_CALL_AUTHENTICATE_USER = "go.processor.authentication.authenticate-user";

    public static final String PLUGIN_ID = "gocd.guest.user.auth.plugin";

    public static final String AUTH_API_USER_KEY = "user";
    public static final String AUTH_API_USERNAME_KEY = "username";
    public static final String AUTH_API_DISPLAYNAME_KEY = "display-name";
    public static final String AUTH_API_EMAIL_KEY = "email-id";

    public static final String CALL_FROM_SERVER_GET_CONFIGURATION = "go.plugin-settings.get-configuration";
    public static final String CALL_FROM_SERVER_GET_VIEW = "go.plugin-settings.get-view";
    public static final String CALL_FROM_SERVER_VALIDATE_CONFIGURATION = "go.plugin-settings.validate-configuration";
    public static final String CALL_FROM_SERVER_PLUGIN_CONFIGURATION = "go.authentication.plugin-configuration";
    public static final String CALL_FROM_SERVER_INDEX = "index";
}
