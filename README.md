# 정보대 실내 지도
## master branch

평면도를 실제 지도에 맞춰서 얻은 좌표 값이 들어 있는 floor_imajery.json


층 별 실내지도의 정보를 담은 osminedit_1F ~ osminedit_5F.geojson
- 'type', 'id', 'level', 'name', 'nodes', 'door', 'entrance', 'height', 'layer' 등의 properties 포함

모든 층의 정보를 합병하는 merge_geojson.ipynb
- 모듈 및 라이브러리 가져오기(geopandas, os pandas)
- 디렉토리로부터 각 GeoJSON 파일 목록 가져오기
- GeoDataFrame 초기화
- 각 GeoJSON 파일을 GeoDataFrame에 추가 ('dtype' 매개변수를 사용하여 'geometry' 열의 데이터 유형을 명시적으로 'geopandas.array.GeometryDtype'으로 설정
  만약 'geometry' 열의 데이터 유형이 'geometry'가 아니라면, 'geometry' 데이터 유형으로 변환
  GeoDataFrame의 좌표 참조 시스템(CRS)을 설정, 만약 이미 설정되어 있지 않다면, 기본값으로 'epsg:4326'으로 사용
- 리스트에 저장된 여러 개의 GeoDataFrame을 하나의 GeoDataFrame으로 병합
- 'geometry'열의 데이터 유형을 표준 'geometry' 유형으로 변환
- GeoDataFrame을 하나의 GeoJSON 파일로 저장 ('driver' 매개변수를 사용하여 GeoJSON 포맷을 지정)

합병 후 정리된 실내지도 파일 output.geojson


앱을 구성하기 위한 데이터 파싱 코드가 들어있는 안드로이드 프로젝트 IndoorMap
- 앱에서 GeoJSON 파일을 읽기 위해 'AssetManager' 사용
- GeoJSON 데이터를 파싱하기 위해 JSON 파싱 라이브러리 사용
- Google Maps API 등의 지도 라이브러리를 이용해 지도에 해당 데이터를 표시할 예정

