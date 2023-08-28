const base = {
    get() {
        return {
            url : "http://localhost:8086/springbootweb/",
            name: "springbootweb",
            // 退出到首页链接
            indexUrl: 'http://localhost:8086/springbootweb/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "Boss"
        } 
    }
}
export default base
