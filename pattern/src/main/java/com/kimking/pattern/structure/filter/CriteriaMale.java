package com.kimking.pattern.structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/10
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
