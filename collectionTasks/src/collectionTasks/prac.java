package collectionTasks;

interface Readable{
	void read();
}
interface Writeable{
	void write();
}
interface Storable{
	void store();
}
class File implements Readable, Writeable, Storable{

	@Override
	public void store() {
	System.out.println("Stored");
		
	}

	@Override
	public void write() {
		System.out.println("Written");
		
	}

	@Override
	public void read() {
		System.out.println("Read");
	}
	public static void main(String[] args) {
		File s1=new File();
		s1.store();
		s1.read();
		s1.write();
	}
}