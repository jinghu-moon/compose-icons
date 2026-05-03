package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorLightIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 133.000 124.640 C 134.115 126.289 134.339 128.382 133.600 130.230 L 117.600 170.230 C 116.815 172.237 115.014 173.668 112.882 173.980 C 110.750 174.292 108.614 173.437 107.287 171.740 C 105.959 170.043 105.644 167.764 106.460 165.770 L 119.140 134.000 L 96.000 134.000 C 94.009 134.000 92.147 133.012 91.031 131.363 C 89.915 129.714 89.690 127.619 90.430 125.770 L 106.430 85.770 C 107.679 82.720 111.153 81.249 114.213 82.473 C 117.272 83.698 118.771 87.161 117.570 90.230 L 104.860 122.000 L 128.000 122.000 C 130.003 121.990 131.878 122.981 133.000 124.640 ZM 246.000 86.640 L 246.000 168.000 C 246.000 180.150 236.150 190.000 224.000 190.000 C 211.850 190.000 202.000 180.150 202.000 168.000 L 202.000 128.000 C 202.000 122.477 197.523 118.000 192.000 118.000 L 174.000 118.000 L 174.000 210.000 L 192.000 210.000 C 195.314 210.000 198.000 212.686 198.000 216.000 C 198.000 219.314 195.314 222.000 192.000 222.000 L 32.000 222.000 C 28.686 222.000 26.000 219.314 26.000 216.000 C 26.000 212.686 28.686 210.000 32.000 210.000 L 50.000 210.000 L 50.000 56.000 C 50.000 43.850 59.850 34.000 72.000 34.000 L 152.000 34.000 C 164.150 34.000 174.000 43.850 174.000 56.000 L 174.000 106.000 L 192.000 106.000 C 204.150 106.000 214.000 115.850 214.000 128.000 L 214.000 168.000 C 214.000 173.523 218.477 178.000 224.000 178.000 C 229.523 178.000 234.000 173.523 234.000 168.000 L 234.000 86.630 C 234.007 83.977 232.952 81.431 231.070 79.560 L 211.760 60.240 C 209.557 57.876 209.622 54.192 211.907 51.907 C 214.192 49.622 217.876 49.557 220.240 51.760 L 239.560 71.070 C 243.697 75.190 246.015 80.792 246.000 86.630 ZM 162.000 210.000 L 162.000 56.000 C 162.000 50.477 157.523 46.000 152.000 46.000 L 72.000 46.000 C 66.477 46.000 62.000 50.477 62.000 56.000 L 62.000 210.000 Z"),
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
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
