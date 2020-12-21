import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUpload extends BaseTest {

    @Test
    public void testUpload() {
        uploadFilePage.openPage();
        uploadFilePage.uploadFile();
        Assert.assertEquals(uploadFilePage.getFileName(), "qa3cz1.jpg");
    }
}
