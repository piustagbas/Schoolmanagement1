public class ExaminationServiceImpl implements ExaminationService {


    @Override
    public void admittApplicantBasedOnAge(Person person) {

        if(person.getAge()>17){
            System.out.println("Congratulations you have been admitted");
        }else {
            System.out.println("You are not eligible for admission due to your age");
        }

    }

    @Override
    public void ExpleStudentBehaviour(Person person) {

        if(person.getBehaviour().equals(Behaviour.MALPRACTICE)){
            System.out.println("you are here by expelled from our institution");

        }else if(person.getBehaviour().equals(Behaviour.SMOKING)){
            System.out.println("you are on probation for a year");
        }
        else{
            System.out.println("Congratulations!!! you have been promoted");
        }


    }
}
