import MacroNutrient.*;
import Pizza.PizzaBuilderTest;
import Pizza.PizzaTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({PizzaTest.class, PizzaBuilderTest.class, CustomerTest.class, MacronutrientFactoryCreatorTest.class, CarbsFactoryTest.class, ProteinFactoryTest.class, FatsFactoryTest.class})
public class SuiteTest {
}
