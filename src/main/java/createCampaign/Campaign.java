package createCampaign;

import java.util.ArrayList;
import java.util.List;

 class BudgetCap
{
    private int value;

    private boolean pacing;

    private String freq;


    public BudgetCap()
    {
        value=1000;
        pacing=false;
        freq="Monthly";
    }

    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public void setPacing(boolean pacing){
        this.pacing = pacing;
    }
    public boolean getPacing(){
        return this.pacing;
    }
    public void setFreq(String freq){
        this.freq = freq;
    }
    public String getFreq(){
        return this.freq;
    }
}

 class Params
{
    private String clientId;

    private List<String> clientIds;

    private String name;

    private String startDate;

    private String endDate;

    private BudgetCap budgetCap;

    public Params()
    {
        clientId="87956473-218d-4068-9190-3fa02c861ff9";

        List<String> listClientIds= new ArrayList<>();
        listClientIds.add("87956473-218d-4068-9190-3fa02c861ff9");

        clientIds=listClientIds;
        name="camp6";
        startDate="03/04/2021";
        endDate="03/30/2021";

        budgetCap= new BudgetCap();
    }


    public void setClientId(String clientId){
        this.clientId = clientId;
    }
    public String getClientId(){
        return this.clientId;
    }
    public void setClientIds(List<String> clientIds){
        this.clientIds = clientIds;
    }
    public List<String> getClientIds(){
        return this.clientIds;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }
    public String getStartDate(){
        return this.startDate;
    }
    public void setEndDate(String endDate){
        this.endDate = endDate;
    }
    public String getEndDate(){
        return this.endDate;
    }
    public void setBudgetCap(BudgetCap budgetCap){
        this.budgetCap = budgetCap;
    }
    public BudgetCap getBudgetCap(){
        return this.budgetCap;
    }
}

public class Campaign
{
    private Params params;

    public Campaign()
    {
        params= new Params();
    }

    public void setParams(Params params){
        this.params = params;
    }
    public Params getParams(){
        return this.params;
    }
}


