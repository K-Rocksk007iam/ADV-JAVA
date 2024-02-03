package manytomanypack;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	@Column(name="project_id")
	private int pid;
	private String projectName;
	@ManyToMany(mappedBy = "projects")
	private List<Emp> emps;
	
	
	public Project() {
		// TODO Auto-generated constructor stub
	}


	public Project(int pid, String projectName, List<Emp> emps) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.emps = emps;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public List<Emp> getEmps() {
		return emps;
	}


	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}


	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", emps=" + emps + "]";
	}
	
}
