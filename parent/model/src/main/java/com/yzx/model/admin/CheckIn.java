package com.yzx.model.admin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CheckIn {
	private int id;//��סid
	private int roomId;//����id
	private Float checkinPrice;//��ס�۸�
	private int liveDays;
	private String name;//��ס������
	private String idCard;//���֤����
	private String phoneNum;//�ֻ���
	private int status;//״̬��0����ס�У�1���ѽ������
	private Date arriveDate;//��ס����
	private Date leaveDate;//�������
	private Date createTime;//����ʱ��
	private Integer bookOrderId;//Ԥ������id����Ϊ��
	private String remark;

	public final static int IN_ARRIVED=0;
	public final static int IN_LEAVE=1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public Float getCheckinPrice() {
		return checkinPrice;
	}

	public void setCheckinPrice(Float checkinPrice) {
		this.checkinPrice = checkinPrice;
	}

	public int getLiveDays() {
		//ʱ��ת����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = arriveDate;
		Date date2 = leaveDate;
		//��ת��������ʱ�����ת����Calendard����
		Calendar can1 = Calendar.getInstance();
		can1.setTime(date1);
		Calendar can2 = Calendar.getInstance();
		can2.setTime(date2);
		//�ó��������
		int year1 = can1.get(Calendar.YEAR);
		int year2 = can2.get(Calendar.YEAR);
		//����
		int days = 0;
		Calendar can = null;
		//���can1 < can2
		//��ȥС��ʱ������һ���Ѿ����˵�����
		//���ϴ��ʱ���ѹ�������
		if(can1.before(can2)){
			days -= can1.get(Calendar.DAY_OF_YEAR);
			days += can2.get(Calendar.DAY_OF_YEAR);
			can = can1;
		}else{
			days -= can2.get(Calendar.DAY_OF_YEAR);
			days += can1.get(Calendar.DAY_OF_YEAR);
			can = can2;
		}
		for (int i = 0; i < Math.abs(year2-year1); i++) {
			//��ȡС��ʱ�䵱ǰ���������
			days += can.getActualMaximum(Calendar.DAY_OF_YEAR);
			//�ټ�����һ�ꡣ
			can.add(Calendar.YEAR, 1);
		}
		return days;
	}

	public void setLiveDays(int liveDays) {
		this.liveDays = liveDays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(Date arriveDate) {
		this.arriveDate = arriveDate;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getBookOrderId() {
		return bookOrderId;
	}

	public void setBookOrderId(Integer bookOrderId) {
		this.bookOrderId = bookOrderId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
