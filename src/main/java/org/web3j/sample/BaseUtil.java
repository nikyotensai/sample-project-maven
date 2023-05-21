package org.web3j.sample;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

public class BaseUtil {

    public static Web3j getTestWeb3J() {
        return Web3j.build(new HttpService("https://sepolia.infura.io/v3/" + System.getenv("ETH_TEST_TOKEN")));
    }

    public static Credentials getMyTestCredentials() throws Exception {
        return WalletUtils.loadCredentials(System.getenv("ETH_WALLET_PWD"),
                System.getenv("ETH_WALLET_FILE"));
    }

}
