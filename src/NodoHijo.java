


public class NodoHijo implements Command{
	
	public NodoHijo(String name)
    {
        m_name = name;
    }
    public void execute()
    {
        System.out.println(CompositeNodos.g_indent + m_name);
    }
    String m_name;

}
