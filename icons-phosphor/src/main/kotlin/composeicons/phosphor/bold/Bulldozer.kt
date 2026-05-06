package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) return _bulldozer!!
        _bulldozer = phosphorBoldIcon(
            name = "Bulldozer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 196h-8c-2.209 0-4-1.791-4-4v-32c0-2.209 1.791-4 4-4h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-8c-15.464 0-28 12.536-28 28v4h-9.68c-4.56-15.969-17.699-28.026-34-31.2L129.12 48.31C126.017 40.86 118.74 36.005 110.67 36h-86.67C12.954 36 4 44.954 4 56v101.7c-6.228 13.619-5.102 29.471 2.989 42.072C15.079 212.374 29.024 219.995 44 220h112c19.668-.026 36.937-13.083 42.32-32h9.68v4c0 15.464 12.536 28 28 28h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM138 132h-70v-72h40ZM44 60v72c-5.474-.007-10.901 1.01-16 3v-75ZM156 196h-112C32.954 196 24 187.046 24 176c0-11.046 8.954-20 20-20h112c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
