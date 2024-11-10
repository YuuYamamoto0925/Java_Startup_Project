package Exam_chapter005.Sample004;

public class Website {

    private String SiteName;    //Webサイトの名前
    private String SiteUrl;     //WebサイトのURL
    private String SiteIp;      //WebサイトのIPアドレス
    
    //Websiteクラスのコンストラクタ
    public Website(String SiteName,String SiteUrl,String SiteIp){
        this.SiteName = SiteName;
        this.SiteUrl = SiteUrl;
        this.SiteIp = SiteIp;
    }

    // ------------------------------------
    // 【アクセス修飾子の意味】
    // public ⇒ どこからでもアクセス可能
    // (default)未設定 ⇒ 省略されている場合、同じパッケージ内のみアクセス可能
    // protected ⇒ 同じパッケージ、またはサブクラスのみアクセス可能
    // private ⇒ 同じクラス内のみアクセス可能
    // ------------------------------------
    
    //Webサイトの名前を返す
    public String getSiteName(){
        return SiteName;
    }

    //WebサイトのURLを返す
    String getSiteUrl(){
        return SiteUrl;
    }

    //WebサイトのIPアドレスを返す
    protected String getSiteIp(){
        return SiteIp;
    }
    
}
