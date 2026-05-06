package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) return _checkSquare!!
        _checkSquare = phosphorBoldIcon(
            name = "CheckSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M79.51 144.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L112 143 159.51 95.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-56 56c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529ZM228 48v160c0 11.046-8.954 20-20 20h-160C36.954 228 28 219.046 28 208v-160C28 36.954 36.954 28 48 28h160c11.046 0 20 8.954 20 20ZM204 52h-152v152h152Z"),
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
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
