package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorLightIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.000 196.200 C 237.639 192.104 235.496 188.375 232.140 186.000 L 192.210 157.480 L 210.830 138.860 C 219.788 129.992 223.715 117.230 221.290 104.860 C 216.739 82.463 204.460 62.379 186.600 48.120 C 168.494 33.519 145.858 25.698 122.600 26.010 C 69.628 26.913 26.903 69.638 26.000 122.610 C 25.711 145.864 33.529 168.493 48.110 186.610 C 62.363 204.468 82.440 216.747 104.830 221.300 C 117.200 223.725 129.962 219.798 138.830 210.840 L 157.450 192.220 L 186.000 232.140 C 188.375 235.496 192.104 237.639 196.200 238.000 C 196.590 238.000 196.980 238.050 197.360 238.050 C 201.070 238.048 204.627 236.573 207.250 233.950 L 233.900 207.310 C 236.843 204.395 238.344 200.327 238.000 196.200 ZM 57.470 179.080 C 44.639 163.140 37.755 143.231 38.000 122.770 C 38.812 76.293 76.293 38.812 122.770 38.000 C 143.229 37.760 163.135 44.639 179.080 57.460 C 187.038 63.874 193.807 71.635 199.080 80.390 L 80.400 199.120 C 71.640 193.838 63.878 187.054 57.470 179.080 ZM 225.410 198.770 L 198.770 225.410 C 198.355 225.811 197.788 226.014 197.213 225.966 C 196.639 225.918 196.112 225.624 195.770 225.160 L 163.130 179.470 C 162.091 178.032 160.469 177.128 158.700 177.000 L 158.210 177.000 C 156.619 177.001 155.094 177.634 153.970 178.760 L 130.340 202.380 L 130.340 202.380 C 124.302 208.495 115.606 211.186 107.170 209.550 C 101.864 208.492 96.675 206.911 91.680 204.830 L 204.800 91.680 C 206.879 96.675 208.460 101.864 209.520 107.170 C 211.157 115.608 208.462 124.306 202.340 130.340 L 178.720 154.000 C 177.474 155.246 176.839 156.977 176.984 158.734 C 177.128 160.490 178.037 162.094 179.470 163.120 L 225.160 195.760 C 225.624 196.102 225.918 196.629 225.966 197.203 C 226.014 197.778 225.811 198.345 225.410 198.760 Z"),
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
