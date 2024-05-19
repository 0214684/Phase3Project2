package RestAssured;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


    

public class POSTRequest {
	private static final Logger logger = LogManager.getLogger(POSTRequest.class);

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.error("This is an error message");
    }


    
    @Test
    public void PostRequestTest() {
   	 
   	JSONObject json=new JSONObject();
   	 
   	 json.put("name", "NewUsername");
   	 json.put("job", "BigBoss");
   	 
   	 
   	 String res=RestAssured.baseURI="https://reqres.in/api/users";
   	 
   	 RestAssured.given().header("Content-Type","application/json").contentType(ContentType.JSON).body(json.toJSONString())
   	 .when()
   		 .post()
   	 .then()
   		 .statusCode(201)
   		 .log().all();
   	}}
