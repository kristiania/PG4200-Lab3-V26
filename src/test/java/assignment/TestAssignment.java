package assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junitpioneer.jupiter.DisableIfTestFails;
import assignment.testing.framework.BaseAssignment;

import static org.junit.jupiter.api.Assertions.*;
import static assignment.testing.framework.Utilities.*;

import java.lang.reflect.AccessFlag;
import java.util.List;


@DisableIfTestFails
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Assignment Title")
public class TestAssignment extends BaseAssignment
{
    @DisplayName("Assignment Task #01")
    @Order(1)
    @Test()
    public void reverseTest() {


        int[] arr = {76,87,89,95,1,56,34,22};
        int[] revArr = {22,34,56,1,95,89,87,76};

        //Traverse tv = new Traverse(arr);
        //int[] actualResult = tv.inReverse();
        ///assertArrayEquals(revArr, actualResult);

    }



}
