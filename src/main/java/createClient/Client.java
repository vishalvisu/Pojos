package createClient;

import java.util.List;
import java.util.Map;

class SchemaMappingAdditional
{
   Map<String,String> map;
   
}


class SchemaMappingPublisher
{
}


class SchemaMappings
{
   public String schemaMappingsJobCollection;

   public String schemaMappingsJob;

   private String schemaMappingsCompany;

   private String schemaMappingsTitle;

   private String schemaMappingsCity;

   private String schemaMappingsState;

   private String schemaMappingsCountry;

   private String schemaMappingsDescription;

   private String schemaMappingsURL;

   private String schemaMappingsZip;

   private String schemaMappingsCategory;

   private String schemaMappingsDatePosted;

   private String schemaMappingsRefNumber;

   private String schemaMappingsModifiedDate;

   private String schemaMappingsPublishedDate;

   private String schemaMappingsCPCBid;

   private String schemaMappingsType;

   private SchemaMappingAdditional schemaMappingAdditional;

   private SchemaMappingPublisher schemaMappingPublisher;

   public void setSchemaMappingsJobCollection(String schemaMappingsJobCollection){
      this.schemaMappingsJobCollection = schemaMappingsJobCollection;
   }
   public String getSchemaMappingsJobCollection(){
      return this.schemaMappingsJobCollection;
   }
   public void setSchemaMappingsJob(String schemaMappingsJob){
      this.schemaMappingsJob = schemaMappingsJob;
   }
   public String getSchemaMappingsJob(){
      return this.schemaMappingsJob;
   }
   public void setSchemaMappingsCompany(String schemaMappingsCompany){
      this.schemaMappingsCompany = schemaMappingsCompany;
   }
   public String getSchemaMappingsCompany(){
      return this.schemaMappingsCompany;
   }
   public void setSchemaMappingsTitle(String schemaMappingsTitle){
      this.schemaMappingsTitle = schemaMappingsTitle;
   }
   public String getSchemaMappingsTitle(){
      return this.schemaMappingsTitle;
   }
   public void setSchemaMappingsCity(String schemaMappingsCity){
      this.schemaMappingsCity = schemaMappingsCity;
   }
   public String getSchemaMappingsCity(){
      return this.schemaMappingsCity;
   }
   public void setSchemaMappingsState(String schemaMappingsState){
      this.schemaMappingsState = schemaMappingsState;
   }
   public String getSchemaMappingsState(){
      return this.schemaMappingsState;
   }
   public void setSchemaMappingsCountry(String schemaMappingsCountry){
      this.schemaMappingsCountry = schemaMappingsCountry;
   }
   public String getSchemaMappingsCountry(){
      return this.schemaMappingsCountry;
   }
   public void setSchemaMappingsDescription(String schemaMappingsDescription){
      this.schemaMappingsDescription = schemaMappingsDescription;
   }
   public String getSchemaMappingsDescription(){
      return this.schemaMappingsDescription;
   }
   public void setSchemaMappingsURL(String schemaMappingsURL){
      this.schemaMappingsURL = schemaMappingsURL;
   }
   public String getSchemaMappingsURL(){
      return this.schemaMappingsURL;
   }
   public void setSchemaMappingsZip(String schemaMappingsZip){
      this.schemaMappingsZip = schemaMappingsZip;
   }
   public String getSchemaMappingsZip(){
      return this.schemaMappingsZip;
   }
   public void setSchemaMappingsCategory(String schemaMappingsCategory){
      this.schemaMappingsCategory = schemaMappingsCategory;
   }
   public String getSchemaMappingsCategory(){
      return this.schemaMappingsCategory;
   }
   public void setSchemaMappingsDatePosted(String schemaMappingsDatePosted){
      this.schemaMappingsDatePosted = schemaMappingsDatePosted;
   }
   public String getSchemaMappingsDatePosted(){
      return this.schemaMappingsDatePosted;
   }
   public void setSchemaMappingsRefNumber(String schemaMappingsRefNumber){
      this.schemaMappingsRefNumber = schemaMappingsRefNumber;
   }
   public String getSchemaMappingsRefNumber(){
      return this.schemaMappingsRefNumber;
   }
   public void setSchemaMappingsModifiedDate(String schemaMappingsModifiedDate){
      this.schemaMappingsModifiedDate = schemaMappingsModifiedDate;
   }
   public String getSchemaMappingsModifiedDate(){
      return this.schemaMappingsModifiedDate;
   }
   public void setSchemaMappingsPublishedDate(String schemaMappingsPublishedDate){
      this.schemaMappingsPublishedDate = schemaMappingsPublishedDate;
   }
   public String getSchemaMappingsPublishedDate(){
      return this.schemaMappingsPublishedDate;
   }
   public void setSchemaMappingsCPCBid(String schemaMappingsCPCBid){
      this.schemaMappingsCPCBid = schemaMappingsCPCBid;
   }
   public String getSchemaMappingsCPCBid(){
      return this.schemaMappingsCPCBid;
   }
   public void setSchemaMappingsType(String schemaMappingsType){
      this.schemaMappingsType = schemaMappingsType;
   }
   public String getSchemaMappingsType(){
      return this.schemaMappingsType;
   }
   public void setSchemaMappingAdditional(SchemaMappingAdditional schemaMappingAdditional){
      this.schemaMappingAdditional = schemaMappingAdditional;
   }
   public SchemaMappingAdditional getSchemaMappingAdditional(){
      return this.schemaMappingAdditional;
   }
   public void setSchemaMappingPublisher(SchemaMappingPublisher schemaMappingPublisher){
      this.schemaMappingPublisher = schemaMappingPublisher;
   }
   public SchemaMappingPublisher getSchemaMappingPublisher(){
      return this.schemaMappingPublisher;
   }
}


