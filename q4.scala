@main def main()={
    var price1 = 15;
    println(s"Profit for ticket price of $price1 : ${Profit(price1)}")
    price1 = 20;
    println(s"Profit for ticket price of $price1 : ${Profit(price1)}")
    price1 = 25;
    println(s"Profit for ticket price of $price1 : ${Profit(price1)}")
    price1 = 30;
    println(s"Profit for ticket price of $price1 : ${Profit(price1)}")
    price1 = 35;
    println(s"Profit for ticket price of $price1 : ${Profit(price1)}")
    price1 = 10;
    println(s"Profit for ticket price of $price1 : ${Profit(price1)}")
    

}

//150rs 120ppl
//-5rs +20ppl
//+5rs -20ppl
//perfomance cost = 500
//attendee cost 3rs
// profit = income - cost
// input ticket price / output profit

def Profit(price: Float):Double = {
    return Income(price) - Cost(price);
}

def Income(price: Float ):Double = {
    return Crowd(price)*price;
}

def Cost(price: Float):Double = {
    return Crowd(price)*AttendeeCost() + PerfomanceCost();
}

def Crowd(price: Float):Double =  {
    return Attendees() - (price - TicketPrice())/5*20;
}

def TicketPrice():Double = {
    return 15;
}

def Attendees():Int = {
    return 120;
}

def AttendeeCost():Float = {
    return 3;
}

def PerfomanceCost():Float = {
    return 500;
}
