import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;


@DynamoDBTable(tableName = "SimplePojoTable")
public class ASimpleDynamoPojo {


    private String      myKey;
    private String      funVal;

    @DynamoDBHashKey(attributeName = "myKey")
    public String getMyKey() {
        return myKey;
    }

    public void setMyKey(String myKey) {
        this.myKey = myKey;
    }

    @DynamoDBAttribute(attributeName = "funVal")
    public String getFunVal() {
        return funVal;
    }

    public void setFunVal(String funVal) {
        this.funVal = funVal;
    }

    @Override
    public String toString() {
        return "ASimpleDynamoPojo{" +
                "myKey='" + myKey + '\'' +
                ", funVal='" + funVal + '\'' +
                '}';
    }
}
