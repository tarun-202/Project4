package in.co.sunrays.test;

import in.co.sunrays.bean.CollegeBean;
import in.co.sunrays.exception.ApplicationException;
import in.co.sunrays.exception.DuplicateRecordException;
import in.co.sunrays.model.CollegeModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.sql.Timestamp;

/**
 * For Collegemodel testing
 * @author Tarun
 *
 */
public class CollegeModelTest {
	public static void main(String[] args) throws Exception {
		//testAdd();
	//testUpdate();
	//testDelete();
	//testFindByName();
	//testFindByPK();
	testSearch();
	//testlist();	
	}

	private static void testlist() {
		 try {
	            CollegeBean bean = new CollegeBean();
	            CollegeModel model= new CollegeModel();
	            List list = new ArrayList();
	            list = model.list(1, 10);
	            if (list.size() < 0) {
	                System.out.println("Test list fail");
	            }
	            Iterator it = list.iterator();
	            while (it.hasNext()) {
	                bean = (CollegeBean) it.next();
	                System.out.println(bean.getId());
	                System.out.println(bean.getName());
	                System.out.println(bean.getAddress());
	                System.out.println(bean.getState());
	                System.out.println(bean.getCity());
	                System.out.println(bean.getPhoneNo());
	                System.out.println(bean.getCreatedBy());
	                System.out.println(bean.getCreatedDatetime());
	                System.out.println(bean.getModifiedBy());
	                System.out.println(bean.getModifiedDatetime());
	            }

	        } catch (ApplicationException e) {
	            e.printStackTrace();
	        }
	    }
	

	private static void testSearch() {
		  try {
	            CollegeBean bean = new CollegeBean();
	            CollegeModel model=new CollegeModel();
	            List list = new ArrayList();
	           // bean.setName("jsp");
	             bean.setAddress("Bypass ");
	            list = model.search(bean, 1, 10);
	            if (list.size() < 0) {
	                System.out.println("Test Search fail");
	            }
	            Iterator it = list.iterator();
	            while (it.hasNext()) {
	                bean = (CollegeBean) it.next();
	                System.out.println(bean.getId());
	                System.out.println(bean.getName());
	                System.out.println(bean.getAddress());
	                System.out.println(bean.getState());
	                System.out.println(bean.getCity());
	                System.out.println(bean.getPhoneNo());
	                System.out.println(bean.getCreatedBy());
	                System.out.println(bean.getCreatedDatetime());
	                System.out.println(bean.getModifiedBy());
	                System.out.println(bean.getModifiedDatetime());
	            }
	        } catch (ApplicationException e) {
	            e.printStackTrace();
	        }
	}



	private static void testFindByPK() {
        try {
            CollegeBean bean = new CollegeBean();
            CollegeModel model=new CollegeModel();
            bean = model.findByPK(1);
            if (bean == null) {
                System.out.println("Test Find By PK fail");
            }
            System.out.println(bean.getId());
            System.out.println(bean.getName());
            System.out.println(bean.getAddress());
            System.out.println(bean.getState());
            System.out.println(bean.getCity());
            System.out.println(bean.getPhoneNo());
            System.out.println(bean.getCreatedBy());
            System.out.println(bean.getCreatedDatetime());
            System.out.println(bean.getModifiedBy());
            System.out.println(bean.getModifiedDatetime());
        } catch (ApplicationException e) {
            e.printStackTrace();
        }

    }
		
	



	public static void testAdd() throws Exception {
		try {
			CollegeBean bean = new CollegeBean();
			bean.setName("jawaharlal technology");
			bean.setAddress("borawan");
			bean.setState("mp");
			bean.setCity("indore");
			bean.setPhoneNo("7773124244");
			bean.setCreatedBy("Admin");
			bean.setModifiedBy("Admin");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
			CollegeModel model = new CollegeModel();
			long pk = model.add(bean);
			CollegeBean addedBean = model.findByPK(pk);
			if (addedBean == null) {
				System.out.println("Test add fail");
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}
	
	public static void testUpdate() throws Exception {
		  try {
			  CollegeModel model = new CollegeModel();
			  CollegeBean bean = new CollegeBean();
	            //CollegeBean bean = model.findByPK(2L);
				bean.setName("akku");
				bean.setAddress("borawan");
				bean.setState("mp");
				bean.setCity("indore");
				bean.setPhoneNo("734124244");
				bean.setCreatedBy("Admin");
				bean.setModifiedBy("Admin");
				bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
				bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
				bean.setId(2);
	            model.update(bean);
	            System.out.println("Test Update succ");
	          
	        } catch (ApplicationException e) {
	            e.printStackTrace();
	        } catch (DuplicateRecordException e) {
	            e.printStackTrace();
	        }
	}
    public static void testDelete() {

        try {
            CollegeBean bean = new CollegeBean();
            CollegeModel model = new CollegeModel();
            bean.setId(2);
            model.delete(bean);
            System.out.println("Test Delete succ");
        } catch (ApplicationException e) {
            e.printStackTrace();
        }
    }
	public static void testFindByName() throws Exception {
		 try {
	            CollegeModel model = new CollegeModel();
				CollegeBean bean = model.findByName("jsp");
	            if (bean == null) {
	                System.out.println("Test Find By Name fail");
	            }
	            System.out.println(bean.getId());
	            System.out.println(bean.getName());
	            System.out.println(bean.getAddress());
	            System.out.println(bean.getState());
	            System.out.println(bean.getCity());
	            System.out.println(bean.getPhoneNo());
	            System.out.println(bean.getCreatedBy());
	            System.out.println(bean.getCreatedDatetime());
	            System.out.println(bean.getModifiedBy());
	            System.out.println(bean.getModifiedDatetime());
	        } catch (ApplicationException e) {
	            e.printStackTrace();
	        }
}
	}