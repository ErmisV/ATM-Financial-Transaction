import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Synallagi_Pelati
{
    private Logariasmos Logariasmos;
    private double amount;
    private LocalDate Synallagi_Pelatidate;
    private LocalTime Synallagi_Pelatitime;
    private String Synallagi_Pelatidescription;
    private Synallagi_Pelatitypos_logar synallagi_Pelatitype; //Τύπος Συναλλαγής

    private double commission;

    public Synallagi_Pelati(Logariasmos Logariasmos, double amount, LocalDate Synallagi_Pelatidate, LocalTime Synallagi_Pelatitime,
    String Synallagi_Pelatidescription, Synallagi_Pelatitypos_logar synallagi_Pelatitype, double commission)
    {
        this.Logariasmos = Logariasmos;
        this.amount = amount;
        this.Synallagi_Pelatidate = Synallagi_Pelatidate;
        this.Synallagi_Pelatitime = Synallagi_Pelatitime;
        this.Synallagi_Pelatidescription=Synallagi_Pelatidescription;
        this.synallagi_Pelatitype = synallagi_Pelatitype;
        this. commission=commission;
    }

    public void setCommission(double commission)
    {
        this.commission = commission;
    }

    public void setLogariasmos(Logariasmos Logariasmos)
    {
        this.Logariasmos = Logariasmos;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public void setSynallagi_Pelatidate(LocalDate Synallagi_Pelatidate)
    {
        this.Synallagi_Pelatidate = Synallagi_Pelatidate;
    }

    public void setSynallagi_Pelatitime(LocalTime Synallagi_Pelatitime)
    {
        this.Synallagi_Pelatitime = Synallagi_Pelatitime;
    }

    public Logariasmos getLogariasmos()
    {
        return Logariasmos;
    }

    public LocalDate getSynallagi_Pelatidate()
    {
        return Synallagi_Pelatidate;
    }

    public LocalTime getSynallagi_Pelatitime()
    {
        return Synallagi_Pelatitime;
    }

    public double getAmount()
    {
        return amount;
    }

    public Synallagi_Pelatitypos_logar getSynallagi_Pelatitype()
    {
        return synallagi_Pelatitype;
    }

    public double getCommission() {return commission;}

    public void transfer(Logariasmos Logariasmosfrom,Logariasmos Logariasmosto,double amount)
    {
        this.Synallagi_Pelatidescription="Money Transfer";

        if (Logariasmosfrom.getypoloipo() > amount)
        {
            Logariasmosfrom.setypoloipo(Logariasmosfrom.getypoloipo() - amount);
            Logariasmosto.setypoloipo(Logariasmosto.getypoloipo() + amount);
        }
        else
            JOptionPane.showMessageDialog(null, "Not enough ypoloipo to transfer");
    }

    @Override
    public String toString()
    {
        String res="\nΠληροφορίες Συναλλαγής: " + "ΙΒΑΝ:" + Logariasmos.getKodikos_Logariasmou() +", Ποσό:" + amount + ",  Ημερομηνία Συναλλαγής:" + Synallagi_Pelatidate +",  Ώρα Συναλλαγής:" + Synallagi_Pelatitime + ",  Περιγραφή:" + Synallagi_Pelatidescription + "  Τύπος Συναλλαγής:" + synallagi_Pelatitype + "Προ-μήθεια Κίνησης:"+commission;
        res+="\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        return res;
    }
}
