import com.sterlingcommerce.woodstock.workflow.Document;           
import java.io.InputStream;              
import java.io.InputStreamReader;              
import java.io.BufferedReader;               
Document document = new Document();              
Document srcDoc = wfc.getPrimaryDocument();            
String mailBoxPath = (String)wfc.getWFContent("mailboxPath");          
String user = (String)wfc.getWFContent("user");         
String xml ="<VirtualRoot Path=\""+ mailBoxPath +  "\" User=\""+ user + "\"/>";       
document = wfc.newDocument();           
document.setBody(xml.toString().getBytes());                
wfc.setAdvancedStatus("Finish!");            
wfc.setBasicStatus(000);                     
wfc.putPrimaryDocument(document);          
return "000";
