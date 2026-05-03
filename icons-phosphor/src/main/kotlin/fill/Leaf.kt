package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorFillIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 223.450 40.070 C 223.213 36.019 219.981 32.787 215.930 32.550 C 139.800 28.080 78.820 51.000 52.820 94.000 C 43.808 108.709 39.367 125.763 40.060 143.000 C 40.513 154.022 42.755 164.898 46.700 175.200 C 47.171 176.489 48.270 177.446 49.611 177.736 C 50.952 178.026 52.348 177.609 53.310 176.630 L 138.310 90.330 C 141.436 87.204 146.504 87.204 149.630 90.330 C 152.756 93.456 152.756 98.524 149.630 101.650 L 56.740 195.940 L 42.550 210.130 C 39.490 213.109 39.229 217.938 41.950 221.230 C 43.403 222.912 45.490 223.914 47.711 223.996 C 49.933 224.078 52.088 223.231 53.660 221.660 L 70.450 204.870 C 84.590 211.710 98.860 215.440 113.010 215.940 Q 114.680 216.000 116.340 216.000 C 132.454 216.041 148.262 211.603 162.000 203.180 C 205.000 177.180 227.930 116.210 223.450 40.070 Z"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
