package co.uk.hungerfree.backend.jsonparsing.pojo;

public class SimpleTestCasePOJO {

    private String name;

    private String profession;

    public SimpleTestCasePOJO() {
    }

    public SimpleTestCasePOJO(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


}
