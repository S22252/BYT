import java.util.ArrayList;
import java.util.List;

public class User {

	private List<MyObject> userList = null;
	private static int counter = 0;
	private int id;

	public User() {

		this.userList = new ArrayList<>();
		this.id = ++counter;
	}

	public void takeObjectFromPool(ObjectPool op) {
		
		userList.add(op.pullObject());
		if(userList.get(userList.size() -1) == null) {
			userList.remove(userList.size() -1);
			System.out.println("User " + this.id + " trying to get an object, but object limit is reached (10).");
		}

	}

	public void returnObjectToPool(ObjectPool op) {
		if (!userList.isEmpty()) {
			op.addObject(userList.get(userList.size() - 1));
			userList.remove(userList.size() - 1);
		} else {
			System.out.println("User " + this.id + " is out of objects. (you are trying to get them from him)");
		}
	}

	public int getListSize() {
		return userList.size();
	}

	public int getId() {
		return id;
	}
	
	

}