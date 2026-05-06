package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorLightIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 109.21l112 64c1.856 1.072 4.144 1.072 6 0L243 109.21c1.87-1.068 3.024-3.056 3.024-5.21 0-2.154-1.154-4.142-3.024-5.21l-112-64c-1.856-1.072-4.144-1.072-6 0l-112 64C11.13 99.858 9.976 101.846 9.976 104c0 2.154 1.154 4.142 3.024 5.21ZM128 46.91 227.91 104 128 161.09 28.09 104ZM245.21 141c.791 1.382 1 3.021 .582 4.557-.418 1.536-1.43 2.843-2.812 3.633l-112 64c-1.856 1.072-4.144 1.072-6 0l-112-64c-2.877-1.657-3.867-5.333-2.21-8.21 1.657-2.877 5.333-3.867 8.21-2.21l109 62.3L236.98 138.77c1.385-.804 3.034-1.02 4.58-.601 1.546 .419 2.86 1.438 3.65 2.831Z"),
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
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
