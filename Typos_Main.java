import javax.swing.*;
import java.util.Vector;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Typos_Main
{
    public static void main(String [] args)
    {
        Logariasmos logariasmos;
        double ypoloipo,poso_synall;

        int id,epilogix,custlogariasmoi_pelati,thesi,thesinea;
        String eponymo, onoma, tilefono, dieythynsi, poli,apantisi_xristi=null,Kodikos_Logariasmou,Kodikos_Logariasmou2,typos_logar,perigr_synallag;
        Vector <Pelatis> lista_pelaton=new  Vector <Pelatis> ();

        boolean synexisi_ektelesis=false;


        do
        {
            id = Integer.parseInt(JOptionPane.showInputDialog("Εισάγετε Κωδικό Πελάτη"));
            eponymo = JOptionPane.showInputDialog("Εισάγετε Επώνυμο Πελάτη");
            onoma = JOptionPane.showInputDialog("Εισάγετε Όνομα Πελάτη");
            tilefono = JOptionPane.showInputDialog("Εισάγετε Τηλέφωνο Πελάτη");

            dieythynsi = JOptionPane.showInputDialog("Εισάγετε Διεύθυνση Πελάτη");
            poli = JOptionPane.showInputDialog("Εισάγετε Πόλη Πελάτη");

            Pelatis cust = new Pelatis(id, eponymo, onoma, tilefono, dieythynsi, poli);

            custlogariasmoi_pelati=Integer.parseInt(JOptionPane.showInputDialog("Πόοσυς Λογαριασμούς διαθέτει ο Πελάτης"));

            for (int i=0;i<custlogariasmoi_pelati;i++)
            {
                Kodikos_Logariasmou = JOptionPane.showInputDialog("Εισάγετε Κωδικό Λο-γαριασμού");
                ypoloipo=Double.parseDouble(JOptionPane.showInputDialog("Εισάγετε Υπό-λοιπο Λογαριασμού"));
                typos_logar = JOptionPane.showInputDialog("Εισάγετε Τύπο Λογαριασμού είτε Τρεχούμενος είτε Επενδυτικός)");

                if ((typos_logar.compareTo("Τρεχούμενος")==0) || (typos_logar.compareTo("τρεχούμενος")==0))
                    logariasmos=new Logariasmos(Kodikos_Logariasmou,cust,ypoloipo,typos_logariasmou.trexoumenos);
                else
                    logariasmos=new Logariasmos(Kodikos_Logariasmou,cust,ypoloipo,typos_logariasmou.ependytiko);

                cust.getlogariasmoi_pelati().add(logariasmos);

                lista_pelaton.add(cust);

                apantisi_xristi=JOptionPane.showInputDialog("Διαθέτει Πιστωτική Κάρτα; yes/Yes");

                Pistotiki_Karta Pistotiki_Karta=null;

                if ((apantisi_xristi.compareTo("yes")==0 || apantisi_xristi.compareTo("Yes")==0))
                {
                    String pin= JOptionPane.showInputDialog("Εισάγετε PIN Κάρτας");
                    String hmeromhnia_ekdosis=JOptionPane.showInputDialog("Εισάγετε Ημρο-μηνία Έκδοσης Κάρτας");
                    String hmeromhnia_lixis=JOptionPane.showInputDialog("Εισάγετε Ημρομη-νία Λήξης Κάρτας");
                    String typos_Kartas=JOptionPane.showInputDialog("Εισάγετε Τύπο Κάρτας (MasterCard, Visa, PayPal)");

                    if (typos_Kartas.compareTo("MasterCard")==0)
                        Pistotiki_Karta=new Pistotiki_Karta(pin,hmeromhnia_ekdosis, hmeromhnia_lixis, cust, Typos_Kartas.MasterCard);
                    else
                         if (typos_Kartas.compareTo("Visa")==0)
                             Pistotiki_Karta=new Pistotiki_Karta(pin,hmeromhnia_ekdosis, hmeromhnia_lixis, cust, Typos_Kartas.Visa);
                }
            }

            apantisi_xristi=JOptionPane.showInputDialog("Εισαγωγή Νέου Πελάτη; yes/Yes");

            if ((apantisi_xristi.compareTo("yes")==0 || apantisi_xristi.compareTo("Yes")==0))
                synexisi_ektelesis=true;
            else
                synexisi_ektelesis=false;
        }
        while (synexisi_ektelesis==true);


        do
        {
            synexisi_ektelesis=false;

            apantisi_xristi="Λειτουργίες Πελατών\n";
            apantisi_xristi+="1.Στοιχεία Πελατών\n";
            apantisi_xristi+="2.Κατάθεση/Ανάληψη\n";
            apantisi_xristi+="3.Τερματισμός\n";
            apantisi_xristi+="Δώσε Επιλογή ";

            epilogix=Integer.parseInt(JOptionPane.showInputDialog(apantisi_xristi));

            switch (epilogix)
            {
                case 1:     int pelid=Integer.parseInt(JOptionPane.showInputDialog("Εισαγετε Κωδικό Πελάτη"));
                            boolean entopismos=false;

                            for (int i=0; i<lista_pelaton.size(); i++)
                            {
                                if (pelid==lista_pelaton.get(i).getId())
                                {
                                    lista_pelaton.get(i).printPelatisInfo();
                                    entopismos=true;
                                    break;
                                }
                            }

                            if (entopismos==false)
                                JOptionPane.showMessageDialog(null, "O Πελάτης δεν υπάρχει!");

                            break;

                case 2:     synexisi_ektelesis=true;

                            do
                            {
                                apantisi_xristi="Μενού Συναλλαγών\n";
                                apantisi_xristi+="1.Κατάθεση\n";
                                apantisi_xristi+="2.Ανάληψη\n";
                                apantisi_xristi+="3.Λίστα Συναλλαγών Πελάτη\n";
                                apantisi_xristi+="4.Έξοδος\n";
                                apantisi_xristi+="\nΕπιλογή ";

                                epilogix=Integer.parseInt(JOptionPane.showInputDialog(apantisi_xristi));

                                switch(epilogix)
                                {
                                    case 1:
                                                id = Integer.parseInt(JOptionPane.showInputDialog("Δώσε Κωδικό Πελάτη"));

                                                thesi = -1;

                                                for (int i = 0; i < lista_pelaton.size(); i++)
                                                    if (lista_pelaton.get(i).getId() == id)
                                                    {
                                                        thesi = i;
                                                        break;
                                                    }


                                                if (thesi != -1)
                                                {
                                                    Kodikos_Logariasmou = JOptionPane.showInputDialog("Εισάγετε Κωδικό Λογαριασμού για να εκτελεστεί η Κατάθεση");

                                                    thesinea = -1;

                                                    for (int i = 0; i < lista_pelaton.get(thesi).getlogariasmoi_pelati().size(); i++)
                                                        if (lista_pelaton.get(thesi).getlogariasmoi_pelati().get(i).getKodikos_Logariasmou().compareTo(Kodikos_Logariasmou) == 0)
                                                        {
                                                            thesinea = i;
                                                            break;
                                                        }

                                                    if (thesinea != -1)
                                                    {
                                                        poso_synall = Double.parseDouble(JOptionPane.showInputDialog("Δώσε Ποσό Κατάθεσης"));
                                                        perigr_synallag = JOptionPane.showInputDialog("Δώστε Περιγραφή Κατάθεσης");
                                                        Synallagi_Pelati Synallagi_Pelati;

                                                        perigr_synallag = JOptionPane.showInputDialog("H Κατάθεση θα γίνει με πιστωτική κάρτα yes/Yes");

                                                        Synallagi_Pelati =null;
                                                        String pink;
                                                        int pros=1;
                                                        boolean term=false;


                                                        if (perigr_synallag.compareTo("yes")==0 || perigr_synallag.compareTo("Yes")==0)
                                                        {
                                                            do
                                                            {
                                                                pink= JOptionPane.showInputDialog("Εισάγετε το Pin");
                                                                term=false;

                                                                for (int i = 0; i < lista_pelaton.get(thesi).getPistotikes_pelati().size(); i++)
                                                                    if (pink.compareTo(lista_pelaton.get(thesi).getPistotikes_pelati().get(i).getPin())!=0)
                                                                    {
                                                                        pink = JOptionPane.showInputDialog("Λάθος Pin στην " + i + " προσπάθεια από 3 συνολικά προσπάθειες. Ξαναδώστε το Pin");
                                                                        pros++;
                                                                    }
                                                                    else
                                                                    {
                                                                        JOptionPane.showMessageDialog(null,"Σωστό Pin. Μπορείτε να προχωρήσετε στη συ-ναλλαγή");
                                                                        term = true;
                                                                    }
                                                            }
                                                            while (term==false && pros<=3);

                                                           if (term==true)
                                                                Synallagi_Pelati = new Synallagi_Pelati(lista_pelaton.get(thesi).getlogariasmoi_pelati().get(thesinea), poso_synall, java.time.LocalDate.now(), LocalDateTime.now().toLocalTime(), perigr_synallag, Synallagi_Pelatitypos_logar.Katathesi, 0.05 * poso_synall);
                                                        }
                                                        else
                                                            Synallagi_Pelati = new Synallagi_Pelati(lista_pelaton.get(thesi).getlogariasmoi_pelati().get(thesinea), poso_synall, java.time.LocalDate.now(),  LocalDateTime.now().toLocalTime(),perigr_synallag,Synallagi_Pelatitypos_logar.Katathesi,0);



                                                        lista_pelaton.get(thesi).getlogariasmoi_pelati().get(thesinea).getSynallagi_Pelatis().add(Synallagi_Pelati);

                                                        lista_pelaton.get(thesi).getlogariasmoi_pelati().get(thesinea).Katathesi(poso_synall);
                                                    }
                                                    else
                                                        JOptionPane.showMessageDialog(null, "O Λογαρια-σμός δεν εντοπίστηκε");
                                                }
                                                else
                                                    JOptionPane.showMessageDialog(null, "O Πελάτης δεν εντοπίστηκε!");

                                                break;


                                    case 2:    id = Integer.parseInt(JOptionPane.showInputDialog("Δώσε ID Πελάτη"));

                                                thesi = -1;

                                                for (int i = 0; i < lista_pelaton.size(); i++)
                                                    if (lista_pelaton.get(i).getId() == id)
                                                    {
                                                        thesi = i;
                                                        break;
                                                    }


                                                    if (thesi != -1)
                                                    {
                                                        Kodikos_Logariasmou = JOptionPane.showInputDialog("Εισάγετε Κωδικό Λογαριασμού για να εκτελεστεί η Ανά-ληψη");

                                                        thesinea = -1;

                                                        for (int i = 0; i < lista_pelaton.get(thesi).getlogariasmoi_pelati().size(); i++)
                                                            if (lista_pelaton.get(thesi).getlogariasmoi_pelati().get(i).getKodikos_Logariasmou().compareTo(Kodikos_Logariasmou) == 0)
                                                            {
                                                                thesinea = i;
                                                                break;
                                                            }

                                                    Synallagi_Pelati Synallagi_Pelati;

                                                    if (thesinea != -1)
                                                    {
                                                        poso_synall = Double.parseDouble(JOptionPane.showInputDialog("Δώσε Ποσό Ανάληψης"));
                                                        perigr_synallag = JOptionPane.showInputDialog("Περιγραφή Συναλλαγής Ανάληψης");

                                                        Synallagi_Pelati =null;
                                                        String pink;
                                                        int pros=1;
                                                        boolean term=false;


                                                        perigr_synallag = JOptionPane.showInputDialog("H Ανάληψη θα γίνει με πιστωτική κάρτα yes/Yes");

                                                        Synallagi_Pelati =null;

                                                        pros=1;
                                                        term=false;


                                                        if (perigr_synallag.compareTo("yes")==0 || perigr_synallag.compareTo("Yes")==0)
                                                        {
                                                            do
                                                            {
                                                                pink= JOptionPane.showInputDialog("Εισάγετε το Pin");
                                                                term=false;

                                                                for (int i = 0; i < lista_pelaton.get(thesi).getPistotikes_pelati().size(); i++)
                                                                    if (pink.compareTo(lista_pelaton.get(thesi).getPistotikes_pelati().get(i).getPin())!=0)
                                                                    {
                                                                        pink = JOptionPane.showInputDialog("Λάθος Pin στην " + i + " προσπάθεια από 3 συνολικά προσπάθειες. Ξαναδώστε το Pin");
                                                                        pros++;
                                                                    }
                                                                    else
                                                                    {
                                                                        JOptionPane.showMessageDialog(null,"Σωστό Pin. Μπορείτε να προχωρήσετε στη συ-ναλλαγή");
                                                                        term = true;
                                                                    }
                                                            }
                                                            while (term==false && pros<=3);

                                                            if (term==true)
                                                                Synallagi_Pelati = new Synallagi_Pelati(lista_pelaton.get(thesi).getlogariasmoi_pelati().get(thesinea), poso_synall, java.time.LocalDate.now(), LocalDateTime.now().toLocalTime(), perigr_synallag, Synallagi_Pelatitypos_logar.Analipsi, 0.03 * poso_synall);
                                                        }
                                                        else
                                                            Synallagi_Pelati = new Synallagi_Pelati(lista_pelaton.get(thesi).getlogariasmoi_pelati().get(thesinea), poso_synall, java.time.LocalDate.now(),  LocalDateTime.now().toLocalTime(),perigr_synallag,Synallagi_Pelatitypos_logar.Analipsi,0);


                                                        lista_pelaton.get(thesi).getlogariasmoi_pelati().get(thesinea).getSynallagi_Pelatis().add(Synallagi_Pelati);

                                                        lista_pelaton.get(thesi).getlogariasmoi_pelati().get(thesinea).Katathesi(poso_synall);
                                                    }
                                                    else
                                                        JOptionPane.showMessageDialog(null, "O Λογαρια-σμός δεν εντοπίστηκε");
                                                    }
                                                    else
                                                        JOptionPane.showMessageDialog(null, "O Πελάτης δεν εντοπίστηκε!");

                                        break;



                                    case 3:      id = Integer.parseInt(JOptionPane.showInputDialog("Δώσε ID Πελάτη"));

                                                 thesi = -1;

                                                 for (int i = 0; i < lista_pelaton.size(); i++)
                                                        if (lista_pelaton.get(i).getId() == id)
                                                        {
                                                            thesi = i;
                                                            break;
                                                        }


                                                    if (thesi != -1)
                                                    {
                                                        Kodikos_Logariasmou = JOptionPane.showInputDialog("Εισάγετε Κωδικό Λογαριασμού για εμφάνιση συναλλα-γών πελάτη");

                                                        thesinea = -1;

                                                        for (int i = 0; i < lista_pelaton.get(thesi).getlogariasmoi_pelati().size(); i++)
                                                            if (lista_pelaton.get(thesi).getlogariasmoi_pelati().get(i).getKodikos_Logariasmou().compareTo(Kodikos_Logariasmou) == 0)
                                                            {
                                                                thesinea = i;
                                                                break;
                                                            }

                                                            if (thesinea != -1)
                                                               lista_pelaton.get(thesi).getlogariasmoi_pelati().get(thesinea).printLogariasmosInfo();
                                                            else
                                                                JOptionPane.showMessageDialog(null, "O Λο-γαριασμός δεν υπάρχει");
                                                    }
                                                    else
                                                           JOptionPane.showMessageDialog(null, "O Πελάτης δεν υπάρχει!");
                                                    break;

                                    case 4:         synexisi_ektelesis = false;
                                                    break;
                                }
                            }
                            while (synexisi_ektelesis==true);

                            break;

                case 3:     JOptionPane.showMessageDialog(null,"Τερματισμός Εφαρμογής");
                            System.exit(0);
            }
        }
        while (true);
    }
}

