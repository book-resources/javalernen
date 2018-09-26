import java.lang.reflect.*;

public class Main {					
	public static void main( String args[] ) {
		try {
			Class c = Class.forName( "Demo" );
			Method m[] = c.getDeclaredMethods();
			for( int i = 0; i < m.length; i++ ) {
				System.out.println( m[i].toString() );
			}
		}
		catch( ClassNotFoundException e ) {
			e.printStackTrace();
		}
		catch( ArrayIndexOutOfBoundsException e ) {
			e.printStackTrace();
		}
	}
}