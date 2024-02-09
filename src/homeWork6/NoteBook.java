package src.homeWork6;

public class NoteBook {
    private int RAM;
    private int HDD;
    private String OS;
    private String colour;

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String toString() {
        return "RAM: " + RAM + ", HDD: " + HDD + ", OS: " + OS + ", colour: " + colour;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoteBook){
            NoteBook noteBook = (NoteBook)
 obj;
            return RAM == noteBook.RAM && HDD == noteBook.HDD && OS.equals(noteBook.OS) && colour.equals(noteBook.colour);
        }
        return false;

    }

    @Override
    public int hashCode() {
        return RAM + 3 * HDD + 7 * OS.hashCode() + 11 * colour.hashCode();
    }
}
