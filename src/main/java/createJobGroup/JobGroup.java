package createJobGroup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 class Rules
{
    private String operator;

    private String field;

    private String data;

    public Rules()
    {
        operator="EQUAL";
        field="category";
        data="Recruitment";


    }

    public void setOperator(String operator){
        this.operator = operator;
    }
    public String getOperator(){
        return this.operator;
    }
    public void setField(String field){
        this.field = field;
    }
    public String getField(){
        return this.field;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
}

 class Filters
{
    private String operator;

    private List<Rules> rules;

    public  Filters()
    {
        operator="AND";

        List<Rules> rules= new ArrayList<>();

        rules.add(new Rules());


    }

    public void setOperator(String operator){
        this.operator = operator;
    }
    public String getOperator(){
        return this.operator;
    }
    public void setRules(List<Rules> rules){
        this.rules = rules;
    }
    public List<Rules> getRules(){
        return this.rules;
    }
}

 class BudgetCap
{
    private boolean pacing;

    private String freq;

    private int threshold;

    private int value;

    public BudgetCap()
    {
        pacing=true;
        freq="Monthly";
        threshold=80;
        value=1000;

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
    public void setThreshold(int threshold){
        this.threshold = threshold;
    }
    public int getThreshold(){
        return this.threshold;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}

class ClicksCap
{
    private boolean pacing;

    private String freq;

    private int threshold;

    private int value;

    public ClicksCap()
    {
        pacing=true;
        freq="Monthly";
        threshold=80;
        value=1000;
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
    public void setThreshold(int threshold){
        this.threshold = threshold;
    }
    public int getThreshold(){
        return this.threshold;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}

 class AppliesCap
{
    private boolean pacing;

    private String freq;

    private int threshold;

    private int value;

    public AppliesCap()
    {
        pacing=true;
        freq="Monthly";
        threshold=80;
        value=1000;
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
    public void setThreshold(int threshold){
        this.threshold = threshold;
    }
    public int getThreshold(){
        return this.threshold;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}

 class OverspendCap
{
    private String status;

    private int maxJobCount;

    private String clientId;

    private String filterBy;

    private String orderBy;

    private int timePeriodSec;

    public OverspendCap()
    {
        status="A";
        maxJobCount=10;
        clientId="87956473-218d-4068-9190-3fa02c861ff9";
        filterBy="POSTED_DATE";
        orderBy="ASCENDING";
        timePeriodSec=2592000;
    }

    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setMaxJobCount(int maxJobCount){
        this.maxJobCount = maxJobCount;
    }
    public int getMaxJobCount(){
        return this.maxJobCount;
    }
    public void setClientId(String clientId){
        this.clientId = clientId;
    }
    public String getClientId(){
        return this.clientId;
    }
    public void setFilterBy(String filterBy){
        this.filterBy = filterBy;
    }
    public String getFilterBy(){
        return this.filterBy;
    }
    public void setOrderBy(String orderBy){
        this.orderBy = orderBy;
    }
    public String getOrderBy(){
        return this.orderBy;
    }
    public void setTimePeriodSec(int timePeriodSec){
        this.timePeriodSec = timePeriodSec;
    }
    public int getTimePeriodSec(){
        return this.timePeriodSec;
    }
}

 class JobBudgetCap
{
    private boolean pacing;

    private String freq;

    private int threshold;

    private int value;

    public JobBudgetCap()
    {
        pacing=true;
        freq="Monthly";
        threshold=80;
        value=1000;
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
    public void setThreshold(int threshold){
        this.threshold = threshold;
    }
    public int getThreshold(){
        return this.threshold;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}

 class JobClicksCap
{
    private boolean pacing;

    private String freq;

    private int threshold;

    private int value;

    public JobClicksCap()
    {
        pacing=true;
        freq="Monthly";
        threshold=80;
        value=1000;
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
    public void setThreshold(int threshold){
        this.threshold = threshold;
    }
    public int getThreshold(){
        return this.threshold;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}

class JobAppliesCap
{
    private boolean pacing;

    private String freq;

    private int threshold;

    private int value;

    public JobAppliesCap()
    {
        pacing=true;
        freq="Monthly";
        threshold=80;
        value=1000;
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
    public void setThreshold(int threshold){
        this.threshold = threshold;
    }
    public int getThreshold(){
        return this.threshold;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}

 class IoDetails
{
    private String number;

    private int value;

    private String startDate;

    private String endDate;

    public IoDetails()
    {
        number="767";
        value=1000;
        startDate="03/02/2027";
        endDate="03/31/2029";

    }


    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return this.number;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
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
}

class PerformanceTargets
{
    private String type;

    private int value;

    public PerformanceTargets(String Type,int Value)
    {
        type=Type;
        value=Value;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}

class TradingGoals
{
    private List<IoDetails> ioDetails;

    private List<PerformanceTargets> performanceTargets;


    public void setIoDetails(List<IoDetails> ioDetails){
        this.ioDetails = ioDetails;
    }
    public List<IoDetails> getIoDetails(){
        return this.ioDetails;
    }
    public void setPerformanceTargets(List<PerformanceTargets> performanceTargets){
        this.performanceTargets = performanceTargets;
    }
    public List<PerformanceTargets> getPerformanceTargets(){
        return this.performanceTargets;
    }
}

 class Placements
{
    private String pValue;

    public void setPValue(String pValue){
        this.pValue = pValue;
    }
    public String getPValue(){
        return this.pValue;
    }
}

class RecommendationAudit
{
    private List<String> result;

    private List<String> acceptedResult;

    public void setResult(List<String> result){
        this.result = result;
    }
    public List<String> getResult(){
        return this.result;
    }
    public void setAcceptedResult(List<String> acceptedResult){
        this.acceptedResult = acceptedResult;
    }
    public List<String> getAcceptedResult(){
        return this.acceptedResult;
    }
}

class Params
{
    private String name;

    private String campaignId;

    private String startDate;

    private String endDate;

    private int priority;

    private String category;

    private int cpcBid;

    private int cpaBid;

    private String clientId;

    private List<String> clientIds;

    private String sign;

    private Filters filters;

    private BudgetCap budgetCap;

    private ClicksCap clicksCap;

    private AppliesCap appliesCap;

    private OverspendCap overspendCap;

    private JobBudgetCap jobBudgetCap;

    private JobClicksCap jobClicksCap;

    private JobAppliesCap jobAppliesCap;

    private TradingGoals tradingGoals;

    private List<Placements> placements;

    private RecommendationAudit recommendationAudit;

    private boolean isPPC;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setCampaignId(String campaignId){
        this.campaignId = campaignId;
    }
    public String getCampaignId(){
        return this.campaignId;
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
    public void setPriority(int priority){
        this.priority = priority;
    }
    public int getPriority(){
        return this.priority;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }
    public void setCpcBid(int cpcBid){
        this.cpcBid = cpcBid;
    }
    public int getCpcBid(){
        return this.cpcBid;
    }
    public void setCpaBid(int cpaBid){
        this.cpaBid = cpaBid;
    }
    public int getCpaBid(){
        return this.cpaBid;
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
    public void setSign(String sign){
        this.sign = sign;
    }
    public String getSign(){
        return this.sign;
    }
    public void setFilters(Filters filters){
        this.filters = filters;
    }
    public Filters getFilters(){
        return this.filters;
    }
    public void setBudgetCap(BudgetCap budgetCap){
        this.budgetCap = budgetCap;
    }
    public BudgetCap getBudgetCap(){
        return this.budgetCap;
    }
    public void setClicksCap(ClicksCap clicksCap){
        this.clicksCap = clicksCap;
    }
    public ClicksCap getClicksCap(){
        return this.clicksCap;
    }
    public void setAppliesCap(AppliesCap appliesCap){
        this.appliesCap = appliesCap;
    }
    public AppliesCap getAppliesCap(){
        return this.appliesCap;
    }
    public void setOverspendCap(OverspendCap overspendCap){
        this.overspendCap = overspendCap;
    }
    public OverspendCap getOverspendCap(){
        return this.overspendCap;
    }
    public void setJobBudgetCap(JobBudgetCap jobBudgetCap){
        this.jobBudgetCap = jobBudgetCap;
    }
    public JobBudgetCap getJobBudgetCap(){
        return this.jobBudgetCap;
    }
    public void setJobClicksCap(JobClicksCap jobClicksCap){
        this.jobClicksCap = jobClicksCap;
    }
    public JobClicksCap getJobClicksCap(){
        return this.jobClicksCap;
    }
    public void setJobAppliesCap(JobAppliesCap jobAppliesCap){
        this.jobAppliesCap = jobAppliesCap;
    }
    public JobAppliesCap getJobAppliesCap(){
        return this.jobAppliesCap;
    }
    public void setTradingGoals(TradingGoals tradingGoals){
        this.tradingGoals = tradingGoals;
    }
    public TradingGoals getTradingGoals(){
        return this.tradingGoals;
    }
    public void setPlacements(List<Placements> placements){
        this.placements = placements;
    }
    public List<Placements> getPlacements(){
        return this.placements;
    }
    public void setRecommendationAudit(RecommendationAudit recommendationAudit){
        this.recommendationAudit = recommendationAudit;
    }
    public RecommendationAudit getRecommendationAudit(){
        return this.recommendationAudit;
    }
    public void setIsPPC(boolean isPPC){
        this.isPPC = isPPC;
    }
    public boolean getIsPPC(){
        return this.isPPC;
    }
}


public class JobGroup
{
    private Params params;

    public void setParams(Params params){
        this.params = params;
    }
    public Params getParams(){
        return this.params;
    }
}
