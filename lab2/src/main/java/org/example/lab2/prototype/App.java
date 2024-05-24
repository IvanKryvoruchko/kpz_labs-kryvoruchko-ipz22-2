package org.example.lab2.prototype;

public class App {
    public static void main(String[] args) {
        Virus virus = new Virus();
        virus.weight = 10;
        virus.name = "CoronaVirus";
        virus.age = 10;
        virus.childList.add(new Virus() {{
            weight = 20;
            name = "CoronaVirus2";
            age = 20;
            childList.add(new Virus() {{
                weight = 30;
                name = "CoronaVirus211";
            }});
            childList.add(new Virus() {{
                weight = 40;
                name = "CoronaVirus212";
                age = 47;
                childList.add(new Virus() {{
                    weight = 10;
                    name = "CoronaVirus2121";
                    age = 11;
                }});
            }});
        }});
        virus.childList.add(new Virus() {{
            weight = 27;
            name = "CoronaVirus4";
            age = 4;
            childList.add(new Virus() {{
                weight = 14;
                name = "CoronaVirus2122";
            }});
        }});

        Virus virusCopy = virus.clone();

        virusCopy.printVirusInfo();
    }
}
