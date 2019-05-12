package LinkedLisst;

import java.util.HashMap;

class Nodes{
	char data;
	Nodes next;
	Nodes prev;
	
	public Nodes(char data)
	{
		this.data=data;
		this.next=null;
		this.prev=prev;
	}
	
}
public class DetectingLoop {

	public static void main(String[] args) {

		HashMap<Nodes,Nodes>map=new HashMap<Nodes,Nodes>();
		System.out.println("Node 1:");	
		
		//Instantiate
		Nodes a=new Nodes('a');
		Nodes b=new Nodes('b');
		Nodes c=new Nodes('c');
		Nodes d=new Nodes('d');
		Nodes e=new Nodes('e');
		Nodes head=new Nodes('h');
		
		//next
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=null;
		head.next=a;
		e.next=c;
		
		//prev
		e.prev=d;
		d.prev=c;
		c.prev=b;
		b.prev=a;
		a.prev=head;
		
		//System.out.println(Integer.toHexString(b.next.hashCode())==Integer.toHexString(c.hashCode()));
		
		Nodes temp=head.next;
		
		while(temp!=null)
		{
			if(!map.containsKey(temp))
			{
				map.put(temp, temp.prev);
			}
			
			else {
				System.out.println(temp.data);
				System.out.println("Loop found");
				return;
			}
			
			temp=temp.next;
		}
		System.out.println("Loop not found");		
		
	}

}
