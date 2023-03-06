package resetAssured.requst;

public class UserRequest extends BaseRequest {

    public UserRequest createUser() {
        return header("fbjn", "12").post(new UserRequest(), "/api/users").as(UserRequest.class);
    }


}
