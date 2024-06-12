<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>CODING TEST</title>
    <style>
    header h1 {
       color: #FF69B4; /* 핑크색 */
      }

        body {
            font-family: Helvetica, sans-serif; /* 글꼴 변경 */
            margin: 0;
            padding: 0;
            background-color: #FFFFFF; /* 흰색 */
        }
        header {
            background-color: #f0f0f0; /* 연한 회색 */
            color: white;
            padding: 10px 0;
            text-align: center;
        }
        nav {
            display: flex;
            justify-content: center;
            background-color: #f0f0f0;
        }
        nav a {
            color: purple;
            padding: 15px 20px;
            text-decoration: none;
        }
        nav a:hover {
            background-color: #FFFFFF;
        }
        .container {
            padding: 20px;
        }
        .category-bar {
            display: flex;
            justify-content: center;
            margin-bottom: 20px;
        }
        .category-bar button {
            background-color: #FF69B4; /* 연한 핑크 */
            border: none; /* 테두리 없애기 */
            color: white;
            padding: 20px 30px;
            margin: 0 30px;
            cursor: pointer;
            font-size: 18px; /* 글씨체 크기 키우기 */
        }
        .category-bar button:hover {
            background-color: #FFB6C1; 
        }

        .cards {
            display: flex; /* flexbox 컨테이너로 변경 */
            flex-wrap: wrap; /* 줄 바꿈 설정 */
            justify-content: center; /* 수평 중앙 정렬 */
            align-items: center;
            gap: 20px;
        }

        .card {
            height: 400px; /* 카드 높이 변경 */
            width: 300px; /* 카드 너비 변경 */
            margin: 10px; /* 카드 사이 여백 설정 */
            background-color: white;
            border: 1px solid #ddd;
            border-radius: 5px;
            padding: 20px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            transition: transform 0.2s;
        }

        .card:hover {
            transform: translateY(-5px);
        }
        .card h3 {
            margin-top: 0;
        }
        .tags {
            margin-top: 10px;
        }
        .tags span {
            display: inline-block;
            background-color: #eee;
            color: #333;
            padding: 5px 10px;
            margin-right: 5px;
            border-radius: 3px;
            font-size: 12px;
        }
        .tags span:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
    <header>
        <h1>CODING TEST</h1>
    </header>
    <nav>
        <a href="#">HOME</a>
        <a href="#">CATEGORY</a>
        <a href="#">TAG</a>
    </nav>
    <div class="container">
        <div class="category-bar">
            <button>Sorting</button>
            <button>DP</button>
            <button>Stack</button>
            <button>Queue</button>
            <button>Graph</button>
        </div>
        <div class="cards">
            <div class="card">
                <h3>Sorting</h3>
                <p>정렬 관련 기본 개념과 예제들</p>
                <div class="tags">
                    <span>#정렬</span>
                    <span>#Algorithm</span>
                </div>
            </div>
            <div class="card">
                <h3>Dynamic Programming</h3>
                <p>동적 프로그래밍 관련 기본 개념과 예제들</p>
                <div class="tags">
                    <span>#DP</span>
                    <span>#Algorithm</span>
                </div>
            </div>
            <div class="card">
                <h3>Stack</h3>
                <p>스택의 관련 기본 개념과 활용 예제들</p>
                <div class="tags">
                    <span>#stack</span>
                    <span>#자료구조</span>
                </div>
            </div>
        </div>
    </div>
</body>
</html>