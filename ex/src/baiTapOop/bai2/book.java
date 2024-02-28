package baiTapOop.bai2;

public class book extends document{
	private String author;//teen tác giả
	private long page;
	
	public book() {
		super();
	}

	public book(String author, long page) {
		super();
		this.author = author;
		this.page = page;
	}

	public book(long id, String imprint, long issue, String author, long page) {
		super(id, imprint, issue);
		this.author = author;
		this.page = page;
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getPage() {
		return page;
	}

	public void setPage(long page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", imprint=" + imprint + ", issue=" + issue + ", author=" + author + ", page=" + page
				+ "]";
	}
	
	
}
