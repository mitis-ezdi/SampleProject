package hibernateMain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "StudentDetails")

public class StudentDetails {

	private int studentID;
	private String studentName;

	private ClassDetail classdetail ;
	
	public StudentDetails(){
		}
	
	public StudentDetails(String name, ClassDetail detail){
		
		this.studentName = name;
		this.classdetail = detail;
	}

	@Id
	@Column(name = "student_id")
	@GeneratedValue
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	@Column(name = "name")
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@ManyToOne
	@JoinColumn(name = "classid")
	public ClassDetail getClassdetail() {
		return classdetail;
	}

	public void setClassdetail(ClassDetail classdetail) {
		this.classdetail = classdetail;
	}
	
	
}
