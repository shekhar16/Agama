package io.jans.duo;

import com.duosecurity.Client;
import com.duosecurity.exception.DuoException;

import java.util.HashMap;
import java.util.Map;

class ClientDuoTest{

    private static Client duoClient;

    public static String  duoValidate() throws DuoException {
        Map<String, String> stateMap = new HashMap<>();;
        String CLIENT_ID = "DI1QCWC6TY96FLSPDEKE";
        String CLIENT_SECRET = "sPqo9w4BgBOJexIwJd105ZEzaLeoqEB2HaunMKLF";
        String API_HOST = "api-de9a3a97.duosecurity.com";
        String HTTPS_REDIRECT_URI = "https://shekhar16-quiet-cicada.gluu.info/jans-auth/fl/callback";
        this.duoClient = new Client.Builder(CLIENT_ID, CLIENT_SECRET, API_HOST, HTTPS_REDIRECT_URI).build();

        String state = duoClient.generateState();
        // Store the state to remember the session and username
        String username = "admin";
        stateMap.put(state, username);

        // Step 4: Create the authUrl and redirect to it
        String authUrl = duoClient.createAuthUrl(username, state);

        return authUrl;

    }

    public static String validateCallback(String callbackUrl){
        System.out.println("check callbackUrl  :  " + callbackUrl);
        return callbackUrl;
    }

}
