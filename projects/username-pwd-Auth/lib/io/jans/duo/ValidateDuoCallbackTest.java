package io.jans.duo;

class ValidateDuoCallbackTest {

    public static String validateCallback(String callbackUrl){
        System.out.println("check callbackUrl  :  " + callbackUrl);
        return callbackUrl;
    }

}
