//methoid overriding
class bank{
    int getInternest(){
        return 0;
    }
}
class SBI extends bank{
    int getInternest(){
        return 8;
    }
}
class ICIC extends bank{
    int getInternest(){
        return 7;
    }
}
class AXIS extends bank{
    int getInternest(){
        return 9;
    }
}
class test_bank{
    public static void main(String args[]){
        SBI s=new SBI();
        ICIC i = new ICIC();
        AXIS a = new AXIS();
        System.out.println("SBI RATE : "+ s.getInternest());
        System.out.println("ICIC RATE : "+ i.getInternest());
        System.out.println("AXIS RATE : "+ a.getInternest());
    }   
}