package sho.dbtest;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shot_audit")
public class ShotAudit {
	private String dsid;
	
	@Column(name = "view_id")
    private String viewId;
	
	@Column(name = "view_date")
    private Date viewDate;
	
	@Column(name = "server_hostname")
    private String serverHostname;
	
	@Column(name = "client_ip")
    private String clientIp;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * @return the dsid
	 */
	public String getDsid() {
		return dsid;
	}

	/**
	 * @param dsid the dsid to set
	 */
	public void setDsid(String dsid) {
		this.dsid = dsid;
	}

	/**
	 * @return the viewId
	 */
	public String getViewId() {
		return viewId;
	}

	/**
	 * @param viewId the viewId to set
	 */
	public void setViewId(String viewId) {
		this.viewId = viewId;
	}

	/**
	 * @return the viewDate
	 */
	public Date getViewDate() {
		return viewDate;
	}

	/**
	 * @param viewDate the viewDate to set
	 */
	public void setViewDate(Date viewDate) {
		this.viewDate = viewDate;
	}

	/**
	 * @return the serverHostname
	 */
	public String getServerHostname() {
		return serverHostname;
	}

	/**
	 * @param serverHostname the serverHostname to set
	 */
	public void setServerHostname(String serverHostname) {
		this.serverHostname = serverHostname;
	}

	/**
	 * @return the clientIp
	 */
	public String getClientIp() {
		return clientIp;
	}

	/**
	 * @param clientIp the clientIp to set
	 */
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
}
