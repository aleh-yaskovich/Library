package by.htp.library.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {
	
	private String groupSearchName;
	private String parameter;

	public Criteria() {
		this.groupSearchName = null;
		this.parameter = "";
	}
	
	public Criteria(String groupSearchName, String parameter) {
		this.groupSearchName = groupSearchName;
		this.parameter = parameter;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void setGroupSearchName(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupSearchName == null) ? 0 : groupSearchName.hashCode());
		result = prime * result + ((parameter == null) ? 0 : parameter.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Criteria other = (Criteria) obj;
		if (groupSearchName == null) {
			if (other.groupSearchName != null)
				return false;
		} else if (!groupSearchName.equals(other.groupSearchName))
			return false;
		if (parameter == null) {
			if (other.parameter != null)
				return false;
		} else if (!parameter.equals(other.parameter))
			return false;
		return true;
	}
	
}
