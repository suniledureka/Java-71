package co.edureka.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee", schema = "java71")
public class Employee {
	private Integer empno;
	private String ename;
	private float sal;

	public Employee(Integer empno, String ename, float sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
	@Id
	@Column(name="empno", nullable = false, unique = true, length = 5)	
	public Integer getEmpno() {
		return empno;
	}
	
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	
	@Column(name="ename", length=30)
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Column(name="salary", length = 10, precision = 2)
	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

}
