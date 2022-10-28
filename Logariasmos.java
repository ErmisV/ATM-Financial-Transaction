import javax.swing.*;
import java.util.ArrayList;

public class Logariasmos
{
    private String Kodikos_Logariasmou;
    private Pelatis pelatis;
    private double ypoloipo;
    private typos_logariasmou typos_logariasmou;
    private ArrayList<Synallagi_Pelati> Synallagi_Pelatis=new ArrayList<Synallagi_Pelati>
(); //Ένας λογαριασμός έχει ένα πίνακα συναλλαγών

    public Logariasmos(String Kodikos_Logariasmou, Pelatis Pelatis, double ypoloipo, typos_logariasmou typos_logariasmou)
    {
        this.Kodikos_Logariasmou = Kodikos_Logariasmou;
        this.pelatis = Pelatis;
        this.ypoloipo = ypoloipo;
        this.typos_logariasmou = typos_logariasmou;
    }

    public void setKodikos_Logariasmou(String Kodikos_Logariasmou)
    {
        this.Kodikos_Logariasmou = Kodikos_Logariasmou;
    }

    public void settypos_logariasmou(typos_logariasmou typos_logariasmou)
    {
        this.typos_logariasmou = typos_logariasmou;
    }

    public void setypoloipo(double ypoloipo)
    {
        this.ypoloipo = ypoloipo;
    }

    public void setPelatis(Pelatis Pelatis)
    {
        this.pelatis = Pelatis;
    }

    public void setSynallagi_Pelatis(ArrayList<Synallagi_Pelati> Synallagi_Pelatis)
    {
        this.Synallagi_Pelatis = Synallagi_Pelatis;
    }

    public String getKodikos_Logariasmou()
    {
        return Kodikos_Logariasmou;
    }

    public double getypoloipo()
    {
        return ypoloipo;
    }

    public Pelatis getPelatis()
    {
        return pelatis;
    }

    public typos_logariasmou gettypos_logariasmou()
    {
        return typos_logariasmou;
    }

    public ArrayList<Synallagi_Pelati> getSynallagi_Pelatis()
    {
        return Synallagi_Pelatis;
    }


    public void Katathesi(double x)
    {
       ypoloipo+=x;
    }

    public void Analipsi(double y)
    {
        if (ypoloipo>=y)
            ypoloipo-=y;
        else
            JOptionPane.showMessageDialog(null,"Το υπόλοιπο δεν επαρκεί για να εκτελε-στεί η ανάληψη");
    }

    public void printLogariasmosInfo()
    {
        String apotelesma="\nΣτοιχεία Λογαριασμού Κωδικός:" + Kodikos_Logariasmou + "\nΥπόλοιπο:" + ypoloipo +", Είδος Λογαριασμού:" + typos_logariasmou ;

        for (int i=0;i<Synallagi_Pelatis.size();i++)
            apotelesma+=Synallagi_Pelatis.get(i).toString();

        JOptionPane.showMessageDialog(null,apotelesma,"Πληροφορίες Συναλλαγών Λογα-ριασμού",JOptionPane.INFORMATION_MESSAGE);
    }

    public String toString()
    {
        String apotelesma="\nΣτοιχεία Λογαριασμού Κωδικός:" + Kodikos_Logariasmou + "\nΥπόλοιπο:" + ypoloipo +", Είδος Λογαριασμού:" + typos_logariasmou ;
        apotelesma += "\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";

        for (int i=0;i<Synallagi_Pelatis.size();i++) //Εκτελούμε μια επανάληψη για όλες τις συ-ναλλαγές του λογαριασμού του
            apotelesma += Synallagi_Pelatis.get(i).toString(); //συνενώνουμε τα στοιχεία-πληροφορίες από τον κάθε λογαριασμό στο res

        return apotelesma;

    }

}
