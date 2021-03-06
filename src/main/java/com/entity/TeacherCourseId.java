package com.entity;
// Generated 2017-10-11 16:06:00 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TeacherCourseId generated by hbm2java
 */
@Embeddable
public class TeacherCourseId implements java.io.Serializable {

	private String courseId;
	private int teacherId;

	public TeacherCourseId() {
	}

	public TeacherCourseId(String courseId, int teacherId) {
		this.courseId = courseId;
		this.teacherId = teacherId;
	}

	@Column(name = "courseID", nullable = false, length = 20)
	public String getCourseId() {
		return this.courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	@Column(name = "teacherID", nullable = false)
	public int getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TeacherCourseId))
			return false;
		TeacherCourseId castOther = (TeacherCourseId) other;

		return ((this.getCourseId() == castOther.getCourseId()) || (this.getCourseId() != null
				&& castOther.getCourseId() != null && this.getCourseId().equals(castOther.getCourseId())))
				&& (this.getTeacherId() == castOther.getTeacherId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCourseId() == null ? 0 : this.getCourseId().hashCode());
		result = 37 * result + this.getTeacherId();
		return result;
	}

}
