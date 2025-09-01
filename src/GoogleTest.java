import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class GoogleTest {
    @Test
    public void HomePageCheck() throws URISyntaxException, MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
//        caps.setPlatform(Platform.WINDOWS);
//        caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");

        WebDriver driver = new RemoteWebDriver(new URI("http://192.168.1.4:4444").toURL(), caps );
        driver.get("https://google.com");
        System.out.println(driver.getTitle());

    }
}
