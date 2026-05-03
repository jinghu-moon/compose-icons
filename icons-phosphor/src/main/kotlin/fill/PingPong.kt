package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorFillIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 196.000 C 239.611 191.312 237.179 187.033 233.350 184.300 L 195.350 157.150 L 212.350 140.200 C 221.770 130.860 225.898 117.429 223.350 104.410 C 218.696 81.562 206.167 61.074 187.950 46.520 C 169.449 31.627 146.328 23.662 122.580 24.000 C 68.519 24.914 24.914 68.519 24.000 122.580 C 23.707 146.299 31.680 169.379 46.550 187.860 C 61.104 206.077 81.592 218.606 104.440 223.260 C 117.459 225.806 130.889 221.679 140.230 212.260 L 157.180 195.260 L 184.330 233.260 C 187.038 237.115 191.307 239.581 196.000 240.000 C 196.440 240.000 196.880 240.050 197.320 240.050 C 201.563 240.048 205.631 238.361 208.630 235.360 L 235.270 208.720 C 238.656 205.392 240.389 200.732 240.000 196.000 ZM 197.400 224.000 L 164.770 178.310 C 163.403 176.397 161.263 175.183 158.920 174.990 Q 158.590 174.990 158.260 174.990 C 156.138 174.988 154.102 175.830 152.600 177.330 L 128.970 200.960 C 123.408 206.605 115.391 209.093 107.610 207.590 C 103.423 206.752 99.310 205.582 95.310 204.090 L 204.110 95.290 C 205.600 99.291 206.771 103.404 207.610 107.590 C 209.115 115.371 206.627 123.389 200.980 128.950 L 177.300 152.550 C 175.635 154.212 174.786 156.522 174.979 158.867 C 175.172 161.211 176.386 163.352 178.300 164.720 L 224.000 197.360 Z"),
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
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
