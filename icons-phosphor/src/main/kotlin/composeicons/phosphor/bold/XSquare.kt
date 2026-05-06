package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.XSquare: ImageVector
    get() {
        if (_xSquare != null) return _xSquare!!
        _xSquare = phosphorBoldIcon(
            name = "XSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h152ZM87.51 151.51 111 128 87.51 104.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L128 111 151.51 87.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L145 128l23.52 23.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L128 145l-23.51 23.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17Z"),
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
        return _xSquare!!
    }

private var _xSquare: ImageVector? = null
