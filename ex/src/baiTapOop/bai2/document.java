package baiTapOop.bai2;

public class document {
	protected long id;// mã sản phẩm
	protected String imprint;// tên nhà xuất bản
	protected long issue;// số bản phát hành
	
	public document() {
		super();
	}

	public document(long id, String imprint, long issue) {
		super();
		this.id = id;
		this.imprint = imprint;
		this.issue = issue;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImprint() {
		return imprint;
	}

	public void setImprint(String imprint) {
		this.imprint = imprint;
	}

	public long getIssue() {
		return issue;
	}

	public void setIssue(long issue) {
		this.issue = issue;
	}

	@Override
	public String toString() {
		return "document [id=" + id + ", imprint=" + imprint + ", issue=" + issue + "]";
	}
	
	

}
