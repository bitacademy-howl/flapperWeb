/**
 * 
 */
/**
 * @author howl
 * 
 * 기본적으로 모든 빈은 SingleTone!!!!!!!!!!!!!!!!!!!!!!!!
 * 때문에 서버 설정파일들과 같은 싱글톤 객체들을 XML로 작성하여 컨테이너에 담고 관리하기에 편리하다.
 * 
 * 동일한 스프링 프레임 워크에서 하나의 객체 인스턴스만 존재 (like static)
 * but 동일한 JVM 상에서 다수의 컨테이너가 실행될 수 있기 때문에 하나의 JVM에서 동일한 다수의 빈 인스턴스를 가질 수 있음.!!!!!!
 * 
 * 
 * 
 * SCOPE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 이 또한 빈의 scope 설정을 통해 변경가능....
 * 
 * 
 *
 */
package scope;