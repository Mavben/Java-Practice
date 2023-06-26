package day03_StackQueue;

public class IntStack {
	
	// 스택용 배열 stk - 푸시된 데이터를 저장한다. stk[0]부터 저장된다.
	private int[] stk; 		
	
	//  스택 용량 capacity - 스택에 쌓을 수 있는 최대 데이터 수를 나타내는 int형 필드이다.
	private int capacity; 	
	
	// 스택 포인터 ptr - 스택에 쌓여 있는 데이터 수를 나타내는 필드
	// 스택에서 데이터를 푸시(push)할 때 ptr을 1 증가시키고, 데이터를 팝(pop)할 때 ptr을 1 감소시킨다.
	private int ptr; 		
	
	
	//  실행 시 예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { }
	}

	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }
	}

	/*
	 *  생성자 : 스택용 배열 본체를 생성하는 준비 작업을 한다.
	 *  	생성할 때 스택은 비어있으므로 스택 포인터 ptr값을 0으로 한다.
	 *  	매개변수 maxlen으로 전달받은 값을 스택 용량을 나타내는 capacity에 대입하고 요솟수가 capacity인 배열 본체를 생성한다.
	 *  	스택용 배열 본체의 개별 요소에 접근하는 인덱스식은 바닥부터 stk[0], stk[1], ..., stk[capacity - 1]이 된다.
	 */
	
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	// 푸시 메서드 push - 스택이 가득 차서 푸시할 수 없는 경우 예외 OverflowIntStackException을 내보낸다.
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= capacity)	// 스택이 가득 참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	// 팝 메서드 pop - 스택이 비어 있어 팝을 할 수 없는 경우 예외 EmptyIntStackException을 내보낸다.
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) // 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[ptr--];
	}
	
	// 피크 메서드 peek - 스택의 꼭대기에 있는 데이터를 '들여다보는' 메서드, 스택이 비어있으면 예외 EmptyIntStackException을 내보낸다.
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0) // 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	// 스택의 모든 요소를 삭제하는 메서드 clear
	public void clear() {
		ptr = 0;
	}
	
	// 검색 메서드 indexOf - 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--)
			if(stk[i] == x)
				return i;
		return -1;
	}
	
	// 스택의 용량을 반환하는 메서드 getCapacity
	public int getCapacity() {
		return capacity;
	}
	
	// 데이터 개수를 확인하는 메서드 size - 현재 스택에 쌓여 있는 데이터 개수(ptr값)을 반환
	public int size() {
		return ptr;
	}
	
	// 스택이 비어 있는지 검사하는 메서드 isEmpty - 스택이 비어 있므면 true, 그렇지 않으면 false를 반환
	// 반환식 ptr == 0도 가능
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// 스택이 가득 찼는지 검사하는 메서드 isFull - 스택이 가득 찼으면 true, 그렇지 않으면 false를 반환
	// 반환식 ptr == capacity도 가능
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	// 스택 안에 있는 모든 데이터를 출력하는 메서드 dump
	public void dump() {
		if(ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for(int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
