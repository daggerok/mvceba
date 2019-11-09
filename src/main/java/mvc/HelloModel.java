package mvc;

import javax.enterprise.inject.Model;

@Model
public class HelloModel {

    public String getGreeting() {
        return "Maksimko";
    }
}
