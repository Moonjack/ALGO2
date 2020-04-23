import java.io.*;



public class WordCount {

	public static void main(String[] args) throws IOException
	{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String line; 
		
        Elem head = null;
		while((line = r.readLine())!=null)
		{
			boolean check = false;
			if(head == null)
			{
				head = new Elem(line,null,1);
			}
			
			else {
					for(Elem i = head; i!=null; i = i.next)
					{
						if(i.word.equals(line))
						{
							i.count++;
							check = true;
						}
						
					}
					if(!check)
					{
						head = new Elem(line,head,1);
					}
					
				 }
		// test test
		}
			
			
			for(Elem p = head; p!=null; p = p.next)
			{
				
				System.out.println("Word: " + p.word + " Count: " + p.count);
			}
		}
		//nd test
		// bla bal
		// sdds
	}

