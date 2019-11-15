package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    SharedPreferences prf;
    private Button btnFrag;
    private TextView tvdocentry0;
    private TextView tvdocnum1;
    private TextView tvprodcode0;
    private TextView tvnoprod1;
    private TextView tvnmprod1;
    private TextView tvprodplanqty0;
    private TextView tvprodstatus2;
    private TextView tvroutecode2;
    private TextView tvroutename2;
    private TextView tvsequence1;
    private TextView tvseqqty1;
    private TextView tvdocdate0;
    private TextView tvjammulai2;
    private TextView tvInputQty1;
    private TextView tvOutputQty1;
    private TextView tvworkcenter6;
    private TextView tvtglsel1;
    private TextView tvjamsel1;
    private TextView tvstatus0;
    private TextView tvposted7;
    private TextView tvusername8;
    private TextView tvqcname4;
    private TextView tvshift4;
    private TextView tvcodeshift4;
    private TextView tvtglmulai2;
    private TextView tvid5;
    private TextView tvmobileid0;

    private TextView tvdocentry7;
    private TextView tvdocnum2;
    private Gson gson;
//    private InputRejectAdapter adapter;
//    private OpenDocAdapter openDocAdapter;
//    private List<InputReject> list;
    private RecyclerView rv;
    private TextView tvnamawc6;
    private TextView tvPRDSPECD2;
    private ImageButton ibscan;
    private TextView tvip10;
    private TextView tvdocentry01;
    private TextView tvid7;
    private InputCriteriaAdapter inputCriteriaAdapter;
    private TextView docsap0;
    private static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvdocentry0 = findViewById(R.id.tvdocentry0);
        tvdocnum1 = findViewById(R.id.tvdocnum1);
        tvprodcode0 = findViewById(R.id.tvprodcode0);
        tvnoprod1 = findViewById(R.id.tvnoprod1);
        tvnmprod1 = findViewById(R.id.tvnmprod1);
        tvprodplanqty0 = findViewById(R.id.tvprodplanqty0);
        tvprodstatus2 = findViewById(R.id.tvprodstatus2);
        tvroutecode2 = findViewById(R.id.tvroutecode2);
        tvroutename2 = findViewById(R.id.tvroutename2);
        tvsequence1 = findViewById(R.id.tvsequence1);
        tvseqqty1 = findViewById(R.id.tvseqqty1);
        tvdocdate0 = findViewById(R.id.tvdocdate0);
        tvjammulai2 = findViewById(R.id.tvjammulai2);
        tvInputQty1 = findViewById(R.id.tvInputQty1);
        tvOutputQty1 = findViewById(R.id.tvOutputQty1);
        tvworkcenter6 = findViewById(R.id.tvworkcenter6);
        tvtglsel1 = findViewById(R.id.tvtglsel1);
        tvjamsel1 = findViewById(R.id.tvjamsel1);
        tvstatus0 = findViewById(R.id.tvstatus0);
        tvposted7 = findViewById(R.id.tvposted7);
        tvusername8 = findViewById(R.id.tvusername8);
        tvqcname4 = findViewById(R.id.tvqcname4);
        tvshift4 = findViewById(R.id.tvshift4);
        tvcodeshift4 = findViewById(R.id.tvcodeshift4);
//        tvtglmulai2 = findViewById(R.id.tvtglmulai2);
        tvdocnum2 = findViewById(R.id.tvdocnum2);
        tvdocentry7 = findViewById(R.id.tvdocentry7);
        tvnamawc6 = findViewById(R.id.tvnamawc6);
        ibscan = findViewById(R.id.ibscan);
        tvid5 = findViewById(R.id.tvid5);
        tvmobileid0 = findViewById(R.id.tvmobileid0);
        tvip10 = findViewById(R.id.tvip10);
//        tvdocentry01 = findViewById(R.id.tvdocentry01);
        tvid7 = findViewById(R.id.tvid7);
        docsap0 = findViewById(R.id.docsap0);


