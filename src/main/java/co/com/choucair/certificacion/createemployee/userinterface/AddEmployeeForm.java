package co.com.choucair.certificacion.createemployee.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddEmployeeForm
{
   public static final Target FIELD_NAME = Target.the("nombre del empleado").located(By.xpath("//div[@class= 'input-field col s12 m12 l4']/input[@id= 'firstName']"));
   public static final Target LAST_NAME = Target.the("").located(By.id("lastName"));
   public static final Target MIDDLE_NAME = Target.the("").located(By.id("middleName"));
   public static final Target ID_NUMBER = Target.the("").located(By.id("employeeId"));
   public static final Target LOCATION = Target.the("").located(By.xpath("//div[@id='status_inputfileddiv']/div[@class='select-wrapper initialized']/ul[@id='select-options-4b2721ad-5929-f555-bb27-2249a86f277e']/li[2]/span"));
   public static final Target DISPLAY_LOCATION = Target.the("").located(By.xpath("//div[@class= 'select-wrapper initialized']/input[@class= 'select-dropdown']"));
   public static final Target USER_NAME = Target.the("").located(By.id("username"));
   public static final Target LOGIN_DETAILS = Target.the("").located(By.xpath("//div[@class= 'row col s12']/label"));
   public static final Target STATUS_DISPLAY = Target.the("").located(By.xpath("//div[@class='schema-form-section col s12 m12 l12']/sf-decorator[2]/div[@id='status_inputfileddiv']/div[@class='select-wrapper initialized']/input[@class='select-dropdown']"));
   public static final Target STATUS_ENABLED = Target.the("Status enable").located(By.xpath("//ul[@id='select-options-d2e66a9e-6389-0834-ea0b-c41c2217659e']/li[@class='active selected' and contains(.,'Enabled')]"));
   public static final Target STATUS_DISABLED = Target.the("Status disabled").located(By.xpath("//div[@class='select-wrapper initialized']/ul[@id='select-options-a58073ca-eea1-b24f-a3d1-0101e671a0a9']/li[2]/span"));
   public static final Target PASSWORD = Target.the("input password").located(By.id("password"));
   public static final Target CONFIRM_PASSWORD = Target.the("").located(By.id("confirmPassword"));
   public static final Target ESS_ROLE = Target.the("").located(By.xpath("//div[@id= 'essRoleId_inputfileddiv']/div[@class= 'select-wrapper initialized']"));
   public static final Target SUPERVISOR_ROLE = Target.the("").located(By.xpath("//div[@id= 'supervisorRoleId_inputfileddiv']/div/select[@id= 'supervisorRoleId']"));
   public static final Target ADMIN_ROLE = Target.the("").located(By.xpath("//div[@class= 'select-wrapper initialized']/select[@id= 'adminRoleId']"));
   public static final Target BUTTON_NEXT = Target.the("").located(By.id("systemUserSaveBtn"));
   public static final Target CHECK_ALL_REGIONS = Target.the("").located(By.xpath("//div[@class= 'row col s12 m12 l12 modify-region-allregions']/label"));
   public static final Target SELECT_REGION = Target.the("").located(By.xpath("//div[@class= 'multy-select-container']/input"));
}
