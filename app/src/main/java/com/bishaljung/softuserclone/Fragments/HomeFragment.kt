package com.bishaljung.softuserclone.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bishaljung.softuserclone.Adapter.StudentDetailAdapter
import com.bishaljung.softuserclone.Model.StudentModel
import com.bishaljung.softuserclone.R

class HomeFragment: Fragment() {
    private  var studentList= ArrayList<StudentModel>()
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_fragment_home,container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        studentData()

        val adapter = context?.let { StudentDetailAdapter(studentList, it) }
        recyclerView.layoutManager = LinearLayoutManager(null)
        recyclerView.adapter = adapter
        return view
    }
    private fun studentData() {
        studentList.add(
            StudentModel(
                1,"Bishal Jung",
                "20","Male",
                "Kathmandu",
                "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxMTEhUQEhIVFRUWFhUWFRUWFRUVFRYYFRUWFxUVFRcYHSggGBolGxUVITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGhAQGy0dHyUtLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIALcBEwMBIgACEQEDEQH/xAAbAAABBQEBAAAAAAAAAAAAAAABAAMEBQYCB//EAD0QAAEDAgQDBgQEBAUFAQAAAAEAAhEDIQQFEjEGQVETImFxgaEHMpGxQsHR8BQjUuEVFhdigkNykrLxM//EABkBAQEBAQEBAAAAAAAAAAAAAAABAgMEBf/EACQRAQEAAgIDAAEEAwAAAAAAAAABAhEDIRIxQVEEIjJhE3GB/9oADAMBAAIRAxEAPwDzfJaOqs0dL/RbPGYxrWaRuG7RzPislw4f53ofyWxzKi00zG5aDsuuJPTP4PEOkadzYLZVMHVFMOFyQsHTcWiRuCSFv+F89bUpDXuLFWG78cPwNTsi9xiyxtSuQ43vP2K0/G2fQzsqdibT0lY/TdoSm79anDUpYSSDaYWIzenFV31XoGHpaaVybN6WWAzh81neg9lMi/xQoXofAfDNOowVXgEm/kPBeerV8NcXHDs0OBtsd1MWHojuFqBJ7jZ2FhKq6/w7oOfqJcL7AwPKFQN+ILg8nSYmbc0q3xEedmned/Za3EabF8AYd8ACIPK0phnw7w7HBxkwflJMKhZ8SHj/AKZvvfbyUbF/EGq7ZsRtJ+6dD0xmS4aGyxpjbaxQxuTUngNgR4LySvxlXMQYgyb7qQ3jzEWDQLeJvKbG9PA2E3NNvX/6n/8AKWDFxTYCIMrKf4/jHtEBrRpbqJJ3cJgeUqbgMY+pTcQ8l3UW5T9LQueXNhHTHiyrXUcCxgIbG6Zwr3h7u1DQBtBtHVY+lmdTVDi7xFwbeMQncUalRoIruH/GBHiCfzWZ+ow+tXgy+Kz4nZixzuyYWzYkDosAtNmnDuILu1JFQHcg3A6wqN+CcCWkX+/kteeOXpi4We4iLe5dhA+jEn8O3osGQtrw5iNdIDnER4haxXH6qc2pltUNJm8eysOGs57DEaHDuui/QocQYeYcIm23UfsqnrUySx43G6vpPcetObRntBF15/xXnArVhSaLNuT+Sebmnc06oOnqs+KR1ucdyVbTxOYBhdXt4ey0+M7tMzAsdjPJVGQ02h2om/JSOKMbppkA7jSPXdPiz2xBQK6XKww9B4T4zp06IpVbFtgTYGBG6kYfj9grO1DuQAHb7LzZBXyo9Wp/EWjAmR6FJeUpJ5UT8BW0VGu6G/kVvadQOpyTIHJedq+ybMrdm4+XikreP4dvYCTp2myewlXsQTfn6KTUwUkCmYBIkdPJW5yRpaJla0t6Z6v/ADSHxtsjhtLX6nXhXlXKwGwJPK9lXUMM2mNdUgkbD8I/umj2sM0zANpSbcyPsFgKjpJJ3Jn6qxzfMjVMD5Rt4+Krlm3bOV+QEkUoUZBKF1CSAIQuoXTKc9f30QctYTsJWmy3KWsu+JjaJv0/JPUsC2nSDnNGttNu0XOp1z1/Co2Pxh1DxMj/AJmV5s+S3qPTx8cndXBae+P6Q3b8WoSY+n1T2SUTTqGDLC1rY6QRBHUEQVWOxYAdO7WwZ/EBrj1nWE9l2MLAZdMO57gT+sLjrTvvbQ4nD3GoBzXWcCOY5+J5dVGp4ch38ioWm8MMR42NjytbzXWIra2SDGxaf6HDafA291GfigWg1BpJdpLm7sd+EzzaRt6rKnI1Eh7dDxsRseV2ugg/udlHq5drllTSHC7TAbPiOl+sKQMxLmup1o1t2eNntNg48xyE9QqXG4wvs6mXafxRHmC6OnX6pP6S/wBq7Pspc0a9Nx8xGxHUjkoGSZh2L7/Kd/DxVsMb2bnNfMSYafw8jv8AMOSqcfQp6dbDveOgOwC9PFyfK4cnHr90XuZUHPPasOpu5aPuEzluHNWdImLdCqbLc2fStu3p08losvz+lvYE9bH6r1SuXV9IzsjeH6tJHrZNZlScxzRpmen59FeVM8pRu3r8yqsw4gp8oJHRXo1frilhhTPauMGNpsFn81xpqvnkNv1Sx+YPqb2HT9VDhZtTK/I5IQXSCjAILpBBykjCSCQiEEkFhg82ezxHurelxSR/UsyirtqZVocRxM47A+pj7KnxWNfU+Y26clGSCbS5WkikkogQiikgCKSSBKRhHRY/KfWDyKYU3LMJrcAdvPfwUvpZ7XGGD6o7NoJtY9P3b6KNicA/ZwIIg+rSD9pXpnCOVtZT1kAF21tmiwCtMdk9J4u0ey8Pe+n0JJrt43VpmQ7wdPWC9zoP190nNcGyef7/AEXomI4VbqsbJ1vDLCBMKXKtTCMJg82cw6CJaRcePMfvonCxxa7RDmx8h3je3OOccltzwlT3hOf5aYBYfvqs3a6jz2vWc0B24/E0i4teJm146rn+NxDQTT7zQflkOsbmb6o236+a22YcPjTE2vb3WaxGUNpklrg3kdVvod/34qypYp8Zj+0bNQRI3jV3o6WB38/oolPAOc12mTpiLQS08x6qzZh6rXGm0tIMgOE6QANyXxG+/NSsBQdJZUnvW1SXTHRxvF59V0mXjduVm5pj3tgrlT84wxp1S0qCvbLuPFenKSKSICEIlBACEESgUAhArpBAEF0ggfRQRQFJAIhAUkklQYSSSQJFAIoEkkkgKewdVzXDTvIj1TKtcnyuo97HRADgb878gpfS4+3tGBpkU2joAPZOkuTrWBoGxTjKjTyXzn0YhOJRbPRSw0brirUaOammtojsQei7pYiUnCdoPr/ZNVKfgf3907XpziDq2CrsZg2GNbRaJHL93U99SBZVONxM2/f7uovwzmeVsqNmmYAdcACI07RvNrHzURuVPZoMd0HpHMzI/wDH6Kzy7EAdzrufEfax9k9nuYijhqlTm1piebjZvuQuutvNb4vKOKKzX4qq5m2qPUWPpIVQuyZuVyV7ZNTTxW7CEEUlQEEUEAKBRSQcoFdIFAEkkkD6KCIQIIpJIEikAkqhJJLs0jaxvtbfyQcIpw0XTGkz0goVKTm7tI8wQg4RQUrLsP2lRreXPyCKueHMl1kPcPIfmVsBRDBDAC7YHoeULmgzs6fS3qAmcrripXpyfxNgeu61eo6Sd6iK/FYvDDtGvDgZltR7RPlq/VT8v407UaXUnMdzIhzfqNldZvwtSru1vZqIbAG0c5EKor8Mjusa0tDZ0gG4+n5r5Vn7X0cf5LH/ABB2gvOq+wg7Db6qvxXGNCnZ4c4+DTP1Nlp8ThwzDhvMNAnxhef5jww59yXX3j+6xMdXt03udLihx1h47v0Nj9lb5dxZRqCDY8xusZh+GTTHdqOHg9rXj0kKThstcHS+mJGz6YsfNt4W7ZPTEx37b6vh9UObsqbNsNpbJVlldUlgaZEbf3m6a4kpDspmdgjPq6U2SsD3i1/L3VR8VMdpLcM3nDnD/t29z7KywFbsWl+mXH5QN3ePgFHzbGDF0a9PEUKbXU6ZfTqtYA9jhcNLtyDtHiumHJMcpKzl+mzz48s8fUeYIKTiMHUZGthE7SN0zoO0GekFe5802krd3DuI7IVhTJaY23E7WUxvBuIiXANkSN/orqozaCfq4V7SQWOsSCYMW8UP4Z/9Dv8AxKKYQV1l/DtWrTdUaILTGkgyY+ysP8iYrs9fdmJ0zf6pqm2VQK1beBcR2faktFp0mZ8llqjSCQdwYPollg4SSSUHpWM+HRLnFr9I5CNpTuL+HPcaGOIdzPXqrqtx1RuA4X29N0qfHtAwS8QTtzBXTURnf9OHA3qGBvYStPT4Bw5pNaRtF+aj47j6jcNcCd7fZVmI+IYDAW3JIkdIKdDR4zhGkG6WNAm2w2hUB+G7Ds5w5p//AFEpQCTJ3PqnKvxEo6RDpMREGyBsfDikIMuOxiVf4Xhuk25aCRESNlmXfEVvjtG3Rcn4jN1fKS0+G0INdh8tpOeZYO7sYWI+JzKbSGtiZ+iexHxBpgnQHXFzCxOe5s/E1TUcfIdAlor1c8LsmoT0H3VKrjhmtFWOo+yzPbWPtrc0qvDTttHiFV5DiNNem4mwcP0V9mB1sI6hZBzSJHP8wrlNxqXt7RRqaudkixs6Ruf2VnshzTtMOKk3iH+DgLpUc30aqpG5LWkwBAjb1+y+X5auq+njh5TcaDHskeCrcOQTvIFlSYzjFjCG1LA8wC77Awk7GCo4YigZYGgOEG9/uJWbfsdJh8rRvpAA2lMio3mIUWljpEg2UTG4sNUuZ4flctqt291R8RY2CxkxJ++3uopzQTa91AxLjVqsg7mT6bR7/RWVzymj2OwpDqNSSC7cbiCSR7AfRaPLsvaO07QDvOAvz2/QLqm+m1jn1CGkRq1fhgDbpYe685z/AIxe6s7sTFMWbO/iV24OPeflU/U8/jw/4/8Aj1Ovl9F+kENMHp7pqtlGHa7VpbO0wvIW8XYoADWLc4381xX4sxLjJcBaIA919Hyj5L2enjaDaV9MCyeq1aTwIIiQF4JXzis6n2TnktmfFOs4ixAAaKhgCFPKD24ZfQ0xDYO9lyyjhwNMN58gvFxxRitOjtTHWBP1Ud2fYgz/ADDcQnlB7extFsuBAB3UbMWPc7UyoBT0XbF56yvF6md1yC01DBEHyXQ4hxOjs+2dpiPGPNPKD1viTPKdDBiXCT3fEmOS8Qe6SSeakYjHVHta17y4N2B5KMs27HKSMpKKelGUkUClKUkkBlJJJVCSRSCBJJIoEnMNWLHB45FNpSg9CwuND6Ug+IVM+7jNr7cwqfKszNIwbtPLp5LT4atSqkOkem63vbrNXtKyCp2ba7DsWtcOXUHf0TNcvqsvfTZo2FuY9lKzBgcNNMgk03NNv9zDHsq/iLh7EupN7J5GmO620cxt16r53Ljrlse/g3cFPRwlTUNYcIne9+nh/ZanKszFJuk8xImw6QPZZxmQYmLYt8jZpok7eP73U7D5XiyNNUtI5EjS7boCVnKadcZfxZ/tpsJXY7vMPdm45tP6Kpz/ABJBgc+7Iv5+XJM5RqpVjTeCA5pvyJ5eXJLMWhz3E+HW0EfWRC5anktt0awLTN/Oduk+sFTqMds2lMHvOtY7Cw5TyVdTOlpncSenP5b891IyRuuapJ60/AA94epPsukjjcvwpuOcXU7c0HPOlgZ3Z/EWzJjc3CzMK64yLv4ytq3lv/o2FSr3YSTGPn8mVuVtCEEZQWmAShFCUQIQhElBFBJFBBygV0hKAIIpIH0QgigKSCSAooIqhIoJIgpJJIEigkgK7p1S0y0keS4Vjg8GANb/AEH5lFS8rzCs0iq67W3vaf1XoWPfVfQbWoEB0ah0II2ledVa0td5K54V4pLKRw5IlvyzF29BK8vPhv8Ac9f6bk1fGmTxFi3P7LS4E+futRldN4b35c7n4KnGdNFS+8bxfZT3cXMDbgDlM7jzXmym3umWvdScys2YvyWfo4oB7iIMiYJtPXw3H0UDiDisP+X0Hkf/AKs1/HPce7MuIVw4r9cc+ab1GgzPMA49kzzf02EX8wFquF3DU0NuNIB35D2WKy/KXamj8ZIm/I3krbZfpw4ixdu5xMATyPoFu61qMze93pmPiLRbSxbnvdAeGOAiZhoaY9QqjCVIAgQPK5V9xnxNSxLW0G02u0uDu1I5j+j8ys5SevVhvXbxZ630nuax4hzRPUCCqrF4UsN7jkVYteAFFxWbNHdMEeK2zYgILtwB7zdj7eC4VZJBFBAEkkECQKSSAJJJIH0kAigSIT2Hwj3/ACj15KzpcPvIufZXSzG1TpK3rcPVBsZ8xCrK+Gcww4EfZCyw2iuUUZFJBFAkV1RoucYaJU1mADfnMnoPzKLp3lFBpl7hMGAOXmU/jHyozq4YbCGnp90qz5uFlTdN8SCq+sdDw+CQDcAwY5weqlPKj4gSFKs6aJ+Ra2itSruLXCQYBIB6qlxWWVbfzJB2Mfu6f4Xzs0Hdk+9Nxt/tJ/Iq9xTmOFjpv5exXkyuWF092Mw5JuMxRyYT3j4rQZZljRsI/Tr7o0aVMXc63K+6bzWs1o1zDYgWI8wOsrO7ndN+M45vTRCrSpMNYwA0b29vosJm2dvrkiYZJMc3f936KDjMa+rYzpGzeXmepTTKTunuu/HxeLy83N59Q6yonRiU23DnwXf8ETsR9F2cDj6dSp8sR5p+hllMXeAT43Uelgqo2eApDcIB89U+g/VB3Uy5o/8AycG89J+U/oo78Od3CPcfVStNEf1HzcfyS/iqI5x/y/VUVr2EbrgqxdXon/qAeBghMvwk3Y4EeBlXaIaS6fTI3C4RCQKSSBIJJIHwrbJMqNUgnbl4quwdHW9rOp9ua9DwNEUqYMRax6R1WpNtSfXeGy9lMCRfw2CbxGOa23hsAmnV+0OkGB4HeUamSyfmK0342puHzBjrSLxuFGzHBU3iIF9h18lx/g4aCdRsmqNQa9LjtYHoqllxZHNsuNJ3+07H8lAXoOeYRtSmY329eRWSy/LfxVBYbN6+fgudmmbPwh4bBvf8rSR12H1U6nlzW3edR6Db681OrYn8IsOgsFAqVJUTRypiIENgDoLKMakrh5TYKgcLJ3UR1UtMHZT2qHimSgJeCmaiYkt2Xf8AFDYopisRzVnlubOADSZAsJuq+vEGOijUKjWiTfoP1WMsZlO28M7hdxpaWaFsucAT+EADf8gqrHYx9V2p522HIeSgVcaTyTXbPKmOGMu1y5cspq+k3VCXbKDpcdzC7bQ8z4mwW3NJOLHVcnHxsVw3DDz9guxhAg5OZHxXIxVR2wT7cIFJpUgNkEZmEc673HyFlYYTDsbs0eZukAnWKh9+HY6zmNPp+ai1MmbvTcWnzlSQ5diqgqamKqU+7Vbqb1/uuKxaTLZAI2PJXVVocINwqfFUC0+CRKZQSSIVQkkkkF7wxTmqT0b9ytTmWNhjm6SIAAPLqsxwpUiqR1H2K1mdMDqbiBexW8fTfyKHL3y9l4kgLdYvKXlocx28LzUz2ZjcT7Gy33CfEZdRaKhkgbpKd76SMyy4toEl5Do8lhn1Tq33P2V9xlnrnxSYYkwfLms7SZLmjxVtSb+tNUqBtMuJJkCAdpWcxGJklS86xQADRsBAVAa03WMruiSXqNVqItrSFGqOWUd6kmlcNTjAgeBsmaoT5Cacgjuppuo0Dce0qVC4cgrqx7p2HpCjaLcvop2KTBbZQMmnsPBOsoHoPddsF1JAQNMo/sBOCmF3CICKAXTQkQulQYSCCBQd6l02omV0EQ8XpNeo1SpC5pVZQT2VU5VAcIUWV3TqKK2fw94bpvYazwHOkgbWgxHgtTW4Xw7qjCWC0kbcl55w9nz8K8kXY75m/Zw8VN/1Af8AxIqEHs2hw0xck811mU0xYss0+HpqVXvY7S0uJAGwSQp/EtkXY6UlekYDAYns6jX9Dfy5reVsQ3s9fKLopLOLrPVZ0NBJLdiumYg0BYWSSRfhysO0765pjvAfvxQSS+iq7N8RJhRQ7upJLmyZwr/mHqkSkkgdpqQwJJKjsptwQSRATbkUkECsboEJJKA0N5UkBJJUdoAJJIEUUkkUCU24pJIV0EJSSUEfEOXVAoJIiXNkmOSSRTr9kxXpahq5jfxH6pJKohpJJKsv/9k=",

            )
        )
    }

}