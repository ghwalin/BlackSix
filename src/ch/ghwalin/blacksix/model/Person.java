package ch.ghwalin.blacksix.model;

import java.util.UUID;

/**
 * a person
 * <p>
 * Black Six
 *
 * @author Marcel Suter
 * @version 0.1
 * @since 2019-03-04
 */
public class Person {

    private UUID personUUID;
    private String licenseNo;
    private String firstname;
    private String lastname;
    private Integer year;

    public UUID getPersonUUID() {
        if (this.personUUID == null)
            this.personUUID = UUID.randomUUID();
        return personUUID;
    }

    public void setPersonUUID(UUID personUUID) {
        this.personUUID = personUUID;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
