package org.hazelcast.addon.demo.debezium.data;

import java.io.IOException;


import com.hazelcast.nio.serialization.PortableReader;
import com.hazelcast.nio.serialization.PortableWriter;
import com.hazelcast.nio.serialization.VersionedPortable;

/**
  * Order is generated code. To modify this class, you must follow the
  * guidelines below.
  * <ul>
  * <li>Always add new fields and do NOT delete old fields.</li>
  * <li>If new fields have been added, then make sure to increment the version number.</li>
  * </ul>
  *
  * @generator com.netcrest.pado.tools.hazelcast.VersionedPortableClassGenerator
  * @schema debezium.inventory-orders.schema
  * @date Sun Mar 22 16:14:45 EDT 2020
**/
public class Order implements VersionedPortable
{
	private long orderNumber;
	private String orderDate;
	private long purchaser;
	private long quantity;
	private long productId;

	public Order()
	{
	}

	public void setOrderNumber(long orderNumber) {
		this.orderNumber=orderNumber;
	}

	public long getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate=orderDate;
	}

	public String getOrderDate() {
		return this.orderDate;
	}

	public void setPurchaser(long purchaser) {
		this.purchaser=purchaser;
	}

	public long getPurchaser() {
		return this.purchaser;
	}

	public void setQuantity(long quantity) {
		this.quantity=quantity;
	}

	public long getQuantity() {
		return this.quantity;
	}

	public void setProductId(long productId) {
		this.productId=productId;
	}

	public long getProductId() {
		return this.productId;
	}


	@Override
	public int getClassId() 
	{
		return PortableFactoryImpl.Order_CLASS_ID;
	}

	@Override
	public int getFactoryId() {
		return PortableFactoryImpl.FACTORY_ID;
	}
	
	@Override
	public int getClassVersion() {
		return 1;
	}

	@Override
	public void writePortable(PortableWriter writer) throws IOException {
		writer.writeLong("orderNumber", orderNumber);
		writer.writeUTF("orderDate", orderDate);
		writer.writeLong("purchaser", purchaser);
		writer.writeLong("quantity", quantity);
		writer.writeLong("productId", productId);
	}

	@Override
	public void readPortable(PortableReader reader) throws IOException {
		this.orderNumber = reader.readLong("orderNumber");
		this.orderDate = reader.readUTF("orderDate");
		this.purchaser = reader.readLong("purchaser");
		this.quantity = reader.readLong("quantity");
		this.productId = reader.readLong("productId");
	}
    
	@Override
	public String toString()
	{
		return "[orderDate=" + this.orderDate
			 + ", orderNumber=" + this.orderNumber
			 + ", productId=" + this.productId
			 + ", purchaser=" + this.purchaser
			 + ", quantity=" + this.quantity + "]";
	}
}
