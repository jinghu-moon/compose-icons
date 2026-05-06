package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorBoldIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 84.38 140.1 16.09l-.26-.2c-7.033-5.191-16.627-5.191-23.66 0l-.26 .2L28 84.38c-6.791 5.087-9.633 13.905-7.09 22l32 107.51 .08 .26C55.637 222.412 63.324 228.013 72 228h112c8.677 .006 16.361-5.603 19-13.87l.08-.26 32-107.51C237.615 98.273 234.779 89.467 228 84.38ZM181 204h-106L44.62 101.87 128 37.09l83.38 64.78Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
