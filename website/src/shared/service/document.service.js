const api = 'http://localhost:2000/documents'

export class DocumentService {

    constructor($http) {
        this.$http = $http;
        this.Document = this.$http.get(api)
            .then((response) => response.data);
    }

    getDocuments() {
        return this.Document;
    }

    // getDocumentsById(id) {
    //     return this.Document.then(Document => _.find(Document, p => p.id === id));
    // }

    saveDocument(document) {
        return this.$http.post(api, document)
            .then(response => response.data);
    }

}