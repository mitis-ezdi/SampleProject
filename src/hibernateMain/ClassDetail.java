package hibernateMain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "ClassMaster")
public class ClassDetail {

	
	private int classID;
	private String className;
	
	private Set<StudentDetails> studentDetails ;
	
	
	

	public ClassDetail(){
		}
	
	public ClassDetail(String name) {
		this.className = name;
	}
	
	@Id
	@Column(name = "class_id")
	@GeneratedValue
	public int getClassID() {
		return classID;
	}

   public void setClassID(int classID) {
		this.classID = classID;
	}

   @Column(name = "name")
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	@OneToMany(mappedBy = "classdetail", cascade = CascadeType.ALL)
	public Set<StudentDetails> getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(Set<StudentDetails> studentDetails) {
		this.studentDetails = studentDetails;
	}

}
