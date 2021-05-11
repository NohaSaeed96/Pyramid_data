package com.AI;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramidd = pDAO.reader("D:\\pyramids.csv");
        pyramidd.sort(Comparator.comparingDouble(Pyramid::getHeight));
        int i = 1;
        for (Pyramid p : pyramidd) {

            System.out.println((i += 1) + " " + p.getPharoh() + " " + p.getModern_name() + " " + p.getSite() + " " + p.getHeight());

        }
            Map<String, Integer> counting_map = new HashMap<>();

            for (Pyramid pp : pyramidd) {

                String site = pp.getSite();
                Integer no_sites = counting_map.get(site);
                if (no_sites == null) {
                    no_sites = 1;
                } else {
                    no_sites++;
                }
                counting_map.put(site, no_sites);}
                System.out.println(counting_map);



        }
    }


