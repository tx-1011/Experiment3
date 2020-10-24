package text3; 
public class People{
	private int code;
	private String name;
	private char sex;
	People(int code, String name, char sex){
		setCode(code);
		setName(name);
		setSex(sex);
	}
	int getCode(){
		return code;
	}
	String getName(){
		return name;
	}
	char getSex(){
		return sex;
	}
	void setCode(int code){
		this.code = code;
	}
	void setName(String name){
		this.name = name;
	}
	void setSex(char sex){
		this.sex = sex;
	}
}