fun main() {
    // Connecting nodes one by one
    run {
        val node1 = Node(value = 1)
        val node2 = Node(value = 2)
        val node3 = Node(value = 3)

        node1.next = node2
        node2.next = node3

        println(node1)
    }
    // Filling in the linked list using multiple pushes
    run {
        val list = LinkedList<Int>()
        list.push(3)
        list.push(2)
        list.push(1)

        println(list)
    }
    // Chained pushes
    run {
        val list = LinkedList<Int>()
        list.push(3).push(2).push(1)
        println(list)
    }
    //
    run {
        val list = LinkedList<Int>()
        list.append(1)
        list.append(2)
        list.append(3)

        println(list)
    }
    //
    run {
        val list = LinkedList<Int>()
        list.push(3)
        list.push(2)
        list.push(1)

        println("Before inserting: $list")
        var middleNode = list.nodeAt(1)!!
        for (i in 1..3) {
            middleNode = list.insert(-1 * i, middleNode)
        }
        println("After inserting: $list")
    }
}