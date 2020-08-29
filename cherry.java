public enum cherry{
	//Enumeration
	a("yoyo", "22"),
	b("nono", "34"),
    c("koko", "23"),
    d("momo", "34"),
    e("lolo", "65");
	private final String desc;
	private final String year;
	cherry(String description, String nyear){
		desc = description;
		year = nyear;
	}
	public String getDesc(){
		return desc;
	}
	public String getYear(){
		return year;
	}
	
}