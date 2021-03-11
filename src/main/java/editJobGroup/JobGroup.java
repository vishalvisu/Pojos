package editJobGroup;

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


public class JobGroup
{
    private Filters filters;

    public void setFilters(Filters filters){
        this.filters = filters;
    }
    public Filters getFilters(){
        return this.filters;
    }
}
