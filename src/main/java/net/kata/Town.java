package net.kata;

import net.kata.Town.Name;

public class Town {

	enum Name {
		PARIS, LYON
	}
	
	Name name;
	
	public Town(Name name) {
		this.name = name;
	}

	public String getName() {
		return name.name();
	}

}
