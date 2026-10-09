import console.*;

/*
 * Anwendung fuer Sprechstundenhilfe einer Arztpraxis zur Verwaltung der wartenden Patienten.
 * (Autor, Datum)
 */
public class WartezimmerUI
{
    private Wartezimmer wz;

    public WartezimmerUI()
    {
        wz = new Wartezimmer();
    }

    /*
     * Ein neuer Patient steht am Empfang.
     * Seine Daten werden ueber die Konsole eingegeben,
     * dann wird der Patient in die Warteschlange eingefuegt.
     */
    public void aufnehmen()
    {
        Patient patient;
        Console.println("name und kasse eingeben");
        patient = new Patient(Console.readString(), Console.readString());
        wz.einfuegen(patient);
    }

    /*
     * Der naechste Patient kann vom Arzt behandelt werden.1
    
     * Gibt den Namen des Patient am Anfang der Warteschlange aus entfernt ihn.
     */
    public void aufrufen()
    {
        Patient patient;
        Console.println("Patient aufrufen");
        if (patient == null)
        {
            Console.println("Keine Person in Wartschlange");
        }else
        {
            Console.println("Der naechste Patient ist" + wz.naechsterPatient());
        }
        
    }

    /*
     * Gibt die Zahl der wartenden Patienten aus.
     */
    public void status()
    {
        // Diese Methode implementieren.
    }

    /*
     * Ermoeglicht, einen Patienten vor der Behandlung aus der Warteschlange zu entfernen
     */
    public void entfernen()
    {
        // Diese Methode implementieren.
    }

    /*
     * Leert die Warteschlange
     */
    public void beenden()
    {
        wz.alleLoeschen();
        Console.println("geht alle weg");
    }

    /*
     * Hauptprogramm:
     * Zeigt in einer Endlosschleife ein Menue mit den Moeglichkeiten des Programms an.
     * Der Benutzer (Sprechstundenhilfe) kann jeweils eine Moeglichkeit auswaehlen.
     */
    public void main()
    {
        int wahl = 0; 
        while (wahl != 3)
        {
            Console.println("Menue");
            Console.println("1: Neuen Patient");
            Console.println("2: Patient aufrufen");
            Console.println("3: Beenden");
            
            wahl = Console.readInt();
            if (wahl == 1) {aufnehmen(); }
            else if (wahl == 2) {aufrufen(); }  
            else if (wahl == 3) {beenden(); }
        }
    }
}