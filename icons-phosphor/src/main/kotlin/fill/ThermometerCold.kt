package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorFillIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.910 77.720 L 228.910 84.210 L 241.250 101.210 C 243.025 103.517 243.408 106.606 242.248 109.276 C 241.089 111.946 238.570 113.776 235.672 114.053 C 232.775 114.330 229.955 113.012 228.310 110.610 L 216.000 93.610 L 203.660 110.610 C 201.018 114.043 196.123 114.749 192.618 112.203 C 189.114 109.657 188.272 104.784 190.720 101.210 L 203.060 84.210 L 183.060 77.720 C 178.857 76.356 176.556 71.843 177.920 67.640 C 179.284 63.437 183.797 61.136 188.000 62.500 L 208.000 69.000 L 208.000 48.000 C 208.000 43.582 211.582 40.000 216.000 40.000 C 220.418 40.000 224.000 43.582 224.000 48.000 L 224.000 69.000 L 244.000 62.510 C 248.203 61.143 252.718 63.442 254.085 67.645 C 255.452 71.848 253.153 76.363 248.950 77.730 ZM 176.000 192.000 C 175.979 218.576 157.282 241.477 131.248 246.815 C 105.213 252.153 79.013 238.457 68.536 214.034 C 58.058 189.610 66.190 161.186 88.000 146.000 L 88.000 40.000 C 88.000 22.327 102.327 8.000 120.000 8.000 C 137.673 8.000 152.000 22.327 152.000 40.000 L 152.000 146.000 C 167.019 156.506 175.975 173.672 176.000 192.000 ZM 80.820 184.000 L 159.180 184.000 C 156.876 172.790 149.899 163.095 140.000 157.350 C 137.524 155.921 135.999 153.279 136.000 150.420 L 136.000 40.000 C 136.000 31.163 128.837 24.000 120.000 24.000 C 111.163 24.000 104.000 31.163 104.000 40.000 L 104.000 150.420 C 104.001 153.279 102.476 155.921 100.000 157.350 C 90.101 163.095 83.124 172.790 80.820 184.000 Z"),
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
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
