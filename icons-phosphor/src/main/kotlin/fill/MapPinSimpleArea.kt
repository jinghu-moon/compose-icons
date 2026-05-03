package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorFillIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 64.000 C 87.999 42.950 104.313 25.501 125.316 24.088 C 146.319 22.676 164.822 37.783 167.640 58.644 C 170.458 79.505 156.625 98.980 136.000 103.190 L 136.000 176.000 C 136.000 180.418 132.418 184.000 128.000 184.000 C 123.582 184.000 120.000 180.418 120.000 176.000 L 120.000 103.190 C 101.388 99.371 88.020 83.000 88.000 64.000 ZM 218.000 146.590 C 205.740 139.650 188.880 134.320 169.230 131.170 C 164.859 130.480 160.755 133.464 160.065 137.835 C 159.375 142.206 162.359 146.310 166.730 147.000 C 184.270 149.820 199.730 154.630 210.150 160.550 C 219.000 165.500 224.000 171.140 224.000 176.000 C 224.000 189.360 187.480 208.000 128.000 208.000 C 68.520 208.000 32.000 189.360 32.000 176.000 C 32.000 171.140 37.000 165.500 45.850 160.510 C 56.310 154.590 71.730 149.780 89.270 146.960 C 92.160 146.582 94.616 144.663 95.681 141.950 C 96.746 139.237 96.251 136.159 94.389 133.917 C 92.527 131.674 89.593 130.622 86.730 131.170 C 67.080 134.320 50.220 139.650 37.960 146.590 C 19.810 156.870 16.000 168.260 16.000 176.000 C 16.000 207.180 73.710 224.000 128.000 224.000 C 182.290 224.000 240.000 207.180 240.000 176.000 C 240.000 168.260 236.190 156.870 218.000 146.590 Z"),
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
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
