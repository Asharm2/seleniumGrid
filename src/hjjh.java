import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class hjjh {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println( calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MONTH));
        Date date = new Date();

        // Formatting the time
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String time = formatter.format(date);

        System.out.println("Current Time: " + time);
    }

    @Test
    public void HomePageCheckPartTwo(){
        WebDriver driver;

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
//        caps.setPlatform(Platform.WINDOWS);
        caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

        try {
            driver = new RemoteWebDriver(new URI("http://192.168.1.4:4444").toURL(), caps);
        } catch (MalformedURLException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }
}
