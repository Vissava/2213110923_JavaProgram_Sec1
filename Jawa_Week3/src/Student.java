
public class Student {
	private String name;
	private int score;
	
	public void setName(String Name) {
		name = Name;
	}
	public String getName() {
		return name;
	}
	public void setScore(int Score) {
		score = Score;
	}
	public int getScore() {
		return score;
	}
	public boolean checkScore() {
		return score>=0&&score<=100;
	}
	public boolean isPass() {
		if(score>=50)
			return true;
		return false;
	}
	public String findGrade() {
		if (score <50)
			return "F";
		if (score <55)
			return "D";
		if (score <60)
			return "D+";
		if (score <65)
			return "C";
		if (score <70)
			return "C+";
		if (score <75)
			return "B";
		if (score <80)
			return "B+";
		else
			return "A";
					
	 
	}

}
