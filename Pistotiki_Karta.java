public class Pistotiki_Karta
{
    private String pin;
    private String hmeromhnia_ekdosis;
    private String hmeromhnia_lixis;
    Pelatis Pelatis;
    private Typos_Kartas typos_Kartas;


    public Pistotiki_Karta(String pin, String he, String hl, Pelatis Pelatis, Typos_Kartas tk)
    {
        this.pin = pin;
        this.hmeromhnia_ekdosis = he;
        this.hmeromhnia_lixis =hl;
        this.Pelatis = Pelatis;
        this.typos_Kartas = tk;
    }

    public String getPin()
    {
        return pin;
    }

    public void setPin(String pin)
    {
        this.pin = pin;
    }

    public String gethmeromhnia_ekdosis()
    {
        return hmeromhnia_ekdosis;
    }

    public void sethmeromhnia_ekdosis(String hmeromhnia_ekdosis)
    {
        this.hmeromhnia_ekdosis = hmeromhnia_ekdosis;
    }

    public String gethmeromhnia_lixis()
    {
        return hmeromhnia_lixis;
    }

    public void sethmeromhnia_lixis(String hl)
    {
        this.hmeromhnia_lixis = hl;
    }

    public Pelatis getPelatis()
    {
        return Pelatis;
    }

    public void setPelatis(Pelatis Pelatis)
    {
        this.Pelatis = Pelatis;
    }

    public Typos_Kartas getTypos_Kartas()
    {
        return typos_Kartas;
    }

    public void setTypos_Kartas(Typos_Kartas typos_Kartas)
    {
        this.typos_Kartas = typos_Kartas;
    }

    public void printInfo()
    {
        System.out.println("Στοιχεία Πελάτη:\n"+Pelatis.toString());

        System.out.println("Στοιχεία Πιστωτικής Κάρτας\n");

        System.out.println("Pin:"+pin+" Ημερομηνία Έκδοσης: "+hmeromhnia_ekdosis+"Ημερομηνία Λήξης: "+hmeromhnia_lixis+" Τύπος Κάρτας:"+typos_Kartas);
    }
}
