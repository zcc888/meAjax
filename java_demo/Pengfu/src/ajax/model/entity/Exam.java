package ajax.model.entity;

import java.util.List;

public class Exam extends Entity<Exam>{
	private int id;
	private int userid;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 题目封面 (一般有默认值, 不允许用户设置)
	 */
	private String img;
	/**
	 * 题目类型
	 */
	private String type;
	private int seconds;
	/**
	 * 题目难度
	 */
	private int diffuculty;
	/**
	 * 题目数量
	 */
	private int num;
	private String dateEntered;
	/**
	 * 静态文件url
	 */
	private String url;
	
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDateEntered() {
		return dateEntered;
	}
	public void setDateEntered(String dateEntered) {
		this.dateEntered = dateEntered;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public int getDiffuculty() {
		return diffuculty;
	}
	public void setDiffuculty(int diffuculty) {
		this.diffuculty = diffuculty;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	




	public class Choice{
		private String title;
		private boolean checked;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public boolean isChecked() {
			return checked;
		}
		public void setChecked(boolean checked) {
			this.checked = checked;
		}
	}
	public class Question {
		private int id;
		private String title;
		private boolean finish = false;
		private List<Choice> choices;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public boolean isFinish() {
			return finish;
		}
		public void setFinish(boolean finish) {
			this.finish = finish;
		}
		public List<Choice> getChoices() {
			return choices;
		}
		public void setChoices(List<Choice> choices) {
			this.choices = choices;
		}
	}
	
	
	
}
