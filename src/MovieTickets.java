public class MovieTickets{
    private String moviename;
    private Day day;
    private double finalPrice;
    private double actualPrice=200;
    private double discountPrice;
    private double extraPrice;

    private double price;
    public MovieTickets(String moviename, String day) {
        this.moviename = moviename;
        this.day= Day.valueOf(day);

    }
    public void showTicketPriceDetails(){
        System.out.println("you booked :"+ moviename+"on "+ day);
        switch(day){
            case MONDAY:
                discountPrice=actualPrice*0.10;
                finalPrice = actualPrice-discountPrice;
                System.out.println("actualPrice :"+ actualPrice);
                System.out.println("DiscountPrice"+discountPrice);
                System.out.println("finalPrice"+finalPrice);
                System.out.println("you saved"+discountPrice);
                break;
            case TUESDAY:
                discountPrice=actualPrice*0.20;
                finalPrice = actualPrice-discountPrice;
                System.out.println("actualPrice :"+ actualPrice);
                System.out.println("DiscountPrice"+discountPrice);
                System.out.println("finalPrice"+finalPrice);
                System.out.println("you saved"+discountPrice);
                break;
            case WEDNESDAY:
                discountPrice=actualPrice*0.30;
                finalPrice = actualPrice-discountPrice;
                System.out.println("actualPrice :"+ actualPrice);
                System.out.println("DiscountPrice"+discountPrice);
                System.out.println("finalPrice"+finalPrice);
                System.out.println("you saved"+discountPrice);
                break;

            case THURSDAY:
                discountPrice=actualPrice*0.40;
                finalPrice = actualPrice-discountPrice;
                System.out.println("actualPrice :"+ actualPrice);
                System.out.println("DiscountPrice"+discountPrice);
                System.out.println("finalPrice"+finalPrice);
                System.out.println("you saved"+discountPrice);
                break;
            case FRIDAY:
            case SATURDAY:
                case SUNDAY:
                discountPrice=actualPrice*0.50;
                finalPrice = actualPrice-discountPrice;
                System.out.println("actualPrice :"+ actualPrice);
                System.out.println("DiscountPrice"+discountPrice);
                System.out.println("finalPrice"+finalPrice);
                System.out.println("you saved"+discountPrice);
                break;
        }
    }

}
