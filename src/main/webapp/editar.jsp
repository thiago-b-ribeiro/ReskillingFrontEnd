<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="pt_br">

	<head>
	
		<meta charset="UTF-8">
		<meta name="viewport" content="width-device-width, initial-scale-1.0">   <!-- Configuração padrão para dispositívos móveis -->
		
		<title>prj0001 - Editar</title>
		
		<link rel="icon" href="01_images/book01.png">
		<link rel="stylesheet" type="text/css" href="02_scripts/styleDefault.css">
		
	</head>
	
	<body>
	
		<header>
			
			<h1>PRJ0001</h1>
				
			<h2>Edita</h2>	
				
			<div class="divFlex">
				<a href="main">Página Principal</a>
				<a href="index">Sair</a>
			</div>
			
		</header>
		
		<main class="mainForm">
		
			<div class="divForm">
		
				<form class="formEspacado" action="editar">
				
					<fieldset>																<!-- Tag agrupador de campos -->

						<div class="divFlex">
							<label for="campo01">Campo01</label>
							<input type="text" class="campo" name="campo01" id="campo01" readonly value="<%out.print(request.getAttribute("campo01"));%>">
						</div>

						<div class="divFlex">
							<label for="campo02">Campo02</label>
							<input type="text" class="campo" name="campo02" id="campo02" required value="<%out.print(request.getAttribute("campo02"));%>">			<!-- Tag required torna obrigatório o preenchimento do campo -->
						</div>
						
						<div class="divFlex">
							<label for="campo03">Campo03</label>
							<input type="email" class="campo" name="campo03" id="campo03" required value="<%out.print(request.getAttribute("campo03"));%>">
						</div>
					
					</fieldset>
					
					<div>
					
						<label>Exemplo de radiobutton</label><br>
						
						<input type="radio" name="opcaoRadioButton" id="radioButtonOpcao01" value="opcao01">
						<label for="radioButtonOpcao01">Opção01</label><br>
						
						<input type="radio" name="opcaoRadioButton" id="radioButtonOpcao02" value="opcao02">
						<label for="radioButtonOpcao02">Opção02</label>
					
					</div>
					
					<div>
					
						<label for="opcaoComboBox">Exemplo de combobox</label><br>
						
						<select class="campo" id="opcaoComboBox" name="opcaoComboBox">
						
							<option selected disabled value="">Selecione</option>
							<option>Opção01</option>
							<option>Opção02</option>
							
						</select>
					
					</div>
					
					<fieldset class="grupo">
					
						<div>
						
							<label>Exemplo de checkbox</label><br>
							
								<input type="checkbox" name="opcaoCheckbox01" id="opcaoCheckbox01" value="opcaoCheckbox01">
								<label for="opcaoCheckbox01">Opção01</label><br>
								<input type="checkbox" name="opcaoCheckbox02" id="opcaoCheckbox02" value="opcaoCheckbox02">
								<label for="opcaoCheckbox01">Opção02</label>
								
						</div>
					
					</fieldset>
						
					<div>
						
						<label>Exemplo de textarea</label><br>
						<textarea class="campo" rows="6" style="width: 25rem" name="textArea" id="textArea"><%out.print(request.getAttribute("textArea"));%></textarea>
						
					</div>
						
					<button type="submit">Gravar</button>
				
				</form>
			
			</div>
		
		</main>
		
		<footer>
		
			Idealizado e Criado por Thiago B. Ribeiro
		
		</footer>
		
	</body>
	
</html>