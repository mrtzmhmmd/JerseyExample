package model;

public class Job {

	private int idJob;
	private String name;
	private int salary;

	public Job() {

	}

	public Job(String name, int salary) {
		setName(name);
		setSalary(salary);
	}

	public Job(int idJob, String name, int salary) {
		setIdJob(idJob);
		setName(name);
		setSalary(salary);
	}

	public int getIdJob() {
		return idJob;
	}

	public void setIdJob(int idJob) {
		this.idJob = idJob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}