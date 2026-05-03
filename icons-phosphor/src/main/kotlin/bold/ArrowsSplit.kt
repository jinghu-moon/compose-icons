package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) return _arrowsSplit!!
        _arrowsSplit = phosphorBoldIcon(
            name = "ArrowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.490 192.490 L 200.490 224.490 C 198.238 226.749 195.180 228.019 191.990 228.019 C 188.800 228.019 185.742 226.749 183.490 224.490 L 151.490 192.490 C 146.796 187.796 146.796 180.184 151.490 175.490 C 156.184 170.796 163.796 170.796 168.490 175.490 L 180.000 187.000 L 180.000 141.000 L 128.000 89.000 L 76.000 141.000 L 76.000 187.000 L 87.510 175.480 C 92.204 170.786 99.816 170.786 104.510 175.480 C 109.204 180.174 109.204 187.786 104.510 192.480 L 72.510 224.480 C 70.258 226.739 67.200 228.009 64.010 228.009 C 60.820 228.009 57.762 226.739 55.510 224.480 L 23.510 192.480 C 18.816 187.786 18.816 180.174 23.510 175.480 C 28.204 170.786 35.816 170.786 40.510 175.480 L 52.000 187.000 L 52.000 136.000 C 51.997 132.816 53.260 129.762 55.510 127.510 L 116.000 67.000 L 116.000 24.000 C 116.000 17.373 121.373 12.000 128.000 12.000 C 134.627 12.000 140.000 17.373 140.000 24.000 L 140.000 67.000 L 200.490 127.480 C 202.747 129.740 204.010 132.806 204.000 136.000 L 204.000 187.000 L 215.510 175.480 C 220.204 170.786 227.816 170.786 232.510 175.480 C 237.204 180.174 237.204 187.786 232.510 192.480 Z"),
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
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
