public class Login {
   LoginPages loginPages;
   public Login() {
    loginPages = new LoginPages();

   }

   @Given("I am on the login page")
   public void i_am_on_the_login_page() {
      loginPages.init();
   }

   @When("I login with username {string} and password {string}")
   public void i_login_with_username_and_password(String username, String password) {
      loginPages.login(username, password);
   }

   @Then("I should be logged in")
   public void i_should_be_logged_in() {
      Assert.assertTrue(loginPages.menuButton.isDisplayed());
   }


}
