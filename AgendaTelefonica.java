import java.util.*;

public class AgendaTelefonica

{
    // la agenda se guarda en un mapa
    private Map<String, String> agenda;

    /**
     * Constructor que deja la agenda vacía
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<String, String>();
    }

    /**
     * Añade un nombre y un numero de telefono al mapa
     */
    public void enterNumber(String name, String number)
    {
        agenda.put(name, number);
    }
    
    public String lookupNumber(String name)
    {
        String telefono = agenda.get(name); 
        return telefono;
    }
    
    public void printAllNames()
    {
        System.out.println(agenda.keySet() + "" + agenda.values());
    }
}