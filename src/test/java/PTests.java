import com.sdabyd2.programowanie.PTestImpl;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
//import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;
import  static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class PTests {

    @Test
    public void shouldFindLastElementFromList()
            throws Exception{
        assertThat(PTestImpl.last(asList("a","b","c","d")),is(equalTo("d")));
    }
    @Test
    public void shouldFindListOfNonEmptyList() throws Exception {
        assertThat(PTestImpl.lenght(Arrays.asList(1,2,3,4,5)),is(equalTo(5)));
    }
    @Test
    public void shouldReverseList() throws Exception{
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        assertThat(PTestImpl.reverse(numbers),is(equalTo(Arrays.asList(5,4,3,2,1))));
    }
    @Test
    public void shouldReturnTrueWhenListIsPalindrome() throws Exception {
        assertTrue(PTestImpl.isPalindrome(Arrays.asList("x","a","m","a","x")));
    }
    @Test
    public void shouldRemoveKthElementFromList() throws Exception {
            Object[] result = PTestImpl.removeAt(
                    Arrays.asList("a", "b", "c", "d"), 2);
            assertThat(result[0], CoreMatchers.<Object>equalTo(Arrays.asList("a", "c", "d")));
            assertThat(result[1], CoreMatchers.<Object>equalTo("b"));
    }

    @Test
    public void shouldReturnAListOfThreeRandomSelectedElements() throws Exception {
            List<String> result =
                    PTestImpl.randomSelect(
                            Arrays.asList(
                                    "a", "b", "c", "d", "e", "f", "g", "h"), 3);
            System.out.println(result);
            assertThat(result, hasSize(3));
        }
/*
    @Test
    public void shouldFlattenAListOfList() throws Exception {
        List<String> flatten = PTestImpl.flatten(
                asList("a", asList("b", asList("c", "d")), "e"));
        assertThat(flatten, hasSize(5));
        assertThat(flatten, hasItems("a", "b", "c", "d", "e"));
    }*/
    @Test
    public void shouldRemoveConsecutiveDuplicatesInAList() throws Exception{
        List<String> compressedList =
                PTestImpl.compress(
                        asList("a","a", "a", "b", "c", "c", "d", "e", "e", "e"));
        assertThat(compressedList, hasSize(5));
        assertThat(compressedList, contains("a", "b", "c", "d", "e"));
    }
    @Test
    public void shouldDuplicateElementsInAList() throws Exception {
        List<String> duplicates =
                PTestImpl.duplicate(Arrays.asList("a", "b", "c", "d"));
        assertThat(duplicates, hasSize(8));
        assertThat(duplicates, contains("a", "a", "b",
                "b", "c", "c", "d", "d"));
    }
    @Test
    public void shouldDuplicateElementsInAListWithParameter() throws Exception {
        List<String> duplicates =
                PTestImpl.duplicateWithParameter(Arrays.asList("a", "b", "c"), 3);
        assertThat(duplicates, hasSize(9));
        assertThat(duplicates, contains("a", "a",
                "a", "b", "b", "b", "c", "c", "c"));
    }
/*
    @Test
    public void shouldDropEveryNthElement() throws Exception {
        List<String> result = PTestImpl.dropEveryNth(
                Arrays.asList("a", "b", "c", "d", "e",
                        "f", "g", "h", "i", "j", "k"), 3);
        assertThat(result, hasSize(8));
        assertThat(result, contains("a", "b", "d", "e", "g", "h", "j", "k"));
    }
*/
}