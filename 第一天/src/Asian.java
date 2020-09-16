public class Asian {

    private String skin;
    private PersonT person;

    public Asian() {
    }

    public Asian(String skin, PersonT person) {
        this.skin = skin;
        this.person = person;
    }

    public Asian(Asian asian) {
        this.skin = asian.skin;
        this.person = new PersonT(asian.person);
    }

//    public Asian(Asian asian) {
//        this(asian.skin, asian.person);
    //    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public PersonT getPerson() {
        return person;
    }

    public void setPerson(PersonT person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Asian{" +
                "skin='" + skin + '\'' +
                ", person=" + person.toString() +
                '}';
    }


    public static void main(String[] args) {
        PersonT p1 = new PersonT("张三", 14, "男");
        PersonT p2 = new PersonT(p1);
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        //修改p1
        System.out.println("---------修改p1----------");
        p1.setName("李四");
        p1.setAge(19);
        p1.setSex("女");
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        //修改p2
        System.out.println("---------修改p2----------");
        p2.setName("王二");
        p2.setAge(23);
        p2.setSex("男");
        System.out.println(p1.toString());
        System.out.println(p2.toString());


        System.out.println("-------------------------");
        Asian a1 = new Asian("yellow", p1);
        Asian a2 = new Asian(a1);
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        //修改a1
        System.out.println("---------修改a1----------");
        a1.setSkin("back");
        a1.getPerson().setName("麻子");
        a1.getPerson().setAge(28);
        a1.getPerson().setSex("男");
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        //修改a2
        System.out.println("---------修改a2----------");
        a2.setSkin("red");
        a2.getPerson().setName("诗诗");
        a2.getPerson().setAge(25);
        a2.getPerson().setSex("女");
        System.out.println(a1.toString());
        System.out.println(a2.toString());

    }
}
