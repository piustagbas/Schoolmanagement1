public class Main {
    public static void main(String[] args) {

        // User inputs

        Person person = new Person("Lucky","Pius","ptagb@gmail.com",23,Role.STUDENT,Behaviour.MALPRACTICE);
        Person person1 = new Person("John","Lucas","jlucas23@gmail.com",17,Role.APPLICANT,Behaviour.STUDYING);




        // Promgramers outputs
        System.out.println("STUDENT STATUS");
        ExaminationServiceImpl examinationServiceimp = new ExaminationServiceImpl();
        examinationServiceimp.admittApplicantBasedOnAge(person1);
        examinationServiceimp.ExpleStudentBehaviour(person);
    }

}
