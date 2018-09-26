import java.lang.reflect.*;

public class Main {					
	public static void main( String args[] ) {
		try {
			Class c = Class.forName( "Demo" );
			Class types = Integer.TYPE;
			Constructor ct = c.getConstructor( types );
			Object params = new Integer(12);
			Object obj = ct.newInstance( params );
		}
		catch( InstantiationException e ) {
			e.printStackTrace();
		}
		catch( ClassNotFoundException e ) {
			e.printStackTrace();
		}
		catch( NoSuchMethodException e ) {
			e.printStackTrace();
		}
		catch( IllegalAccessException e ) {
			e.printStackTrace();
		}
		catch( InvocationTargetException e ) {
			e.printStackTrace();
		}
	}
}