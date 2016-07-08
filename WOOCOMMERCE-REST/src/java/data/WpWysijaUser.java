/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Deschamps Sébastien
 */
@Entity
@Table(name = "wp_wysija_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpWysijaUser.findAll", query = "SELECT w FROM WpWysijaUser w"),
    @NamedQuery(name = "WpWysijaUser.findByUserId", query = "SELECT w FROM WpWysijaUser w WHERE w.userId = :userId"),
    @NamedQuery(name = "WpWysijaUser.findByWpuserId", query = "SELECT w FROM WpWysijaUser w WHERE w.wpuserId = :wpuserId"),
    @NamedQuery(name = "WpWysijaUser.findByEmail", query = "SELECT w FROM WpWysijaUser w WHERE w.email = :email"),
    @NamedQuery(name = "WpWysijaUser.findByFirstname", query = "SELECT w FROM WpWysijaUser w WHERE w.firstname = :firstname"),
    @NamedQuery(name = "WpWysijaUser.findByLastname", query = "SELECT w FROM WpWysijaUser w WHERE w.lastname = :lastname"),
    @NamedQuery(name = "WpWysijaUser.findByIp", query = "SELECT w FROM WpWysijaUser w WHERE w.ip = :ip"),
    @NamedQuery(name = "WpWysijaUser.findByConfirmedIp", query = "SELECT w FROM WpWysijaUser w WHERE w.confirmedIp = :confirmedIp"),
    @NamedQuery(name = "WpWysijaUser.findByConfirmedAt", query = "SELECT w FROM WpWysijaUser w WHERE w.confirmedAt = :confirmedAt"),
    @NamedQuery(name = "WpWysijaUser.findByLastOpened", query = "SELECT w FROM WpWysijaUser w WHERE w.lastOpened = :lastOpened"),
    @NamedQuery(name = "WpWysijaUser.findByLastClicked", query = "SELECT w FROM WpWysijaUser w WHERE w.lastClicked = :lastClicked"),
    @NamedQuery(name = "WpWysijaUser.findByKeyuser", query = "SELECT w FROM WpWysijaUser w WHERE w.keyuser = :keyuser"),
    @NamedQuery(name = "WpWysijaUser.findByCreatedAt", query = "SELECT w FROM WpWysijaUser w WHERE w.createdAt = :createdAt"),
    @NamedQuery(name = "WpWysijaUser.findByStatus", query = "SELECT w FROM WpWysijaUser w WHERE w.status = :status"),
    @NamedQuery(name = "WpWysijaUser.findByDomain", query = "SELECT w FROM WpWysijaUser w WHERE w.domain = :domain"),
    @NamedQuery(name = "WpWysijaUser.findByCf1", query = "SELECT w FROM WpWysijaUser w WHERE w.cf1 = :cf1")})
public class WpWysijaUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wpuser_id")
    private int wpuserId;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "confirmed_ip")
    private String confirmedIp;
    @Column(name = "confirmed_at")
    private Integer confirmedAt;
    @Column(name = "last_opened")
    private Integer lastOpened;
    @Column(name = "last_clicked")
    private Integer lastClicked;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "keyuser")
    private String keyuser;
    @Column(name = "created_at")
    private Integer createdAt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private short status;
    @Size(max = 255)
    @Column(name = "domain")
    private String domain;
    @Size(max = 100)
    @Column(name = "cf_1")
    private String cf1;

    public WpWysijaUser() {
    }

    public WpWysijaUser(Integer userId) {
        this.userId = userId;
    }

    public WpWysijaUser(Integer userId, int wpuserId, String email, String firstname, String lastname, String ip, String confirmedIp, String keyuser, short status) {
        this.userId = userId;
        this.wpuserId = wpuserId;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ip = ip;
        this.confirmedIp = confirmedIp;
        this.keyuser = keyuser;
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getWpuserId() {
        return wpuserId;
    }

    public void setWpuserId(int wpuserId) {
        this.wpuserId = wpuserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getConfirmedIp() {
        return confirmedIp;
    }

    public void setConfirmedIp(String confirmedIp) {
        this.confirmedIp = confirmedIp;
    }

    public Integer getConfirmedAt() {
        return confirmedAt;
    }

    public void setConfirmedAt(Integer confirmedAt) {
        this.confirmedAt = confirmedAt;
    }

    public Integer getLastOpened() {
        return lastOpened;
    }

    public void setLastOpened(Integer lastOpened) {
        this.lastOpened = lastOpened;
    }

    public Integer getLastClicked() {
        return lastClicked;
    }

    public void setLastClicked(Integer lastClicked) {
        this.lastClicked = lastClicked;
    }

    public String getKeyuser() {
        return keyuser;
    }

    public void setKeyuser(String keyuser) {
        this.keyuser = keyuser;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCf1() {
        return cf1;
    }

    public void setCf1(String cf1) {
        this.cf1 = cf1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WpWysijaUser)) {
            return false;
        }
        WpWysijaUser other = (WpWysijaUser) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.WpWysijaUser[ userId=" + userId + " ]";
    }
    
}
