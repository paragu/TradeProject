public class InstrumentVO {

	
	String instid;
	String instname;
	public String getInstid() {
		return instid;
	}
	public void setInstid(String instid) {
		this.instid = instid;
	}
	public String getInstname() {
		return instname;
	}
	public void setInstname(String instname) {
		this.instname = instname;
	}


public String toString() { 
    return String.format("instid:"+instid  + "," + "instname:"+instname); 
} 
}