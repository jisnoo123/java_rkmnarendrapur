package assignment.as11.employee.NetSal;
import assignment.as11.employee.employeemain;

public class calNetSal {
    public double ns;

    public void calns(employeemain obr){
        assignment.as11.employee.DA.calDA ob_da = new assignment.as11.employee.DA.calDA();
        assignment.as11.employee.HRA.calHRA ob_hra = new assignment.as11.employee.HRA.calHRA();
        
        ob_da.cald(obr);
        ob_hra.calh(obr);

        ns = obr.bs + ob_hra.h + ob_da.da;
        System.out.println("Net Salary: Rs. "+ ns);
    }
}
