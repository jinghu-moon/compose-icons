package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorFillIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 72.000 72.000 L 112.000 72.000 C 116.418 72.000 120.000 75.582 120.000 80.000 C 120.000 84.418 116.418 88.000 112.000 88.000 L 72.000 88.000 C 67.582 88.000 64.000 84.418 64.000 80.000 C 64.000 75.582 67.582 72.000 72.000 72.000 ZM 72.000 120.000 L 120.000 120.000 C 124.418 120.000 128.000 123.582 128.000 128.000 C 128.000 132.418 124.418 136.000 120.000 136.000 L 72.000 136.000 C 67.582 136.000 64.000 132.418 64.000 128.000 C 64.000 123.582 67.582 120.000 72.000 120.000 ZM 168.000 184.000 L 72.000 184.000 C 67.582 184.000 64.000 180.418 64.000 176.000 C 64.000 171.582 67.582 168.000 72.000 168.000 L 168.000 168.000 C 172.418 168.000 176.000 171.582 176.000 176.000 C 176.000 180.418 172.418 184.000 168.000 184.000 ZM 197.660 101.660 C 196.159 103.162 194.123 104.006 192.000 104.006 C 189.877 104.006 187.841 103.162 186.340 101.660 L 176.000 91.310 L 176.000 136.000 C 176.000 140.418 172.418 144.000 168.000 144.000 C 163.582 144.000 160.000 140.418 160.000 136.000 L 160.000 91.310 L 149.660 101.660 C 146.534 104.786 141.466 104.786 138.340 101.660 C 135.214 98.534 135.214 93.466 138.340 90.340 L 162.340 66.340 C 163.841 64.838 165.877 63.994 168.000 63.994 C 170.123 63.994 172.159 64.838 173.660 66.340 L 197.660 90.340 C 199.162 91.841 200.006 93.877 200.006 96.000 C 200.006 98.123 199.162 100.159 197.660 101.660 Z"),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
