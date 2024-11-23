package collectionTasks;

interface printable{
	void display();
}
interface showable{
	void display();
}
class Document implements printable,showable {

		public void display(){
			System.out.println("Come on");
		}

		public static void main(String[] args) {
			Document d1=new Document();
			d1.display();
		}
	
}