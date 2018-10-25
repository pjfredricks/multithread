package com.example.thread.multithread.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MediaItem {

    @Id
    @Column
    private String GlobalRank;

    @Column
    private String TldRank;

    @Column
    private String Domain;

    @Column
    private String TLD;

    @Column
    private String RefSubNets;

    @Column
    private String RefIPs;

    @Column
    private String IDN_Domain;

    @Column
    private String IDN_TLD;

    @Column
    private String PrevGlobalRank;

    @Column
    private String prevTldRank;

    @Column
    private String PrevRefSubNets;

    @Column
    private String PrevRefIPs;

    @Override
    public String toString() {
        return "MediaItem{" +
                "GlobalRank='" + GlobalRank + '\'' +
                ", TldRank='" + TldRank + '\'' +
                ", Domain='" + Domain + '\'' +
                ", TLD='" + TLD + '\'' +
                ", RefSubNets='" + RefSubNets + '\'' +
                ", RefIPs='" + RefIPs + '\'' +
                ", IDN_Domain='" + IDN_Domain + '\'' +
                ", IDN_TLD='" + IDN_TLD + '\'' +
                ", PrevGlobalRank='" + PrevGlobalRank + '\'' +
                ", prevTldRank='" + prevTldRank + '\'' +
                ", PrevRefSubNets='" + PrevRefSubNets + '\'' +
                ", PrevRefIPs='" + PrevRefIPs + '\'' +
                '}';
    }

    public String getGlobalRank() {
        return GlobalRank;
    }

    public void setGlobalRank(String globalRank) {
        GlobalRank = globalRank;
    }

    public String getTldRank() {
        return TldRank;
    }

    public void setTldRank(String tldRank) {
        TldRank = tldRank;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String domain) {
        Domain = domain;
    }

    public String getTLD() {
        return TLD;
    }

    public void setTLD(String TLD) {
        this.TLD = TLD;
    }

    public String getRefSubNets() {
        return RefSubNets;
    }

    public void setRefSubNets(String refSubNets) {
        RefSubNets = refSubNets;
    }

    public String getRefIPs() {
        return RefIPs;
    }

    public void setRefIPs(String refIPs) {
        RefIPs = refIPs;
    }

    public String getIDN_Domain() {
        return IDN_Domain;
    }

    public void setIDN_Domain(String IDN_Domain) {
        this.IDN_Domain = IDN_Domain;
    }

    public String getIDN_TLD() {
        return IDN_TLD;
    }

    public void setIDN_TLD(String IDN_TLD) {
        this.IDN_TLD = IDN_TLD;
    }

    public String getPrevGlobalRank() {
        return PrevGlobalRank;
    }

    public void setPrevGlobalRank(String prevGlobalRank) {
        PrevGlobalRank = prevGlobalRank;
    }

    public String getPrevTldRank() {
        return prevTldRank;
    }

    public void setPrevTldRank(String prevTldRank) {
        this.prevTldRank = prevTldRank;
    }

    public String getPrevRefSubNets() {
        return PrevRefSubNets;
    }

    public void setPrevRefSubNets(String prevRefSubNets) {
        PrevRefSubNets = prevRefSubNets;
    }

    public String getPrevRefIPs() {
        return PrevRefIPs;
    }

    public void setPrevRefIPs(String prevRefIPs) {
        PrevRefIPs = prevRefIPs;
    }
}
