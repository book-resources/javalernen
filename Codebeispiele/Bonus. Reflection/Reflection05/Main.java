import java.lang.reflect.*;

public class Main {					
	public static void main( String args[] ) {
		try {
			Demo d = new Demo();
			Method m = d.getClass().getDeclaredMethod( "methode" );
			m.setAccessible( true );
			Object r = m.invoke( d );
		}
		catch( NoSuchMethodException e ) {
			e.printStackTrace();
		}
		catch( InvocationTargetException e ) {
			e.printStackTrace();
		}
		catch( IllegalAccessException e ) {
			e.printStackTrace();
		}
	}
}