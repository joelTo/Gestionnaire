export default class DocumentController{

    constructor(DocumentService, PanierService){
            this.DocumentService = DocumentService;
            console.log(this.DocumentService)
            this.PanierService = PanierService;
            console.log(this.PanierService)
        }

       $onInit(){

         this.initDocument();
         this.getCateg();
       }

       initDocument(){
            this.DocumentService.getDocuments()
           .then(documents => {
               this.documents = documents;
           })
           
       }
       

     afficherModale(Document) {
        this.currentDocument = document;
        console.log(document)
     }

     ajouterPanier(document) {
         this.PanierService.ajouterElement(document);
     }

     sort(predicat){
        if(predicat !="Tous"){
        this.documents =   this.DocumentService.getDocuments()
           .then(documents => {
               this.documents = documents
             .filter((document)=> document.categorie == predicat);
           })
         }else{
         this.initDocument();
         }
  
      
       
         
     }
     
       saveDocument(document) {
           console.log(document);
        this.DocumentService.saveDocument(document);
    }

    

}
