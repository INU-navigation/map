package org.trueuu.indoormap;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import org.trueuu.indoormap.dataps.YourGeoJsonClass;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AssetManager를 사용하여 GeoJSON 파일 열기
        AssetManager assetManager = getAssets();
        try {
            InputStream inputStream = assetManager.open("your_geojson_file.geojson");

            // GeoJSON 파일을 Gson을 사용하여 파싱
            Gson gson = new Gson();
            Reader reader = new InputStreamReader(inputStream);
            YourGeoJsonClass geoJsonData = gson.fromJson(reader, YourGeoJsonClass.class);

            // geoJsonData를 사용하여 GeoJSON 데이터를 처리
            processGeoJsonData(geoJsonData);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processGeoJsonData(YourGeoJsonClass geoJsonData) {
        // geoJsonData를 사용하여 필요한 작업 수행(log 출력)
        Log.d("GeoJSON", "Type: " + geoJsonData.getType());

        List<YourGeoJsonClass.Feature> features = geoJsonData.getFeatures();
        for (YourGeoJsonClass.Feature feature : features) {
            YourGeoJsonClass.Properties properties = feature.getProperties();
            if (properties != null) {
                Log.d("GeoJSON", "Id: " + properties.getId());
                Log.d("GeoJSON", "Access: " + properties.getAccess());
            }
        }
    }
}