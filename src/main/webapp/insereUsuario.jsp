<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="pt_br">

	<head>
	
		<meta charset="UTF-8">
		<meta name="viewport" content="width-device-width, initial-scale-1.0">   <!-- Configuração padrão para dispositívos móveis -->
		
		<title>prj0001 - Insere Usuário</title>
		
		<link rel="icon" href="01_images/book01.png">
		<link rel="stylesheet" type="text/css" href="02_scripts/styleDefault.css">
		
	</head>
	
	<body>
	
		<header>
		
			<h1>PRJ0001</h1>
			
			<h2>Insere Usuário</h2>		
		
		</header>
		
		<main class="mainForm">
		
			<div class="divForm">
		
				<form>
				
					<fieldset class="grupo">														<!-- Tag para agrupador de campos -->
						
						<div>
							<label for="campo02">Campo02</label>
							<input type="text" class="campo" name="campo02" id="campo02" required>				<!-- Tag required torna obrigatório o preenchimento do campo -->
						</div>
						
						<div>
							<label for="campo03">Campo03</label>
							<input type="email" class="campo" name="campo03" id="campo03" required>
						</div>
					
					</fieldset>
					
					<div>
					
						<label>Exemplo de radiobuttom</label>
						
						<label>
						
							<input type="radio" name="opcaoRadioButtom" value="opcao01" checked>Opção01
						
						</label>
						
						<label>
						
							<input type="radio" name="opcaoRadioButtom" value="opcao02">Opção02
						
						</label>
					
					</div>
					
					<div>
					
						<label for="opcaoComboBox">Exemplo de combobox</label>
						
						<select class="campo" id="opcaoComboBox">
						
							<option selected disabled value="">Selecione</option>
							<option>Opção01</option>
							<option>Opção02</option>
							
						</select>
					
					</div>
					
					<fieldset class="grupo">
					
						<div id="check">
						
							<label>Exemplo de checkbox</label>
							
								<input type="checkbox" name="opcaoCheckbox01" id="opcaoCheckbox01" value="opcaoCheckbox01">
								<label for="opcaoCheckbox01">Opção01</label>
								<input type="checkbox" name="opcaoCheckbox02" id="opcaoCheckbox02" value="opcaoCheckbox02">
								<label for="opcaoCheckbox01">Opção01</label>
								
						</div>
					
					</fieldset>
						
					<div>
						
						<label>Exemplo de textarea</label>
						<textarea class="campo" rows="6" style="width: 26em" name="textarea" id="textarea"></textarea>
						
					</div>
						
					<button type="submit">Inserir</button>
				
				</form>
			
			</div>
		
		</main>
		
		<footer>
		
			Idealizado e Criado por Thiago B. Ribeiro
		
		</footer>
		
	</body>
	
</html>