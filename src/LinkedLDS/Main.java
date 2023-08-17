package LinkedLDS;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.prepend(0);
        linkedList.display();
        linkedList.delete(2);
        linkedList.display();
    }
}
echo "# Radiance" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/GhostRavenDrago/Radiance.git
git push -u origin main