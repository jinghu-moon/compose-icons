package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorFillIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 72.000 72.000 L 168.000 72.000 C 172.418 72.000 176.000 75.582 176.000 80.000 C 176.000 84.418 172.418 88.000 168.000 88.000 L 72.000 88.000 C 67.582 88.000 64.000 84.418 64.000 80.000 C 64.000 75.582 67.582 72.000 72.000 72.000 ZM 112.000 184.000 L 72.000 184.000 C 67.582 184.000 64.000 180.418 64.000 176.000 C 64.000 171.582 67.582 168.000 72.000 168.000 L 112.000 168.000 C 116.418 168.000 120.000 171.582 120.000 176.000 C 120.000 180.418 116.418 184.000 112.000 184.000 ZM 120.000 136.000 L 72.000 136.000 C 67.582 136.000 64.000 132.418 64.000 128.000 C 64.000 123.582 67.582 120.000 72.000 120.000 L 120.000 120.000 C 124.418 120.000 128.000 123.582 128.000 128.000 C 128.000 132.418 124.418 136.000 120.000 136.000 ZM 197.660 165.660 L 173.660 189.660 C 172.159 191.162 170.123 192.006 168.000 192.006 C 165.877 192.006 163.841 191.162 162.340 189.660 L 138.340 165.660 C 135.214 162.534 135.214 157.466 138.340 154.340 C 141.466 151.214 146.534 151.214 149.660 154.340 L 160.000 164.690 L 160.000 120.000 C 160.000 115.582 163.582 112.000 168.000 112.000 C 172.418 112.000 176.000 115.582 176.000 120.000 L 176.000 164.690 L 186.340 154.340 C 189.466 151.214 194.534 151.214 197.660 154.340 C 200.786 157.466 200.786 162.534 197.660 165.660 Z"),
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
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
