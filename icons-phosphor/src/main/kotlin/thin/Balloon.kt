package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorThinIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 81.629 20.050 44.050 57.629 44.000 104.000 C 44.000 126.570 53.080 151.630 68.280 171.000 C 80.960 187.170 96.280 197.810 112.500 202.000 L 100.320 230.400 C 99.779 231.639 99.901 233.067 100.643 234.197 C 101.386 235.326 102.648 236.005 104.000 236.000 L 152.000 236.000 C 153.346 236.002 154.603 235.326 155.344 234.202 C 156.086 233.078 156.212 231.657 155.680 230.420 L 143.500 202.000 C 159.730 197.830 175.040 187.190 187.720 171.000 C 202.920 151.590 212.000 126.530 212.000 104.000 C 211.950 57.629 174.371 20.050 128.000 20.000 ZM 145.930 228.000 L 110.070 228.000 L 120.550 203.540 C 125.498 204.153 130.502 204.153 135.450 203.540 ZM 128.000 196.000 C 85.900 196.000 52.000 145.670 52.000 104.000 C 52.000 62.026 86.026 28.000 128.000 28.000 C 169.974 28.000 204.000 62.026 204.000 104.000 C 204.000 145.670 170.100 196.000 128.000 196.000 ZM 180.000 95.340 C 180.176 96.388 179.929 97.463 179.311 98.328 C 178.694 99.192 177.758 99.776 176.710 99.950 C 176.490 99.965 176.270 99.965 176.050 99.950 C 174.094 99.952 172.423 98.539 172.100 96.610 C 168.737 77.905 154.059 63.286 135.340 60.000 C 133.158 59.635 131.685 57.572 132.050 55.390 C 132.415 53.208 134.478 51.735 136.660 52.100 C 158.746 55.996 176.053 73.263 180.000 95.340 Z"),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
