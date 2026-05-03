package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorThinIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 44.000 128.000 C 44.000 125.791 45.791 124.000 48.000 124.000 L 120.000 124.000 C 122.209 124.000 124.000 125.791 124.000 128.000 C 124.000 130.209 122.209 132.000 120.000 132.000 L 48.000 132.000 C 45.791 132.000 44.000 130.209 44.000 128.000 ZM 48.000 68.000 L 104.000 68.000 C 106.209 68.000 108.000 66.209 108.000 64.000 C 108.000 61.791 106.209 60.000 104.000 60.000 L 48.000 60.000 C 45.791 60.000 44.000 61.791 44.000 64.000 C 44.000 66.209 45.791 68.000 48.000 68.000 ZM 184.000 188.000 L 48.000 188.000 C 45.791 188.000 44.000 189.791 44.000 192.000 C 44.000 194.209 45.791 196.000 48.000 196.000 L 184.000 196.000 C 186.209 196.000 188.000 194.209 188.000 192.000 C 188.000 189.791 186.209 188.000 184.000 188.000 ZM 226.830 85.170 L 186.830 45.170 C 186.080 44.419 185.062 43.997 184.000 43.997 C 182.938 43.997 181.920 44.419 181.170 45.170 L 141.170 85.170 C 139.607 86.733 139.607 89.267 141.170 90.830 C 142.733 92.393 145.267 92.393 146.830 90.830 L 180.000 57.660 L 180.000 144.000 C 180.000 146.209 181.791 148.000 184.000 148.000 C 186.209 148.000 188.000 146.209 188.000 144.000 L 188.000 57.660 L 221.170 90.830 C 222.733 92.393 225.267 92.393 226.830 90.830 C 228.393 89.267 228.393 86.733 226.830 85.170 Z"),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
