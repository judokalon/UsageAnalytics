package application.model;

public class VerticalUsage {

    private String vertical;
    private long amount;

    public VerticalUsage(String vertical, long amount)
    {
        this.vertical=vertical;
        this.amount=amount;
    }

    public void setVertical (String vertical) {this.vertical=vertical;}
    public String getVertical () {return vertical;}
    public void setAmount (Long amount) {this.amount=amount;}
    public Long getAmount () {return  amount;}

}
