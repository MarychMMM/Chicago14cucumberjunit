package apiModules;

public class Instructor {

int id;
String firstName;
String lastMarych;
int batch;
String subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastMarych(String lastMarych) {
        this.lastMarych = lastMarych;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastMarych() {
        return lastMarych;
    }

    public int getBatch() {
        return batch;
    }

    public String getSubject() {
        return subject;
    }
}
