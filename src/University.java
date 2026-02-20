public class University {
    private String uName;
    private String location;

    public University(String n, String l){
        uName = n;
        location = l;
    }

    public class Department{
        private String deptName;
        private String hodName;

        public Department(String dn, String hn){
            deptName = dn;
            hodName = hn;
        }

        public void display(){
            System.out.println("University: " + uName);
            System.out.println("Location: " + location);
            System.out.println("Department: " + deptName);
            System.out.println("HOD: " + hodName);
        }
    }

    public static void main(String[] args){
        University uni = new University("KIIT", "Bhubaneswar");
        University.Department dept = uni.new Department("CSE", "Dr. Dean");
        dept.display();
    }
}
