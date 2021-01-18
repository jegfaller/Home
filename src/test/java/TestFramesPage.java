import org.testng.Assert;
import org.testng.annotations.Test;


public class TestFramesPage extends BaseTest {

    @Test
    public void testPText() {
        framesPage.openPage();
        framesPage.clickIframe();
        Assert.assertEquals(framesPage.getPText(), "Your content goes here.");
    }
}
