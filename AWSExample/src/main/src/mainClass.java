import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import static com.amazonaws.regions.Regions.US_EAST_1;

/**
 * Created by rob on 11/16/16.
 */
public class mainClass {

    public static void main(String[] args){
        DynamoDBMapper mapper = getDynamoDBMapper();

        ASimpleDynamoPojo create = new ASimpleDynamoPojo();
        create.setMyKey("KeyValue");
        create.setFunVal("funValue");
        mapper.save(create);


        ASimpleDynamoPojo load = mapper.load(ASimpleDynamoPojo.class, "KeyValue");

        ASimpleDynamoPojo update = load;
        update.setFunVal("updatedFunValue");
        mapper.save(update);

        ASimpleDynamoPojo delete = update;
        mapper.delete(delete);

    }


    private static DynamoDBMapper getDynamoDBMapper() {
        AmazonKey key = new AmazonKey();
        BasicAWSCredentials credentials = new BasicAWSCredentials(key.getPubkey(), key.getPrikey());
        AmazonDynamoDBClient client = new AmazonDynamoDBClient(credentials).withRegion(US_EAST_1);
        return new DynamoDBMapper(client);
    }
}
