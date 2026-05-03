package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorBoldIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.930 195.710 C 243.458 189.980 240.544 184.730 235.930 181.300 L 203.000 155.170 L 215.100 143.070 C 225.472 132.789 230.017 118.002 227.210 103.670 C 222.375 79.901 209.347 58.584 190.400 43.440 C 171.182 27.981 147.182 19.693 122.520 20.000 C 66.296 20.946 20.946 66.296 20.000 122.520 C 19.696 147.171 27.979 171.160 43.430 190.370 C 58.574 209.317 79.891 222.345 103.660 227.180 C 117.989 229.987 132.773 225.442 143.050 215.070 L 155.170 203.000 L 181.300 235.950 C 184.730 240.564 189.980 243.478 195.710 243.950 C 196.260 243.950 196.810 244.020 197.370 244.020 C 202.670 244.016 207.753 241.909 211.500 238.160 L 238.140 211.520 C 242.309 207.363 244.429 201.576 243.930 195.710 ZM 44.000 122.860 C 44.600 80.000 80.000 44.600 122.860 44.000 C 148.220 43.683 172.297 55.131 188.060 75.000 L 75.000 188.060 C 55.131 172.297 43.683 148.220 44.000 122.860 ZM 197.710 218.000 L 165.610 177.510 C 163.482 174.835 160.313 173.194 156.900 173.000 L 156.210 173.000 C 153.026 172.997 149.972 174.260 147.720 176.510 L 126.090 198.100 L 126.090 198.100 C 121.470 202.795 114.811 204.874 108.340 203.640 C 104.364 202.842 100.459 201.729 96.660 200.310 L 200.310 96.660 C 201.729 100.459 202.842 104.364 203.640 108.340 C 204.874 114.811 202.795 121.470 198.100 126.090 L 176.470 147.720 C 174.046 150.136 172.769 153.472 172.960 156.889 C 173.151 160.306 174.792 163.479 177.470 165.610 L 218.000 197.710 Z"),
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
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
