package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorBoldIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 36.000 128.000 C 36.000 121.373 41.373 116.000 48.000 116.000 L 116.000 116.000 C 122.627 116.000 128.000 121.373 128.000 128.000 C 128.000 134.627 122.627 140.000 116.000 140.000 L 48.000 140.000 C 41.373 140.000 36.000 134.627 36.000 128.000 ZM 48.000 76.000 L 100.000 76.000 C 106.627 76.000 112.000 70.627 112.000 64.000 C 112.000 57.373 106.627 52.000 100.000 52.000 L 48.000 52.000 C 41.373 52.000 36.000 57.373 36.000 64.000 C 36.000 70.627 41.373 76.000 48.000 76.000 ZM 180.000 180.000 L 48.000 180.000 C 41.373 180.000 36.000 185.373 36.000 192.000 C 36.000 198.627 41.373 204.000 48.000 204.000 L 180.000 204.000 C 186.627 204.000 192.000 198.627 192.000 192.000 C 192.000 185.373 186.627 180.000 180.000 180.000 ZM 232.490 79.510 L 192.490 39.510 C 190.238 37.251 187.180 35.981 183.990 35.981 C 180.800 35.981 177.742 37.251 175.490 39.510 L 135.490 79.510 C 130.796 84.204 130.796 91.816 135.490 96.510 C 140.184 101.204 147.796 101.204 152.490 96.510 L 172.000 77.000 L 172.000 144.000 C 172.000 150.627 177.373 156.000 184.000 156.000 C 190.627 156.000 196.000 150.627 196.000 144.000 L 196.000 77.000 L 215.510 96.520 C 220.204 101.214 227.816 101.214 232.510 96.520 C 237.204 91.826 237.204 84.214 232.510 79.520 Z"),
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
