import java.lang.reflect.*;

public class Main {					
	public static void main( String args[] ) {
		try {
			Class c = Class.forName( "Demo" );
			Field f[] = c.getDeclaredFields();
			for( int i = 0; i < f.length; i++ ) {
				System.out.println( "Klasse: " + f[i].getDeclaringClass() );
				System.out.println( "Attribut: " + f[i].getName() );
				System.out.println( "Datentyp: " + f[i].getType() );
				System.out.println( "Zugriffsmodifikator: " + Modifier.toString(f[i].getModifiers()) );
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