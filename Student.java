package text3; 
public class Student extends People{
	String LearnLesson;
	Student(int code,String name,char sex,String lesson){
		super(code,name,sex);
		setLearnLesson(lesson);
	}
	String getLearnLesson(){
		return LearnLesson;
	}
	void setLearnLesson(String LearnLesson){
		this.LearnLesson = LearnLesson;
	}
	public String toString(){
		return"ѧ�����:"+getCode()+"ѧ������:"+getName()+"�Ա�:"+getSex()+"���ڿγ�:"+LearnLesson;
	}
}
