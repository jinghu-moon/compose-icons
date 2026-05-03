package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorThinIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.000 51.150 C 225.108 46.769 220.772 43.951 216.000 44.000 L 40.000 44.000 C 35.251 44.000 30.949 46.802 29.027 51.145 C 27.106 55.488 27.926 60.555 31.120 64.070 L 31.170 64.120 L 100.000 137.590 L 100.000 216.000 C 99.993 220.430 102.428 224.502 106.332 226.595 C 110.236 228.687 114.975 228.458 118.660 226.000 L 150.660 204.670 C 154.005 202.443 156.014 198.689 156.010 194.670 L 156.010 137.590 L 224.870 64.070 C 228.111 60.582 228.950 55.493 227.000 51.150 ZM 219.000 58.650 L 149.100 133.270 C 148.400 134.007 148.006 134.983 148.000 136.000 L 148.000 194.650 C 148.001 195.988 147.333 197.238 146.220 197.980 L 114.220 219.310 C 112.995 220.127 111.421 220.205 110.121 219.514 C 108.821 218.822 108.006 217.472 108.000 216.000 L 108.000 136.000 C 108.002 134.983 107.615 134.003 106.920 133.260 L 37.050 58.670 C 36.000 57.499 35.734 55.821 36.370 54.382 C 37.006 52.943 38.427 52.011 40.000 52.000 L 216.000 52.000 C 217.574 51.999 219.003 52.920 219.650 54.355 C 220.297 55.790 220.043 57.471 219.000 58.650 Z"),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
