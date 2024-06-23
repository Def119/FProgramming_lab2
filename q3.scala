@main def main() = {
    var hrs = 40;
    var ot = 30;
    println(s"Total takehome salary for ${hrs} working hours and $ot overtime hours is : ${TakeHomeMoney(hrs,ot)}");
}

def TakeHomeMoney(hrs: Double, ot: Double):Double = {
    var sal: Double = TotalSal(hrs,ot);
    sal - TaxPay(sal);
}

def TaxPay(sal: Double):Double = {
    return sal * .12;
}

def TotalSal(hrs: Double, ot: Double):Double = {
    return NormalHours()*hrs + OverTime()*ot;
}

def NormalHours():Double = {
    return 250.0;
}

def OverTime():Double = {
    return 85.0;
}
