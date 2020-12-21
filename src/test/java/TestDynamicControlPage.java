import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDynamicControlPage extends BaseTest {


    @Test
    public void testFindCheckbox() {
        dynamicControlPage.openPage();
        Assert.assertTrue(dynamicControlPage.findCheckbox());
    }

    @Test
    public void testClickCheckboxButton() {
        dynamicControlPage.openPage();
        Assert.assertTrue(dynamicControlPage.clickCheckboxButton());
    }

    @Test
    public void testItsGoneText() {
        dynamicControlPage.openPage();
        dynamicControlPage.clickCheckboxButton();
        String message = dynamicControlPage.getItsGoneText();
        Assert.assertEquals(message, "It's gone!");
    }

    @Test
    public void testCheckboxIsNotVisible() {
        dynamicControlPage.openPage();
        dynamicControlPage.clickCheckboxButton();
        Assert.assertTrue(dynamicControlPage.checkCheckboxVisibility());
    }

    @Test
    public void testFindInput() {
        dynamicControlPage.openPage();
        Assert.assertTrue(dynamicControlPage.findInput());
    }

    @Test
    public void testInputIsDisabled() {
        dynamicControlPage.openPage();
        Assert.assertTrue(dynamicControlPage.checkDisabledInput());
    }

    @Test
    public void testClickInputButton() {
        dynamicControlPage.openPage();
        Assert.assertTrue(dynamicControlPage.clickInputButton());
    }

    @Test
    public void testItsEnabledText() {
        dynamicControlPage.openPage();
        dynamicControlPage.clickInputButton();
        String message = dynamicControlPage.getIsEnabledMessage();
        Assert.assertEquals(message, "It's enabled!");
    }

    @Test
    public void testCheckEnabledInput() {
        dynamicControlPage.openPage();
        dynamicControlPage.clickInputButton();
        Assert.assertTrue(dynamicControlPage.checkEnabledInput());
    }
}


