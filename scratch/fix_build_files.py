import os

def fix_file(path):
    with open(path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    # 修复 `n 乱码
    content = content.replace('`n', '\n')
    
    # 修复 project(":generator:core") 的重复或错误
    if 'implementation(project(":generator:core"))' not in content:
        # 在 dependencies 块开始处插入
        if 'dependencies {' in content:
            content = content.replace('dependencies {', 'dependencies {\n    implementation(project(":generator:core"))')
        else:
            # 在 plugins 块后插入
            content = content.replace('plugins {', 'plugins {\n}\n\ndependencies {\n    implementation(project(":generator:core"))\n')
            content = content.replace('}\n\n}', '}\n') # 修复可能的重复闭合
            
    # 修复 generator:core 自身的循环依赖
    if 'generator/core' in path:
        content = content.replace('implementation(project(":generator:core"))', '')

    with open(path, 'w', encoding='utf-8') as f:
        f.write(content)

generator_dir = 'generator'
for root, dirs, files in os.walk(generator_dir):
    for file in files:
        if file == 'build.gradle.kts':
            fix_file(os.path.join(root, file))
