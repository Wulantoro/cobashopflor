package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Upcriteria implements Parcelable
{

    private int docEntry;
    private Object lineNumber;
    private Object criteria;
    private Object criteriaDesc;
    private Object valueType;
    private Object standard;
    private Object actualResult;
    private Object actualRemarks;
    private int hostHeadEntry;
    private int id;
    public final static Parcelable.Creator<Upcriteria> CREATOR = new Creator<Upcriteria>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Upcriteria createFromParcel(Parcel in) {
            return new Upcriteria(in);
        }

        public Upcriteria[] newArray(int size) {
            return (new Upcriteria[size]);
        }

    }
            ;

    protected Upcriteria(Parcel in) {
        this.docEntry = ((int) in.readValue((int.class.getClassLoader())));
        this.lineNumber = ((Object) in.readValue((Object.class.getClassLoader())));
        this.criteria = ((Object) in.readValue((Object.class.getClassLoader())));
        this.criteriaDesc = ((Object) in.readValue((Object.class.getClassLoader())));
        this.valueType = ((Object) in.readValue((Object.class.getClassLoader())));
        this.standard = ((Object) in.readValue((Object.class.getClassLoader())));
        this.actualResult = ((Object) in.readValue((Object.class.getClassLoader())));
        this.actualRemarks = ((Object) in.readValue((Object.class.getClassLoader())));
        this.hostHeadEntry = ((int) in.readValue((int.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
    }

    public Upcriteria() {
    }

    public int getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(int docEntry) {
        this.docEntry = docEntry;
    }

    public Object getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Object lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Object getCriteria() {
        return criteria;
    }

    public void setCriteria(Object criteria) {
        this.criteria = criteria;
    }

    public Object getCriteriaDesc() {
        return criteriaDesc;
    }

    public void setCriteriaDesc(Object criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public Object getValueType() {
        return valueType;
    }

    public void setValueType(Object valueType) {
        this.valueType = valueType;
    }

    public Object getStandard() {
        return standard;
    }

    public void setStandard(Object standard) {
        this.standard = standard;
    }

    public Object getActualResult() {
        return actualResult;
    }

    public void setActualResult(Object actualResult) {
        this.actualResult = actualResult;
    }

    public Object getActualRemarks() {
        return actualRemarks;
    }

    public void setActualRemarks(Object actualRemarks) {
        this.actualRemarks = actualRemarks;
    }

    public int getHostHeadEntry() {
        return hostHeadEntry;
    }

    public void setHostHeadEntry(int hostHeadEntry) {
        this.hostHeadEntry = hostHeadEntry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(docEntry);
        dest.writeValue(lineNumber);
        dest.writeValue(criteria);
        dest.writeValue(criteriaDesc);
        dest.writeValue(valueType);
        dest.writeValue(standard);
        dest.writeValue(actualResult);
        dest.writeValue(actualRemarks);
        dest.writeValue(hostHeadEntry);
        dest.writeValue(id);
    }

    public int describeContents() {
        return 0;
    }


}
