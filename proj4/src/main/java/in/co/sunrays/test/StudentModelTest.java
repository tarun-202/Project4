package in.co.sunrays.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.sunrays.bean.StudentBean;
import in.co.sunrays.exception.ApplicationException;
import in.co.sunrays.exception.DuplicateRecordException;
import in.co.sunrays.model.StudentModel;
import in.co.sunrays.util.DataUtility;

/**
 * For Student model testing
 * @author Tarun
 *
 */
public class StudentModelTest {

	public static void main(String[] args) throws Exception {

		 testAdd();
		// testDelete();
		// testUpdate();
		// testFindByPK();
		//testFindByEmailId();
		//testSearch();
		//testList();
	}

	private static void testAdd() throws Exception {
		try {
			StudentModel model = new StudentModel();
			StudentBean bean = new StudentBean();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			bean.setId(6);
			//bean.setCollegeName("SIT Indore");
			bean.setFirstName("pankaj");
			bean.setLastName("karma");
			bean.setDob(sdf.parse("1/11/1992"));
			bean.setMobileNo(917525333);
			bean.setEmail("pankaj@FGSDF.VOM");
			bean.setCollegeId(1L);
			bean.setCreatedBy("Admin");
			bean.setModifiedBy("Admin");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
			long pk = model.add(bean);
			StudentBean addedbean = model.findByPK(pk);
			if (addedbean == null) {
				System.out.println("Test add fail");
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		} catch (DuplicateRecordException e) {
			e.printStackTrace();
		}
	}

	public static void testDelete() {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			StudentBean bean = new StudentBean();
			StudentModel model = new StudentModel();
			long pk = 10L;
			bean.setId(3);
			model.delete(bean);
			StudentBean deletedbean = model.findByPK(pk);
			if (deletedbean != null) {
				System.out.println("Test Delete fail");
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	public static void testUpdate() throws Exception {

		try {
			StudentModel model = new StudentModel();
			StudentBean bean = model.findByPK(1L);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			bean.setCollegeId(2021L);
			bean.setCollegeName("SIT Indore");
			bean.setFirstName("Akanksha");
			bean.setLastName("dfdsfdsf");
			bean.setDob(sdf.parse("1/12/1990"));
			bean.setMobileNo(917525);
			bean.setEmail("Asddss@FGSDF.VOM");
			bean.setCreatedBy("Admin");
			bean.setModifiedBy("Admin");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
			model.update(bean);

			StudentBean updatedbean = model.findByPK(1L);
			if (!"rr".equals(updatedbean.getFirstName())) {
				System.out.println("Test Update success");
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		} catch (DuplicateRecordException e) {
			e.printStackTrace();
		}
	}

	public static void testFindByPK() {
		try {
			StudentModel model = new StudentModel();
			StudentBean bean = new StudentBean();
			long pk = 1L;
			bean = model.findByPK(pk);
			if (bean == null) {
				System.out.println("Test Find By PK fail");
			}
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getDob());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCollegeId());
		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}

	private static void testFindByEmailId() {
		try {
			StudentModel model = new StudentModel();
			StudentBean bean = new StudentBean();
			bean = model.findByEmailId("kjghjghjg@FGSDF.VOM");
			if (bean != null) {
				System.out.println("Test Find By EmailId fail");
			}

			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getDob());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCollegeId());
		} catch (ApplicationException e) {
			e.printStackTrace();
		}

	}
	private static void testSearch() {
		try {
			
			StudentModel model = new StudentModel();
            StudentBean bean = new StudentBean();
            List list = new ArrayList();
            bean.setFirstName("sita");
            list = model.search(bean, 0, 0);
            if (list.size() < 0) {
                System.out.println("Test Serach fail");
            }
            Iterator it = list.iterator();
            
            while (it.hasNext()) {
                bean = (StudentBean) it.next();
                System.out.println(bean.getId());
                System.out.println(bean.getFirstName());
                System.out.println(bean.getLastName());
                System.out.println(bean.getDob());
                System.out.println(bean.getMobileNo());
                System.out.println(bean.getEmail());
                System.out.println(bean.getCollegeId());
            }

        } catch (ApplicationException e) {
            e.printStackTrace();
        }	
	}
	private static void testList() {
		 try { StudentModel model = new StudentModel();
	            StudentBean bean = new StudentBean();
	            List list = new ArrayList();
	            list = model.list(1, 10);
	            if (list.size() < 0) {
	                System.out.println("Test list fail");
	            }
	            Iterator it = list.iterator();
	            while (it.hasNext()) {
	                bean = (StudentBean) it.next();
	                System.out.println(bean.getId());
	                System.out.println(bean.getFirstName());
	                System.out.println(bean.getLastName());
	                System.out.println(bean.getDob());
	                System.out.println(bean.getMobileNo());
	                System.out.println(bean.getEmail());
	                System.out.println(bean.getCollegeId());
	                System.out.println(bean.getCreatedBy());
	                System.out.println(bean.getCreatedDatetime());
	                System.out.println(bean.getModifiedBy());
	                System.out.println(bean.getModifiedDatetime());
	            }

	        } catch (ApplicationException e) {
	            e.printStackTrace();
	        }
	    }
		
	}

