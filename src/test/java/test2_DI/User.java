package test2_DI;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;
	
	
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public Set<Object> getSets() {
		return sets;
	}
	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}
	public Map<Object, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}
}
