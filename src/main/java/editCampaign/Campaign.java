package EditCampaign;

import java.util.List;

import java.util.ArrayList;
import java.util.List;
 class Params
{
    private List<String> clientIds;

    private List<String> campaignIds;

    private String name;

    public void setClientIds(List<String> clientIds){
        this.clientIds = clientIds;
    }
    public List<String> getClientIds(){
        return this.clientIds;
    }
    public void setCampaignIds(List<String> campaignIds){
        this.campaignIds = campaignIds;
    }
    public List<String> getCampaignIds(){
        return this.campaignIds;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}


public class Campaign
{
    private Params params;

    public void setParams(Params params){
        this.params = params;
    }
    public Params getParams(){
        return this.params;
    }
}
