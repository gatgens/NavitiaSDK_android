# navitia-sdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.kisio.sdk</groupId>
    <artifactId>navitia-sdk</artifactId>
    <version>1.3.3</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.kisio.sdk:navitia-sdk:1.3.3"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/navitia-sdk-1.3.3.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import org.kisio.NavitiaSDK.NavitiaConfiguration;
import org.kisio.NavitiaSDK.NavitiaSDK;
import org.kisio.NavitiaSDK.invokers.ApiCallback;
import org.kisio.NavitiaSDK.invokers.ApiException;
import org.kisio.NavitiaSDK.models.Journey;
import org.kisio.NavitiaSDK.models.Journeys;

import java.util.List;
import java.util.Map;

public class JourneysApiExample {

    public static void main(String[] args) {
        try {
            NavitiaSDK sdk = new NavitiaSDK(new NavitiaConfiguration("my-token"));
            sdk.journeysApi.newJourneysRequestBuilder()
                .withFrom("2.38;48.84")
                .withTo("2.29;48.82")
                .get(new ApiCallback<Journeys>() {
                    @Override
                    public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                        
                    }
                    @Override
                    public void onSuccess(Journeys result, int statusCode, Map<String, List<String>> responseHeaders) {
                        List<Journey> journeys = result.getJourneys();
                    }
                    @Override
                    public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {

                    }
                    @Override
                    public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {

                    }
                });
        } catch (Exception e) {
            
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.navitia.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddressesApi* | [**getCoverageLonLatAddresses**](docs/AddressesApi.md#getCoverageLonLatAddresses) | **GET** /coverage/{lon};{lat}/addresses | 
*AddressesApi* | [**getCoverageLonLatAddressesId**](docs/AddressesApi.md#getCoverageLonLatAddressesId) | **GET** /coverage/{lon};{lat}/addresses/{id} | 
*AddressesApi* | [**getCoverageLonLatUriAddresses**](docs/AddressesApi.md#getCoverageLonLatUriAddresses) | **GET** /coverage/{lon};{lat}/{uri}/addresses | 
*AddressesApi* | [**getCoverageLonLatUriAddressesId**](docs/AddressesApi.md#getCoverageLonLatUriAddressesId) | **GET** /coverage/{lon};{lat}/{uri}/addresses/{id} | 
*AddressesApi* | [**getCoverageRegionAddresses**](docs/AddressesApi.md#getCoverageRegionAddresses) | **GET** /coverage/{region}/addresses | 
*AddressesApi* | [**getCoverageRegionAddressesId**](docs/AddressesApi.md#getCoverageRegionAddressesId) | **GET** /coverage/{region}/addresses/{id} | 
*AddressesApi* | [**getCoverageRegionUriAddresses**](docs/AddressesApi.md#getCoverageRegionUriAddresses) | **GET** /coverage/{region}/{uri}/addresses | 
*AddressesApi* | [**getCoverageRegionUriAddressesId**](docs/AddressesApi.md#getCoverageRegionUriAddressesId) | **GET** /coverage/{region}/{uri}/addresses/{id} | 
*CalendarsApi* | [**getCoverageLonLatCalendars**](docs/CalendarsApi.md#getCoverageLonLatCalendars) | **GET** /coverage/{lon};{lat}/calendars | 
*CalendarsApi* | [**getCoverageLonLatCalendarsId**](docs/CalendarsApi.md#getCoverageLonLatCalendarsId) | **GET** /coverage/{lon};{lat}/calendars/{id} | 
*CalendarsApi* | [**getCoverageLonLatUriCalendars**](docs/CalendarsApi.md#getCoverageLonLatUriCalendars) | **GET** /coverage/{lon};{lat}/{uri}/calendars | 
*CalendarsApi* | [**getCoverageRegionCalendars**](docs/CalendarsApi.md#getCoverageRegionCalendars) | **GET** /coverage/{region}/calendars | 
*CalendarsApi* | [**getCoverageRegionCalendarsId**](docs/CalendarsApi.md#getCoverageRegionCalendarsId) | **GET** /coverage/{region}/calendars/{id} | 
*CalendarsApi* | [**getCoverageRegionUriCalendars**](docs/CalendarsApi.md#getCoverageRegionUriCalendars) | **GET** /coverage/{region}/{uri}/calendars | 
*CommercialModesApi* | [**getCoverageLonLatCommercialModes**](docs/CommercialModesApi.md#getCoverageLonLatCommercialModes) | **GET** /coverage/{lon};{lat}/commercial_modes | 
*CommercialModesApi* | [**getCoverageLonLatCommercialModesId**](docs/CommercialModesApi.md#getCoverageLonLatCommercialModesId) | **GET** /coverage/{lon};{lat}/commercial_modes/{id} | 
*CommercialModesApi* | [**getCoverageLonLatUriCommercialModes**](docs/CommercialModesApi.md#getCoverageLonLatUriCommercialModes) | **GET** /coverage/{lon};{lat}/{uri}/commercial_modes | 
*CommercialModesApi* | [**getCoverageLonLatUriCommercialModesId**](docs/CommercialModesApi.md#getCoverageLonLatUriCommercialModesId) | **GET** /coverage/{lon};{lat}/{uri}/commercial_modes/{id} | 
*CommercialModesApi* | [**getCoverageRegionCommercialModes**](docs/CommercialModesApi.md#getCoverageRegionCommercialModes) | **GET** /coverage/{region}/commercial_modes | 
*CommercialModesApi* | [**getCoverageRegionCommercialModesId**](docs/CommercialModesApi.md#getCoverageRegionCommercialModesId) | **GET** /coverage/{region}/commercial_modes/{id} | 
*CommercialModesApi* | [**getCoverageRegionUriCommercialModes**](docs/CommercialModesApi.md#getCoverageRegionUriCommercialModes) | **GET** /coverage/{region}/{uri}/commercial_modes | 
*CommercialModesApi* | [**getCoverageRegionUriCommercialModesId**](docs/CommercialModesApi.md#getCoverageRegionUriCommercialModesId) | **GET** /coverage/{region}/{uri}/commercial_modes/{id} | 
*CompaniesApi* | [**getCoverageLonLatCompanies**](docs/CompaniesApi.md#getCoverageLonLatCompanies) | **GET** /coverage/{lon};{lat}/companies | 
*CompaniesApi* | [**getCoverageLonLatCompaniesId**](docs/CompaniesApi.md#getCoverageLonLatCompaniesId) | **GET** /coverage/{lon};{lat}/companies/{id} | 
*CompaniesApi* | [**getCoverageLonLatUriCompanies**](docs/CompaniesApi.md#getCoverageLonLatUriCompanies) | **GET** /coverage/{lon};{lat}/{uri}/companies | 
*CompaniesApi* | [**getCoverageLonLatUriCompaniesId**](docs/CompaniesApi.md#getCoverageLonLatUriCompaniesId) | **GET** /coverage/{lon};{lat}/{uri}/companies/{id} | 
*CompaniesApi* | [**getCoverageRegionCompanies**](docs/CompaniesApi.md#getCoverageRegionCompanies) | **GET** /coverage/{region}/companies | 
*CompaniesApi* | [**getCoverageRegionCompaniesId**](docs/CompaniesApi.md#getCoverageRegionCompaniesId) | **GET** /coverage/{region}/companies/{id} | 
*CompaniesApi* | [**getCoverageRegionUriCompanies**](docs/CompaniesApi.md#getCoverageRegionUriCompanies) | **GET** /coverage/{region}/{uri}/companies | 
*CompaniesApi* | [**getCoverageRegionUriCompaniesId**](docs/CompaniesApi.md#getCoverageRegionUriCompaniesId) | **GET** /coverage/{region}/{uri}/companies/{id} | 
*ContributorsApi* | [**getCoverageLonLatContributors**](docs/ContributorsApi.md#getCoverageLonLatContributors) | **GET** /coverage/{lon};{lat}/contributors | 
*ContributorsApi* | [**getCoverageLonLatContributorsId**](docs/ContributorsApi.md#getCoverageLonLatContributorsId) | **GET** /coverage/{lon};{lat}/contributors/{id} | 
*ContributorsApi* | [**getCoverageLonLatUriContributors**](docs/ContributorsApi.md#getCoverageLonLatUriContributors) | **GET** /coverage/{lon};{lat}/{uri}/contributors | 
*ContributorsApi* | [**getCoverageLonLatUriContributorsId**](docs/ContributorsApi.md#getCoverageLonLatUriContributorsId) | **GET** /coverage/{lon};{lat}/{uri}/contributors/{id} | 
*ContributorsApi* | [**getCoverageRegionContributors**](docs/ContributorsApi.md#getCoverageRegionContributors) | **GET** /coverage/{region}/contributors | 
*ContributorsApi* | [**getCoverageRegionContributorsId**](docs/ContributorsApi.md#getCoverageRegionContributorsId) | **GET** /coverage/{region}/contributors/{id} | 
*ContributorsApi* | [**getCoverageRegionUriContributors**](docs/ContributorsApi.md#getCoverageRegionUriContributors) | **GET** /coverage/{region}/{uri}/contributors | 
*ContributorsApi* | [**getCoverageRegionUriContributorsId**](docs/ContributorsApi.md#getCoverageRegionUriContributorsId) | **GET** /coverage/{region}/{uri}/contributors/{id} | 
*CoordApi* | [**getCoordLonLat**](docs/CoordApi.md#getCoordLonLat) | **GET** /coord/{lon};{lat}/ | 
*CoordApi* | [**getCoordsLonLat**](docs/CoordApi.md#getCoordsLonLat) | **GET** /coords/{lon};{lat}/ | 
*CoordsApi* | [**getCoverageLonLatCoord**](docs/CoordsApi.md#getCoverageLonLatCoord) | **GET** /coverage/{lon};{lat}/coord | 
*CoordsApi* | [**getCoverageLonLatCoordId**](docs/CoordsApi.md#getCoverageLonLatCoordId) | **GET** /coverage/{lon};{lat}/coord/{id} | 
*CoordsApi* | [**getCoverageLonLatCoords**](docs/CoordsApi.md#getCoverageLonLatCoords) | **GET** /coverage/{lon};{lat}/coords | 
*CoordsApi* | [**getCoverageLonLatCoordsId**](docs/CoordsApi.md#getCoverageLonLatCoordsId) | **GET** /coverage/{lon};{lat}/coords/{id} | 
*CoordsApi* | [**getCoverageLonLatUriCoord**](docs/CoordsApi.md#getCoverageLonLatUriCoord) | **GET** /coverage/{lon};{lat}/{uri}/coord | 
*CoordsApi* | [**getCoverageLonLatUriCoordId**](docs/CoordsApi.md#getCoverageLonLatUriCoordId) | **GET** /coverage/{lon};{lat}/{uri}/coord/{id} | 
*CoordsApi* | [**getCoverageLonLatUriCoords**](docs/CoordsApi.md#getCoverageLonLatUriCoords) | **GET** /coverage/{lon};{lat}/{uri}/coords | 
*CoordsApi* | [**getCoverageLonLatUriCoordsId**](docs/CoordsApi.md#getCoverageLonLatUriCoordsId) | **GET** /coverage/{lon};{lat}/{uri}/coords/{id} | 
*CoordsApi* | [**getCoverageRegionCoord**](docs/CoordsApi.md#getCoverageRegionCoord) | **GET** /coverage/{region}/coord | 
*CoordsApi* | [**getCoverageRegionCoordId**](docs/CoordsApi.md#getCoverageRegionCoordId) | **GET** /coverage/{region}/coord/{id} | 
*CoordsApi* | [**getCoverageRegionCoords**](docs/CoordsApi.md#getCoverageRegionCoords) | **GET** /coverage/{region}/coords | 
*CoordsApi* | [**getCoverageRegionCoordsId**](docs/CoordsApi.md#getCoverageRegionCoordsId) | **GET** /coverage/{region}/coords/{id} | 
*CoordsApi* | [**getCoverageRegionUriCoord**](docs/CoordsApi.md#getCoverageRegionUriCoord) | **GET** /coverage/{region}/{uri}/coord | 
*CoordsApi* | [**getCoverageRegionUriCoordId**](docs/CoordsApi.md#getCoverageRegionUriCoordId) | **GET** /coverage/{region}/{uri}/coord/{id} | 
*CoordsApi* | [**getCoverageRegionUriCoords**](docs/CoordsApi.md#getCoverageRegionUriCoords) | **GET** /coverage/{region}/{uri}/coords | 
*CoordsApi* | [**getCoverageRegionUriCoordsId**](docs/CoordsApi.md#getCoverageRegionUriCoordsId) | **GET** /coverage/{region}/{uri}/coords/{id} | 
*CoverageApi* | [**getCoverage**](docs/CoverageApi.md#getCoverage) | **GET** /coverage/ | 
*CoverageApi* | [**getCoverageLonLat**](docs/CoverageApi.md#getCoverageLonLat) | **GET** /coverage/{lon};{lat}/ | 
*CoverageApi* | [**getCoverageRegion**](docs/CoverageApi.md#getCoverageRegion) | **GET** /coverage/{region}/ | 
*DatasetsApi* | [**getCoverageLonLatDatasets**](docs/DatasetsApi.md#getCoverageLonLatDatasets) | **GET** /coverage/{lon};{lat}/datasets | 
*DatasetsApi* | [**getCoverageLonLatDatasetsId**](docs/DatasetsApi.md#getCoverageLonLatDatasetsId) | **GET** /coverage/{lon};{lat}/datasets/{id} | 
*DatasetsApi* | [**getCoverageLonLatUriDatasets**](docs/DatasetsApi.md#getCoverageLonLatUriDatasets) | **GET** /coverage/{lon};{lat}/{uri}/datasets | 
*DatasetsApi* | [**getCoverageLonLatUriDatasetsId**](docs/DatasetsApi.md#getCoverageLonLatUriDatasetsId) | **GET** /coverage/{lon};{lat}/{uri}/datasets/{id} | 
*DatasetsApi* | [**getCoverageRegionDatasets**](docs/DatasetsApi.md#getCoverageRegionDatasets) | **GET** /coverage/{region}/datasets | 
*DatasetsApi* | [**getCoverageRegionDatasetsId**](docs/DatasetsApi.md#getCoverageRegionDatasetsId) | **GET** /coverage/{region}/datasets/{id} | 
*DatasetsApi* | [**getCoverageRegionUriDatasets**](docs/DatasetsApi.md#getCoverageRegionUriDatasets) | **GET** /coverage/{region}/{uri}/datasets | 
*DatasetsApi* | [**getCoverageRegionUriDatasetsId**](docs/DatasetsApi.md#getCoverageRegionUriDatasetsId) | **GET** /coverage/{region}/{uri}/datasets/{id} | 
*DisruptionsApi* | [**getCoverageLonLatDisruptions**](docs/DisruptionsApi.md#getCoverageLonLatDisruptions) | **GET** /coverage/{lon};{lat}/disruptions | 
*DisruptionsApi* | [**getCoverageLonLatDisruptionsId**](docs/DisruptionsApi.md#getCoverageLonLatDisruptionsId) | **GET** /coverage/{lon};{lat}/disruptions/{id} | 
*DisruptionsApi* | [**getCoverageLonLatUriDisruptions**](docs/DisruptionsApi.md#getCoverageLonLatUriDisruptions) | **GET** /coverage/{lon};{lat}/{uri}/disruptions | 
*DisruptionsApi* | [**getCoverageLonLatUriDisruptionsId**](docs/DisruptionsApi.md#getCoverageLonLatUriDisruptionsId) | **GET** /coverage/{lon};{lat}/{uri}/disruptions/{id} | 
*DisruptionsApi* | [**getCoverageRegionDisruptions**](docs/DisruptionsApi.md#getCoverageRegionDisruptions) | **GET** /coverage/{region}/disruptions | 
*DisruptionsApi* | [**getCoverageRegionDisruptionsId**](docs/DisruptionsApi.md#getCoverageRegionDisruptionsId) | **GET** /coverage/{region}/disruptions/{id} | 
*DisruptionsApi* | [**getCoverageRegionUriDisruptions**](docs/DisruptionsApi.md#getCoverageRegionUriDisruptions) | **GET** /coverage/{region}/{uri}/disruptions | 
*DisruptionsApi* | [**getCoverageRegionUriDisruptionsId**](docs/DisruptionsApi.md#getCoverageRegionUriDisruptionsId) | **GET** /coverage/{region}/{uri}/disruptions/{id} | 
*EquipmentReportsApi* | [**getCoordLonLatEquipmentReports**](docs/EquipmentReportsApi.md#getCoordLonLatEquipmentReports) | **GET** /coord/{lon};{lat}/equipment_reports | 
*EquipmentReportsApi* | [**getCoordsLonLatEquipmentReports**](docs/EquipmentReportsApi.md#getCoordsLonLatEquipmentReports) | **GET** /coords/{lon};{lat}/equipment_reports | 
*EquipmentReportsApi* | [**getCoverageLonLatEquipmentReports**](docs/EquipmentReportsApi.md#getCoverageLonLatEquipmentReports) | **GET** /coverage/{lon};{lat}/equipment_reports | 
*EquipmentReportsApi* | [**getCoverageLonLatUriEquipmentReports**](docs/EquipmentReportsApi.md#getCoverageLonLatUriEquipmentReports) | **GET** /coverage/{lon};{lat}/{uri}/equipment_reports | 
*EquipmentReportsApi* | [**getCoverageRegionEquipmentReports**](docs/EquipmentReportsApi.md#getCoverageRegionEquipmentReports) | **GET** /coverage/{region}/equipment_reports | 
*EquipmentReportsApi* | [**getCoverageRegionUriEquipmentReports**](docs/EquipmentReportsApi.md#getCoverageRegionUriEquipmentReports) | **GET** /coverage/{region}/{uri}/equipment_reports | 
*GeoStatusApi* | [**getCoverageLonLatGeoStatus**](docs/GeoStatusApi.md#getCoverageLonLatGeoStatus) | **GET** /coverage/{lon};{lat}/_geo_status | 
*GeoStatusApi* | [**getCoverageRegionGeoStatus**](docs/GeoStatusApi.md#getCoverageRegionGeoStatus) | **GET** /coverage/{region}/_geo_status | 
*GraphicalIsochroneApi* | [**getCoverageLonLatIsochrones**](docs/GraphicalIsochroneApi.md#getCoverageLonLatIsochrones) | **GET** /coverage/{lon};{lat}/isochrones | 
*GraphicalIsochroneApi* | [**getCoverageRegionIsochrones**](docs/GraphicalIsochroneApi.md#getCoverageRegionIsochrones) | **GET** /coverage/{region}/isochrones | 
*HeatMapApi* | [**getCoverageLonLatHeatMaps**](docs/HeatMapApi.md#getCoverageLonLatHeatMaps) | **GET** /coverage/{lon};{lat}/heat_maps | 
*HeatMapApi* | [**getCoverageRegionHeatMaps**](docs/HeatMapApi.md#getCoverageRegionHeatMaps) | **GET** /coverage/{region}/heat_maps | 
*JourneyPatternPointsApi* | [**getCoverageLonLatJourneyPatternPoints**](docs/JourneyPatternPointsApi.md#getCoverageLonLatJourneyPatternPoints) | **GET** /coverage/{lon};{lat}/journey_pattern_points | 
*JourneyPatternPointsApi* | [**getCoverageLonLatJourneyPatternPointsId**](docs/JourneyPatternPointsApi.md#getCoverageLonLatJourneyPatternPointsId) | **GET** /coverage/{lon};{lat}/journey_pattern_points/{id} | 
*JourneyPatternPointsApi* | [**getCoverageLonLatUriJourneyPatternPoints**](docs/JourneyPatternPointsApi.md#getCoverageLonLatUriJourneyPatternPoints) | **GET** /coverage/{lon};{lat}/{uri}/journey_pattern_points | 
*JourneyPatternPointsApi* | [**getCoverageLonLatUriJourneyPatternPointsId**](docs/JourneyPatternPointsApi.md#getCoverageLonLatUriJourneyPatternPointsId) | **GET** /coverage/{lon};{lat}/{uri}/journey_pattern_points/{id} | 
*JourneyPatternPointsApi* | [**getCoverageRegionJourneyPatternPoints**](docs/JourneyPatternPointsApi.md#getCoverageRegionJourneyPatternPoints) | **GET** /coverage/{region}/journey_pattern_points | 
*JourneyPatternPointsApi* | [**getCoverageRegionJourneyPatternPointsId**](docs/JourneyPatternPointsApi.md#getCoverageRegionJourneyPatternPointsId) | **GET** /coverage/{region}/journey_pattern_points/{id} | 
*JourneyPatternPointsApi* | [**getCoverageRegionUriJourneyPatternPoints**](docs/JourneyPatternPointsApi.md#getCoverageRegionUriJourneyPatternPoints) | **GET** /coverage/{region}/{uri}/journey_pattern_points | 
*JourneyPatternPointsApi* | [**getCoverageRegionUriJourneyPatternPointsId**](docs/JourneyPatternPointsApi.md#getCoverageRegionUriJourneyPatternPointsId) | **GET** /coverage/{region}/{uri}/journey_pattern_points/{id} | 
*JourneyPatternsApi* | [**getCoverageLonLatJourneyPatterns**](docs/JourneyPatternsApi.md#getCoverageLonLatJourneyPatterns) | **GET** /coverage/{lon};{lat}/journey_patterns | 
*JourneyPatternsApi* | [**getCoverageLonLatJourneyPatternsId**](docs/JourneyPatternsApi.md#getCoverageLonLatJourneyPatternsId) | **GET** /coverage/{lon};{lat}/journey_patterns/{id} | 
*JourneyPatternsApi* | [**getCoverageLonLatUriJourneyPatterns**](docs/JourneyPatternsApi.md#getCoverageLonLatUriJourneyPatterns) | **GET** /coverage/{lon};{lat}/{uri}/journey_patterns | 
*JourneyPatternsApi* | [**getCoverageLonLatUriJourneyPatternsId**](docs/JourneyPatternsApi.md#getCoverageLonLatUriJourneyPatternsId) | **GET** /coverage/{lon};{lat}/{uri}/journey_patterns/{id} | 
*JourneyPatternsApi* | [**getCoverageRegionJourneyPatterns**](docs/JourneyPatternsApi.md#getCoverageRegionJourneyPatterns) | **GET** /coverage/{region}/journey_patterns | 
*JourneyPatternsApi* | [**getCoverageRegionJourneyPatternsId**](docs/JourneyPatternsApi.md#getCoverageRegionJourneyPatternsId) | **GET** /coverage/{region}/journey_patterns/{id} | 
*JourneyPatternsApi* | [**getCoverageRegionUriJourneyPatterns**](docs/JourneyPatternsApi.md#getCoverageRegionUriJourneyPatterns) | **GET** /coverage/{region}/{uri}/journey_patterns | 
*JourneyPatternsApi* | [**getCoverageRegionUriJourneyPatternsId**](docs/JourneyPatternsApi.md#getCoverageRegionUriJourneyPatternsId) | **GET** /coverage/{region}/{uri}/journey_patterns/{id} | 
*JourneysApi* | [**getCoverageLonLatJourneys**](docs/JourneysApi.md#getCoverageLonLatJourneys) | **GET** /coverage/{lon};{lat}/journeys | 
*JourneysApi* | [**getCoverageRegionJourneys**](docs/JourneysApi.md#getCoverageRegionJourneys) | **GET** /coverage/{region}/journeys | 
*JourneysApi* | [**getJourneys**](docs/JourneysApi.md#getJourneys) | **GET** /journeys | 
*LineGroupsApi* | [**getCoverageLonLatLineGroups**](docs/LineGroupsApi.md#getCoverageLonLatLineGroups) | **GET** /coverage/{lon};{lat}/line_groups | 
*LineGroupsApi* | [**getCoverageLonLatLineGroupsId**](docs/LineGroupsApi.md#getCoverageLonLatLineGroupsId) | **GET** /coverage/{lon};{lat}/line_groups/{id} | 
*LineGroupsApi* | [**getCoverageLonLatUriLineGroups**](docs/LineGroupsApi.md#getCoverageLonLatUriLineGroups) | **GET** /coverage/{lon};{lat}/{uri}/line_groups | 
*LineGroupsApi* | [**getCoverageLonLatUriLineGroupsId**](docs/LineGroupsApi.md#getCoverageLonLatUriLineGroupsId) | **GET** /coverage/{lon};{lat}/{uri}/line_groups/{id} | 
*LineGroupsApi* | [**getCoverageRegionLineGroups**](docs/LineGroupsApi.md#getCoverageRegionLineGroups) | **GET** /coverage/{region}/line_groups | 
*LineGroupsApi* | [**getCoverageRegionLineGroupsId**](docs/LineGroupsApi.md#getCoverageRegionLineGroupsId) | **GET** /coverage/{region}/line_groups/{id} | 
*LineGroupsApi* | [**getCoverageRegionUriLineGroups**](docs/LineGroupsApi.md#getCoverageRegionUriLineGroups) | **GET** /coverage/{region}/{uri}/line_groups | 
*LineGroupsApi* | [**getCoverageRegionUriLineGroupsId**](docs/LineGroupsApi.md#getCoverageRegionUriLineGroupsId) | **GET** /coverage/{region}/{uri}/line_groups/{id} | 
*LineGroupsApi* | [**getLineGroups**](docs/LineGroupsApi.md#getLineGroups) | **GET** /line_groups | 
*LineReportsApi* | [**getCoverageLonLatLineReports**](docs/LineReportsApi.md#getCoverageLonLatLineReports) | **GET** /coverage/{lon};{lat}/line_reports | 
*LineReportsApi* | [**getCoverageLonLatUriLineReports**](docs/LineReportsApi.md#getCoverageLonLatUriLineReports) | **GET** /coverage/{lon};{lat}/{uri}/line_reports | 
*LineReportsApi* | [**getCoverageRegionLineReports**](docs/LineReportsApi.md#getCoverageRegionLineReports) | **GET** /coverage/{region}/line_reports | 
*LineReportsApi* | [**getCoverageRegionUriLineReports**](docs/LineReportsApi.md#getCoverageRegionUriLineReports) | **GET** /coverage/{region}/{uri}/line_reports | 
*LinesApi* | [**getCoverageLonLatLines**](docs/LinesApi.md#getCoverageLonLatLines) | **GET** /coverage/{lon};{lat}/lines | 
*LinesApi* | [**getCoverageLonLatLinesId**](docs/LinesApi.md#getCoverageLonLatLinesId) | **GET** /coverage/{lon};{lat}/lines/{id} | 
*LinesApi* | [**getCoverageLonLatUriLines**](docs/LinesApi.md#getCoverageLonLatUriLines) | **GET** /coverage/{lon};{lat}/{uri}/lines | 
*LinesApi* | [**getCoverageLonLatUriLinesId**](docs/LinesApi.md#getCoverageLonLatUriLinesId) | **GET** /coverage/{lon};{lat}/{uri}/lines/{id} | 
*LinesApi* | [**getCoverageRegionLines**](docs/LinesApi.md#getCoverageRegionLines) | **GET** /coverage/{region}/lines | 
*LinesApi* | [**getCoverageRegionLinesId**](docs/LinesApi.md#getCoverageRegionLinesId) | **GET** /coverage/{region}/lines/{id} | 
*LinesApi* | [**getCoverageRegionUriLines**](docs/LinesApi.md#getCoverageRegionUriLines) | **GET** /coverage/{region}/{uri}/lines | 
*LinesApi* | [**getCoverageRegionUriLinesId**](docs/LinesApi.md#getCoverageRegionUriLinesId) | **GET** /coverage/{region}/{uri}/lines/{id} | 
*LinesApi* | [**getLines**](docs/LinesApi.md#getLines) | **GET** /lines | 
*NetworksApi* | [**getCoverageLonLatNetworks**](docs/NetworksApi.md#getCoverageLonLatNetworks) | **GET** /coverage/{lon};{lat}/networks | 
*NetworksApi* | [**getCoverageLonLatNetworksId**](docs/NetworksApi.md#getCoverageLonLatNetworksId) | **GET** /coverage/{lon};{lat}/networks/{id} | 
*NetworksApi* | [**getCoverageLonLatUriNetworks**](docs/NetworksApi.md#getCoverageLonLatUriNetworks) | **GET** /coverage/{lon};{lat}/{uri}/networks | 
*NetworksApi* | [**getCoverageLonLatUriNetworksId**](docs/NetworksApi.md#getCoverageLonLatUriNetworksId) | **GET** /coverage/{lon};{lat}/{uri}/networks/{id} | 
*NetworksApi* | [**getCoverageRegionNetworks**](docs/NetworksApi.md#getCoverageRegionNetworks) | **GET** /coverage/{region}/networks | 
*NetworksApi* | [**getCoverageRegionNetworksId**](docs/NetworksApi.md#getCoverageRegionNetworksId) | **GET** /coverage/{region}/networks/{id} | 
*NetworksApi* | [**getCoverageRegionUriNetworks**](docs/NetworksApi.md#getCoverageRegionUriNetworks) | **GET** /coverage/{region}/{uri}/networks | 
*NetworksApi* | [**getCoverageRegionUriNetworksId**](docs/NetworksApi.md#getCoverageRegionUriNetworksId) | **GET** /coverage/{region}/{uri}/networks/{id} | 
*NetworksApi* | [**getNetworks**](docs/NetworksApi.md#getNetworks) | **GET** /networks | 
*NextArrivalsApi* | [**getCoverageLonLatArrivals**](docs/NextArrivalsApi.md#getCoverageLonLatArrivals) | **GET** /coverage/{lon};{lat}/arrivals | 
*NextArrivalsApi* | [**getCoverageLonLatUriArrivals**](docs/NextArrivalsApi.md#getCoverageLonLatUriArrivals) | **GET** /coverage/{lon};{lat}/{uri}/arrivals | 
*NextArrivalsApi* | [**getCoverageRegionArrivals**](docs/NextArrivalsApi.md#getCoverageRegionArrivals) | **GET** /coverage/{region}/arrivals | 
*NextArrivalsApi* | [**getCoverageRegionUriArrivals**](docs/NextArrivalsApi.md#getCoverageRegionUriArrivals) | **GET** /coverage/{region}/{uri}/arrivals | 
*NextDeparturesApi* | [**getCoverageLonLatDepartures**](docs/NextDeparturesApi.md#getCoverageLonLatDepartures) | **GET** /coverage/{lon};{lat}/departures | 
*NextDeparturesApi* | [**getCoverageLonLatUriDepartures**](docs/NextDeparturesApi.md#getCoverageLonLatUriDepartures) | **GET** /coverage/{lon};{lat}/{uri}/departures | 
*NextDeparturesApi* | [**getCoverageRegionDepartures**](docs/NextDeparturesApi.md#getCoverageRegionDepartures) | **GET** /coverage/{region}/departures | 
*NextDeparturesApi* | [**getCoverageRegionUriDepartures**](docs/NextDeparturesApi.md#getCoverageRegionUriDepartures) | **GET** /coverage/{region}/{uri}/departures | 
*PhysicalModesApi* | [**getCoverageLonLatPhysicalModes**](docs/PhysicalModesApi.md#getCoverageLonLatPhysicalModes) | **GET** /coverage/{lon};{lat}/physical_modes | 
*PhysicalModesApi* | [**getCoverageLonLatPhysicalModesId**](docs/PhysicalModesApi.md#getCoverageLonLatPhysicalModesId) | **GET** /coverage/{lon};{lat}/physical_modes/{id} | 
*PhysicalModesApi* | [**getCoverageLonLatUriPhysicalModes**](docs/PhysicalModesApi.md#getCoverageLonLatUriPhysicalModes) | **GET** /coverage/{lon};{lat}/{uri}/physical_modes | 
*PhysicalModesApi* | [**getCoverageLonLatUriPhysicalModesId**](docs/PhysicalModesApi.md#getCoverageLonLatUriPhysicalModesId) | **GET** /coverage/{lon};{lat}/{uri}/physical_modes/{id} | 
*PhysicalModesApi* | [**getCoverageRegionPhysicalModes**](docs/PhysicalModesApi.md#getCoverageRegionPhysicalModes) | **GET** /coverage/{region}/physical_modes | 
*PhysicalModesApi* | [**getCoverageRegionPhysicalModesId**](docs/PhysicalModesApi.md#getCoverageRegionPhysicalModesId) | **GET** /coverage/{region}/physical_modes/{id} | 
*PhysicalModesApi* | [**getCoverageRegionUriPhysicalModes**](docs/PhysicalModesApi.md#getCoverageRegionUriPhysicalModes) | **GET** /coverage/{region}/{uri}/physical_modes | 
*PhysicalModesApi* | [**getCoverageRegionUriPhysicalModesId**](docs/PhysicalModesApi.md#getCoverageRegionUriPhysicalModesId) | **GET** /coverage/{region}/{uri}/physical_modes/{id} | 
*PlaceUriApi* | [**getCoverageLonLatPlacesId**](docs/PlaceUriApi.md#getCoverageLonLatPlacesId) | **GET** /coverage/{lon};{lat}/places/{id} | 
*PlaceUriApi* | [**getCoverageRegionPlacesId**](docs/PlaceUriApi.md#getCoverageRegionPlacesId) | **GET** /coverage/{region}/places/{id} | 
*PlaceUriApi* | [**getPlacesId**](docs/PlaceUriApi.md#getPlacesId) | **GET** /places/{id} | 
*PlacesApi* | [**getCoverageLonLatPlaces**](docs/PlacesApi.md#getCoverageLonLatPlaces) | **GET** /coverage/{lon};{lat}/places | 
*PlacesApi* | [**getCoverageRegionPlaces**](docs/PlacesApi.md#getCoverageRegionPlaces) | **GET** /coverage/{region}/places | 
*PlacesApi* | [**getPlaces**](docs/PlacesApi.md#getPlaces) | **GET** /places | 
*PlacesNearbyApi* | [**getCoordLonLatPlacesNearby**](docs/PlacesNearbyApi.md#getCoordLonLatPlacesNearby) | **GET** /coord/{lon};{lat}/places_nearby | 
*PlacesNearbyApi* | [**getCoordsLonLatPlacesNearby**](docs/PlacesNearbyApi.md#getCoordsLonLatPlacesNearby) | **GET** /coords/{lon};{lat}/places_nearby | 
*PlacesNearbyApi* | [**getCoverageLonLatPlacesNearby**](docs/PlacesNearbyApi.md#getCoverageLonLatPlacesNearby) | **GET** /coverage/{lon};{lat}/places_nearby | 
*PlacesNearbyApi* | [**getCoverageLonLatUriPlacesNearby**](docs/PlacesNearbyApi.md#getCoverageLonLatUriPlacesNearby) | **GET** /coverage/{lon};{lat}/{uri}/places_nearby | 
*PlacesNearbyApi* | [**getCoverageRegionPlacesNearby**](docs/PlacesNearbyApi.md#getCoverageRegionPlacesNearby) | **GET** /coverage/{region}/places_nearby | 
*PlacesNearbyApi* | [**getCoverageRegionUriPlacesNearby**](docs/PlacesNearbyApi.md#getCoverageRegionUriPlacesNearby) | **GET** /coverage/{region}/{uri}/places_nearby | 
*PoiTypesApi* | [**getCoverageLonLatPoiTypes**](docs/PoiTypesApi.md#getCoverageLonLatPoiTypes) | **GET** /coverage/{lon};{lat}/poi_types | 
*PoiTypesApi* | [**getCoverageLonLatPoiTypesId**](docs/PoiTypesApi.md#getCoverageLonLatPoiTypesId) | **GET** /coverage/{lon};{lat}/poi_types/{id} | 
*PoiTypesApi* | [**getCoverageLonLatUriPoiTypes**](docs/PoiTypesApi.md#getCoverageLonLatUriPoiTypes) | **GET** /coverage/{lon};{lat}/{uri}/poi_types | 
*PoiTypesApi* | [**getCoverageLonLatUriPoiTypesId**](docs/PoiTypesApi.md#getCoverageLonLatUriPoiTypesId) | **GET** /coverage/{lon};{lat}/{uri}/poi_types/{id} | 
*PoiTypesApi* | [**getCoverageRegionPoiTypes**](docs/PoiTypesApi.md#getCoverageRegionPoiTypes) | **GET** /coverage/{region}/poi_types | 
*PoiTypesApi* | [**getCoverageRegionPoiTypesId**](docs/PoiTypesApi.md#getCoverageRegionPoiTypesId) | **GET** /coverage/{region}/poi_types/{id} | 
*PoiTypesApi* | [**getCoverageRegionUriPoiTypes**](docs/PoiTypesApi.md#getCoverageRegionUriPoiTypes) | **GET** /coverage/{region}/{uri}/poi_types | 
*PoiTypesApi* | [**getCoverageRegionUriPoiTypesId**](docs/PoiTypesApi.md#getCoverageRegionUriPoiTypesId) | **GET** /coverage/{region}/{uri}/poi_types/{id} | 
*PoisApi* | [**getCoverageLonLatPois**](docs/PoisApi.md#getCoverageLonLatPois) | **GET** /coverage/{lon};{lat}/pois | 
*PoisApi* | [**getCoverageLonLatPoisId**](docs/PoisApi.md#getCoverageLonLatPoisId) | **GET** /coverage/{lon};{lat}/pois/{id} | 
*PoisApi* | [**getCoverageLonLatUriPois**](docs/PoisApi.md#getCoverageLonLatUriPois) | **GET** /coverage/{lon};{lat}/{uri}/pois | 
*PoisApi* | [**getCoverageLonLatUriPoisId**](docs/PoisApi.md#getCoverageLonLatUriPoisId) | **GET** /coverage/{lon};{lat}/{uri}/pois/{id} | 
*PoisApi* | [**getCoverageRegionPois**](docs/PoisApi.md#getCoverageRegionPois) | **GET** /coverage/{region}/pois | 
*PoisApi* | [**getCoverageRegionPoisId**](docs/PoisApi.md#getCoverageRegionPoisId) | **GET** /coverage/{region}/pois/{id} | 
*PoisApi* | [**getCoverageRegionUriPois**](docs/PoisApi.md#getCoverageRegionUriPois) | **GET** /coverage/{region}/{uri}/pois | 
*PoisApi* | [**getCoverageRegionUriPoisId**](docs/PoisApi.md#getCoverageRegionUriPoisId) | **GET** /coverage/{region}/{uri}/pois/{id} | 
*PtobjectsApi* | [**getCoverageLonLatPtObjects**](docs/PtobjectsApi.md#getCoverageLonLatPtObjects) | **GET** /coverage/{lon};{lat}/pt_objects | 
*PtobjectsApi* | [**getCoverageRegionPtObjects**](docs/PtobjectsApi.md#getCoverageRegionPtObjects) | **GET** /coverage/{region}/pt_objects | 
*RouteSchedulesApi* | [**getCoverageLonLatUriRouteSchedules**](docs/RouteSchedulesApi.md#getCoverageLonLatUriRouteSchedules) | **GET** /coverage/{lon};{lat}/{uri}/route_schedules | 
*RouteSchedulesApi* | [**getCoverageRegionUriRouteSchedules**](docs/RouteSchedulesApi.md#getCoverageRegionUriRouteSchedules) | **GET** /coverage/{region}/{uri}/route_schedules | 
*RouteSchedulesApi* | [**getRouteSchedules**](docs/RouteSchedulesApi.md#getRouteSchedules) | **GET** /route_schedules | 
*RoutesApi* | [**getCoverageLonLatRoutes**](docs/RoutesApi.md#getCoverageLonLatRoutes) | **GET** /coverage/{lon};{lat}/routes | 
*RoutesApi* | [**getCoverageLonLatRoutesId**](docs/RoutesApi.md#getCoverageLonLatRoutesId) | **GET** /coverage/{lon};{lat}/routes/{id} | 
*RoutesApi* | [**getCoverageLonLatUriRoutes**](docs/RoutesApi.md#getCoverageLonLatUriRoutes) | **GET** /coverage/{lon};{lat}/{uri}/routes | 
*RoutesApi* | [**getCoverageLonLatUriRoutesId**](docs/RoutesApi.md#getCoverageLonLatUriRoutesId) | **GET** /coverage/{lon};{lat}/{uri}/routes/{id} | 
*RoutesApi* | [**getCoverageRegionRoutes**](docs/RoutesApi.md#getCoverageRegionRoutes) | **GET** /coverage/{region}/routes | 
*RoutesApi* | [**getCoverageRegionRoutesId**](docs/RoutesApi.md#getCoverageRegionRoutesId) | **GET** /coverage/{region}/routes/{id} | 
*RoutesApi* | [**getCoverageRegionUriRoutes**](docs/RoutesApi.md#getCoverageRegionUriRoutes) | **GET** /coverage/{region}/{uri}/routes | 
*RoutesApi* | [**getCoverageRegionUriRoutesId**](docs/RoutesApi.md#getCoverageRegionUriRoutesId) | **GET** /coverage/{region}/{uri}/routes/{id} | 
*RoutesApi* | [**getRoutes**](docs/RoutesApi.md#getRoutes) | **GET** /routes | 
*StopAreasApi* | [**getCoverageLonLatStopAreas**](docs/StopAreasApi.md#getCoverageLonLatStopAreas) | **GET** /coverage/{lon};{lat}/stop_areas | 
*StopAreasApi* | [**getCoverageLonLatStopAreasId**](docs/StopAreasApi.md#getCoverageLonLatStopAreasId) | **GET** /coverage/{lon};{lat}/stop_areas/{id} | 
*StopAreasApi* | [**getCoverageLonLatUriStopAreas**](docs/StopAreasApi.md#getCoverageLonLatUriStopAreas) | **GET** /coverage/{lon};{lat}/{uri}/stop_areas | 
*StopAreasApi* | [**getCoverageLonLatUriStopAreasId**](docs/StopAreasApi.md#getCoverageLonLatUriStopAreasId) | **GET** /coverage/{lon};{lat}/{uri}/stop_areas/{id} | 
*StopAreasApi* | [**getCoverageRegionStopAreas**](docs/StopAreasApi.md#getCoverageRegionStopAreas) | **GET** /coverage/{region}/stop_areas | 
*StopAreasApi* | [**getCoverageRegionStopAreasId**](docs/StopAreasApi.md#getCoverageRegionStopAreasId) | **GET** /coverage/{region}/stop_areas/{id} | 
*StopAreasApi* | [**getCoverageRegionUriStopAreas**](docs/StopAreasApi.md#getCoverageRegionUriStopAreas) | **GET** /coverage/{region}/{uri}/stop_areas | 
*StopAreasApi* | [**getCoverageRegionUriStopAreasId**](docs/StopAreasApi.md#getCoverageRegionUriStopAreasId) | **GET** /coverage/{region}/{uri}/stop_areas/{id} | 
*StopAreasApi* | [**getStopAreas**](docs/StopAreasApi.md#getStopAreas) | **GET** /stop_areas | 
*StopPointsApi* | [**getCoverageLonLatStopPoints**](docs/StopPointsApi.md#getCoverageLonLatStopPoints) | **GET** /coverage/{lon};{lat}/stop_points | 
*StopPointsApi* | [**getCoverageLonLatStopPointsId**](docs/StopPointsApi.md#getCoverageLonLatStopPointsId) | **GET** /coverage/{lon};{lat}/stop_points/{id} | 
*StopPointsApi* | [**getCoverageLonLatUriStopPoints**](docs/StopPointsApi.md#getCoverageLonLatUriStopPoints) | **GET** /coverage/{lon};{lat}/{uri}/stop_points | 
*StopPointsApi* | [**getCoverageLonLatUriStopPointsId**](docs/StopPointsApi.md#getCoverageLonLatUriStopPointsId) | **GET** /coverage/{lon};{lat}/{uri}/stop_points/{id} | 
*StopPointsApi* | [**getCoverageRegionStopPoints**](docs/StopPointsApi.md#getCoverageRegionStopPoints) | **GET** /coverage/{region}/stop_points | 
*StopPointsApi* | [**getCoverageRegionStopPointsId**](docs/StopPointsApi.md#getCoverageRegionStopPointsId) | **GET** /coverage/{region}/stop_points/{id} | 
*StopPointsApi* | [**getCoverageRegionUriStopPoints**](docs/StopPointsApi.md#getCoverageRegionUriStopPoints) | **GET** /coverage/{region}/{uri}/stop_points | 
*StopPointsApi* | [**getCoverageRegionUriStopPointsId**](docs/StopPointsApi.md#getCoverageRegionUriStopPointsId) | **GET** /coverage/{region}/{uri}/stop_points/{id} | 
*StopPointsApi* | [**getStopPoints**](docs/StopPointsApi.md#getStopPoints) | **GET** /stop_points | 
*StopSchedulesApi* | [**getCoverageLonLatUriStopSchedules**](docs/StopSchedulesApi.md#getCoverageLonLatUriStopSchedules) | **GET** /coverage/{lon};{lat}/{uri}/stop_schedules | 
*StopSchedulesApi* | [**getCoverageRegionUriStopSchedules**](docs/StopSchedulesApi.md#getCoverageRegionUriStopSchedules) | **GET** /coverage/{region}/{uri}/stop_schedules | 
*StopSchedulesApi* | [**getStopSchedules**](docs/StopSchedulesApi.md#getStopSchedules) | **GET** /stop_schedules | 
*TrafficReportApi* | [**getCoverageLonLatTrafficReports**](docs/TrafficReportApi.md#getCoverageLonLatTrafficReports) | **GET** /coverage/{lon};{lat}/traffic_reports | 
*TrafficReportApi* | [**getCoverageLonLatUriTrafficReports**](docs/TrafficReportApi.md#getCoverageLonLatUriTrafficReports) | **GET** /coverage/{lon};{lat}/{uri}/traffic_reports | 
*TrafficReportApi* | [**getCoverageRegionTrafficReports**](docs/TrafficReportApi.md#getCoverageRegionTrafficReports) | **GET** /coverage/{region}/traffic_reports | 
*TrafficReportApi* | [**getCoverageRegionUriTrafficReports**](docs/TrafficReportApi.md#getCoverageRegionUriTrafficReports) | **GET** /coverage/{region}/{uri}/traffic_reports | 
*TripsApi* | [**getCoverageLonLatTrips**](docs/TripsApi.md#getCoverageLonLatTrips) | **GET** /coverage/{lon};{lat}/trips | 
*TripsApi* | [**getCoverageLonLatTripsId**](docs/TripsApi.md#getCoverageLonLatTripsId) | **GET** /coverage/{lon};{lat}/trips/{id} | 
*TripsApi* | [**getCoverageLonLatUriTrips**](docs/TripsApi.md#getCoverageLonLatUriTrips) | **GET** /coverage/{lon};{lat}/{uri}/trips | 
*TripsApi* | [**getCoverageLonLatUriTripsId**](docs/TripsApi.md#getCoverageLonLatUriTripsId) | **GET** /coverage/{lon};{lat}/{uri}/trips/{id} | 
*TripsApi* | [**getCoverageRegionTrips**](docs/TripsApi.md#getCoverageRegionTrips) | **GET** /coverage/{region}/trips | 
*TripsApi* | [**getCoverageRegionTripsId**](docs/TripsApi.md#getCoverageRegionTripsId) | **GET** /coverage/{region}/trips/{id} | 
*TripsApi* | [**getCoverageRegionUriTrips**](docs/TripsApi.md#getCoverageRegionUriTrips) | **GET** /coverage/{region}/{uri}/trips | 
*TripsApi* | [**getCoverageRegionUriTripsId**](docs/TripsApi.md#getCoverageRegionUriTripsId) | **GET** /coverage/{region}/{uri}/trips/{id} | 
*VehicleJourneysApi* | [**getCoverageLonLatUriVehicleJourneys**](docs/VehicleJourneysApi.md#getCoverageLonLatUriVehicleJourneys) | **GET** /coverage/{lon};{lat}/{uri}/vehicle_journeys | 
*VehicleJourneysApi* | [**getCoverageLonLatUriVehicleJourneysId**](docs/VehicleJourneysApi.md#getCoverageLonLatUriVehicleJourneysId) | **GET** /coverage/{lon};{lat}/{uri}/vehicle_journeys/{id} | 
*VehicleJourneysApi* | [**getCoverageLonLatVehicleJourneys**](docs/VehicleJourneysApi.md#getCoverageLonLatVehicleJourneys) | **GET** /coverage/{lon};{lat}/vehicle_journeys | 
*VehicleJourneysApi* | [**getCoverageLonLatVehicleJourneysId**](docs/VehicleJourneysApi.md#getCoverageLonLatVehicleJourneysId) | **GET** /coverage/{lon};{lat}/vehicle_journeys/{id} | 
*VehicleJourneysApi* | [**getCoverageRegionUriVehicleJourneys**](docs/VehicleJourneysApi.md#getCoverageRegionUriVehicleJourneys) | **GET** /coverage/{region}/{uri}/vehicle_journeys | 
*VehicleJourneysApi* | [**getCoverageRegionUriVehicleJourneysId**](docs/VehicleJourneysApi.md#getCoverageRegionUriVehicleJourneysId) | **GET** /coverage/{region}/{uri}/vehicle_journeys/{id} | 
*VehicleJourneysApi* | [**getCoverageRegionVehicleJourneys**](docs/VehicleJourneysApi.md#getCoverageRegionVehicleJourneys) | **GET** /coverage/{region}/vehicle_journeys | 
*VehicleJourneysApi* | [**getCoverageRegionVehicleJourneysId**](docs/VehicleJourneysApi.md#getCoverageRegionVehicleJourneysId) | **GET** /coverage/{region}/vehicle_journeys/{id} | 
*VehicleJourneysApi* | [**getVehicleJourneys**](docs/VehicleJourneysApi.md#getVehicleJourneys) | **GET** /vehicle_journeys | 


## Documentation for Models

 - [Address](docs/Address.md)
 - [Admin](docs/Admin.md)
 - [Amount](docs/Amount.md)
 - [Arrivals](docs/Arrivals.md)
 - [BetaEndpoints](docs/BetaEndpoints.md)
 - [CO2](docs/CO2.md)
 - [Calendar](docs/Calendar.md)
 - [CalendarException](docs/CalendarException.md)
 - [CalendarPeriod](docs/CalendarPeriod.md)
 - [Calendars](docs/Calendars.md)
 - [CarPark](docs/CarPark.md)
 - [Cause](docs/Cause.md)
 - [CellLatSchema](docs/CellLatSchema.md)
 - [CellLonSchema](docs/CellLonSchema.md)
 - [Channel](docs/Channel.md)
 - [Code](docs/Code.md)
 - [Comment](docs/Comment.md)
 - [CommercialMode](docs/CommercialMode.md)
 - [CommercialModes](docs/CommercialModes.md)
 - [Companie](docs/Companie.md)
 - [Companies](docs/Companies.md)
 - [Context](docs/Context.md)
 - [Contributor](docs/Contributor.md)
 - [Contributors](docs/Contributors.md)
 - [Coord](docs/Coord.md)
 - [Cost](docs/Cost.md)
 - [Coverage](docs/Coverage.md)
 - [CoverageError](docs/CoverageError.md)
 - [Coverages](docs/Coverages.md)
 - [CurrentAvailability](docs/CurrentAvailability.md)
 - [Dataset](docs/Dataset.md)
 - [Datasets](docs/Datasets.md)
 - [DateTimeType](docs/DateTimeType.md)
 - [Departures](docs/Departures.md)
 - [DictAddresses](docs/DictAddresses.md)
 - [Disruption](docs/Disruption.md)
 - [DisruptionProperty](docs/DisruptionProperty.md)
 - [Disruptions](docs/Disruptions.md)
 - [Distances](docs/Distances.md)
 - [Durations](docs/Durations.md)
 - [Effect](docs/Effect.md)
 - [EquipmentDetails](docs/EquipmentDetails.md)
 - [EquipmentReport](docs/EquipmentReport.md)
 - [EquipmentReports](docs/EquipmentReports.md)
 - [Error](docs/Error.md)
 - [Exception](docs/Exception.md)
 - [Fare](docs/Fare.md)
 - [FareZone](docs/FareZone.md)
 - [FeedPublisher](docs/FeedPublisher.md)
 - [GeoStatus](docs/GeoStatus.md)
 - [GeoStatus1](docs/GeoStatus1.md)
 - [GraphicalIsrochone](docs/GraphicalIsrochone.md)
 - [GraphicalIsrochone1](docs/GraphicalIsrochone1.md)
 - [GraphicalIsrochoneGeojson](docs/GraphicalIsrochoneGeojson.md)
 - [Header](docs/Header.md)
 - [HeatMap](docs/HeatMap.md)
 - [HeatMap1](docs/HeatMap1.md)
 - [HeatMatrixSchema](docs/HeatMatrixSchema.md)
 - [Impacted](docs/Impacted.md)
 - [ImpactedSection](docs/ImpactedSection.md)
 - [ImpactedStop](docs/ImpactedStop.md)
 - [IndividualInformation](docs/IndividualInformation.md)
 - [IndividualRating](docs/IndividualRating.md)
 - [Journey](docs/Journey.md)
 - [JourneyDebug](docs/JourneyDebug.md)
 - [JourneyPattern](docs/JourneyPattern.md)
 - [JourneyPatternPoint](docs/JourneyPatternPoint.md)
 - [JourneyPatternPoints](docs/JourneyPatternPoints.md)
 - [JourneyPatterns](docs/JourneyPatterns.md)
 - [Journeys](docs/Journeys.md)
 - [Line](docs/Line.md)
 - [LineGroup](docs/LineGroup.md)
 - [LineGroups](docs/LineGroups.md)
 - [LineHeadersSchema](docs/LineHeadersSchema.md)
 - [LineReport](docs/LineReport.md)
 - [LineReports](docs/LineReports.md)
 - [Lines](docs/Lines.md)
 - [LinesSchema](docs/LinesSchema.md)
 - [LinkSchema](docs/LinkSchema.md)
 - [Message](docs/Message.md)
 - [MultiLineStringSchema](docs/MultiLineStringSchema.md)
 - [Network](docs/Network.md)
 - [Networks](docs/Networks.md)
 - [Note](docs/Note.md)
 - [Pagination](docs/Pagination.md)
 - [Passage](docs/Passage.md)
 - [Path](docs/Path.md)
 - [Period](docs/Period.md)
 - [PhysicalMode](docs/PhysicalMode.md)
 - [PhysicalModes](docs/PhysicalModes.md)
 - [Place](docs/Place.md)
 - [PlaceNearby](docs/PlaceNearby.md)
 - [Places](docs/Places.md)
 - [PlacesNearby](docs/PlacesNearby.md)
 - [Poi](docs/Poi.md)
 - [PoiType](docs/PoiType.md)
 - [PoiTypes](docs/PoiTypes.md)
 - [Pois](docs/Pois.md)
 - [Property](docs/Property.md)
 - [PtObject](docs/PtObject.md)
 - [PtObjects](docs/PtObjects.md)
 - [RidesharingInformation](docs/RidesharingInformation.md)
 - [Route](docs/Route.md)
 - [RouteDisplayInformation](docs/RouteDisplayInformation.md)
 - [RouteSchedule](docs/RouteSchedule.md)
 - [RouteSchedules](docs/RouteSchedules.md)
 - [Routes](docs/Routes.md)
 - [Row](docs/Row.md)
 - [SeatsDescription](docs/SeatsDescription.md)
 - [Section](docs/Section.md)
 - [SectionGeoJsonSchema](docs/SectionGeoJsonSchema.md)
 - [SectionGeoJsonSchemaProperties](docs/SectionGeoJsonSchemaProperties.md)
 - [Severity](docs/Severity.md)
 - [Stands](docs/Stands.md)
 - [StopArea](docs/StopArea.md)
 - [StopAreaEquipments](docs/StopAreaEquipments.md)
 - [StopAreas](docs/StopAreas.md)
 - [StopDateTime](docs/StopDateTime.md)
 - [StopPoint](docs/StopPoint.md)
 - [StopPoints](docs/StopPoints.md)
 - [StopSchedule](docs/StopSchedule.md)
 - [StopSchedules](docs/StopSchedules.md)
 - [StopTime](docs/StopTime.md)
 - [Table](docs/Table.md)
 - [Ticket](docs/Ticket.md)
 - [TrafficReport](docs/TrafficReport.md)
 - [TrafficReports](docs/TrafficReports.md)
 - [Trip](docs/Trip.md)
 - [Trips](docs/Trips.md)
 - [VJDisplayInformation](docs/VJDisplayInformation.md)
 - [ValidityPattern](docs/ValidityPattern.md)
 - [VehicleJourney](docs/VehicleJourney.md)
 - [VehicleJourneys](docs/VehicleJourneys.md)
 - [WeekPattern](docs/WeekPattern.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

navitia@googlegroups.com

