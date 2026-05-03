package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorThinIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 124.000 128.000 C 124.000 130.209 122.209 132.000 120.000 132.000 L 48.000 132.000 C 45.791 132.000 44.000 130.209 44.000 128.000 C 44.000 125.791 45.791 124.000 48.000 124.000 L 120.000 124.000 C 122.209 124.000 124.000 125.791 124.000 128.000 ZM 48.000 68.000 L 184.000 68.000 C 186.209 68.000 188.000 66.209 188.000 64.000 C 188.000 61.791 186.209 60.000 184.000 60.000 L 48.000 60.000 C 45.791 60.000 44.000 61.791 44.000 64.000 C 44.000 66.209 45.791 68.000 48.000 68.000 ZM 104.000 188.000 L 48.000 188.000 C 45.791 188.000 44.000 189.791 44.000 192.000 C 44.000 194.209 45.791 196.000 48.000 196.000 L 104.000 196.000 C 106.209 196.000 108.000 194.209 108.000 192.000 C 108.000 189.791 106.209 188.000 104.000 188.000 ZM 226.830 165.170 C 226.080 164.419 225.062 163.997 224.000 163.997 C 222.938 163.997 221.920 164.419 221.170 165.170 L 188.000 198.340 L 188.000 112.000 C 188.000 109.791 186.209 108.000 184.000 108.000 C 181.791 108.000 180.000 109.791 180.000 112.000 L 180.000 198.340 L 146.830 165.170 C 145.267 163.607 142.733 163.607 141.170 165.170 C 139.607 166.733 139.607 169.267 141.170 170.830 L 181.170 210.830 C 181.920 211.581 182.938 212.003 184.000 212.003 C 185.062 212.003 186.080 211.581 186.830 210.830 L 226.830 170.830 C 227.581 170.080 228.003 169.062 228.003 168.000 C 228.003 166.938 227.581 165.920 226.830 165.170 Z"),
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
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
