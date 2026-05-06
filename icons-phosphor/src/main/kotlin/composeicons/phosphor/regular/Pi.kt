package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorRegularIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 172c0 19.882-16.118 36-36 36-19.882 0-36-16.118-36-36v-100h-64v128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-128h-8C49.909 72 32 89.909 32 112c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C16.033 81.086 41.086 56.033 72 56h152c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48v100c0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
