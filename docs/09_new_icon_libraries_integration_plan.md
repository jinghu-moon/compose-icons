# 新图标库接入方案

> 基于各图标库源码仓库实际结构编写，供 generator 接入实现参考。

---

## 1. Simple Icons（P0）

| 属性 | 值 |
|------|-----|
| 仓库 | https://github.com/simple-icons/simple-icons |
| SVG 路径 | `icons/{slug}.svg` |
| viewBox | `0 0 24 24` |
| 图标数 | 3,400+ |
| 风格 | 单一（填充，单 path） |
| 许可证 | **CC0 1.0**（公共领域，无限制） |

### SVG 特征

```xml
<svg role="img" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
  <title>Brand Name</title>
  <path d="M..."/>
</svg>
```

- 极简结构：单个 `<path>`，无 `<g>`/transform/stroke
- 无 `fill` 属性（默认黑色），生成时设为 `currentColor`
- 无 `width`/`height` 属性

### 元数据

- `data/simple-icons.json`：包含所有图标的 `title`、`slug`、`hex`（品牌色）、`source`
- slug 即文件名（无 `.svg` 后缀）

### 接入配置

```kotlin
fun SimpleIconsSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "simpleicons"
    displayName = "Simple Icons"
    iconContainerName = "SimpleIcons"
    basePackage = "composeicons.simpleicons"
    upstreamVersion = "16.x"

    style("Default") {
        helperFunction = "simpleIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = flatDirectory("icons")
}
```

### 命名映射

| 文件名 | Kotlin 名 |
|--------|-----------|
| `adobephotoshop.svg` | `AdobePhotoshop` |
| `github.svg` | `Github` |
| `hive_blockchain.svg` | `HiveBlockchain` |

规则：去掉 `.svg`，转 PascalCase，`_` 视为分隔符。

---

## 2. MDI — Material Design Icons（P1）

| 属性 | 值 |
|------|-----|
| 仓库 | https://github.com/Templarian/MaterialDesign-SVG |
| SVG 路径 | `svg/{name}.svg` |
| viewBox | `0 0 24 24` |
| 图标数 | 7,000+ |
| 风格 | 2 种（Default / Outline，通过文件名后缀 `-outline` 区分） |
| 许可证 | **Apache 2.0** |

### SVG 特征

```xml
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
  <path d="M..."/>
</svg>
```

- 单 path，fill-based，无 stroke
- 24×24 viewBox，结构极简

### 元数据

- `meta.json`：包含所有图标的 name、id、tags、aliases、author

### 接入配置

```kotlin
fun MdiIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "mdi"
    displayName = "Material Design Icons"
    iconContainerName = "MdiIcons"
    basePackage = "composeicons.mdi"
    upstreamVersion = "7.x"

    style("Default") {
        subdirectory = "default"
        helperFunction = "mdiIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Outline") {
        subdirectory = "outline"
        helperFunction = "mdiOutlineIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = suffixBased("svg") {
        match("Outline", "-outline")
        default("Default")
    }
}
```

### 命名映射

| 文件名 | 风格 | Kotlin 名 |
|--------|------|-----------|
| `home.svg` | Default | `Home` |
| `home-outline.svg` | Outline | `Home` |
| `account-circle.svg` | Default | `AccountCircle` |

规则：去掉 `-outline` 后缀后，kebab-case → PascalCase。

---

## 3. Carbon Icons（P2）

| 属性 | 值 |
|------|-----|
| 仓库 | https://github.com/carbon-design-system/carbon |
| SVG 路径 | `packages/icons/src/svg/{size}/{name}.svg` |
| viewBox | `0 0 {size} {size}`（16/20/24/32） |
| 图标数 | ~2,500 unique × 4 sizes |
| 风格 | 2 种（Default / Filled，通过 `--filled` 后缀区分） |
| 许可证 | **Apache 2.0** |

### SVG 特征

```xml
<svg width="32px" height="32px" viewBox="0 0 32 32" id="icon" xmlns="http://www.w3.org/2000/svg">
  <defs><style>.cls-1 { fill: none; }</style></defs>
  <path d="M..."/>
  <rect class="cls-1" width="32" height="32"/>
</svg>
```

- 包含 `<defs>`/`<style>`/`<rect>` 等复杂元素 → usvg 可处理
- fill-based（非 stroke）
- 透明 `<rect>` 作为边界框（usvg 会忽略 `fill: none` 的 rect）
- 部分图标有 `transform="translate(0 0)"`

### 接入策略

- **选用 32px 作为源**（设计主尺寸），生成时 normalize 到 24dp
- 忽略 16/20/24 目录（32px 是 master，其他是缩放版）

