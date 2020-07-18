package co.edureka.domains;

import java.util.Set;

public class Faculty {
	private Integer facid;
	private String name;
	private Set<Batch> batches;
	
	public Faculty(Integer facid, String name) {		
		this.facid = facid;
		this.name = name;
	}

	public Integer getFacid() {
		return facid;
	}

	public void setFacid(Integer facid) {
		this.facid = facid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Batch> getBatches() {
		return batches;
	}

	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}
	
}
