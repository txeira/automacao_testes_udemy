package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;

public class Web {
    public static WebDriver navegador;
    public static String url = "https://www.udemy.com/";
    public static String driverPathWindows = "src/test/resources/drivers/chromedriver.exe".replace("/", File.separator);
    public static String driverPathLinux = "/usr/local/bin/chromedriver".replace("/", File.separator);

    public void Init() {
        ChromeOptions options = new ChromeOptions();
        if (System.getProperty("os.name").startsWith("Windows")) {
            System.setProperty("webdriver.chrome.driver", driverPathWindows);
        } else {
            System.setProperty("webdriver.chrome.driver", driverPathLinux);
            options.addArguments("--headless");
        }
        options.addArguments("window-size=1920,1080", "--no-sandbox", "disable-dev-shm-usage", "--ignore-certificate-errors");
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        navegador = new ChromeDriver(options);
        navegador.manage().window().maximize();
        navegador.get(url);
    }

    public void Finish() {
        navegador.close();
        navegador.quit();
    }

}
