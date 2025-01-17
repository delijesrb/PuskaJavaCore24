package rs.srb.cetri;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        char [] copyfrom = {'d','e','c','a','f','f','e','t','i','n','a','t','e'};
        char [] to = new char[8];
        char [] copy = Arrays.copyOfRange(copyfrom,2,11);
        System.arraycopy(copyfrom,2,to,0,to.length);
        System.out.println(copy);
    }
}
