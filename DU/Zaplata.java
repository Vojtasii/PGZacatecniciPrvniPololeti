--- Prumer.java	2015-11-04 21:54:05.862563000 +0100
+++ PrumerZ.java	2015-11-04 21:57:36.810563000 +0100
@@ -7,6 +7,7 @@
             suma += sc.nextDouble();
             pocet++;
         }
-        System.out.printf("Prumer je %2.2f.\n", suma / pocet);
+	if (pocet == 0) {System.out.printf("Nebylo zadano zadne cislo"); }
+        else System.out.printf("Prumer je %2.2f.\n", suma / pocet);
     }
 }
\ No newline at end of file
