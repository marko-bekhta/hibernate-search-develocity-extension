package org.hibernate.search.develocity.util;

public final class Strings {

    private Strings() {
    }

    public static boolean isBlank(String string) {
        if (string == null) {
            return true;
        }

        return string.isBlank();
    }
}