### 接入配置

```kotlin
fun CarbonIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "carbon"
    displayName = "Carbon Icons"
    iconContainerName = "CarbonIcons"
    basePackage = "composeicons.carbon"
    upstreamVersion = "11.x"

    style("Default") {
        subdirectory = "default"
        helperFunction = "carbonIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Filled") {
        subdirectory = "filled"
        helperFunction = "carbonFilledIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    // 只取 32px 目录
    discovery = suffixBased("packages/icons/src/svg/32") {
        match("Filled", "--filled")
        default("Default")
    }

    normalizeSize = 24  // 32px → 24dp
}
```

### 命名映射

| 文件名 | 风格 | Kotlin 名 |
|--------|------|-----------|
| `add.svg` | Default | `Add` |
| `add--filled.svg` | Filled | `Add` |
| `add-comment.svg` | Default | `AddComment` |

规则：去掉 `--filled` 后缀，kebab-case → PascalCase，`--` 和 `-` 都视为分隔符。

---

## 4. Octicons（P3）

| 属性 | 值 |
|------|-----|
| 仓库 | https://github.com/primer/octicons |
| SVG 路径 | `icons/{name}-{size}.svg` |
| viewBox | `0 0 {size} {size}`（12/16/24） |
| 图标数 | ~336 unique concepts |
| 风格 | 2 种（Default / Fill，通过 `-fill` 名称区分） |
| 许可证 | **MIT** |

### SVG 特征

```xml
<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
  <path fill-rule="evenodd" d="M..."/>
</svg>
```

- 极简：单/多 `<path>`，无 `<g>`/transform
- 已经过 SVGO 优化
- 使用 `fill-rule="evenodd"`
- 无显式 `fill` 属性

### 接入策略

- **选用 24px 作为源**（与项目 24dp 标准一致）
- 文件名格式：`{icon-name}-{size}.svg`，需解析去掉 `-24` 后缀
- `-fill` 在 icon name 中（不是 size 后缀前），如 `alert-fill-24.svg`

### 接入配置

```kotlin
fun OcticonsIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "octicons"
    displayName = "Octicons"
    iconContainerName = "OcticonsIcons"
    basePackage = "composeicons.octicons"
    upstreamVersion = "19.x"

    style("Default") {
        subdirectory = "default"
        helperFunction = "octiconsIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Fill") {
        subdirectory = "fill"
        helperFunction = "octiconsFillIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    // 自定义 discovery：过滤 -24.svg 文件，按 -fill 区分风格
    discovery = custom { dir ->
        dir.listFiles { f -> f.name.endsWith("-24.svg") }
            ?.map { file ->
                val baseName = file.nameWithoutExtension.removeSuffix("-24")
                val style = if (baseName.endsWith("-fill")) "Fill" else "Default"
                val iconName = if (style == "Fill") baseName.removeSuffix("-fill") else baseName
                SvgEntry(file = file, name = iconName, style = style)
            } ?: emptyList()
    }
}
```

### 命名映射

| 文件名 | 风格 | Kotlin 名 |
|--------|------|-----------|
| `arrow-down-left-24.svg` | Default | `ArrowDownLeft` |
| `bell-fill-24.svg` | Fill | `Bell` |
| `code-review-24.svg` | Default | `CodeReview` |

---

## 5. Iconsax（P4）

| 属性 | 值 |
|------|-----|
| 仓库（SVG 源） | https://github.com/saade/blade-iconsax (`resources/svg/`) |
| 元数据 | https://github.com/rendinjast/iconsax-react (`meta-data.json`) |
| SVG 路径 | `resources/svg/{prefix}-{name}.svg`（flat，5,398 文件） |
| viewBox | `0 0 24 24` |
| 图标数 | ~1,000 unique × 6 styles = ~6,000 |
| 风格 | 6 种（Bold / Broken / Bulk / Linear / Outline / TwoTone） |
| 许可证 | **MIT**（iconsax-react 仓库明确声明） |

### SVG 特征

**Linear/Outline/Broken**（stroke-based）：
```xml
<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none">
  <path d="M..." stroke="currentColor" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/>
</svg>
```

**Bold**（fill-based）：
```xml
<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none">
  <path d="M..." fill="currentColor"/>
</svg>
```

**Bulk**（多 path，部分带 opacity）：
```xml
<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none">
  <path opacity="0.4" d="M..." fill="currentColor"/>
  <path d="M..." fill="currentColor"/>
</svg>
```

