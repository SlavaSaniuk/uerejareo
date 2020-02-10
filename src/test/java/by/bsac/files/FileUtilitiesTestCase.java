package by.bsac.files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileUtilitiesTestCase {

    @Test
    void getFileExtension_fileWithExtension_shouldReturnFileExtension() {

        final String EXPECTED = "jpg";

        String actual = FileNameUtilities.getFileExtension("any_name.jpg");

        Assertions.assertEquals(EXPECTED, actual);
        System.out.println("Actual extension: " +actual);

    }

    @Test
    void getFileExtension_innerFile_shouldReturnFileExtension() {

        final String EXPECTED = "jpg";

        String actual = FileNameUtilities.getFileExtension("any_name.png.jpg");

        Assertions.assertEquals(EXPECTED, actual);
        System.out.println("Actual extension: " +actual);

    }

    @Test
    void getFileExtension_fileNameIsNull_shouldThrowNPE() {

        Assertions.assertThrows(NullPointerException.class, () -> FileNameUtilities.getFileExtension(null));

    }

    @Test
    void getFileNameWithoutExtension_fileWithExtension_shouldReturnFileExtension() {

        final String EXPECTED = "any_name";

        String actual = FileNameUtilities.getFileNameWithoutExtension("any_name.jpg");

        Assertions.assertEquals(EXPECTED, actual);
        System.out.println("Actual extension: " +actual);

    }

    @Test
    void getFileNameWithoutExtension_innerFile_shouldReturnFileExtension() {

        final String EXPECTED = "any_name.png";

        String actual = FileNameUtilities.getFileNameWithoutExtension("any_name.png.jpg");

        Assertions.assertEquals(EXPECTED, actual);
        System.out.println("Actual extension: " +actual);

    }

    @Test
    void getFileNameWithoutExtension_fileNameIsNull_shouldThrowNPE() {

        Assertions.assertThrows(NullPointerException.class, () -> FileNameUtilities.getFileNameWithoutExtension(null));

    }




}
