package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorThinIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 L 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 219.900 124.000 L 171.900 124.000 C 170.750 78.450 150.160 49.480 138.420 36.600 C 183.354 41.783 217.881 78.814 219.910 124.000 ZM 128.000 218.610 C 119.680 210.610 93.430 181.480 92.070 132.000 L 163.930 132.000 C 162.570 181.480 136.320 210.610 128.000 218.610 ZM 92.070 124.000 C 93.430 74.520 119.680 45.390 128.000 37.390 C 136.320 45.390 162.570 74.520 163.930 124.000 ZM 117.540 36.600 C 105.800 49.480 85.210 78.450 84.060 124.000 L 36.060 124.000 C 38.088 78.817 72.610 41.787 117.540 36.600 ZM 36.090 132.000 L 84.090 132.000 C 85.240 177.550 105.830 206.520 117.570 219.400 C 72.640 214.213 38.118 177.183 36.090 132.000 ZM 138.460 219.400 C 150.200 206.520 170.790 177.550 171.940 132.000 L 219.940 132.000 C 217.912 177.183 183.390 214.213 138.460 219.400 Z"),
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
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
