package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;


public class Upcriteria implements Parcelable
{

    private String docEntry;
    private String hostHeadEntry;
    private String id;
    private String criteria;
    private String criteriaDesc;
    private String standard;
    private String lineNumber;
    private String actualResult;
    private String valueType;
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
        this.docEntry = ((String) in.readValue((String.class.getClassLoader())));
        this.hostHeadEntry = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.criteria = ((String) in.readValue((String.class.getClassLoader())));
        this.criteriaDesc = ((String) in.readValue((String.class.getClassLoader())));
        this.standard = ((String) in.readValue((String.class.getClassLoader())));
        this.lineNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.actualResult = ((String) in.readValue((String.class.getClassLoader())));
        this.valueType = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Upcriteria() {
    }

    public String getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(String docEntry) {
        this.docEntry = docEntry;
    }

    public String getHostHeadEntry() {
        return hostHeadEntry;
    }

    public void setHostHeadEntry(String hostHeadEntry) {
        this.hostHeadEntry = hostHeadEntry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(docEntry);
        dest.writeValue(hostHeadEntry);
        dest.writeValue(id);
        dest.writeValue(criteria);
        dest.writeValue(criteriaDesc);
        dest.writeValue(standard);
        dest.writeValue(lineNumber);
        dest.writeValue(actualResult);
        dest.writeValue(valueType);
    }

    public int describeContents() {
        return 0;
    }

}


//public class Upcriteria implements Parcelable
//{
//
//    private int docEntry;
//    private Object lineNumber;
//    private Object criteria;
//    private Object criteriaDesc;
//    private Object valueType;
//    private Object standard;
//    private Object actualResult;
//    private Object actualRemarks;
//    private int hostHeadEntry;
//    private int id;
//    public final static Parcelable.Creator<Upcriteria> CREATOR = new Creator<Upcriteria>() {
//
//
//        @SuppressWarnings({
//                "unchecked"
//        })
//        public Upcriteria createFromParcel(Parcel in) {
//            return new Upcriteria(in);
//        }
//
//        public Upcriteria[] newArray(int size) {
//            return (new Upcriteria[size]);
//        }
//
//    }
//            ;
//
//    protected Upcriteria(Parcel in) {
//        this.docEntry = ((int) in.readValue((int.class.getClassLoader())));
//        this.lineNumber = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.criteria = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.criteriaDesc = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.valueType = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.standard = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.actualResult = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.actualRemarks = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.hostHeadEntry = ((int) in.readValue((int.class.getClassLoader())));
//        this.id = ((int) in.readValue((int.class.getClassLoader())));
//    }
//
//    public Upcriteria() {
//    }
//
//    public int getDocEntry() {
//        return docEntry;
//    }
//
//    public void setDocEntry(int docEntry) {
//        this.docEntry = docEntry;
//    }
//
//    public Object getLineNumber() {
//        return lineNumber;
//    }
//
//    public void setLineNumber(Object lineNumber) {
//        this.lineNumber = lineNumber;
//    }
//
//    public Object getCriteria() {
//        return criteria;
//    }
//
//    public void setCriteria(Object criteria) {
//        this.criteria = criteria;
//    }
//
//    public Object getCriteriaDesc() {
//        return criteriaDesc;
//    }
//
//    public void setCriteriaDesc(Object criteriaDesc) {
//        this.criteriaDesc = criteriaDesc;
//    }
//
//    public Object getValueType() {
//        return valueType;
//    }
//
//    public void setValueType(Object valueType) {
//        this.valueType = valueType;
//    }
//
//    public Object getStandard() {
//        return standard;
//    }
//
//    public void setStandard(Object standard) {
//        this.standard = standard;
//    }
//
//    public Object getActualResult() {
//        return actualResult;
//    }
//
//    public void setActualResult(Object actualResult) {
//        this.actualResult = actualResult;
//    }
//
//    public Object getActualRemarks() {
//        return actualRemarks;
//    }
//
//    public void setActualRemarks(Object actualRemarks) {
//        this.actualRemarks = actualRemarks;
//    }
//
//    public int getHostHeadEntry() {
//        return hostHeadEntry;
//    }
//
//    public void setHostHeadEntry(int hostHeadEntry) {
//        this.hostHeadEntry = hostHeadEntry;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeValue(docEntry);
//        dest.writeValue(lineNumber);
//        dest.writeValue(criteria);
//        dest.writeValue(criteriaDesc);
//        dest.writeValue(valueType);
//        dest.writeValue(standard);
//        dest.writeValue(actualResult);
//        dest.writeValue(actualRemarks);
//        dest.writeValue(hostHeadEntry);
//        dest.writeValue(id);
//    }
//
//    public int describeContents() {
//        return 0;
//    }
//
//
//}


