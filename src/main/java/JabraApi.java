import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;


public class JabraApi {
    @RunWith(Parameterized.class)
    public static class ParameterizedTest {

        int productId;

        public ParameterizedTest(int productId) {
            this.productId = productId;
        }

        @Parameterized.Parameters(name = "Resquest to product with ID {0}")
        public static List<Object[]> productNumbers() {
            return Arrays.asList(new Object[][]{
                    {621},
                    {217},
                    {404},
                    {425},
                    {119},
                    {423},
                    {395}
            });
        }

        @Test
        public void getFamilyRequest() throws JsonProcessingException {
            Response response = RestAssured.get("https://productcatalogueapi.jabra.com/v1/Family/" + productId + "/groups?marketLocale=en-us");
            Assert.assertEquals(200, response.getStatusCode());
            RestTemplate restTemplate = new RestTemplate();
            Product[] product = restTemplate.getForObject("https://productcatalogueapi.jabra.com/v1/Family/" + productId + "/groups?marketLocale=en-us", Product[].class);
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(product);
            System.out.println(jsonString);
        }
    }
}
