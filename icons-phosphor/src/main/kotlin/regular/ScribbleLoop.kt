package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorRegularIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 253.930 154.630 C 252.610 153.170 229.840 128.410 192.930 114.070 C 191.210 95.650 184.470 78.900 173.520 66.150 C 158.870 49.000 137.580 40.000 112.000 40.000 C 60.480 40.000 26.890 86.180 25.490 88.150 C 23.108 91.739 23.996 96.570 27.498 99.078 C 31.000 101.586 35.859 100.871 38.490 97.460 C 38.800 97.050 68.810 56.000 112.000 56.000 C 132.770 56.000 149.860 63.110 161.410 76.570 C 168.830 85.210 173.850 96.260 176.080 108.570 C 164.496 105.545 152.573 104.009 140.600 104.000 C 114.540 104.000 92.670 110.810 77.340 123.690 C 63.780 135.090 56.000 151.000 56.000 167.250 C 55.875 180.000 60.872 192.266 69.870 201.300 C 79.530 210.920 92.930 216.000 108.600 216.000 C 160.410 216.000 189.780 173.870 193.090 131.580 C 211.377 139.709 227.992 151.167 242.090 165.370 C 245.056 168.645 250.115 168.896 253.390 165.930 C 256.665 162.964 256.916 157.905 253.950 154.630 ZM 159.470 176.270 C 150.640 187.090 134.660 200.000 108.600 200.000 C 83.320 200.000 72.000 183.550 72.000 167.250 C 72.000 144.490 93.470 120.000 140.600 120.000 C 153.076 120.037 165.474 121.952 177.380 125.680 C 176.930 144.440 170.460 162.780 159.470 176.270 Z"),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
