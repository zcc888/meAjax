package ajax.spider.rules;

import org.jsoup.select.Elements;

public class PreProcessor {
	
	public String preProcessTitleElements(Elements eles) {
		return eles.html();
	}
	public String preProcessSummaryElements(Elements eles) {
		String content = eles.html().replaceAll("<script>", "&lt;script&gt;");
		return content;
	}
	public String preProcessContentElements(Elements eles) {
		String content = eles.html().replaceAll("<script>", "&lt;script&gt;");
		return content;
	}
	public String preProcessStampsElements(Elements eles) {
		return eles.html();
	}
	public int preProcessLikesElements(Elements eles) {
		return Integer.parseInt(eles.html());
	}
	public int preProcessDislikesElements(Elements eles) {
		return Integer.parseInt(eles.html());
	}
	public String preProcessUsernameElements(Elements eles) {
		return eles.html();
	}
	public String preProcessUserPersonalPageUrlElements(Elements eles) {
		return eles.html();
	}
	public String preProcessBackgroundInformationElements(Elements eles) {
		return eles.html();
	}
	
}