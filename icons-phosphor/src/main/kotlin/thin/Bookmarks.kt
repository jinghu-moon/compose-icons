package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = phosphorThinIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 28.000 L 96.000 28.000 C 89.373 28.000 84.000 33.373 84.000 40.000 L 84.000 60.000 L 64.000 60.000 C 57.373 60.000 52.000 65.373 52.000 72.000 L 52.000 224.000 C 52.000 225.499 52.839 226.872 54.173 227.557 C 55.507 228.242 57.111 228.123 58.330 227.250 L 112.000 188.920 L 165.690 227.250 C 166.362 227.737 167.170 227.999 168.000 228.000 C 168.636 227.998 169.263 227.847 169.830 227.560 C 171.163 226.874 172.001 225.500 172.000 224.000 L 172.000 176.920 L 197.680 195.250 C 198.355 195.739 199.167 196.002 200.000 196.000 C 200.636 195.998 201.263 195.847 201.830 195.560 C 203.163 194.874 204.001 193.500 204.000 192.000 L 204.000 40.000 C 204.000 33.373 198.627 28.000 192.000 28.000 ZM 164.000 216.230 L 114.320 180.750 C 112.929 179.757 111.061 179.757 109.670 180.750 L 60.000 216.230 L 60.000 72.000 C 60.000 69.791 61.791 68.000 64.000 68.000 L 160.000 68.000 C 162.209 68.000 164.000 69.791 164.000 72.000 ZM 196.000 184.230 L 172.000 167.090 L 172.000 72.000 C 172.000 65.373 166.627 60.000 160.000 60.000 L 92.000 60.000 L 92.000 40.000 C 92.000 37.791 93.791 36.000 96.000 36.000 L 192.000 36.000 C 194.209 36.000 196.000 37.791 196.000 40.000 Z"),
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
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
