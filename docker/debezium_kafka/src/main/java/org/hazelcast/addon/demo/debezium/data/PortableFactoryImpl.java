package org.hazelcast.addon.demo.debezium.data;

import com.hazelcast.nio.serialization.Portable;
import com.hazelcast.nio.serialization.PortableFactory;

/**
 * PortableFactoryImpl is generated code. To manually modified the code, make sure
 * to follow the same naming conventions. Otherwise, the code generator may not work.
 
 * @generator com.netcrest.pado.tools.hazelcast.VersionedPortableClassGenerator
 * @date Sun Mar 22 16:14:45 EDT 2020
 */
public class PortableFactoryImpl implements PortableFactory {
	public static final int FACTORY_ID = Integer.getInteger("org.hazelcast.addon.demo.debezium.data.PortableFactoryImpl.factoryId", 20001);

	static final int __FIRST_CLASS_ID = Integer.getInteger("org.hazelcast.addon.demo.debezium.data.PortableFactoryImpl.firstClassId", 20001);
	static final int Address_CLASS_ID = __FIRST_CLASS_ID;
	static final int Customer_CLASS_ID = Address_CLASS_ID + 1;
	static final int Order_CLASS_ID = Customer_CLASS_ID + 1;
	static final int Product_CLASS_ID = Order_CLASS_ID + 1;
	static final int ProductOnHand_CLASS_ID = Product_CLASS_ID + 1;
	static final int __LAST_CLASS_ID = ProductOnHand_CLASS_ID;

	public Portable create(int classId) {
		if (classId == Address_CLASS_ID) {
			return new Address();
		} else if (classId == Customer_CLASS_ID) {
			return new Customer();
		} else if (classId == Order_CLASS_ID) {
			return new Order();
		} else if (classId == Product_CLASS_ID) {
			return new Product();
		} else if (classId == ProductOnHand_CLASS_ID) {
			return new ProductOnHand();
		} else {
			return null;
		}
	}
}
