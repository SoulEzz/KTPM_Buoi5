package com.example.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "chungnhan")
public class ChungNhan {
	
	@Column(name = "MaNV")
	private String MaNV;
	@Column(name = "MaMB")
	private String MaMB;
	
	public ChungNhan() {
		// TODO Auto-generated constructor stub
	}

	public ChungNhan(String maNV) {
		super();
		MaNV = maNV;
	}

	public ChungNhan(String maNV, String maMB) {
		super();
		MaNV = maNV;
		MaMB = maMB;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	public String getMaMB() {
		return MaMB;
	}

	public void setMaMB(String maMB) {
		MaMB = maMB;
	}

	@Override
	public String toString() {
		return "ChungNhan [MaNV=" + MaNV + ", MaMB=" + MaMB + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(MaMB, MaNV);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChungNhan other = (ChungNhan) obj;
		return Objects.equals(MaMB, other.MaMB) && Objects.equals(MaNV, other.MaNV);
	}
	
	
	
	
	
	
}
