package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) return _bookmarksSimple!!
        _bookmarksSimple = phosphorThinIcon(
            name = "BookmarksSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 60.000 L 64.000 60.000 C 57.373 60.000 52.000 65.373 52.000 72.000 L 52.000 224.000 C 52.000 225.499 52.839 226.872 54.173 227.557 C 55.507 228.242 57.111 228.123 58.330 227.250 L 112.000 188.920 L 165.690 227.250 C 166.362 227.737 167.170 227.999 168.000 228.000 C 168.636 227.998 169.263 227.847 169.830 227.560 C 171.163 226.874 172.001 225.500 172.000 224.000 L 172.000 72.000 C 172.000 65.373 166.627 60.000 160.000 60.000 ZM 164.000 216.230 L 114.320 180.740 C 112.929 179.747 111.061 179.747 109.670 180.740 L 60.000 216.230 L 60.000 72.000 C 60.000 69.791 61.791 68.000 64.000 68.000 L 160.000 68.000 C 162.209 68.000 164.000 69.791 164.000 72.000 ZM 204.000 40.000 L 204.000 192.000 C 204.000 194.209 202.209 196.000 200.000 196.000 C 197.791 196.000 196.000 194.209 196.000 192.000 L 196.000 40.000 C 196.000 37.791 194.209 36.000 192.000 36.000 L 88.000 36.000 C 85.791 36.000 84.000 34.209 84.000 32.000 C 84.000 29.791 85.791 28.000 88.000 28.000 L 192.000 28.000 C 198.627 28.000 204.000 33.373 204.000 40.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _bookmarksSimple!!
    }

private var _bookmarksSimple: ImageVector? = null
