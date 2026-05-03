package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorBoldIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 128.000 C 128.000 134.627 122.627 140.000 116.000 140.000 L 48.000 140.000 C 41.373 140.000 36.000 134.627 36.000 128.000 C 36.000 121.373 41.373 116.000 48.000 116.000 L 116.000 116.000 C 122.627 116.000 128.000 121.373 128.000 128.000 ZM 48.000 76.000 L 180.000 76.000 C 186.627 76.000 192.000 70.627 192.000 64.000 C 192.000 57.373 186.627 52.000 180.000 52.000 L 48.000 52.000 C 41.373 52.000 36.000 57.373 36.000 64.000 C 36.000 70.627 41.373 76.000 48.000 76.000 ZM 100.000 180.000 L 48.000 180.000 C 41.373 180.000 36.000 185.373 36.000 192.000 C 36.000 198.627 41.373 204.000 48.000 204.000 L 100.000 204.000 C 106.627 204.000 112.000 198.627 112.000 192.000 C 112.000 185.373 106.627 180.000 100.000 180.000 ZM 232.490 159.510 C 230.238 157.251 227.180 155.981 223.990 155.981 C 220.800 155.981 217.742 157.251 215.490 159.510 L 196.000 179.000 L 196.000 112.000 C 196.000 105.373 190.627 100.000 184.000 100.000 C 177.373 100.000 172.000 105.373 172.000 112.000 L 172.000 179.000 L 152.490 159.480 C 147.796 154.786 140.184 154.786 135.490 159.480 C 130.796 164.174 130.796 171.786 135.490 176.480 L 175.490 216.480 C 177.742 218.739 180.800 220.009 183.990 220.009 C 187.180 220.009 190.238 218.739 192.490 216.480 L 232.490 176.480 C 237.176 171.794 237.176 164.196 232.490 159.510 Z"),
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