class Feeds
{
   private String xmlFeedUrl;

   private String id;

   private SchemaMappings schemaMappings;

   private List<String> mandatoryFields;

   public void setXmlFeedUrl(String xmlFeedUrl){
      this.xmlFeedUrl = xmlFeedUrl;
   }
   public String getXmlFeedUrl(){
      return this.xmlFeedUrl;
   }
   public void setId(String id){
      this.id = id;
   }
   public String getId(){
      return this.id;
   }
   public void setSchemaMappings(SchemaMappings schemaMappings){
      this.schemaMappings = schemaMappings;
   }
   public SchemaMappings getSchemaMappings(){
      return this.schemaMappings;
   }
   public void setMandatoryFields(List<String> mandatoryFields){
      this.mandatoryFields = mandatoryFields;
   }
   public List<String> getMandatoryFields(){
      return this.mandatoryFields;
   }
}

class BudgetCap
{
   private int value;

   private boolean pacing;

   private String freq;

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
   private String name;

   private String country;

   private String exportedName;

   private String advertiserName;

   private String ats;

   private String atsUrl;

   private String frequency;

   private int applyConvWindow;

   private String timezone;

   private String type;

   private String industry;

   private String excludedPublishers;

   private String endDate;

   private String startDate;

   private String markdown;

   private List<Feeds> feeds;

   private boolean sjCreate;

   private BudgetCap budgetCap;

   private List<String> industries;

   private String globallyExcludedPublishers;

   public void setName(String name){
      this.name = name;
   }
   public String getName(){
      return this.name;
   }
   public void setCountry(String country){
      this.country = country;
   }
   public String getCountry(){
      return this.country;
   }
   public void setExportedName(String exportedName){
      this.exportedName = exportedName;
   }
   public String getExportedName(){
      return this.exportedName;
   }
   public void setAdvertiserName(String advertiserName){
      this.advertiserName = advertiserName;
   }
   public String getAdvertiserName(){
      return this.advertiserName;
   }
   public void setAts(String ats){
      this.ats = ats;
   }
   public String getAts(){
      return this.ats;
   }
   public void setAtsUrl(String atsUrl){
      this.atsUrl = atsUrl;
   }
   public String getAtsUrl(){
      return this.atsUrl;
   }
   public void setFrequency(String frequency){
      this.frequency = frequency;
   }
   public String getFrequency(){
      return this.frequency;
   }
   public void setApplyConvWindow(int applyConvWindow){
      this.applyConvWindow = applyConvWindow;
   }
   public int getApplyConvWindow(){
      return this.applyConvWindow;
   }
   public void setTimezone(String timezone){
      this.timezone = timezone;
   }
   public String getTimezone(){
      return this.timezone;
   }
   public void setType(String type){
      this.type = type;
   }
   public String getType(){
      return this.type;
   }
   public void setIndustry(String industry){
      this.industry = industry;
   }
   public String getIndustry(){
      return this.industry;
   }
   public void setExcludedPublishers(String excludedPublishers){
      this.excludedPublishers = excludedPublishers;
   }
   public String getExcludedPublishers(){
      return this.excludedPublishers;
   }
   public void setEndDate(String endDate){
      this.endDate = endDate;
   }
   public String getEndDate(){
      return this.endDate;
   }
   public void setStartDate(String startDate){
      this.startDate = startDate;
   }
   public String getStartDate(){
      return this.startDate;
   }
   public void setMarkdown(String markdown){
      this.markdown = markdown;
   }
   public String getMarkdown(){
      return this.markdown;
   }
   public void setFeeds(List<Feeds> feeds){
      this.feeds = feeds;
   }
   public List<Feeds> getFeeds(){
      return this.feeds;
   }
   public void setSjCreate(boolean sjCreate){
      this.sjCreate = sjCreate;
   }
   public boolean getSjCreate(){
      return this.sjCreate;
   }
   public void setBudgetCap(BudgetCap budgetCap){
      this.budgetCap = budgetCap;
   }
   public BudgetCap getBudgetCap(){
      return this.budgetCap;
   }
   public void setIndustries(List<String> industries){
      this.industries = industries;
   }
   public List<String> getIndustries(){
      return this.industries;
   }
   public void setGloballyExcludedPublishers(String globallyExcludedPublishers){
      this.globallyExcludedPublishers = globallyExcludedPublishers;
   }
   public String getGloballyExcludedPublishers(){
      return this.globallyExcludedPublishers;
   }
}


 class Client
{
   private Params params;

   public void setParams(Params params){
      this.params = params;
   }
   public Params getParams(){
      return this.params;
   }
}
