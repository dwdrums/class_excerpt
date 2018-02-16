package arrayListTest;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name("Daniel", "Schallmeiner"));
		names.add(new Name("Fritz", "Schallmeiner"));
		names.add(new Name("Daniel", "Schallmeiner"));
		names.add(new Name("Horst", "Schallmeiner"));
		names.add(new Name("Sepp", "Schallmeiner"));
		names.add(new Name("Sepp", "Schallmeiner"));
		names.add(new Name("Daniel", "Schallmeiner"));
		names.add(new Name("Fritz", "Schallmeiner"));
		names.add(new Name("Fritz", "Schallmeiner"));
		names.add(new Name("Fritz", "Schallmeiner"));
		names.add(new Name("Niko", "Schallmeiner"));
		names.add(new Name("Fritz", "Schallmeiner"));
		names.add(new Name("Niko", "Schallmeiner"));
		names.add(new Name("Fritz", "Schallmeiner"));
		names.add(new Name("Daniel", "Schallmeiner"));
		names.add(new Name("Niko", "Schallmeiner"));
		names.add(new Name("Nick", "Schallmeiner"));
		Name test = new Name("","");
		ArrayList<Name> newNames = test.getOnlyOnce(names);
		for(int x = 0; x <newNames.size(); x++) {
			System.out.println(x + " " +newNames.get(x).getVorname());
		}
		
	}

}