//        openDocAdapter = new OpenDocAdapter(this);
//        inputCriteriaAdapter = new InputCriteriaAdapter(this);

        gson = new Gson();


        tvmobileid0.setText(Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID));

        TextView tvdocentot = findViewById(R.id.tvid7);
        tvdocentot.setText(String.valueOf(543));

        TextView tvdocnum = findViewById(R.id.tvdocnum1);
        tvdocnum.setText("S20191115");


        TextView tvusername = findViewById(R.id.tvusername8);
        tvusername.setText("NUGROHO");

        TextView tvworkcenter = findViewById(R.id.tvworkcenter6);
        tvworkcenter.setText("ASSEMBLING");

        TextView tvjammulai = findViewById(R.id.tvjammulai2);
        tvjammulai.setText("09:19");

        TextView tvdocdate = findViewById(R.id.tvdocdate0);
        tvdocdate.setText("2018-01-12 16:19:21.000");

        TextView tvroutename = findViewById(R.id.tvroutename2);
        tvroutename.setText("INJ120");

        TextView tvroutecode = findViewById(R.id.tvroutecode2);
        tvroutecode.setText("R005");

        TextView tvprodstatus = findViewById(R.id.tvprodstatus2);
        tvprodstatus.setText("r");

        TextView tvprodplanqty = findViewById(R.id.tvprodplanqty0);
        tvprodplanqty.setText("3268.000000");

        TextView tvprodcode = findViewById(R.id.tvprodcode0);
        tvprodcode.setText("6-02-0128");

        TextView tvdocentry = findViewById(R.id.tvdocentry0);
        tvdocentry.setText(String.valueOf(1));


        TextView tvidd = findViewById(R.id.tvid5);
        tvidd.setText(String.valueOf(1));

        /*****************qtyin**********************/
        TextView inqty = findViewById(R.id.tvInputQty1);
        inqty.setText("307.000000");

        /*****************************qtyout***************************/
        TextView outqty = findViewById(R.id.tvOutputQty1);
        outqty.setText("307.000000");


        /********************************nmprod*******************************/
        TextView tvnmprod = findViewById(R.id.tvnmprod1);
        tvnmprod.setText("COVER METER (61303-K84A-9000)(WIP)");

        /****************************sequence************************************/
        TextView tvsequence = findViewById(R.id.tvsequence1);
        tvsequence.setText("2");

        /***************************sequenceqty**********************************/
        TextView tvsequenceqty = findViewById(R.id.tvseqqty1);
        tvsequenceqty.setText("3600");

        /*******************tglsel*************************************************/
        TextView tglsel = findViewById(R.id.tvtglsel1);
        tglsel.setText("2018-01-12 16:24:15");

        /******************************jamsel*********************************/
        TextView jamsel = findViewById(R.id.tvjamsel1);
        jamsel.setText("09:24");

        TextView tvdocsts = findViewById(R.id.tvdocsts2);
        tvdocsts.setText("Completed");

        TextView tvshift = findViewById(R.id.tvshift4);
        tvshift.setText("JmS1");

        TextView tvcodesh = findViewById(R.id.tvcodeshift4);
        tvcodesh.setText("Jumat - Shift 1");

        TextView tvstatus = findViewById(R.id.tvstatus0);
        tvstatus.setText("Completed");

        TextView tvposted = findViewById(R.id.tvdocsts2);
        tvposted.setText("Pending1");

        inputCriteriaAdapter = new InputCriteriaAdapter(this);

        loadCriteriaIsi(tvid7.getText().toString());

        ibscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpan();
            }
        });
    }

    private void loadCriteriaIsi(String hostHeadEntry) {

        Log.e(TAG, "host " + hostHeadEntry);
        Log.e(TAG, "crit " + GlobalVars.BASE_IP + "index.php/upcriteria?hostHeadEntry=" + hostHeadEntry);

            AndroidNetworking.get(GlobalVars.BASE_IP + "index.php/upcriteria?hostHeadEntry=" + hostHeadEntry)
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .getAsJSONObject(new JSONObjectRequestListener() {
                        @Override
                        public void onResponse(JSONObject response) {
                            List<Upcriteria> result = new ArrayList<>();
                            try {
                                Log.e(TAG,"criteria = "+ response.toString(1));
                                if (result != null)
                                    result.clear();

                                String message = response.getString("message");

                                if (message.equals("Criteria were found")) {
                                    String records = response.getString("data");

                                    JSONArray dataArr = new JSONArray(records);

                                    if (dataArr.length() > 0) {
                                        for (int i = 0; i < dataArr.length(); i++) {
                                            Upcriteria upcriteria = gson.fromJson(dataArr.getJSONObject(i).toString(), Upcriteria.class);
                                            result.add(upcriteria);

                                        }
                                    }
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            inputCriteriaAdapter.addAll(result);

                        }

                        @Override
                        public void onError(ANError anError) {

                        }
                    });
        }



    private void simpan() {

        JSONObject jsonObject = new JSONObject();
        try {
            JSONArray newArr = new JSONArray();
//            jsonObject.put("docEntry", tvdocentry0.getText().toString());
            jsonObject.put("docNum", tvdocnum1.getText().toString());
//            jsonObject.put("prodNo", tvnoprod1.getText().toString());
//            jsonObject.put("prodCode", tvprodcode0.getText().toString());
//            jsonObject.put("prodName", tvnmprod1.getText().toString());
//            jsonObject.put("prodPlanQty", tvprodplanqty0.getText().toString());
//            jsonObject.put("prodStatus", tvprodstatus2.getText().toString());
//            jsonObject.put("routeCode", tvroutecode2.getText().toString());
//            jsonObject.put("routeName", tvroutename2.getText().toString());
//            jsonObject.put("sequence", tvsequence1.getText().toString());
//            jsonObject.put("sequenceQty", tvseqqty1.getText().toString());
//            jsonObject.put("shiftName", tvshift4.getText().toString());
//            jsonObject.put("shift", tvcodeshift4.getText().toString());
//            jsonObject.put("docDate", tvdocdate0.getText().toString());
//            jsonObject.put("tanggalMulai", tvdocdate0.getText().toString());
//            jsonObject.put("jamMulai", tvjammulai2.getText().toString());
//            jsonObject.put("inQty", tvInputQty1.getText().toString());
//            jsonObject.put("outQty", tvOutputQty1.getText().toString());
//            jsonObject.put("workCenter", tvworkcenter6.getText().toString());
////            jsonObject.put("tanggalSelesai", tvtglsel1.getText().toString());
////            jsonObject.put("jamSelesai", tvjamsel1.getText().toString());
////            jsonObject.put("status", tvstatus0.getText().toString());
//            jsonObject.put("posted", tvposted7.getText().toString());
////            jsonObject.put("UploadTime", tvjamsel1.getText().toString()); muncul otomatis
////            jsonObject.put("QcName", tvqcname4.getText().toString());
//            jsonObject.put("userId", tvusername8.getText().toString());
            jsonObject.put("id", tvid5.getText().toString());
//            jsonObject.put("mobileId", tvmobileid0.getText().toString());

            newArr.put(jsonObject);
            Log.e(TAG, "coba input header" + newArr.toString(1));
            Log.e(TAG, "id 5 >> " + tvid5.getText().toString());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        String element1 = gson.toJson(
                    inputCriteriaAdapter.getData(),
                    new TypeToken<ArrayList<Upcriteria>>() {

                    }.getType());

            try {
                JSONArray array = new JSONArray(element1);
//                Log.e("arrraaayyyy = ", array.toString(1));

                JSONArray newArr = new JSONArray();

                for (int i = 0; i < array.length(); i++) {
                    Upcriteria upcriteria = gson.fromJson(array.getJSONObject(i).toString(), Upcriteria.class);

                    JSONObject object = new JSONObject();
                    object.put("hostHeadEntry", upcriteria.getHostHeadEntry());
                    object.put("id", upcriteria.getId());
                    object.put("criteria", upcriteria.getCriteria());
                    object.put("criteriaDesc", upcriteria.getCriteriaDesc());
                    object.put("standard", upcriteria.getStandard());
                    object.put("lineNumber", upcriteria.getLineNumber());
                    object.put("actualResult", upcriteria.getActualResult());
                    object.put("valueType", upcriteria.getValueType());

                    newArr.put(object);
                }
                Log.e("input crit ", newArr.toString(1));
//                simpanSincCriteria(newArr);
//                simpanSincreject(newArr);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        AndroidNetworking.post(GlobalVars.BASE_IP + "index.php/UploadSap")
                    .addJSONObjectBody(jsonObject)
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .getAsJSONObject(new JSONObjectRequestListener() {
                        @Override
                        public void onResponse(JSONObject response) {
                            try {
                                String message = response.getString("message");
                                Toasty.success(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                            } catch (JSONException e) {
                                e.printStackTrace();
                                Toast.makeText(getApplicationContext(), "JSONExceptions" + e, Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onError(ANError anError) {
                            Toasty.error(getApplicationContext(), "Gagal menambah data", Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }

