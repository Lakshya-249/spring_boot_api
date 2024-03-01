package application.web_app2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller1 {
    @GetMapping(value = "/hello")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayhello(){
        return "hello";
    }

    @GetMapping("/hello2")
    public String sayhello2(){
        return "hello2";
    }

    @PostMapping("/postreq")
    public String postr(
            @RequestBody String message
    ){
        return "The data posted with req: " + message;
    }

    @PostMapping("/postreq-2")
    public String postr(
            @RequestBody postorder order
    ){
        return "The data posted with req: " + order.toString();
    }

    @PostMapping("/postreq-3")
    public String postr(
            @RequestBody postorder_record order
    ){
        return "The data posted with req: " + order.toString();
    }

    @GetMapping("/hello2/{user-name}")
    public String pathvar(
            @PathVariable("user-name") String username
    ){
        return "object return with username: " + username;
    }

    @GetMapping("/hello3")
    public String pathvar(
            @RequestParam("u-fname") String fname,
            @RequestParam("u-lname") String lname
    ){
        return "object return with name: "+fname+" & lastname: "+lname ;
    }

    @PutMapping("/update/{id}")
    public String udpate(
            @PathVariable("id") Integer id1,
            @RequestBody postorder_record record
    ){
//       data up gradation code here...
        return "Data updated";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(
            @PathVariable("id") Integer id1
    ){
//       data deletion code here..
        return "Data Deleted";
    }
}
