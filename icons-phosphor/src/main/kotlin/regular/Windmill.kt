package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = phosphorRegularIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 224.000 L 182.940 224.000 L 176.640 179.880 L 179.880 181.790 C 183.537 183.944 187.900 184.557 192.010 183.494 C 196.119 182.431 199.637 179.778 201.790 176.120 L 213.790 155.780 C 215.944 152.123 216.557 147.760 215.494 143.650 C 214.431 139.541 211.778 136.023 208.120 133.870 L 173.120 113.260 L 213.810 44.130 C 215.964 40.473 216.577 36.110 215.514 32.000 C 214.451 27.891 211.798 24.373 208.140 22.220 L 187.800 10.220 C 184.143 8.066 179.780 7.453 175.670 8.516 C 171.561 9.579 168.043 12.232 165.890 15.890 L 145.280 50.890 L 76.120 10.220 C 72.463 8.066 68.100 7.453 63.990 8.516 C 59.881 9.579 56.363 12.232 54.210 15.890 L 42.210 36.220 C 40.052 39.878 39.438 44.244 40.501 48.355 C 41.565 52.467 44.219 55.987 47.880 58.140 L 82.880 78.750 L 42.210 147.880 C 40.056 151.537 39.443 155.900 40.506 160.010 C 41.569 164.119 44.222 167.637 47.880 169.790 L 68.220 181.790 C 71.397 183.694 75.148 184.403 78.800 183.790 L 73.060 224.000 L 32.000 224.000 C 27.582 224.000 24.000 227.582 24.000 232.000 C 24.000 236.418 27.582 240.000 32.000 240.000 L 224.000 240.000 C 228.418 240.000 232.000 236.418 232.000 232.000 C 232.000 227.582 228.418 224.000 224.000 224.000 ZM 200.000 147.660 L 188.000 168.000 L 118.870 127.310 L 130.870 106.960 ZM 179.660 24.000 L 200.000 36.000 L 159.310 105.140 L 139.000 93.170 ZM 56.000 44.350 L 68.000 24.000 L 137.140 64.700 L 125.140 85.050 ZM 76.340 168.000 L 56.000 156.000 L 96.690 86.860 L 117.050 98.860 ZM 89.220 224.000 L 98.000 162.800 L 110.770 141.100 L 159.000 169.500 L 166.790 224.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _windmill!!
    }

private var _windmill: ImageVector? = null
