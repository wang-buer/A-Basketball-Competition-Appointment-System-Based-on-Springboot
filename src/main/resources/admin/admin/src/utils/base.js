const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootkklwr/",
            name: "springbootkklwr",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootkklwr/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "篮球竞赛预约平台"
        } 
    }
}
export default base
