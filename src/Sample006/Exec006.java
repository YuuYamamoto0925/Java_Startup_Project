package Sample006;


public class Exec006 {

    //Javaのクラスとオブジェクト
    //Webサイト情報を格納するWebsiteクラスを生成する
    public static void main(String[] args){

        //<表示処理その1>
        //Yahooの情報
        String SiteName_Y = "Yahoo";
        String SiteUrl_Y = "https://www.yahoo.co.jp/";
        String SiteIp_Y = "182.22.16.251";

        //オブジェクトクラスに格納する
        Website SiteInfo_Y = new Website(SiteName_Y, SiteUrl_Y, SiteIp_Y);
        
        //コンソール上に表示させる
        System.out.println("【Yが持つWebサイトの情報】");
        System.out.println("・Webサイトの名前：" + SiteInfo_Y.getSiteName());
        System.out.println("・WebサイトのURL：" + SiteInfo_Y.getSiteUrl());
        System.out.println("・WebサイトのIP：" + SiteInfo_Y.getSiteIp());
        System.out.println("");

        //<表示処理その2>
        //配列に格納するWebサイト情報
        int n = 2;
        String[] SiteName_G = new String[n];
        SiteName_G[0] = "Google";
        SiteName_G[1] = "Bing";
        String[] SiteUrl_G = new String[n];
        SiteUrl_G[0] = "https://www.google.com/";
        SiteUrl_G[1] = "https://www.bing.com/";
        String[] SiteIp_G = new String[n];
        SiteIp_G[0] = "142.250.207.14";
        SiteIp_G[1] = "13.107.21.200";

        //オブジェクトクラスに格納し、コンソール上に表示させる
        for(int i=0;i<SiteName_G.length;i++){
            Website SiteInfo_G = new Website(SiteName_G[i], SiteUrl_G[i], SiteIp_G[i]);
            System.out.println("【" + (i+1) +"つ目の配列が持つWebサイトの情報】");
            System.out.println("・Webサイトの名前：" + SiteInfo_G.getSiteName());
            System.out.println("・WebサイトのURL：" + SiteInfo_G.getSiteUrl());
            System.out.println("・WebサイトのIP：" + SiteInfo_G.getSiteIp());
            System.out.println("");
        }

    }
    
}
