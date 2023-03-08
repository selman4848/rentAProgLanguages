package kodlama.io.Devs.rentAProgLang.entities;

public class ProgLanguages {
private String name;
private int id;
public ProgLanguages() {
	
}
public ProgLanguages(int id,String name ) {
	this.name = name;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}



}
