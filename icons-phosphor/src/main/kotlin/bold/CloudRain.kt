package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorBoldIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 12.000 C 124.017 12.005 95.092 31.007 82.390 60.360 C 80.268 60.120 78.135 60.000 76.000 60.000 C 45.072 60.000 20.000 85.072 20.000 116.000 C 20.000 146.928 45.072 172.000 76.000 172.000 L 105.580 172.000 L 86.000 201.340 C 82.322 206.863 83.817 214.322 89.340 218.000 C 94.863 221.678 102.322 220.183 106.000 214.660 L 134.420 172.000 L 156.000 172.000 C 200.183 172.000 236.000 136.183 236.000 92.000 C 236.000 47.817 200.183 12.000 156.000 12.000 ZM 156.000 148.000 L 76.000 148.000 C 58.327 148.000 44.000 133.673 44.000 116.000 C 44.000 98.327 58.327 84.000 76.000 84.000 L 76.280 84.000 C 76.170 85.100 76.080 86.200 76.020 87.300 C 75.636 93.927 80.698 99.611 87.325 99.995 C 93.952 100.379 99.636 95.317 100.020 88.690 C 101.790 58.205 127.634 34.744 158.148 35.922 C 188.662 37.100 212.621 62.483 212.035 93.014 C 211.450 123.546 186.537 147.992 156.000 148.000 ZM 156.650 206.660 L 129.980 246.660 C 126.302 252.183 118.843 253.678 113.320 250.000 C 107.797 246.322 106.302 238.863 109.980 233.340 L 136.640 193.340 C 140.318 187.817 147.777 186.322 153.300 190.000 C 158.823 193.678 160.318 201.137 156.640 206.660 Z"),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
