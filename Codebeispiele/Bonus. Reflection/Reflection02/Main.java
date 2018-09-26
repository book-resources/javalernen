import java.lang.reflect.*;

public class Main {					
	public static void main( String args[] ) {
		try {
			Class c = Class.forName( "Demo" );
			Method m[] = c.getDeclaredMethods();
			for( int i = 0; i < m.length; i++ ) {
				System.out.println( "Klasse: " + m[i].getDeclaringClass() );
				System.out.println( "Methode: " + m[i].getName() );
				System.out.println( "Typen der Parameter: " );
				Class[] params = m[i].getParameterTypes();
				for ( int j = 0; j < params.length; j++ ) {
					System.out.println( params[j] );
				}
				System.out.println( "Rueckgabetyp: " + m[i].getReturnType() );
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