package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Infosys Limited is an Indian multinational information technology company that provides business consulting, information technology and outsourcing services. The company was founded in Pune and is headquartered in Bangalore.[5] Infosys is the second-largest Indian IT company, after Tata Consultancy Services, by 2020 revenue figures, and the 602nd largest public company in the world, according to the Forbes Global 2000 ranking.[6]

On 24 August 2021, Infosys became the fourth Indian company to reach $100 billion in market capitalization.";
	}

//	echo "# github-actions-example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Java-Techie-jt/github-actions-example.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
