package io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializationEx1 {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		Person person1 = new Person("John", "Student");
		Person person2 = new Person("Alice", "Writer");

		// 파일에 객체를 저장하기 위해 FileOutputStream 객체를 생성하고, 이를 BufferedOutputStream으로 감싸고,
//        다시 ObjectOutputStream으로 감쌉니다.

		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\person.dat");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos)) {
//			oos.writeObject(person1); // 객체 person1을 직렬화하여 파일에 저장합니다.
//			oos.writeObject(person2); // 객체 person2도 직렬화하여 파일에 저장합니다.
			for (Person person : people) {
				oos.writeObject(person);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 파일에서 객체를 읽어오기 위해 FileInputStream 객체를 생성하고,
//        이를 BufferedInputStream으로 감싸고, 다시 ObjectInputStream으로 감쌉니다.

		try (FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\person.dat");
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis)) {
			// 저장된 객체를 역직렬화하여 원래의 객체로 복원합니다.
			Person deserializedPerson1 = (Person) ois.readObject();
			Person deserializedPerson2 = (Person) ois.readObject();
			// 복원된 객체의 정보를 출력합니다.
			System.out.println("Name : " + deserializedPerson1.getName() + ", Job : " + deserializedPerson1.getJob());
			System.out.println("Name : " + deserializedPerson2.getName() + ", Job : " + deserializedPerson2.getJob());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
