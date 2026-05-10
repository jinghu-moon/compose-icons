import os

def fix_file(path):
    with open(path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    if 'implementation(project(":generator:core"))' not in content:
        # 针对 generator/core 特殊处理，不添加
        if 'generator/core' in path:
            return
        
        if 'dependencies {' in content:
            content = content.replace('dependencies {', 'dependencies {\n    implementation(project(":generator:core"))')
        else:
            # 在 plugins 块后安全添加
            if '}' in content:
                pos = content.find('}') + 1
                content = content[:pos] + '\n\ndependencies {\n    implementation(project(":generator:core"))\n}' + content[pos:]

    with open(path, 'w', encoding='utf-8') as f:
        f.write(content)

generator_dir = 'generator'
for root, dirs, files in os.walk(generator_dir):
    for file in files:
        if file == 'build.gradle.kts':
            fix_file(os.path.join(root, file))
