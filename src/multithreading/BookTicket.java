package multithreading;

public class BookTicket {
    private static Integer ticketAvailable = 100;
   synchronized static void bookTicket(int requiredTicket)  {
        if (ticketAvailable >= requiredTicket){
            ticketAvailable = ticketAvailable - requiredTicket;
            System.out.println(requiredTicket + " are booked");
            System.out.println("Total Tickets available: "+ticketAvailable);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("No tickets available");
        }
    }
}
class ThreadTicket1 extends Thread{
   private BookTicket bookTicket1;
    private int tickets;
    ThreadTicket1(int tickets,BookTicket bookTicket1){
        this.tickets = tickets;
        this.bookTicket1 = bookTicket1;
    }
    @Override
    public void run() {
        bookTicket1.bookTicket(tickets);
    }
}

class ThreadTicket2 extends Thread{
    private BookTicket bookTicket2;
    private int tickets;
    ThreadTicket2(int tickets,BookTicket bookTicket2){
        this.tickets = tickets;
        this.bookTicket2 = bookTicket2;
    }
    @Override
    public void run() {
        bookTicket2.bookTicket(tickets);
    }
}

class BookTicketImpl{
    public static void main(String[] args) {
        BookTicket bookTicket1 = new BookTicket();
        ThreadTicket1 t1 = new ThreadTicket1(20,bookTicket1);
        ThreadTicket2 t2 = new ThreadTicket2(30,bookTicket1);

        BookTicket bookTicket2 = new BookTicket();
        ThreadTicket1 t3 = new ThreadTicket1(40,bookTicket2);
        ThreadTicket2 t4 = new ThreadTicket2(50,bookTicket2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}