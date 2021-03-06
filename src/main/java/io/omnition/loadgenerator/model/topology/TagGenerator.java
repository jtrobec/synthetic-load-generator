package io.omnition.loadgenerator.model.topology;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TagGenerator {

    private Random rand = new Random();
    private TagNameGenerator tagGen = new TagNameGenerator();

    public int valLength = 10;
    public int numTags = 0;
    public int numVals = 0;

    public Map<String, Object> generateTags() {
        Map<String, Object> retVal = new HashMap<>();
        for (int genIndex = 0; genIndex < numTags; genIndex++) {
            String val;
            val = RandomStringUtils.random(valLength, 0, 0, true, true, null, new Random(rand.nextInt(numVals)));
            retVal.put(tagGen.getForIndex(genIndex), val);
        }

        return retVal;
    }
}
