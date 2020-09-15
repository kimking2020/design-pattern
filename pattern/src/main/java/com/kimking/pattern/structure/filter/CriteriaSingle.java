package com.kimking.pattern.structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/10
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
