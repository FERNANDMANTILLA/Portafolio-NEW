package api.back.web.Entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

//mongodb import
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class email {
    @Id
    private String id;
    @Field
    @NotNull
    @Email
    private String email;
    @Field
    @NotNull
    private String name;
    @Field
    @NotNull
    private String number;
    @Field
    @NotNull
    private String message;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    
}
