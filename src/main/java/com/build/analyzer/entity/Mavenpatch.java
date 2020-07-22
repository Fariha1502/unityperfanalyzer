package com.build.analyzer.entity;
// Generated Mar 10, 2017 3:55:54 PM by Hibernate Tools 4.3.1.Final

/**
 * Mavenpatch generated by hbm2java
 */
public class Mavenpatch implements java.io.Serializable {

	private long row;
	private String gitCommit;
	private String ghProjectName;
	private String gitBranch;
	private String gitCommits;
	private String trStatus;
	private String blLog;
	private String blCluster;
	private String gitFixBranch;
	private String gitFixCommit;
	private String gitFixCommits;
	private String trFixStatus;
	private String patchData;
	private String patchParent;

	public Mavenpatch() {
	}

	public Mavenpatch(long row) {
		this.row = row;
	}

	public Mavenpatch(long row, String gitCommit, String ghProjectName, String gitBranch, String gitCommits,
			String trStatus, String blLog, String blCluster, String gitFixBranch, String gitFixCommit,
			String gitFixCommits, String trFixStatus, String patchData, String patchParent) {
		this.row = row;
		this.gitCommit = gitCommit;
		this.ghProjectName = ghProjectName;
		this.gitBranch = gitBranch;
		this.gitCommits = gitCommits;
		this.trStatus = trStatus;
		this.blLog = blLog;
		this.blCluster = blCluster;
		this.gitFixBranch = gitFixBranch;
		this.gitFixCommit = gitFixCommit;
		this.gitFixCommits = gitFixCommits;
		this.trFixStatus = trFixStatus;
		this.patchData = patchData;
		this.patchParent = patchParent;
	}

	public long getRow() {
		return this.row;
	}

	public void setRow(long row) {
		this.row = row;
	}

	public String getGitCommit() {
		return this.gitCommit;
	}

	public void setGitCommit(String gitCommit) {
		this.gitCommit = gitCommit;
	}

	public String getGhProjectName() {
		return this.ghProjectName;
	}

	public void setGhProjectName(String ghProjectName) {
		this.ghProjectName = ghProjectName;
	}

	public String getGitBranch() {
		return this.gitBranch;
	}

	public void setGitBranch(String gitBranch) {
		this.gitBranch = gitBranch;
	}

	public String getGitCommits() {
		return this.gitCommits;
	}

	public void setGitCommits(String gitCommits) {
		this.gitCommits = gitCommits;
	}

	public String getTrStatus() {
		return this.trStatus;
	}

	public void setTrStatus(String trStatus) {
		this.trStatus = trStatus;
	}

	public String getBlLog() {
		return this.blLog;
	}

	public void setBlLog(String blLog) {
		this.blLog = blLog;
	}

	public String getBlCluster() {
		return this.blCluster;
	}

	public void setBlCluster(String blCluster) {
		this.blCluster = blCluster;
	}

	public String getGitFixBranch() {
		return this.gitFixBranch;
	}

	public void setGitFixBranch(String gitFixBranch) {
		this.gitFixBranch = gitFixBranch;
	}

	public String getGitFixCommit() {
		return this.gitFixCommit;
	}

	public void setGitFixCommit(String gitFixCommit) {
		this.gitFixCommit = gitFixCommit;
	}

	public String getGitFixCommits() {
		return this.gitFixCommits;
	}

	public void setGitFixCommits(String gitFixCommits) {
		this.gitFixCommits = gitFixCommits;
	}

	public String getTrFixStatus() {
		return this.trFixStatus;
	}

	public void setTrFixStatus(String trFixStatus) {
		this.trFixStatus = trFixStatus;
	}

	public String getPatchData() {
		return this.patchData;
	}

	public void setPatchData(String patchData) {
		this.patchData = patchData;
	}

	public String getPatchParent() {
		return this.patchParent;
	}

	public void setPatchParent(String patchParent) {
		this.patchParent = patchParent;
	}

}
