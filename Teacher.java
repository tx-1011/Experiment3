package text3; 
public class Teacher extends People { 
	String TeachLesson; 
	String name; 
	Teacher(int code, String name, char sex, String lesson) { 
		super(code, name, sex); 
		this.TeachLesson = lesson; 
		setName(name); 
	 } 
	public String toString() { 
		return "��ʦ���:" + getCode() + " ��ʦ����:" + getName() + " �Ա�:" + getSex() + " ���ڿγ�:" + TeachLesson; 
	} 
} 