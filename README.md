# 📱 스마트 포트폴리오 (Smart Portfolio)

리사이클러뷰(RecyclerView)와 애니메이션을 활용하여 포트폴리오 정보를 효율적이고 간결하게 관리할 수 있도록 제작된 **안드로이드 포트폴리오 애플리케이션**입니다.

---

## 📌 앱 소개 (App Introduction)

* **효율적인 포트폴리오 관리**: 리사이클러뷰를 통해 접었다 폈다 할 수 있는 간결한 정보 제공
* **Lottie 기반 로딩 애니메이션**: 앱 시작 시 Lottie 애니메이션을 활용한 로딩/인트로 화면 구현

---

## ✨ 주요 기능 및 특징 (Key Features)

### 1. 🔄 Lottie 애니메이션 로딩 화면
* 앱 실행 시 Lottie 라이브러리를 활용한 움직이는 애니메이션으로 로딩 화면 구성

### 2. ↕️ 접었다 폈다 할 수 있는 리사이클러뷰 (Expandable RecyclerView)
* **화살표 클릭 시 회전 애니메이션**: 화살표 아이콘 클릭 시 Direction 회전
* **상세 화면 아코디언 구현**: 각 항목(자기 소개, 포트폴리오, 희망 직종) 클릭 시 상세 내용이 숨겨졌다 나타나는 기능

### 3. 👤 프로필 및 포트폴리오 섹션
* **자기 소개**: 기본 인적사항, 전공 및 특이사항 정리
* **포트폴리오**: 웹 프로젝트 경험 및 결과물 소개 (GitHub 링크 연동)
* **희망 직종**: FrontEnd, Android, BackEnd(Full Stack), iOS 개발자 목표 제시

---

## 🛠 기술 스택 (Tech Stack)

| 구분 | 내용 |
| :--- | :--- |
| **Platform** | Android |
| **Language** | Java / Kotlin |
| **UI Components** | RecyclerView, ConstraintLayout, Custom Animations |
| **Library** | Lottie (Loading Animation) |
| **Version Control** | Git, GitHub |

---

## 📱 주요 화면 (Screenshots)

| 로딩 화면 (Lottie) | 메인 (접힌 상태) | 상세 보기 (펴진 상태) |
| :---: | :---: | :---: |
| *(Lottie 애니메이션)* | *(자기 소개, 포트폴리오, 희망 직종)* | *(화살표 회전 및 상세 정보 출력)* |

---

## 💡 개발 및 문제 해결 과정 (Development & Problem Solving)

* **핵심 로직 100% 직접 구현**: Lottie 애니메이션 연동, Expandable RecyclerView, 아이콘 회전 애니메이션 등 앱의 주요 UI/UX 및 핵심 로직은 직접 설계하고 구현했습니다.
* **AI 도구를 활용한 문제 해결**: 환경 설정, 빌드/배포 이슈 및 대용량 파일 업로드 제약 발생 시 AI를 보조 도구로 활용하여 원인을 분석하고 신속하게 해결책을 모색했습니다.

---

## 🚀 향후 개선점 (Future Enhancements)

1. **사용자 직접 항목 추가 기능**: 앱 내에서 포트폴리오 항목을 직접 생성/수정/삭제(CRUD)할 수 있는 버튼 및 데이터베이스 기능 추가
2. **Intro 화면 강화**: 앱의 목적과 포트폴리오 주제를 더욱 명확하게 전달할 수 있는 인트로 비주얼 연출 강화
