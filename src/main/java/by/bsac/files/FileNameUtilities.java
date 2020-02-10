package by.bsac.files;

/**
 * Custom utilities for java io/nio package.
 */
public class FileNameUtilities {

    /**
     * Method return extension of given file name string.
     * @param a_file_name - given file name {@link String}.
     * @return - file extension.
     */
    public static String getFileExtension(String a_file_name) {

        if (a_file_name == null)
            throw new NullPointerException("Nullable file name.");

        String extension = "";

        int i = a_file_name.lastIndexOf('.');

        if (i > 0)
            extension = a_file_name.substring(i+1);

        return extension;
    }

    /**
     * Method return file name {@link String} without file extension.
     * @param a_file_name - given file name {@link String}.
     * @return - file name {@link String}.
     */
    public static String getFileNameWithoutExtension(String a_file_name) {

        String name = "";

        int i = a_file_name.lastIndexOf('.');

        if (i > 0)
            name = a_file_name.substring(0, i);

        return name;

    }

}
