package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorLightIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 115.760 155.760 L 211.760 59.760 C 214.124 57.557 217.808 57.622 220.093 59.907 C 222.378 62.192 222.443 65.876 220.240 68.240 L 124.240 164.240 C 121.876 166.443 118.192 166.378 115.907 164.093 C 113.622 161.808 113.557 158.124 115.760 155.760 ZM 128.000 86.000 C 135.167 85.993 142.287 87.155 149.080 89.440 C 152.223 90.498 155.627 88.808 156.685 85.665 C 157.743 82.522 156.053 79.118 152.910 78.060 C 127.647 69.544 99.785 74.521 79.032 91.256 C 58.279 107.991 47.511 134.166 50.480 160.660 C 50.818 163.714 53.408 166.019 56.480 166.000 C 56.703 166.015 56.927 166.015 57.150 166.000 C 60.441 165.634 62.812 162.671 62.450 159.380 C 62.168 156.930 62.018 154.466 62.000 152.000 C 62.044 115.567 91.567 86.044 128.000 86.000 ZM 226.000 101.900 C 224.487 98.951 220.869 97.787 217.920 99.300 C 214.971 100.813 213.807 104.431 215.320 107.380 C 227.529 131.342 229.394 159.258 220.480 184.630 C 220.207 185.452 219.436 186.005 218.570 186.000 L 37.460 186.000 C 36.590 185.978 35.827 185.415 35.550 184.590 C 25.086 154.598 29.770 121.398 48.124 95.472 C 66.478 69.546 96.235 54.096 128.000 54.000 L 128.900 54.000 C 144.109 54.097 159.082 57.769 172.610 64.720 C 175.570 66.236 179.199 65.065 180.715 62.105 C 182.231 59.145 181.060 55.516 178.100 54.000 C 162.901 46.205 146.081 42.095 129.000 42.000 L 128.000 42.000 C 92.311 42.018 58.847 59.339 38.226 88.467 C 17.605 117.595 12.388 154.913 24.230 188.580 C 26.202 194.203 31.501 197.976 37.460 198.000 L 218.530 198.000 C 224.474 197.985 229.767 194.234 231.750 188.630 C 241.781 160.151 239.702 128.806 226.000 101.900 Z"),
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
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
