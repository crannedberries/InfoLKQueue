public class Patient
{
    private String name, kasse;
    
    public Patient(String pName, String pKasse)
    {
        name = pName;
        kasse = pKasse;
    }

    Patient() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getKasse()
    {
        return kasse;
    }
}
