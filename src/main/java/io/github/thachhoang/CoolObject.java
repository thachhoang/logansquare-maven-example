package io.github.thachhoang;

import java.util.ArrayList;
import java.util.List;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class CoolObject {

	@JsonField(name = "id")
	private Long coolId;

	@JsonField(name = "props")
	private List<Object> coolProps = new ArrayList<Object>();

	public Long getCoolId() {
		return coolId;
	}

	public void setCoolId(Long coolId) {
		this.coolId = coolId;
	}

	public List<Object> getCoolProps() {
		return coolProps;
	}

	public void setCoolProps(List<Object> coolProps) {
		this.coolProps = coolProps;
	}

}
