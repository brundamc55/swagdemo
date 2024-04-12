public class BasePage {
    public WebDriver driver;
    String browser;
    Properties properties;


    public BasePage() {
        
        properties = new Properties();

        try {

            properties.load(new FileInputStream("src/test/extends.properties"));
            browser = properties.getProperty("browser");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (browser.equalsIgnoreCase("chrome")) {
            // Code for Chrome browser
            System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            // Code for Firefox browser
        } else if (browser.equalsIgnoreCase("safari")) {
            // Code for Safari browser
        } else {
            // Code for other browsers
        }
    }

    public void init() {
        driver.manage().window().maximize();
        String url = properties.getProperty("url");
        driver.get(url);
    }
}
