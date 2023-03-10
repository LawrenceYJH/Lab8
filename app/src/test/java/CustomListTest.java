import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testHasCity(){
        list = MockList();
        City city = new City("Calgary","Alberta");
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void testDeleteCity(){
        list = MockList();
        City city = new City("Calgary","Alberta");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
        assertThrows(IllegalArgumentException.class, ()-> {
            list.deleteCity(city);
        });
    }

    @Test
    public void testCountCities(){
        list = MockList();
        City city1 = new City("Calgary","Alberta");
        City city2 = new City("Edmonton","Alberta");
        assertEquals(list.countCities(),0);
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(list.countCities(),2);
        list.deleteCity(city2);
        assertEquals(list.countCities(),1);
    }
}
