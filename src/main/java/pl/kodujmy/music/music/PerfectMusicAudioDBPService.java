package pl.kodujmy.music.music;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class PerfectMusicAudioDBPService implements PerfectMusicService{

    private final String endpoint = "https://theaudiodb.com/api/v1/json/2/search.php?s=";

    RestTemplate restTemplate = new RestTemplate();


    @Override
    public PerfectMusic recommend() {
        ResponseEntity<AudioDBResponse> responseEntity =
                restTemplate.getForEntity(endpoint + "coldplay", AudioDBResponse.class);

        System.out.println("Found " + responseEntity.getBody() + " matching results");

        for (AudioDBArtist a  : responseEntity.getBody().getArtists()) {
            System.out.println(a.toString());
        }

        return new PerfectMusic("Viva La Vida", "Coldplay");
    }

    @Override
    public PerfectMusic info(String artist) {
        ResponseEntity<AudioDBResponse> responseEntity =
                restTemplate.getForEntity(endpoint + artist, AudioDBResponse.class);

        System.out.println("Found " + responseEntity.getBody() + " matching results");

        AudioDBArtist[] artists = responseEntity.getBody().getArtists();
        if(artists == null) {
            return new PerfectMusic("Coudln't find any interesting song for you", "Coudln't find any interesting song for you");
        } else {
            AudioDBArtist first = Arrays.stream(artists).findFirst().get();

            return new PerfectMusic(first.getStrArtistBanner(), first.getStrArtist());
        }
    }
}