**TwoTone**（多 path，部分带 opacity + stroke）：
```xml
<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none">
  <path d="M..." stroke="currentColor" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/>
  <path opacity="0.4" d="M..." stroke="currentColor" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/>
</svg>
```

### 文件命名规则

**前缀标识风格**（flat 目录，无子目录）：

| 前缀 | 风格 |
|------|------|
| `bol-` | Bold |
| `bro-` | Broken |
| `bul-` | Bulk |
| `lin-` | Linear |
| `out-` | Outline |
| `twt-` | TwoTone |

示例：`bol-home.svg`、`lin-home.svg`、`bro-arrow-down-2.svg`

### 接入配置

```kotlin
fun IconsaxSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "iconsax"
    displayName = "Iconsax"
    iconContainerName = "IconsaxIcons"
    basePackage = "composeicons.iconsax"
    upstreamVersion = "1.0"

    style("Linear") {
        subdirectory = "linear"
        helperFunction = "iconsaxLinearIcon"
        defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f; strokeLineCap = "round"; strokeLineJoin = "round" }
    }
    style("Outline") {
        subdirectory = "outline"
        helperFunction = "iconsaxOutlineIcon"
        defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f; strokeLineCap = "round"; strokeLineJoin = "round" }
    }
    style("Broken") {
        subdirectory = "broken"
        helperFunction = "iconsaxBrokenIcon"
        defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f; strokeLineCap = "round"; strokeLineJoin = "round" }
    }
    style("Bold") {
        subdirectory = "bold"
        helperFunction = "iconsaxBoldIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("Bulk") {
        subdirectory = "bulk"
        helperFunction = "iconsaxBulkIcon"
        defaultPathStyle { fill = "currentColor" }
    }
    style("TwoTone") {
        subdirectory = "twotone"
        helperFunction = "iconsaxTwoToneIcon"
        defaultPathStyle { fill = "none"; stroke = "currentColor"; strokeWidth = 1.5f; strokeLineCap = "round"; strokeLineJoin = "round" }
    }

    // 前缀匹配发现策略
    discovery = prefixBased("resources/svg") {
        match("Bold", "bol-")
        match("Broken", "bro-")
        match("Bulk", "bul-")
        match("Linear", "lin-")
        match("Outline", "out-")
        match("TwoTone", "twt-")
    }
}
```

### 命名映射

| 文件名 | 风格 | Kotlin 名 |
|--------|------|-----------|
| `bol-home.svg` | Bold | `Home` |
| `lin-home.svg` | Linear | `Home` |
| `bro-arrow-down-2.svg` | Broken | `ArrowDown2` |
| `bul-add-circle.svg` | Bulk | `AddCircle` |

规则：去掉 3 字符前缀 + `-`，剩余 kebab-case → PascalCase。

### 注意事项

1. **需要新增 `prefixBased` 发现策略**：现有 generator-core 只有 `suffixBased` 和 `flatDirectory`，需新增前缀匹配
2. **Bulk/TwoTone 含 opacity**：path 上有 `opacity="0.4"` 属性，svg2compose 需正确传递到 `fillAlpha`/`strokeAlpha`
3. **SVG 源仓库选择**：`saade/blade-iconsax` 是最完整的 SVG 源（5,398 文件），MIT 许可
4. **元数据**：`rendinjast/iconsax-react/meta-data.json` 提供分类和图标名列表，可用于验证

---

## 汇总对比

| 库 | viewBox | 风格数 | 发现策略 | SVG 复杂度 | 许可证风险 |
|----|---------|--------|----------|-----------|-----------|
| Simple Icons | 24×24 | 1 | flat | ★☆☆ 极简 | ✅ 无 |
| MDI | 24×24 | 2 | suffix `-outline` | ★☆☆ 极简 | ✅ 无 |
| Carbon | 32×32 | 2 | suffix `--filled` | ★★☆ 有 defs/style | ✅ 无 |
| Octicons | 24×24 | 2 | 文件名解析 | ★☆☆ 极简 | ✅ 无 |
| Iconsax | 24×24 | 6 | prefix `bol-`/`lin-`/... | ★★☆ 含 opacity | ✅ 无 |

## 实施优先级建议

1. **Simple Icons** → 最简单，CC0 无风险，单 path 无需 usvg 处理
2. **MDI** → 结构与 Simple Icons 类似，suffix 发现策略已有先例（Remix/Ionicons）
3. **Iconsax** → 6 种风格与 Phosphor 类似，需新增 `prefixBased` 发现策略
4. **Carbon** → 需要 normalizeSize（32→24），SVG 稍复杂但 usvg 可处理
5. **Octicons** → 需自定义 discovery（文件名含 size 后缀），图标数少实现快
