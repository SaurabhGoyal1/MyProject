//Addition of two polynominal by using linked list

//start class
public class AdditionPolynominal
{
	//start Node 
class Node
	{
		int cofi;//coficent of polynominal
		int dege;//degere of polynominal
		Node next;//link to next degere

	}
	//end node
	Node start=null;//starting point of polynominal equetion.

	//crete polinominal equestion
	Node create(Node poly,int coficent,int degere)
	{
		Node n=new Node();//create new degere of polynominal
		n.cofi=coficent;
		n.dege=degere;
		n.next=null;
		if(poly==null)//base condition
			poly=n;
		else
		{
			Node polytemp=poly;//temporary variable
			while(polytemp.next!=null)
			{
				polytemp=polytemp.next;//reach distenation
			}
			polytemp.next=n;
		}
		return poly;//return starting pont
	}

	//end of the create function

	//Preforme addition of two polynominal equestion

	Node additionPoly(Node poly1,Node poly2)
	{
		if(poly1==null&&poly2==null)//base condition if both are null 
			return poly1;
		else if(poly1==null&&poly2!=null)//if equestion first is null then return equestion second
			return poly2;
		else if(poly1!=null&&poly2==null)//if equestion second is null then return equestion first
			return poly1;
		else 
		{//both are not null then do this
			Node poly1temp=poly1,poly2temp=poly2,temp2=poly1;//create temporary variables

			while(poly1temp!=null&&poly2temp!=null)//condition for performing addition
			{
				
				if(poly1temp.dege==poly2temp.dege)//if equetion first and equestion second of degere are same then do this 
				{
					poly1temp.cofi=poly1temp.cofi+poly2temp.cofi;//addition 
					temp2=poly1temp;//store the node of equestion first b'z future perpose 
					poly1temp=poly1temp.next;//move the next node
					poly2temp=poly2temp.next;//move the next node


				}
				else if(poly1temp.dege>poly2temp.dege)//if equetion first is greater then equestion second then do this
				{
					temp2=poly1temp;//this is again store the node for future perpose
					poly1temp=poly1temp.next;//move the next node

				}       
				else if(poly1.dege<poly2.dege)//if equetion second is greater then equestion first then do this
				{//only one time condition
					Node temp=poly2;//create temporary variable
					poly2temp=poly2.next;//move the next node
					temp.next=poly1;//link the second equestion from first equestion 
					poly1=temp;//update the start of equestion first 
					temp2=poly1;//again store the node for future perpuse
					poly1temp=poly1.next;//move the next node
					
				}
				else{//this is also for link two nodes b'z equestion second is greater then equestion first
					Node temp=poly2temp;//create temporary variable
					   
					poly2temp=poly2temp.next;//move the next
                    	
					temp.next=poly1temp;//link to the node second node to first node
					  
					temp2.next=temp;//this is alse link to node first node to second node
					temp2=temp;//update the value for next time
				}
				
			}
			return poly1;//retuen the equestion first b'z I change all in the first equestion we have no need to create third equestion.
		}
	}

//end of the addition function
	//display all equestion 

void display(Node poly)
{
	if(poly==null)//if list is null then list is empty
		System.out.print("Empty");
	else
	{//if list is not null then print all the value
		while(poly!=null)
		{
			System.out.print(poly.cofi+" ");//print all the coficient of polynominal equestion
			poly=poly.next;//move the next step
		}
	}
}
//end of the display function

//this is the main function 
public static void main(String[] args)
{
	AdditionPolynominal poly1=new AdditionPolynominal();//Performing first polynominal equestion
	AdditionPolynominal poly2=new AdditionPolynominal();//Performing first polynominal equestion
	
	//call the function for first polynominal equestion

	poly1.start=poly1.create(poly1.start,5,5);//this means 5X^5
	poly1.start=poly1.create(poly1.start,4,0);//5X^5+4X^0

	//end 

	//print first polynominal equestion 

	poly1.display(poly1.start);//5 4
	System.out.println();
	//end

	
	//call the function for first polynominal equestion

	poly2.start=poly2.create(poly2.start,4,6);//4X^6    
	poly2.start=poly2.create(poly2.start,2,0);//4X^6+2X^0

	//end

	//print second polynominal equestion

	poly2.display(poly2.start);//4 2
	System.out.println();

	//end

	// call the function for perform addition operation on two polynominal equestion

	poly1.start=poly1.additionPoly(poly1.start,poly2.start);//4X^6+5X^5+6X^0

	//end

	//print the value after addition

	poly1.display(poly1.start);//4 5 6
	System.out.println();

	//end


}
//end main function

	


}
//end class