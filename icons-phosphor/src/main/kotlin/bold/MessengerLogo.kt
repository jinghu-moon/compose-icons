package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) return _messengerLogo!!
        _messengerLogo = phosphorBoldIcon(
            name = "MessengerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.490 120.490 L 152.490 152.490 C 150.238 154.749 147.180 156.019 143.990 156.019 C 140.800 156.019 137.742 154.749 135.490 152.490 L 112.000 129.000 L 88.490 152.490 C 83.796 157.184 76.184 157.184 71.490 152.490 C 66.796 147.796 66.796 140.184 71.490 135.490 L 103.490 103.490 C 105.742 101.231 108.800 99.961 111.990 99.961 C 115.180 99.961 118.238 101.231 120.490 103.490 L 144.000 127.000 L 167.510 103.480 C 172.204 98.786 179.816 98.786 184.510 103.480 C 189.204 108.174 189.204 115.786 184.510 120.480 ZM 236.000 128.000 C 236.008 165.620 216.439 200.534 184.344 220.160 C 152.250 239.787 112.254 241.299 78.770 224.150 L 46.340 235.000 C 39.139 237.427 31.184 235.563 25.810 230.190 C 20.437 224.816 18.573 216.861 21.000 209.660 L 31.810 177.230 C 11.481 137.410 17.789 89.182 47.675 55.930 C 77.561 22.678 124.845 11.278 166.601 27.257 C 208.356 43.236 235.949 83.291 236.000 128.000 ZM 212.000 128.000 C 211.991 92.685 189.894 61.147 156.706 49.079 C 123.517 37.011 86.324 46.990 63.634 74.050 C 40.943 101.110 37.601 139.473 55.270 170.050 C 56.996 173.028 57.361 176.605 56.270 179.870 L 46.340 209.660 L 76.130 199.730 C 77.355 199.322 78.638 199.113 79.930 199.110 C 82.038 199.114 84.107 199.672 85.930 200.730 C 111.922 215.770 143.965 215.790 169.976 200.785 C 195.987 185.779 212.009 158.029 212.000 128.000 Z"),
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
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
