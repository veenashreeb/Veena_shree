import java.util.Scanner;

 class Emp {

    String e_name, e_address, e_dept, e_id, e_age;

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_address() {
        return e_address;
    }

    public void setE_address(String e_address) {
        this.e_address = e_address;
    }

    public String getE_dept() {
        return e_dept;
    }

    public void setE_dept(String e_dept) {
        this.e_dept = e_dept;
    }

    public String getE_id() {
        return e_id;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    public String getE_age() {
        return e_age;
    }

    public void setE_age(String e_age) {
        this.e_age = e_age;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "e_name='" + e_name + '\'' +
                ", e_address='" + e_address + '\'' +
                ", e_dept='" + e_dept + '\'' +
                ", e_id='" + e_id + '\'' +
                ", e_age='" + e_age + '\'' +
                '}';
    }

        static class Test {
            public static void main(String[] args) {
                Test eTest = new Test();

                Emp[] e = new Emp[10];
                for (int i = 1; i <= 10; i++) {
                    System.out.println("SI NO" + i);
                    e[i] = new Emp();
                    eTest.func(e[i]);
                }
                System.out.println("10 employees are entered");
            }

            void func(Emp emp1) {
                setData(emp1);
                getData(emp1);
            }

            void setData(Emp emp1) {
                Scanner sc = new Scanner(System.in);

                String id = sc.next();
                String name = sc.next();
                String age = sc.next();
                String dept = sc.next();
                String address = sc.next();

                emp1.setE_id(id);
                emp1.setE_name(name);
                emp1.setE_age(age);
                emp1.setE_dept(dept);
                emp1.setE_address(address);

            }

            void getData(Emp emp1) {
                System.out.println("emp1 id = " + emp1.getE_id()+ "\n"+"emp1 name = " + emp1.getE_name()+"\n"+"emp1 age = " + emp1.getE_age()+"\n"+"emp1 department = " + emp1.getE_dept()+"\n"+"emp1 address = " + emp1.getE_address());

            }
        }
    }


