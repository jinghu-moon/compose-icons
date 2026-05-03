package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorBoldIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 96.830 50.000 C 102.598 47.671 108.609 45.994 114.750 45.000 C 141.949 58.517 159.733 85.665 161.260 116.000 L 134.930 116.000 ZM 134.930 140.000 L 211.130 140.000 C 210.243 146.156 208.670 152.194 206.440 158.000 C 181.146 174.761 148.783 176.592 121.760 162.790 ZM 211.130 116.000 L 185.290 116.000 C 184.613 98.504 179.669 81.439 170.890 66.290 C 167.591 60.575 163.779 55.173 159.500 50.150 C 187.170 61.391 206.815 86.447 211.130 116.000 ZM 76.070 62.050 L 89.000 84.390 C 74.188 93.723 61.881 106.535 53.150 121.710 C 49.849 127.446 47.077 133.471 44.870 139.710 C 40.642 110.107 52.537 80.499 76.070 62.050 ZM 62.790 180.870 C 60.932 150.598 75.537 121.676 101.000 105.200 L 114.140 128.000 L 76.070 194.000 C 71.173 190.126 66.719 185.723 62.790 180.870 ZM 96.790 205.980 L 109.710 183.610 C 125.212 191.780 142.477 196.034 160.000 196.000 C 166.570 195.998 173.127 195.403 179.590 194.220 C 156.078 212.624 124.544 217.112 96.830 206.000 Z"),
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
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
