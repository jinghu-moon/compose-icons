package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorRegularIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 196.000 C 239.611 191.312 237.179 187.033 233.350 184.300 L 195.350 157.150 L 212.350 140.200 C 221.770 130.860 225.898 117.429 223.350 104.410 C 218.696 81.562 206.167 61.074 187.950 46.520 C 169.449 31.627 146.328 23.662 122.580 24.000 C 68.519 24.914 24.914 68.519 24.000 122.580 C 23.707 146.299 31.680 169.379 46.550 187.860 C 61.104 206.077 81.592 218.606 104.440 223.260 C 117.459 225.806 130.889 221.679 140.230 212.260 L 157.180 195.260 L 184.330 233.260 C 187.038 237.115 191.307 239.581 196.000 240.000 C 196.440 240.000 196.880 240.050 197.320 240.050 C 201.563 240.048 205.631 238.361 208.630 235.360 L 235.270 208.720 C 238.656 205.392 240.389 200.732 240.000 196.000 ZM 59.000 177.830 C 46.475 162.258 39.758 142.813 40.000 122.830 C 40.769 77.418 77.389 40.786 122.800 40.000 C 142.780 39.774 162.220 46.489 177.800 59.000 C 185.192 64.938 191.539 72.069 196.580 80.100 L 80.100 196.580 C 72.072 191.548 64.940 185.211 59.000 177.830 ZM 197.350 224.000 L 164.720 178.310 C 163.353 176.397 161.213 175.183 158.870 174.990 Q 158.540 174.990 158.210 174.990 C 156.088 174.988 154.052 175.830 152.550 177.330 L 128.920 200.960 C 123.358 206.605 115.341 209.093 107.560 207.590 C 103.373 206.752 99.260 205.582 95.260 204.090 L 204.060 95.290 C 205.550 99.291 206.721 103.404 207.560 107.590 C 209.065 115.371 206.577 123.389 200.930 128.950 L 177.300 152.550 C 175.635 154.212 174.786 156.522 174.979 158.867 C 175.172 161.211 176.386 163.352 178.300 164.720 L 224.000 197.350 Z"),
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
