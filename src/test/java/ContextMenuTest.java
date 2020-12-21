import org.testng.Assert;
import org.testng.annotations.*;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenuIsAppear() {
        contextMenuPage.openPage();
        contextMenuPage.rightClick();
        contextMenuPage.clickOkOnAlertButton();
        Assert.assertTrue(true);
    }

    @Test
    public void testAlertMessage() {
        contextMenuPage.openPage();
        contextMenuPage.rightClick();
        String message = contextMenuPage.getAlertMessage();
        Assert.assertEquals(message, "You selected a context menu");
    }
}
