# SondaReqInfTransacao

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataLocal** | **String** | Data máxima da transação desejada (yyyy-mm-dd) para procurar o NSU em até 7 dias antes desta data/horário. Obs. Campo será tirado de versões futuras, mas ainda necessário e mantido por retro-compatibilidade. | 
**horaLocal** | **String** | Hora máxima da transação desejada (hh-mm-ss) para procurar o NSU em até 7 dias antes desta data/horário. Obs. Campo será tirado de versões futuras, mas ainda necessário e mantido por retro-compatibilidade. | 
**nsuSonda** | **Long** | NSU da transação de sonda. Necessário para controle interno e rastreabilidade das requisições. | 
**nsuTransacao** | **Long** | NSU da transação desejada. Gerado pelo sistema da SEP. Para casos de teste usar até 10 para retorno cancelado, até 20 para estado confirmado e o resto pendente. | 
