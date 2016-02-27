package design.filter;

/**
 * Created by Joan do Carmo on 11/11/15.
 */
import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}