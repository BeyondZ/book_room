package com.yzx.model.admin;

import java.util.Date;


public class Checkin {
	private Long id;//��סid
	private Long roomId;//����id
	private Long roomTypeId;//����id
	private Float checkinPrice;//��ס�۸�

	private String name;//��ס������
	private String idCard;//���֤����
	private String mobile;//�ֻ���
	private int status;//״̬��0����ס�У�1���ѽ������
	private String arriveDate;//��ס����
	private String leaveDate;//�������
	private Date createTime;//����ʱ��
	private Long bookOrderId;//Ԥ������id����Ϊ��
	private String remark;

	public final static int IN_ARRIVED=0;
	public final static int IN_LEAVE=1;
}
