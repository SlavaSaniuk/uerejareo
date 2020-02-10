package by.bsac.streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Custom utilities for {@link InputStream} streams.
 */
public class InputStreamUtilities {

    /**
     * Method read bytes from given {@link InputStream}.
     * @param in - given {@link InputStream}.
     * @return - {@link Byte} array.
     * @throws IOException - Throws if {@link IOException} occurs.
     */
    public static byte[] toByteArray(InputStream in) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();

        byte[] buffer = new byte[1024];
        int length;

        while((length = in.read(buffer)) != -1)
            os.write(buffer, 0 , length);

        return os.toByteArray();
    }
}
