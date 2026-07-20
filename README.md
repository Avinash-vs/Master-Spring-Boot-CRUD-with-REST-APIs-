🌐 𝐂𝐥𝐢𝐞𝐧𝐭 
📲 (Postman / Frontend / Browser)
   │
   │ 🚀 𝐇𝐓𝐓𝐏 𝐑𝐞𝐪𝐮𝐞𝐬𝐭 (GET, POST, PATCH, DELETE)
   ▼
🎮 𝐂𝐨𝐧𝐭𝐫𝐨𝐥𝐥𝐞𝐫 𝐋𝐚𝐲𝐞𝐫 
⚙️ (S_Controller.java)
   ├── 🎯 Listens to endpoint mappings (@DeleteMapping, etc.)
   └── 🔍 Extracts URL data (@PathVariable) & body (@RequestBody)
   │
   │ 📦 𝐏𝐚𝐬𝐬𝐞𝐝 𝐝𝐚𝐭𝐚 𝐨𝐫 𝐈𝐃
   ▼
🧠 𝐒𝐞𝐫𝐯𝐢𝐜𝐞 𝐋𝐚𝐲𝐞𝐫 
💡 (S_Service.java)
   ├── 🛡️ Applies business logic & validation rules
   ├── 🔍 Checks conditions (e.g., verifying if ID exists or is null)
   └── 🛠️ Handles data manipulation (patch merges, safety checks)
   │
   │ ⚡ 𝐂𝐚𝐥𝐥𝐬 𝐉𝐏𝐀 𝐦𝐞𝐭𝐡𝐨𝐝𝐬 (findById, deleteById, save)
   ▼
🔗 𝐑𝐞𝐩𝐨𝐬𝐢𝐭𝐨𝐫𝐲 𝐋𝐚𝐲𝐞𝐫 
🗄️ (StudentRepository.java)
   ├── 📋 Extends JpaRepository
   └── 🔄 Translates Java commands into SQL queries
   │
   │ 🛢️ 𝐒𝐐𝐋 𝐐𝐮𝐞𝐫𝐢𝐞𝐬 (SELECT, INSERT, UPDATE, DELETE)
   ▼
💾 𝐃𝐚𝐭𝐚𝐛𝐚𝐬𝐞 
🗃️ (Oracle XE / MySQL/Postgresql)
