class Container {
    private Node head;
    private Node tail;

    void addF()
    {
        Node a = new Node();
        a.data = -1;

        if(head == null)
        {
            head = a;
            tail = a;
        }
        else {
            a.next = head;
            head = a;
        }
    }

// Добавляем в конец списка
    void addB(int data)
    {
        Node a = new Node();
        a.data = data;
        if (tail == null)
        {
            head = a;
        } else {
            tail.next = a;
        }
        tail = a;
    }

    void printL()
    {
        Node el = this.head;
        while (el != null)
        {
            System.out.print(el.data + " ");
            el = el.next;
        }
        System.out.println();
    }
    int getE(int index) {
        if (head == null)
            return -1;

        Node el = head;
        for (int i = 1; i < index; i++) {
            if (el != null)
                el = el.next;
            else
                return -1;
        }

        if (el != null)
            return el.data;
        else
            return -1;

    }
    void delE(int data)
    {
        if (head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node el = head;
        while (el.next != null) {
            if (el.next.data == data) {
                if(tail == el.next)
                {
                    tail = el;
                }
                el.next = el.next.next;
                return;
            }
            el = el.next;
        }
    }
}
