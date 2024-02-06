package io.jans.duo;

class ValidateDuoCallbackTest {

    public static String validateCallback(String callbackDetails){
        System.out.println("check callbackUrl  :  " + callbackDetails);
        return callbackDetails;
    }

}
