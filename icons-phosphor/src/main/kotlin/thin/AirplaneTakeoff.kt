package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorThinIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 216.000 C 172.000 218.209 170.209 220.000 168.000 220.000 L 24.000 220.000 C 21.791 220.000 20.000 218.209 20.000 216.000 C 20.000 213.791 21.791 212.000 24.000 212.000 L 168.000 212.000 C 170.209 212.000 172.000 213.791 172.000 216.000 ZM 243.930 92.410 C 243.720 93.538 243.035 94.521 242.050 95.110 L 94.640 183.110 C 89.118 186.341 82.838 188.050 76.440 188.060 C 67.307 188.049 58.524 184.547 51.890 178.270 L 15.730 142.890 C 12.821 140.123 11.488 136.084 12.179 132.129 C 12.871 128.174 15.494 124.826 19.170 123.210 L 22.240 121.710 C 23.176 121.256 24.252 121.184 25.240 121.510 L 55.240 131.640 L 81.500 115.800 L 55.910 91.000 C 52.899 88.251 51.489 84.160 52.169 80.139 C 52.848 76.118 55.523 72.718 59.270 71.110 L 59.430 71.050 L 66.580 68.340 C 67.483 68.003 68.477 68.003 69.380 68.340 L 125.110 88.800 L 178.320 57.000 C 193.608 47.907 213.253 51.407 224.460 65.220 L 243.150 89.220 C 243.855 90.123 244.139 91.284 243.930 92.410 ZM 234.060 90.560 L 218.210 70.240 C 209.488 59.553 194.257 56.860 182.400 63.910 L 127.580 96.640 C 126.541 97.262 125.276 97.380 124.140 96.960 L 68.000 76.310 L 62.340 78.450 C 61.113 79.012 60.251 80.155 60.050 81.490 C 59.848 82.824 60.333 84.171 61.340 85.070 C 61.374 85.109 61.411 85.146 61.450 85.180 L 90.800 113.670 C 91.688 114.534 92.126 115.761 91.985 116.992 C 91.844 118.223 91.140 119.319 90.080 119.960 L 57.860 139.440 C 56.852 140.051 55.627 140.186 54.510 139.810 L 24.280 129.610 L 22.610 130.430 L 22.430 130.520 C 21.191 131.052 20.304 132.173 20.070 133.502 C 19.836 134.830 20.287 136.186 21.270 137.110 L 57.420 172.500 C 66.420 180.967 79.927 182.482 90.580 176.220 Z"),
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
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
