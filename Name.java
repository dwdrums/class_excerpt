package arrayListTest;

import java.util.ArrayList;

public class Name {
	private String mVorname;
	private String mNachname;
	
	public Name(String Vorname, String Nachname) {
		this.mVorname = Vorname;
		this.mNachname = Nachname;
	}
	
	public String getVorname() {
		return mVorname;
	}
	
	public String getNachname() {
		return mNachname;
	}
	
	public ArrayList<Name> getOnlyOnce(ArrayList<Name> names) {
		ArrayList<Name> newNames = new ArrayList<Name>();
		newNames.add(names.get(0));
		for(int x = 0; x < names.size(); x++) {
			boolean isFound = false;
			for(int i = 0; i < newNames.size(); i++) {
				if(newNames.get(i).getVorname() == names.get(x).getVorname()) {
					isFound = true;
					break;
				} else {
					isFound = false;
				}
			}
			if(!isFound) {
				newNames.add(names.get(x));
			}
		}
		return newNames;
	}
	
}
