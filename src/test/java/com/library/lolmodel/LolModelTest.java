package com.library.lolmodel;

import com.library.lolmodel.config.DataSourceConfiguration;
import com.library.lolmodel.models.*;
import com.library.lolmodel.repository.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@EnableJpaRepositories
@ContextConfiguration(classes = DataSourceConfiguration.class)
@ComponentScan("com.library.lolmodel.repository.*")
@EntityScan("com.library.lolmodel.models.*")
public class LolModelTest {

    @Autowired
    private ChampionsRepository championsRepository;
    private static final Logger logger = Logger.getLogger(LolModelTest.class);


    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private PassiveRepository passiveRepository;

    @Autowired
    private SkinsRepository skinsRepository;

    @Autowired
    private SpellCooldownRepository spellCooldownRepository;


    @Autowired
    private SpellCostRepository spellCostRepository;


    @Autowired
    private SpellEffectRepository spellEffectRepository;


    @Autowired
    private SpellsRepository spellsRepository;

    @Autowired
    private StatsRepository statsRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testGetChampions() {
        List<Champions> championsList = championsRepository.findAll();
        championsList.forEach(logger::info);
        Assertions.assertTrue(!championsList.isEmpty());
    }

    @Test
    public void testGetImage() {
        List<Image> imageList = imageRepository.findAll();
        imageList.forEach(logger::info);
        Assertions.assertTrue(!imageList.isEmpty());
    }

    @Test
    public void testGetPassive() {
        List<Passive> passiveList = passiveRepository.findAll();
        passiveList.forEach(logger::info);
        Assertions.assertTrue(!passiveList.isEmpty());
    }

    @Test
    public void testGetSkins() {
        List<Skins> skinsList = skinsRepository.findAll();
        skinsList.forEach(logger::info);
        Assertions.assertTrue(!skinsList.isEmpty());
    }

    @Test
    public void testGetSpellCooldown() {
        List<SpellCooldown> spellCooldownList = spellCooldownRepository.findAll();
        spellCooldownList.forEach(logger::info);
        Assertions.assertTrue(!spellCooldownList.isEmpty());
    }



    @Test
    public void testGetSpellCost() {
        List<SpellCost> spellCostList = spellCostRepository.findAll();
        spellCostList.forEach(logger::info);
        Assertions.assertTrue(!spellCostList.isEmpty());
    }



    @Test
    public void testGetSpellEffect() {
        List<SpellEffect> spellEffectList = spellEffectRepository.findAll();
        spellEffectList.forEach(logger::info);
        Assertions.assertTrue(!spellEffectList.isEmpty());
    }



    @Test
    public void testGetSpells() {
        List<Spells> spellsList = spellsRepository.findAll();
        spellsList.forEach(logger::info);
        Assertions.assertTrue(!spellsList.isEmpty());
    }

    @Test
    public void testGetStats() {
        List<Stats> statsList = statsRepository.findAll();
        statsList.forEach(logger::info);
        Assertions.assertTrue(!statsList.isEmpty());
    }

    @Test
    public void testGetUser() {
        List<Users> userList = userRepository.findAll();
        userList.forEach(logger::info);
        Assertions.assertTrue(!userList.isEmpty());
    }
    @Test
    public void getChampions(){

        List<Champions> championsList = championsRepository.findAll();
        championsList.forEach(logger::info);
        Assertions.assertTrue(!championsList.isEmpty());

    }
    @Test
    public void testEquals() {
        Champions champion1 = new Champions();
        champion1.setId("1");
        champion1.setKey(123);
        champion1.setName("Champion 1");

        Champions champion2 = new Champions();
        champion2.setId("1");
        champion2.setKey(123);
        champion2.setName("Champion 1");

        Champions champion3 = new Champions();
        champion3.setId("2");
        champion3.setKey(456);
        champion3.setName("Champion 2");

        Assertions.assertEquals(champion1, champion2);
        Assertions.assertNotEquals(champion1, champion3);
    }

    @Test
    public void testHashCode() {
        Champions champion1 = new Champions();
        champion1.setId("1");
        champion1.setKey(123);
        champion1.setName("Champion 1");

        Champions champion2 = new Champions();
        champion2.setId("1");
        champion2.setKey(123);
        champion2.setName("Champion 1");

        Champions champion3 = new Champions();
        champion3.setId("2");
        champion3.setKey(456);
        champion3.setName("Champion 2");

        Assertions.assertEquals(champion1.hashCode(), champion2.hashCode());
        Assertions.assertNotEquals(champion1.hashCode(), champion3.hashCode());
    }
}
