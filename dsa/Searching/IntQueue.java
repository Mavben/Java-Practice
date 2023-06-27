package day03_StackQueue;

public class IntQueue {
	
	// 큐로 사용할 배열 que - 인큐하는 데이터를 저장하기 위한 큐 본체용 배열
	private int[] que; 		
	
	// 큐의 최대 용량 capacity - 배열 que에 저장할 수 있는 최대 요솟수와 같다.
	private int capacity; 	
	
	// 프런트 front - 인큐하는 데이터 가운데 맨 앞 요소의 인텍스를 저장하는 필드
	private int front; 		
	
	// 리어 rear - 인큐하는 데이터 가운데 맨 뒤에 넣은 요소 하나 뒤 인텍스를 저장하는 필드
	private int rear; 
	
	// 현재 데이터 개수
	private int num;
	
	//  실행 시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() { }
	}

	// 실행 시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() { }
	}
	
	public IntQueue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntQueueException {
		if(num >= capacity)	// 큐가 가득 참
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == capacity)
			rear = 0;
		return x;
	}
	
	public int deque() throws EmptyIntQueueException {
		if(num <= 0) // 큐가 비어 있음
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == capacity)
			front = 0;
		return x;
	}
	
	// 큐에서 데이터를 피크 (프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException {
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	// 검색 메서드 indexOf - 큐에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if(que[idx] == x) 		// 검색 성공
				return idx;
		}
		return -1;					// 검색 실패
	}
	
	// 큐의 최대 용량을 반환하는 메서드 getCapacity
	public int getCapacity() {
		return capacity;
	}
	
	// 데이터 개수를 확인하는 메서드 size - 현재 큐에 쌓여 있는 데이터 개수을 반환
	public int size() {
		return num;
	}
	
	// 큐가 비어 있는지 판단하는 메서드 isEmpty - 비어 있으면 true, 그렇지 않으면 false를 반환
	public boolean isEmpty() {
		return num <= 0;
	}
	
	// 큐가 가득 찼는지 판단하는 메서드 isFull - 가득 찼으면 true, 그렇지 않으면 false를 반환
	public boolean isFull() {
		return num >= capacity;
	}
	
	// 큐 안에 있는 모든 데이터를 출력하는 프런트 -> 리어 순서로 출력하는 메서드 dump
	public void dump() {
		if(num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for(int i = 0; i < num; i++)
				System.out.print(que[(i + front) % capacity] + " ");
			System.out.println();
		}
	}
}
