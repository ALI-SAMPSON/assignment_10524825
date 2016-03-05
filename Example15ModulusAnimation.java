
public class Example15ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%10 == 0 )
				System.out.print(" |_*_*_*_*_*_|  ");
                        else if(i % 10 == 1)
                                System.out.print(" |_*_*_*_*_*_|  ");
                        else if(i % 10 == 2)
                                System.out.print(" |_*_*_*_*_*_|  ");                       
                        else if(i % 10 == 3)
                                System.out.print(" |_*_*_*_*_*_|  ");
                        else if(i % 10 == 4)
                                System.out.print(" |_*_*_*_*_*_|  ");
                        else if(i % 10 == 5)
                                System.out.print(" |_*_*_*_*_*_|  ");
                        else if(i % 10 == 6)
                                System.out.print(" |_*_*_*_*_*_|  ");
                         else if(i % 10 == 7)
                                System.out.print(" |_*_*_*_*_*_|  ");
                        else
                            System.out.println("             ");


			Thread.sleep(200);
		}
		
	}

    
}
