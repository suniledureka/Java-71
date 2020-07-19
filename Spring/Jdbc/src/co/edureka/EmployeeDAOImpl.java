package co.edureka;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO 
{
	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void saveEmp(Employee emp) {
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";
		int n = jt.update(sql);
		if(n>0)
			System.out.println("Employee Saved!");
	}

	@Override
	public void updateEmp(Employee emp) {
		String sql = "update emp set ename='"+emp.getEname()+"', sal="+emp.getSal()+" where empno="+emp.getEmpno();
		int n = jt.update(sql);
		if(n>0)
			System.out.println("Employee Updated!");
	}

	@Override
	public void deleteEmp(int eno) {
		String sql = "delete from emp where empno="+eno;
		int n = jt.update(sql);
		if(n>0)
			System.out.println("Employee Deleted!");
	}
}
