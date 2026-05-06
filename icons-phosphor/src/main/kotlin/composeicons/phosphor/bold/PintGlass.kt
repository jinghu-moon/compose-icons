package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorBoldIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209 24c-2.289-2.56-5.566-4.016-9-4h-144c-3.431 .001-6.697 1.471-8.974 4.038-2.276 2.567-3.345 5.986-2.936 9.392L67.24 226.43c1.228 10.034 9.751 17.574 19.86 17.57h81.8c10.126 .001 18.655-7.566 19.86-17.62L211.91 33.43C212.337 30.015 211.277 26.581 209 24ZM186.47 44l-1.92 16h-113.1L69.53 44ZM165.35 220h-74.7L74.33 84h107.34Z"),
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
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
