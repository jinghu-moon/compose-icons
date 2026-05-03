package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) return _globeSimpleX!!
        _globeSimpleX = phosphorThinIcon(
            name = "GlobeSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 218.830 170.830 L 197.660 192.000 L 218.830 213.170 C 220.393 214.733 220.393 217.267 218.830 218.830 C 217.267 220.393 214.733 220.393 213.170 218.830 L 192.000 197.660 L 170.830 218.830 C 169.267 220.393 166.733 220.393 165.170 218.830 C 163.607 217.267 163.607 214.733 165.170 213.170 L 186.340 192.000 L 165.170 170.830 C 163.607 169.267 163.607 166.733 165.170 165.170 C 166.733 163.607 169.267 163.607 170.830 165.170 L 192.000 186.340 L 213.170 165.170 C 214.733 163.607 217.267 163.607 218.830 165.170 C 220.393 166.733 220.393 169.267 218.830 170.830 ZM 228.000 128.000 C 228.000 130.209 226.209 132.000 224.000 132.000 L 92.080 132.000 C 93.690 190.530 130.130 220.580 130.500 220.880 L 130.500 220.880 C 131.824 221.942 132.333 223.724 131.771 225.325 C 131.209 226.926 129.697 227.999 128.000 228.000 C 72.772 228.000 28.000 183.228 28.000 128.000 C 28.000 72.772 72.772 28.000 128.000 28.000 L 128.000 28.000 C 183.203 28.061 227.939 72.797 228.000 128.000 ZM 138.460 36.600 C 150.200 49.480 170.790 78.450 171.940 124.000 L 219.940 124.000 C 217.912 78.817 183.390 41.787 138.460 36.600 ZM 92.070 124.000 L 163.930 124.000 C 162.570 74.520 136.320 45.400 128.000 37.390 C 119.680 45.390 93.430 74.520 92.070 124.000 ZM 36.070 124.000 L 84.070 124.000 C 85.220 78.450 105.810 49.480 117.550 36.600 C 72.628 41.796 38.117 78.824 36.090 124.000 ZM 84.070 132.000 L 36.070 132.000 C 38.096 177.172 72.602 214.199 117.520 219.400 C 105.800 206.520 85.210 177.550 84.060 132.000 Z"),
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
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
