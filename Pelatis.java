import javax.swing.*;
import java.util.ArrayList;

public class Pelatis
{
    private int id;
    private String eponymo;
    private String onoma;
    private String tilefono;
    private String dieythynsi;
    private String poli;
    private double totalypoloipo; 

    private ArrayList<Logariasmos> logariasmoi_pelati=new ArrayList<Logariasmos> ();
    private ArrayList<Pistotiki_Karta> pistotikes_pelati=new ArrayList<Pistotiki_Karta> ();

    public Pelatis(int id, String eponymo, String onoma, String tilefono, String dieythynsi, String poli)
    {
        this.id = id;
        this.eponymo = eponymo;
        this.onoma = onoma;
        this.tilefono = tilefono;
        this.dieythynsi = dieythynsi;
        this.poli = poli;
        this.totalypoloipo = 0;
    }

    public void setlogariasmoi_pelati(ArrayList<Logariasmos> logariasmoi_pelati)
    {
        this.logariasmoi_pelati = logariasmoi_pelati;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void seteponymo(String eponymo)
    {
        this.eponymo = eponymo;
    }

    public void setonoma(String onoma)
    {
        this.onoma = onoma;
    }

    public void settilefono(String tilefono)
    {
        this.tilefono = tilefono;
    }

    public void setdieythynsi(String dieythynsi)
    {
        this.dieythynsi = dieythynsi;
    }

    public void setpoli(String poli)
    {
        this.poli = poli;
    }

    public String getonoma()
    {
        return onoma;
    }

    public String geteponymo()
    {
        return eponymo;
    }

    public String gettilefono()
    {
        return tilefono;
    }

    public String getpoli()
    {
        return poli;
    }

    public String getdieythynsi()
    {
        return dieythynsi;
    }

    public double gettotalypoloipo()
    {
        return totalypoloipo;
    }

    public int getId()
    {
        return id;
    }

    public ArrayList<Logariasmos> getlogariasmoi_pelati()
    {
        return logariasmoi_pelati;
    }

    public void printPelatisInfo()
    {
        float sum=0;

        String res="Στοιχεία Πελάτη:\n" + "ID:" + id + ", Επώνυμο:" + eponymo + ", Ό-νομα:" + onoma  + ", Τηλέφωνο:" + tilefono + ", Διεύθυνση:" + dieythynsi + ", Πόλη:" + poli +"\n";

        for (int i=0;i<logariasmoi_pelati.size();i++)
        {
            res+=logariasmoi_pelati.get(i).toString();
            sum+= logariasmoi_pelati.get(i).getypoloipo();
        }

        totalypoloipo=sum;

        res+="\n\nΥπόλοιπο Λογαριασμών Πελάτη:"+totalypoloipo;

        JOptionPane.showMessageDialog(null,res,"Στοιχεία Πελάτη",JOptionPane.INFORMATION_MESSAGE);
    }

    public ArrayList<Pistotiki_Karta> getPistotikes_pelati() 
    {
        return pistotikes_pelati;
    }

    public void setPistotikes_pelati(ArrayList<Pistotiki_Karta> pistotikes_pelati)
    {
        this.pistotikes_pelati = pistotikes_pelati;
    }
}
