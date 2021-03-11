package getClient;

import java.util.List;

class Rules
{
    private String operator;

    private String field;

    private List<String> data;

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
    public void setData(List<String> data){
        this.data = data;
    }
    public List<String> getData(){
        return this.data;
    }
}

 class Filters
{
    private String operator;

    private List<Rules> rules;

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

public class Client
{
    private Filters filters;

    private int page;

    private int limit;

    private boolean sortOrderAsc;

    private String sortBy;

    public void setFilters(Filters filters){
        this.filters = filters;
    }
    public Filters getFilters(){
        return this.filters;
    }
    public void setPage(int page){
        this.page = page;
    }
    public int getPage(){
        return this.page;
    }
    public void setLimit(int limit){
        this.limit = limit;
    }
    public int getLimit(){
        return this.limit;
    }
    public void setSortOrderAsc(boolean sortOrderAsc){
        this.sortOrderAsc = sortOrderAsc;
    }
    public boolean getSortOrderAsc(){
        return this.sortOrderAsc;
    }
    public void setSortBy(String sortBy){
        this.sortBy = sortBy;
    }
    public String getSortBy(){
        return this.sortBy;
    }
}
