package serialization;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(
		value= {
				"teamsize",
				"createdBy",
				"projectId",
				"projectName",
		}
		
		)
public class Project {
	int projectId;
	String createdBy;
	int teamsize;
	String projectName;
	
	


	public Project(int projectId, String createdBy, int teamsize, String projectName) {
		super();
		this.projectId = projectId;
		this.createdBy = createdBy;
		this.teamsize = teamsize;
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

	
	
	public Project() {}

}
