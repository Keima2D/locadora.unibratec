package locadora.basics;

import java.util.Calendar;

public class DVDs {
	private String title;
	private String category;
	private Calendar releaseDate;
	private String sinopse;
	private String studio;
	private String actors;
	
	public DVDs(String title, String category, Calendar releaseDate,
			String sinopse, String studio, String actors) {
		super();
		this.title = title;
		this.category = category;
		this.releaseDate = releaseDate;
		this.sinopse = sinopse;
		this.studio = studio;
		this.actors = actors;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Calendar getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Calendar releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	

}
