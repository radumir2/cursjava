package ro.aassaa.demo03;

public class EcuatieGradDoiCuInterfata implements InterfataEcuatieGradDoi {
    @Override
    public String rezolva(double a, double b, double c) {
        return EcuatieGradDoi.rezolva(a,b,c);
    }
}
