package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorThinIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 219.120 128.090 C 205.300 145.270 191.860 154.330 178.010 155.790 C 176.681 155.929 175.346 155.999 174.010 156.000 C 156.010 156.000 140.530 143.360 125.480 131.100 C 109.910 118.420 95.190 106.440 78.840 108.170 C 67.220 109.390 55.540 117.490 43.130 132.930 C 41.727 134.573 39.273 134.805 37.587 133.454 C 35.901 132.103 35.592 129.657 36.890 127.930 C 50.700 110.730 64.140 101.670 78.000 100.210 C 97.670 98.130 114.380 111.740 130.540 124.900 C 146.110 137.580 160.830 149.560 177.180 147.830 C 188.800 146.610 200.480 138.510 212.890 123.070 C 213.766 121.904 215.208 121.307 216.652 121.513 C 218.097 121.718 219.314 122.694 219.830 124.059 C 220.346 125.423 220.077 126.961 219.130 128.070 Z"),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
