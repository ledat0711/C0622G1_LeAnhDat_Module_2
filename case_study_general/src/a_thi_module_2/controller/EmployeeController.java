package a_thi_module_2.controller;

import a_thi_module_2.common.CommonController;
import a_thi_module_2.controller.*;
import a_thi_module_2.service.IEmployeeService;
import a_thi_module_2.service.impl.EmployeeServiceImpl;

public class EmployeeController {
    private static final IEmployeeService employeeService = new EmployeeServiceImpl();
    public void displayEmployeeManagementMenu() {
        String choice;
        while (true) {
            System.out.print("---------------------------------------------------------" +
                    "\n---------------MENU QUẢN LÝ NHÂN VIÊN---------------" +
                    "\n1. Thêm mới thông tin nhân viên." +
                    "\n2. Xóa thông tin nhân viên." +
                    "\n3. Hiển thị thông tin nhân viên." +
                    "\nMời bạn nhập lựa chọn: "
            );
            choice = CommonController.inputValidChoice("[1-3]");
            switch (choice) {
                case "1":
                    employeeService.add();
                    break;
                case "2":
                    employeeService.remove();
                    break;
                case "3":
                    employeeService.display();
                    break;
                case "4":
                    break;
//                case"5":
//                    EmployeeServiceImpl.findEmployee();
//                    break;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }
}
