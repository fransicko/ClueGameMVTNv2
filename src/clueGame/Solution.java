package clueGame;

// Each person will make an accusation and that will be a solution
public class Solution {
	public String person;
	public String room;
	public String weapon;
	
	public Solution(String person, String room, String weapon) {
		super();
		this.person = person;
		this.room = room;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return person + " in the " + room + " with a " + weapon;
	}
	
	public String getPerson() {
		return this.person;
	}

	public String getRoom() {
		return room;
	}

	public String getWeapon() {
		return weapon;
	}
	
	
	

}
