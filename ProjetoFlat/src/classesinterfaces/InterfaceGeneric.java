package classesinterfaces;

import java.util.List;

public interface InterfaceGeneric {
	 void save(Object obj);
	 Object find(Object obj,int codigo);
	 void delete(Object obj);
	 List<Object> listall(Object obj);
}
