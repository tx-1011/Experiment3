package text3; 
public class Course { 
	int number; 
	String site; 
	String time; 
	Teacher t; 
	Course(int number,String site,String time,Teacher t) { 
		setNumber(number); 
		setSite(site); 
		setTime(time); 
		this.t = t; 
	} 
	void setNumber(int number) { 
		this.number = number; 
	} 
	void setSite(String site) { 
		this.site = site; 
	} 
	void setTime(String time) { 
		this.time = time; 
	} 
	public String toString() { 
		return "�γ̱��:"+ number +" �γ�����:"+t.TeachLesson+" �Ͽεص�:"+site+" ʱ��:"+time; 
	} 
} 