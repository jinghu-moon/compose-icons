package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorThinIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.210 59.800 C 199.111 38.763 164.969 38.763 143.870 59.800 L 128.000 75.000 L 112.180 59.800 C 91.097 38.703 56.902 38.692 35.805 59.775 C 14.708 80.858 14.697 115.053 35.780 136.150 L 125.150 226.810 C 125.902 227.573 126.929 228.003 128.000 228.003 C 129.071 228.003 130.098 227.573 130.850 226.810 L 220.210 136.170 C 241.261 115.065 241.261 80.905 220.210 59.800 ZM 214.530 130.540 L 128.000 218.300 L 41.450 130.520 C 23.501 112.535 23.530 83.404 41.515 65.455 C 59.500 47.506 88.631 47.535 106.580 65.520 L 122.230 80.590 L 109.230 93.110 C 108.443 93.865 107.999 94.909 108.000 96.000 C 107.991 97.072 108.413 98.102 109.170 98.860 L 138.350 128.000 L 125.170 141.170 C 123.607 142.733 123.607 145.267 125.170 146.830 C 126.733 148.393 129.267 148.393 130.830 146.830 L 146.830 130.830 C 147.581 130.080 148.003 129.062 148.003 128.000 C 148.003 126.938 147.581 125.920 146.830 125.170 L 117.710 96.000 L 149.480 65.420 C 167.451 47.457 196.582 47.464 214.545 65.435 C 232.508 83.406 232.501 112.537 214.530 130.500 Z"),
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
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
