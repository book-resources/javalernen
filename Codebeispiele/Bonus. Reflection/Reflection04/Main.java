import java.lang.reflect.*;

public class Main {					
	public static void main( String args[] ) {
		try {
			Class c = Class.forName( "Demo" );
			Class types[] = { Integer.TYPE, Integer.TYPE };
			Method m = c.getMethod( "add", types );
			Demo d = new Demo();
			Object params[] = { new Integer(14), new Integer(15) };
			Object o = m.invoke( d, params );
			System.out.println( ((Integer) o).intValue() );
		}
		catch( NoSuchMethodException e ) {
			e.printStackTrace();
		}
		catch( IllegalAccessException e ) {
			e.printStackTrace();
		}
		catch( ClassNotFoundException e ) {
			e.printStackTrace();
		}
		catch( InvocationTargetException e ) {
			e.printStackTrace();
		}
	}
}