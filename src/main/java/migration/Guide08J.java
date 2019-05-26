package migration;

import lombok.*;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

class Guide08J {

    @SneakyThrows(UnsupportedEncodingException.class)
    String utf8ToString(byte[] bytes) {
        if  (bytes.length == 0) {
            throw new UnsupportedEncodingException();
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }

}

class TestGuide08J {
    private static Guide08J guide1;
    public static void main(String[] args) {
        guide1 = new Guide08J();
        System.out.println(guide1.utf8ToString("test".getBytes()));
        System.out.println(guide1.utf8ToString("".getBytes()));
    }
}