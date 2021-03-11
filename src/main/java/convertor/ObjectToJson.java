package convertor;

import createCampaign.Campaign;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import java.io.IOException;

public class ObjectToJson {
    public static void main(String[] a) {

        // Creating object of Client
        Campaign campaign = new Campaign();


        // Creating Object of ObjectMapper define in Jakson Api
        ObjectMapper objectMapper = new ObjectMapper();

        //For handling Empty Classes
        objectMapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);

        try {

            // get Client object as a json string
            String jsonStr = objectMapper.writeValueAsString(campaign);

            // Displaying JSON String
            System.out.println(jsonStr);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}