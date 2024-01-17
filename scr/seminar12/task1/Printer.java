package scr.seminar12.task1;

public class Printer {
    Journal journal;
    public Printer(Journal journal){
        this.journal = journal;
    }
    public void print(){
        for(String entry: journal.getEntrise()){
            System.out.println(entry);
        }
    }
}
