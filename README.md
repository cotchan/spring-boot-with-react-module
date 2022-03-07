## spring-boot-with-react-module

- 스프링부트와 [CRA(Create React App)](https://create-react-app.dev/docs/getting-started) 연동 프로젝트 템플릿(feat. Gradle)

---

### 목차

1. 실행 방법
1. CRA 추가 작업 사항

---

### 실행 방법

```bash
# 빌드
$ ./gradlew build

$ cd build/libs

# run jar
$ java -jar spring-boot-with-react-module-0.0.1-SNAPSHOT.jar
```

---

### CRA 추가 작업 사항

- CORS 이슈 때문에 CRA에 프록시 설정 추가를 위해 `http-proxy-middleware` 라이브러리 설치

```bash
$ npm install http-proxy-middleware
```

- `src/setupProxy.js` 파일 생성

```javascript
const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function(app){
    app.use(
        createProxyMiddleware('/api/**', {
            target: 'http://localhost:8080',
            changeOrigin: true
        })
    )
};
```

---

- 참고
  - [[Develop/React] proxy 수동 설정(setupProxy)](https://hoons-up.tistory.com/26) 
  - [SpringBoot (Gradle Project) 에서 React 사용하기 (1)](https://bug41.tistory.com/121)
