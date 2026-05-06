package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorFillIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.06 110.59 208 106.23v-50.23c0-8.837-7.163-16-16-16h-56v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-56C55.163 40 48 47.163 48 56v50.23l-13.06 4.36C28.406 112.768 23.999 118.883 24 125.77v26.23c0 61.54 97.89 86.72 102.06 87.76 1.274 .318 2.606 .318 3.88 0C134.11 238.72 232 213.54 232 152v-26.23c.001-6.887-4.406-13.002-10.94-15.18ZM136 168c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-63.13c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM192 100.9 130.53 80.41c-1.642-.547-3.418-.547-5.06 0L64 100.9v-44.9h128Z"),
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
        return _boat!!
    }

private var _boat: ImageVector? = null
