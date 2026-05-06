package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bug: ImageVector
    get() {
        if (_bug != null) return _bug!!
        _bug = phosphorFillIcon(
            name = "Bug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 92c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM100 80C93.373 80 88 85.373 88 92c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM216 144c.022 7.766-.987 15.5-3 23l22.24 9.72c3.413 1.555 5.288 5.271 4.51 8.94-.778 3.669-4 6.305-7.75 6.34-1.102 .003-2.192-.226-3.2-.67L207.38 182C192.755 212.563 161.882 232.016 128 232.016 94.118 232.016 63.245 212.563 48.62 182l-21.42 9.33c-1.008 .444-2.098 .673-3.2 .67-3.786-.002-7.053-2.659-7.826-6.365-.774-3.707 1.157-7.448 4.626-8.965L43 167c-2.013-7.5-3.022-15.234-3-23v-8h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24v-8c-.022-7.766 .987-15.5 3-23L20.8 79.33C18.117 78.229 16.241 75.761 15.895 72.882c-.345-2.88 .895-5.72 3.241-7.425 2.346-1.704 5.432-2.006 8.063-.787L48.62 74C63.245 43.437 94.118 23.984 128 23.984c33.882 0 64.755 19.452 79.38 50.016l21.42-9.36c4.024-1.652 8.63 .214 10.37 4.2 1.74 3.986-.023 8.633-3.97 10.46L213 89.05c2.013 7.5 3.022 15.234 3 23v8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24ZM136 144c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM200 112C200 72.235 167.764 40 128 40 88.235 40 56 72.235 56 112v8h144Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bug!!
    }

private var _bug: ImageVector? = null
