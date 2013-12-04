import static org.junit.Assert.*;

import org.junit.Test;


public class CompositeNodosTest {

	@Test
	public void test() {
		NodoHijo CN = new NodoHijo("");
		
		assertEquals(CN.execute(), CompositeNodos.g_indent + CN.m_name);
	}

}
