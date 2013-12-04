
public class CompositeNodos {
	public static StringBuffer g_indent = new StringBuffer();

    public static void main(String[] args)
    {
        NodoPadre one = new NodoPadre("1"), two = new NodoPadre("2");
        NodoHijo a = new NodoHijo("3"),  b = new NodoHijo("4");
        
        one.add(two);
        one.add(b);
        two.add(a);
        one.execute();
    }

}
