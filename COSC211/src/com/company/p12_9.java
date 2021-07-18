package com.company;

public class p12_9 {
    public static void doProblem() {
        try {
            System.out.println("SUCCESSFUL PARSE: "+parseInteger("105"));
        } catch(BinaryFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static int parseInteger(String integer) throws BinaryFormatException {
        for(Character c: integer.toCharArray()) if(c != '0' && c != '1') throw new BinaryFormatException("not binary");
        return Integer.parseInt(integer, 2);
    }
    public static class BinaryFormatException extends Exception {
        String reason;
        public BinaryFormatException(String reason) {
            this.reason = reason;
        }
        public String getMessage() {
            return reason;
        }
    }
}
