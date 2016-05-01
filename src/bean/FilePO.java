package bean;

import java.io.Serializable;

public class FilePO implements Serializable{

	private String filename;
	private byte[] fielcontent;

	public FilePO(String filename, byte[] string) {
		super();
		this.filename = filename;
		this.fielcontent = string;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public byte[] getFielcontent() {
		return fielcontent;
	}

	public void setFielcontent(byte[] fielcontent) {
		this.fielcontent = fielcontent;
	}

}
