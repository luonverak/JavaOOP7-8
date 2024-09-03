class MainFunction {
    public static void main(String[] arg) {

        final Generic<Department> department;

        department = new Generic<>(new Department(1, "IT", 500, 1));

        System.out.println(department);
    }
}
