package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorThinIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 44.000 L 177.660 44.000 L 162.830 29.170 L 162.830 29.170 C 162.079 28.420 161.061 27.999 160.000 28.000 L 96.000 28.000 C 94.939 27.999 93.921 28.420 93.170 29.170 L 93.170 29.170 L 78.340 44.000 L 56.000 44.000 C 49.373 44.000 44.000 49.373 44.000 56.000 L 44.000 208.000 C 44.000 214.627 49.373 220.000 56.000 220.000 L 200.000 220.000 C 206.627 220.000 212.000 214.627 212.000 208.000 L 212.000 56.000 C 212.000 49.373 206.627 44.000 200.000 44.000 ZM 128.000 72.790 L 103.470 36.000 L 152.530 36.000 ZM 160.620 38.280 L 172.000 49.660 L 172.000 104.000 C 172.004 105.554 171.107 106.970 169.700 107.630 C 168.317 108.297 166.673 108.098 165.490 107.120 L 133.290 79.300 ZM 84.000 49.660 L 95.380 38.280 L 122.710 79.280 L 90.540 107.080 C 89.346 108.061 87.694 108.267 86.296 107.609 C 84.898 106.950 84.004 105.545 84.000 104.000 ZM 52.000 208.000 L 52.000 56.000 C 52.000 53.791 53.791 52.000 56.000 52.000 L 76.000 52.000 L 76.000 104.000 C 75.971 108.665 78.674 112.916 82.910 114.870 C 84.504 115.613 86.241 115.998 88.000 116.000 C 90.800 115.997 93.510 115.006 95.650 113.200 L 95.710 113.200 L 124.000 88.740 L 124.000 212.000 L 56.000 212.000 C 53.791 212.000 52.000 210.209 52.000 208.000 ZM 204.000 208.000 C 204.000 210.209 202.209 212.000 200.000 212.000 L 132.000 212.000 L 132.000 88.740 L 160.320 113.200 C 162.469 115.011 165.190 116.003 168.000 116.000 C 169.770 115.996 171.518 115.604 173.120 114.850 C 177.338 112.890 180.026 108.651 180.000 104.000 L 180.000 52.000 L 200.000 52.000 C 202.209 52.000 204.000 53.791 204.000 56.000 Z"),
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
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
