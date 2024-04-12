public class LoginPages {
    public class LoginPages extends BasePages {
        
       
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameInput;
        @FindBy(xpath = "//input[@id='login-button']")
        private WebElement loginButton;
        
       
        public LoginPages(WebDriver driver) {
            super(driver);
        }
        
        public void login(String username, String password) {
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginButton.click();
        }
        
        public void logout() {
            menuButton.click();
        
    }
    }
    
}
