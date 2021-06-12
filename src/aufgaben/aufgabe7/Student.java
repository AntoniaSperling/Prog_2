package aufgaben.aufgabe7;

public class Student implements Listener{

	private String name;
	private Publisher publisher;
	
	public Student(String name)
	{
		this.name = name;
	}

	
	@Override
	public void update() {
		
		String message = this.publisher.getUpdate(this);
		System.out.println(this.name + " received " + message);
		
	}

	@Override
	public void setPublisher(Publisher publisher) {
		
		this.publisher = publisher;
		if(this.publisher.register(this))
		{
			System.out.println(this.name + " registered!");
		}
		
	}

	@Override
	public void removePublisher(Publisher publisher) {
		
		this.publisher = publisher;
		if(this.publisher.unregister(this))
		{
			System.out.println(this.name + " deregistered!");
		}
		
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        
        Student s = (Student) obj;
        return this.name.equals(obj);
	}

}
