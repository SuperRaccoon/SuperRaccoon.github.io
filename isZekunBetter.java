
public class isZekunBetter{
	
	public static void main(String[] args){


		isZekunBetter isZekunBetter1 = new isZekunBetter();


		System.out.println("Hello, this will conclusively prove that Zekun > Ashley");

		Person Zekun = isZekunBetter1.new Person();

		Zekun.setValue(1);

		Person Ashley = isZekunBetter1.new Person();

		Ashley.setValue(0);


		boolean myBool = Zekun.isBetterThan(Ashley);

		System.out.println("Running 'Zekun.isBetterThan(Ashley)'");
		System.out.println("And the result is: " + myBool);



	}



	private class Person{

		int value;


		private void Person(){
			return;
		}



		private void setValue(int myVal){

			this.value = myVal;

			return;
		}



		private boolean isBetterThan(Person otherPerson){

			return (this.value > otherPerson.value);
		}



	}
	
}