package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BookmarkSimple: ImageVector
    get() {
        if (_bookmarkSimple != null) return _bookmarkSimple!!
        _bookmarkSimple = phosphorThinIcon(
            name = "BookmarkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 36.000 L 72.000 36.000 C 65.373 36.000 60.000 41.373 60.000 48.000 L 60.000 224.000 C 60.001 225.454 60.790 226.793 62.062 227.497 C 63.333 228.201 64.887 228.160 66.120 227.390 L 128.000 188.720 L 189.890 227.390 C 190.523 227.786 191.254 227.998 192.000 228.000 C 192.678 227.998 193.345 227.826 193.940 227.500 C 195.212 226.795 196.001 225.454 196.000 224.000 L 196.000 48.000 C 196.000 41.373 190.627 36.000 184.000 36.000 ZM 188.000 216.780 L 130.110 180.610 C 128.813 179.799 127.167 179.799 125.870 180.610 L 68.000 216.780 L 68.000 48.000 C 68.000 45.791 69.791 44.000 72.000 44.000 L 184.000 44.000 C 186.209 44.000 188.000 45.791 188.000 48.000 Z"),
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
