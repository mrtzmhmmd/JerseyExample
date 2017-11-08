package model;

import java.util.Set;

public class Person {
	private int idPerson;
	private String name;
	private String family;
	private int age;
	private Set<Address> address;
	private Job job;

	public Person() {

	}

	public Person(int idPerson, String name, String family, int age, Set<Address> address, Job jobs) {
		setIdPerson(idPerson);
		setName(name);
		setFamily(family);
		setAge(age);
		setAddress(address);
		setJob(jobs);
	}

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public void update(Person person) {
		setName(person.name);
		setFamily(person.family);
		setAge(person.age);
		setAddress(person.address);
		setJob(person.job);
	}
}