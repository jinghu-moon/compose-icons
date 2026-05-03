package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookmarkSimple: ImageVector
    get() {
        if (_bookmarkSimple != null) return _bookmarkSimple!!
        _bookmarkSimple = phosphorBoldIcon(
            name = "BookmarkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 28.000 L 72.000 28.000 C 60.954 28.000 52.000 36.954 52.000 48.000 L 52.000 224.000 C 51.999 228.363 54.365 232.383 58.181 234.499 C 61.997 236.614 66.660 236.492 70.360 234.180 L 127.990 198.180 L 185.640 234.180 C 189.340 236.492 194.003 236.614 197.819 234.499 C 201.635 232.383 204.001 228.363 204.000 224.000 L 204.000 48.000 C 204.000 36.954 195.046 28.000 184.000 28.000 ZM 180.000 202.350 L 134.350 173.820 C 130.459 171.388 125.521 171.388 121.630 173.820 L 76.000 202.350 L 76.000 52.000 L 180.000 52.000 Z"),
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
        return _bookmarkSimple!!
    }

private var _bookmarkSimple: ImageVector? = null
