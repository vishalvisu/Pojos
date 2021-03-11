package EditClient;

import java.util.List;

 class BudgetCap
{
    private int value;

    private String freq;

    private boolean pacing;

    private int threshold;

    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public void setFreq(String freq){
        this.freq = freq;
    }
    public String getFreq(){
        return this.freq;
    }
    public void setPacing(boolean pacing){
        this.pacing = pacing;
    }
    public boolean getPacing(){
        return this.pacing;
    }
    public void setThreshold(int threshold){
        this.threshold = threshold;
    }
    public int getThreshold(){
        return this.threshold;
    }
}


 class Params
{
    private List<String> clientIds;

    private BudgetCap budgetCap;

    public void setClientIds(List<String> clientIds){
        this.clientIds = clientIds;
    }
    public List<String> getClientIds(){
        return this.clientIds;
    }
    public void setBudgetCap(BudgetCap budgetCap){
        this.budgetCap = budgetCap;
    }
    public BudgetCap getBudgetCap(){
        return this.budgetCap;
    }
}


public class Client
{
    private Params params;

    public void setParams(Params params){
        this.params = params;
    }
    public Params getParams(){
        return this.params;
    }
}
