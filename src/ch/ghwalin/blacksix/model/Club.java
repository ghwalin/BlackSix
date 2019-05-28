package ch.ghwalin.blacksix.model;

import java.util.UUID;

/**
 * the club a person is a member of
 * <p>
 * Black Six
 *
 * @author Marcel Suter
 * @version 0.1
 * @since 2019-03-04
 */

public class Club {
    private UUID clubUUID;
    private String clubName;


    public UUID getClubUUID() {
        return clubUUID;
    }

    public void setClubUUID(UUID clubUUID) {
        this.clubUUID = clubUUID;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
}
