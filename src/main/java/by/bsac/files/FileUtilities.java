package by.bsac.files;


public class FileUtilities {

    public static String getFileExtension(String a_file_name) {

        if (a_file_name == null)
            throw new NullPointerException("Nullable file name.");

        String extension = "";

        int i = a_file_name.lastIndexOf('.');

        if (i > 0)
            extension = a_file_name.substring(i+1);

        return extension;
    }

    public static String getFileNameWithoutExtension(String a_file_name) {

        String name = "";

        int i = a_file_name.lastIndexOf('.');

        if (i > 0)
            name = a_file_name.substring(0, i);

        return name;

    }

}
