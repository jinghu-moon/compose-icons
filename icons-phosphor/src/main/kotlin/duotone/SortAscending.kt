package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorDuotoneIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 80.000 L 224.000 168.000 L 200.000 192.000 L 48.000 192.000 L 48.000 64.000 L 208.000 64.000 C 216.837 64.000 224.000 71.163 224.000 80.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 128.000 128.000 C 128.000 132.418 124.418 136.000 120.000 136.000 L 48.000 136.000 C 43.582 136.000 40.000 132.418 40.000 128.000 C 40.000 123.582 43.582 120.000 48.000 120.000 L 120.000 120.000 C 124.418 120.000 128.000 123.582 128.000 128.000 ZM 48.000 72.000 L 184.000 72.000 C 188.418 72.000 192.000 68.418 192.000 64.000 C 192.000 59.582 188.418 56.000 184.000 56.000 L 48.000 56.000 C 43.582 56.000 40.000 59.582 40.000 64.000 C 40.000 68.418 43.582 72.000 48.000 72.000 ZM 104.000 184.000 L 48.000 184.000 C 43.582 184.000 40.000 187.582 40.000 192.000 C 40.000 196.418 43.582 200.000 48.000 200.000 L 104.000 200.000 C 108.418 200.000 112.000 196.418 112.000 192.000 C 112.000 187.582 108.418 184.000 104.000 184.000 ZM 229.660 162.340 C 228.159 160.838 226.123 159.994 224.000 159.994 C 221.877 159.994 219.841 160.838 218.340 162.340 L 192.000 188.690 L 192.000 112.000 C 192.000 107.582 188.418 104.000 184.000 104.000 C 179.582 104.000 176.000 107.582 176.000 112.000 L 176.000 188.690 L 149.660 162.340 C 146.534 159.214 141.466 159.214 138.340 162.340 C 135.214 165.466 135.214 170.534 138.340 173.660 L 178.340 213.660 C 179.841 215.162 181.877 216.006 184.000 216.006 C 186.123 216.006 188.159 215.162 189.660 213.660 L 229.660 173.660 C 231.162 172.159 232.006 170.123 232.006 168.000 C 232.006 165.877 231.162 163.841 229.660 162.340 Z"),
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
