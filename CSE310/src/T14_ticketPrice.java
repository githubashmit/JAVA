public class T14_ticketPrice {
    int infant_age = 3;
    int child_age = 13;
    int senior_citizen_age=60;
    int centenarian_age = 100;
    public void printTicketPrice(int age){
        if(age<=infant_age){
            System.out.println("free ticket for infants");
        }else if(age<=child_age){
            System.out.println("price is 5");
        }else if(age <=senior_citizen_age){
            System.out.println("price is 5 for senior citizen");
        }else{
            System.out.println(" 10 price hai");
        }
    }
    public static void main(String[] args) {
        T14_ticketPrice np = new T14_ticketPrice();
        np.printTicketPrice(np.infant_age);
        np.printTicketPrice(np.child_age);
    }
}
