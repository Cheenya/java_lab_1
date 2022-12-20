class List {
    private ListEl head;
    private ListEl tail;

    void addF()
    {
        ListEl a = new ListEl();
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
    void addB(int data) {
        ListEl a = new ListEl();
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
        ListEl el = this.head;
        while (el != null)
        {
            System.out.print(el.data + " ");
            el = el.next;
        }
        System.out.println();
    }

    void delE(int data)
    {
        if(head == null)
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

        ListEl el = head;
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
