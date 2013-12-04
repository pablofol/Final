import java.util.ArrayList;


public class NodoPadre implements Command {
	
	
	public NodoPadre(String name)
    {
        m_name = name;
    }
    @SuppressWarnings("unchecked")
	public void add(Object comando)
    {
       m_files.add(comando);
    }
    public void execute()
    {
        System.out.println(CompositeNodos.g_indent + m_name);
        CompositeNodos.g_indent.append("   ");
        for (int i = 0; i < m_files.size(); ++i)
        {
            Command comando = (Command)m_files.get(i);
            comando.execute();
        }
        CompositeNodos.g_indent.setLength(CompositeNodos.g_indent.length() - 3);
    }
    private String m_name;
    
	@SuppressWarnings("rawtypes")
	private ArrayList m_files = new ArrayList();

	

}
