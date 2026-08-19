package Collection;

import java.util.*;

class OrderInfo {
    private int orderId;
    private String customerId;
    private String cUstomerName;
    private String customerAddress;
    private String customerPhone;
    private String customerEmail;

    public OrderInfo() {
    }

    public OrderInfo(int orderId, String customerId, String cUstomerName, String customerAddress, String customerPhone,
            String customerEmail) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.cUstomerName = cUstomerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getcUstomerName() {
        return cUstomerName;
    }

    public void setcUstomerName(String cUstomerName) {
        this.cUstomerName = cUstomerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Override
    public String toString() {
        return "OrderInfo [orderId=" + orderId + ", customerId=" + customerId + ", cUstomerName=" + cUstomerName
                + ", customerAddress=" + customerAddress + ", customerPhone=" + customerPhone + ", customerEmail="
                + customerEmail + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + orderId;
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        result = prime * result + ((cUstomerName == null) ? 0 : cUstomerName.hashCode());
        result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
        result = prime * result + ((customerPhone == null) ? 0 : customerPhone.hashCode());
        result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderInfo other = (OrderInfo) obj;
        if (orderId != other.orderId)
            return false;
        if (customerId == null) {
            if (other.customerId != null)
                return false;
        } else if (!customerId.equals(other.customerId))
            return false;
        if (cUstomerName == null) {
            if (other.cUstomerName != null)
                return false;
        } else if (!cUstomerName.equals(other.cUstomerName))
            return false;
        if (customerAddress == null) {
            if (other.customerAddress != null)
                return false;
        } else if (!customerAddress.equals(other.customerAddress))
            return false;
        if (customerPhone == null) {
            if (other.customerPhone != null)
                return false;
        } else if (!customerPhone.equals(other.customerPhone))
            return false;
        if (customerEmail == null) {
            if (other.customerEmail != null)
                return false;
        } else if (!customerEmail.equals(other.customerEmail))
            return false;
        return true;
    }

}

public class HashMapMiniProject {
    public static void main(String[] args) {
        OrderInfo o1 = new OrderInfo(101, "C001", "Ujjwal Dhake", "Mumbai", "9876543210", "ujjwal@example.com");
        OrderInfo o2 = new OrderInfo(102, "C002", "Tejas Kolhe", "Pune", "9876543211", "tejas@example.com");
        OrderInfo o3 = new OrderInfo(103, "C003", "Jay Dhake", "Nashik", "9876543212", "jay@example.com");
        OrderInfo o4 = new OrderInfo(104, "C004", "Durvesh Kolhe", "Nagpur", "9876543213", "durvesh@example.com");
        OrderInfo o5 = new OrderInfo(105, "C005", "Yash Chir", "Delhi", "9876543214", "rahul@example.com");
        OrderInfo o6 = new OrderInfo(106, "C006", "Sneha Joshi", "Thane", "9876543215", "sneha@example.com");
        OrderInfo o7 = new OrderInfo(107, "C007", "Priya Sharma", "Bengaluru", "9876543216", "priya@example.com");
        OrderInfo o8 = new OrderInfo(108, "C008", "Amit Kumar", "Hyderabad", "9876543217", "amit@example.com");
        OrderInfo o9 = new OrderInfo(109, "C009", "Neha Singh", "Chennai", "9876543218", "neha@example.com");
        OrderInfo o10 = new OrderInfo(110, "C010", "Rohan Mehta", "Ahmedabad", "9876543219", "rohan@example.com");
        OrderInfo o11 = new OrderInfo(110, "C010", "Rohan Mehta", "Ahmedabad", "9876543219", "rohan@example.com");
        OrderInfo o12 = new OrderInfo(110, "C010", "Rohan Mehta", "Ahmedabad", "9876543219", "rohan@example.com");
        // HashMap<Integer, OrderInfo> orderinformation = new HashMap<>();
        // orderinformation.put(1, o1);
        // orderinformation.put(2, o2);
        // orderinformation.put(3, o3);
        // orderinformation.put(4, o4);
        // orderinformation.put(5, o5);
        // orderinformation.put(6, o6);
        // orderinformation.put(7, o7);
        // orderinformation.put(8, o8);
        // orderinformation.put(9, o9);
        // orderinformation.put(10, o10);
        // orderinformation.put(11, o10);

        // Set<Integer> allorderid = orderinformation.keySet();
        // for (Integer orderid : allorderid) {

        // System.out.println(orderinformation.get(orderid));

        // }
        // }
        // we can store duplicate object in this
        HashMap<OrderInfo, String> orderinformation = new HashMap<>();
        orderinformation.put(o10, "Delivered");
        System.out.println(orderinformation);
        orderinformation.put(o11, "Returned");
        System.out.println(orderinformation);
        orderinformation.put(o12, "Completed");
        System.out.println(orderinformation);

    }
}
