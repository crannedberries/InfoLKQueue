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
        // Diese Methode implementieren.
    }

    /*
     * Der naechste Patient kann vom Arzt behandelt werden.
     * Gibt den Namen des Patient am Anfang der Warteschlange aus entfernt ihn.
     */
    public void aufrufen()
    {
        // Diese Methode implementieren.
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
        // Diese Methode implementieren.
    }

    /*
     * Hauptprogramm:
     * Zeigt in einer Endlosschleife ein Menue mit den Moeglichkeiten des Programms an.
     * Der Benutzer (Sprechstundenhilfe) kann jeweils eine Moeglichkeit auswaehlen.
     */
    public void main()
    {
        int wahl; 
        while (true)
        {
            Console.println("Menue");
            Console.println("1: Neuen Patient");
            Console.println("2: Patient aufrufen");
            Console.println("3: Beenden");
            
            wahl = Console.readInt();
            if (wahl == 1) {aufnehmen(); }
            else if (wahl == 2) {aufrufen(); }
        }
    }
}