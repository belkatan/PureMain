package pure.autotests.tests.pureweb;

import pure.autotests.config.pureconfig.TestDataConfig;
import org.aeonbits.owner.ConfigFactory;

public class TestData {
    private static TestDataConfig getTestData() {
        return ConfigFactory.newInstance().create(TestDataConfig.class, System.getProperties());
    }

    public static String getWebUrl() {
        return getTestData().webUrl();
    }

    public static String getApiUrl() {
        return getTestData().apiUrl();
    }

    public static String getUserLogin() {
        return getTestData().userLogin();
    }

    public static String getUserPassword() {
        return getTestData().userPassword();
    }
}
