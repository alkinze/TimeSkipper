package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//ignore properties from JSON not bound in this type
@JsonIgnoreProperties(ignoreUnknown = true)
public class Villager {
	
	int id;
	String name;
	String personality;
	String birthday;
	String iconURL;
	
	public Villager() {}
	
	public Villager(int id, String name, String personality, String birthday, String iconURL) {
		super();
		this.id = id;
		this.name = name;
		this.personality = personality;
		this.birthday = birthday;
		this.iconURL = iconURL;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getIconURL() {
		return iconURL;
	}

	public void setIconURL(String iconURL) {
		this.iconURL = iconURL;
	}
	
	
}
