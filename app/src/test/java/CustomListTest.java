import static org.junit.Assert.assertEquals;

import com.example.lab8.City;
import com.example.lab8.CustomList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     *  create a mockList for my cityList
     * @ return
     */

    public CustomList MockList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     *  get the size of the list
     *  increase the list by adding a new city
     *  check if our current size matches the initial plus one
     */
    @Test
    public void taddCityTest(){
        list = MockList();
        int listSize = list.getCount();
        list.addCity(new City(("Estevon"),"SK"));
        assertEquals(list.getCount(),listSize + 1) ;
    }
}
