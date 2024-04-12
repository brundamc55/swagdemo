import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlinePages extends BasePage {
    
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameInput;

    
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[@id='menu-button']")
    private WebElement menuButton;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private List<WebElement> allItems;

    @FindBy(xpath = "//a[text()='About']")
    private WebElement aboutLink;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutLink;

    @FindBy(xpath = "//a[@id='reset_sidebar_link']")
    private WebElement resetButton;
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    private WebElement sauceLabsBackpack;
    
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']//following-sibling::button")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement viewCartLink;

    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
    private WebElement sauceLabsBikeLight;

    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']//following-sibling::button")
    private WebElement addToCartButtonSauceLabsBikeLight;

    @FindBy(xpath = "//button[@class='btn btn_action btn_medium checkout_button ']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zipInput;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[text()='Payment Information:']")
    private List<WebElement> summaryInfoLabels;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    
    @FindBy(xpath="//select[@data-test='product-sort-container']/option[text()='Name (A to Z)']")
    WebElement sortAZ;

    @FindBy(xpath="//select[@data-test='product-sort-container']/option[text()='Name (Z to A)']")
    WebElement sortZA;

    @FindBy(xpath="//select[@data-test='product-sort-container']/option[text()='Price (low to high)']")
    WebElement sortPriceLowToHigh;

    @FindBy(xpath="//select[@data-test='product-sort-container']/option[text()='Price (high to low)']")
    WebElement sortPriceHighToLow;




    public OnlinePages() {
        super();
            init();
            PageFactory.initElements(driver, this);

        }
        

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void logout() {
        menuButton.click();
        logoutLink.click();
    }

    public void resetApp() {
        menuButton.click();
        resetButton.click();
    }

    public void addSauceLabsBackpackToCart() {
        sauceLabsBackpack.click();
        addToCartButton.click();
    }

    public void addSauceLabsBikeLightToCart() {
        sauceLabsBikeLight.click();
        addToCartButtonSauceLabsBikeLight.click();
    }

    public void viewCart() {
        viewCartLink.click();
    }

    public void checkout() {
        checkoutButton.click();
    }

    public void enterCheckoutInfo(String firstName, String lastName, String zip) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        zipInput.sendKeys(zip);
        continueButton.click();
    }

    public void finish() {
        finishButton.click();
    }

    public void sortAZ() {
        sortAZ.click();
    }

    public void sortZA() {
        sortZA.click();
    }

    public void sortPriceLowToHigh() {
        sortPriceLowToHigh.click();
    }

    public void sortPriceHighToLow() {
        sortPriceHighToLow.click();
    }

    public List<WebElement> getAllItems() {
        return allItems;
    }

}
    

