package javaapplication13;

public class Check {

    public boolean name(String nam) {

        char b[] = nam.toCharArray();

        for (int i = 0; i < b.length; i++) {

            if (!((b[i] >= 65 && b[i] <= 90) || (b[i] >= 97 && b[i] <= 122) || (b[i] == 32))) {
                return false;
            }

        }
        return true;

    }
}
