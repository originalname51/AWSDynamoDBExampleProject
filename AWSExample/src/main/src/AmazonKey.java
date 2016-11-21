/**
 * Created by rob on 10/20/16.
 */
public class AmazonKey {


    String pubkey;
    String prikey;

    public AmazonKey(){
        pubkey="your public key here";
        prikey="your private key here.";
    }

    public String getPubkey(){
        return pubkey;
    }

    public String getPrikey(){
        return prikey;
    }
}
