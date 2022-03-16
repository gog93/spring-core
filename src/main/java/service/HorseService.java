package service;

public class HorseService {
   private String name;
    private String breed;
    private String readersName;

    public HorseService() {
    }

    public HorseService(String name, String breed, String readersName) {
        this.name = name;
        this.breed = breed;
        this.readersName = readersName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getReadersName() {
        return readersName;
    }

    public void setReadersName(String readersName) {
        this.readersName = readersName;
    }

    @Override
    public String toString() {
        return "HorseService{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", readersName='" + readersName + '\'' +
                '}';
    }
}
