import java.lang.reflect.*;

public class Main {					
	public static void main( String args[] ) {
		try {
			Class c = Class.forName( "Demo" );
			Field f = c.getField( "y" );
			Demo d = new Demo();
			f.setInt( d, 42 );
			System.out.println( "y=" + d.y );
			// privates Attribut
			f = d.getClass().getDeclaredField( "z" );
			f.setAccessible( true );
			f.setInt( d, 42 );
			System.out.println( "z=" + f.get( d ) );
		}
		catch( NoSuchFieldException e ) {
			e.printStackTrace();
		}
		catch( ClassNotFoundException e ) {
			e.printStackTrace();
		}
		catch( IllegalAccessException e ) {
			e.printStackTrace();
		}
	}
}