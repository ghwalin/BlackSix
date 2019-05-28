package ch.ghwalin.blacksix.model;

import java.util.List;
import java.util.UUID;

/**
 * the result sheet for a competitor
 * <p>
 * Black Six
 *
 * @author Marcel Suter
 * @version 0.1
 * @since 2019-03-04
 */
public class Sheet {
    private UUID sheetUUID;
    private Integer sheetNum;
    private Club club;
    private List<Discipline> disciplineList;

    public UUID getSheetUUID() {
        return sheetUUID;
    }

    public void setSheetUUID(UUID sheetUUID) {
        this.sheetUUID = sheetUUID;
    }

    public Integer getSheetNum() {
        return sheetNum;
    }

    public void setSheetNum(Integer sheetNum) {
        this.sheetNum = sheetNum;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public List<Discipline> getDisciplineList() {
        return disciplineList;
    }

    public void setDisciplineList(List<Discipline> disciplineList) {
        this.disciplineList = disciplineList;
    }
}
