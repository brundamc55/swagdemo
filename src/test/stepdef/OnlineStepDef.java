public class OnlineStepDef extends BasePage{
    
     
     OnlinePages onlinePages;
    
    public OnlineStepDef() {
        
        onlinePages = new OnlinePages();
    }

    @Given("I am on the SauceDemo login page")

    public void i_am_on_the_sauce_demo_login_page() {
        onlinePages.init();
    }

    @When("I login with username {string} and password {string}")

    public void i_login_with_username_and_password(String username, String password) {
        onlinePages.login(username, password);
    }

    @Then("I should be logged in")

    public void i_should_be_logged_in() {
        Assert.assertTrue(onlinePages.menuButton.isDisplayed());
    }

    @When("I logout")

    public void i_logout() {
        onlinePages.logout();
    }

    @Then("I should be logged out")

    public void i_should_be_logged_out() {
        Assert.assertTrue(onlinePages.usernameInput.isDisplayed());
    }

    @When("I reset the app")

    public void i_reset_the_app() {
        onlinePages.resetApp();
    }

    @Then("I should see the login page")

    public void i_should_see_the_login_page() {
        Assert.assertTrue(onlinePages.usernameInput.isDisplayed());
    }

    @When("I add the Sauce Labs Backpack to the cart")

    public void i_add_the_sauce_labs_backpack_to_the_cart() {
        onlinePages.addSauceLabsBackpackToCart();
    }

    @Then("I should see the cart with the Sauce Labs Backpack")

    public void i_should_see_the_cart_with_the_sauce_labs_backpack() {
        Assert.assertTrue(onlinePages.cartItemSauceLabsBackpack.isDisplayed());
    }

    @When("I add the Sauce Labs Bike Light to the cart")

    public void i_add_the_sauce_labs_bike_light_to_the_cart() {
        onlinePages.addSauceLabsBikeLightToCart();
    }

    @Then("I should see the cart with the Sauce Labs Bike Light")

    public void i_should_see_the_cart_with_the_sauce_labs_bike_light() {
        Assert.assertTrue(onlinePages.cartItemSauceLabsBikeLight.isDisplayed());
    }

    @When("I view the cart")

    public void i_view_the_cart() {
        onlinePages.viewCart();
    }

    @Then("I should see the cart")

    public void i_should_see_the_cart() {
        Assert.assertTrue(onlinePages.cartItemSauceLabsBackpack.isDisplayed() || onlinePages.cartItemSauceLabsBikeLight.isDisplayed());
    }

    @When("I checkout")

    public void i_checkout() {
        onlinePages.checkout();
    }

    @Then("I should see the checkout page")

    public void i_should_see_the_checkout_page() {
        Assert.assertTrue(onlinePages.firstNameInput.isDisplayed());
    }

    @When("I enter checkout information with first name {string}, last name {string}, and zip {string}")

    public void i_enter_checkout_information_with_first_name_last_name_and_zip(String firstName, String lastName, String zip) {
        onlinePages.enterCheckoutInfo(firstName, lastName, zip);
    }

    @Then("I should see the checkout overview page")

    public void i_should_see_the_checkout_overview_page() {
        Assert.assertTrue(onlinePages.finishButton.isDisplayed());
    }

    @When("I finish the checkout")

    public void i_finish_the_checkout() {
        onlinePages.finish();
    }

    @Then("I should see the checkout complete page")

    public void i_should_see_the_checkout_complete_page() {
        Assert.assertTrue(onlinePages.completeHeader.isDisplayed());
    }

    @When("I sort the items by A to Z")

    public void i_sort_the_items_by_a_to_z() {
        onlinePages.sortAZ();
    }

    @Then("I should see the items sorted by A to Z")

    public void i_should_see_the_items_sorted_by_a_to_z() {
        List<WebElement> allItems = onlinePages.getAllItems();
        List<String> allItemNames = new ArrayList<>();
        for (WebElement item : allItems) {
            allItemNames.add(item.getText());
        }
        List<String> sortedItemNames = new ArrayList<>(allItemNames);
        Collections.sort(sortedItemNames);
        Assert.assertEquals(allItemNames, sortedItemNames);
    }

    @When("I sort the items by Z to A")

    public void i_sort_the_items_by_z_to_a() {
        onlinePages.sortZA();
    }

    @Then("I should see the items sorted by Z to A")

    public void i_should_see_the_items_sorted_by_z_to_a() {
        List<WebElement> allItems = onlinePages.getAllItems();
        List<String> allItemNames = new ArrayList<>();
        for (WebElement item : allItems) {
            allItemNames.add(item.getText());
        }
        List<String> sortedItemNames = new ArrayList<>(allItemNames);
        Collections.sort(sortedItemNames, Collections.reverseOrder());
        Assert.assertEquals(allItemNames, sortedItemNames);
    }

    @When("I sort the items by price low to high")

    public void i_sort_the_items_by_price_low_to_high() {
        onlinePages.sortPriceLowToHigh();
    }

    @Then("I should see the items sorted by price low to high")

    public void i_should_see_the_items_sorted_by_price_low_to_high() {
        List<WebElement> allItems = onlinePages.getAllItems();
        List<String> allItemPrices = new ArrayList<>();
        for (WebElement item : allItems) {
            allItemPrices.add(item.getText());
        }
        List<String> sortedItemPrices = new ArrayList<>(allItemPrices);
        Collections.sort(sortedItemPrices);
        Assert.assertEquals(allItemPrices, sortedItemPrices);
    }

    @When("I sort the items by price high to low")

    public void i_sort_the_items_by_price_high_to_low() {
        onlinePages.sortPriceHighToLow();
    }

    @Then("I should see the items sorted by price high to low")

    public void i_should_see_the_items_sorted_by_price_high_to_low() {
        List<WebElement> allItems = onlinePages.getAllItems();
        List<String> allItemPrices = new ArrayList<>();
        for (WebElement item : allItems) {
            allItemPrices.add(item.getText());
        }
        List<String> sortedItemPrices = new ArrayList<>(allItemPrices);
        Collections.sort(sortedItemPrices, Collections.reverseOrder());
        Assert.assertEquals(allItemPrices, sortedItemPrices);
    }

    @When("click on the login button")
    public void click_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        onlinePages.loginButton.click();
    }



}
