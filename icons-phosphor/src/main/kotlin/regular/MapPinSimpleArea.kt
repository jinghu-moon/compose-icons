package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorRegularIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 103.200 L 120.000 176.000 C 120.000 180.418 123.582 184.000 128.000 184.000 C 132.418 184.000 136.000 180.418 136.000 176.000 L 136.000 103.200 C 156.120 99.093 169.861 80.418 167.797 59.988 C 165.734 39.557 148.535 24.008 128.000 24.008 C 107.465 24.008 90.266 39.557 88.203 59.988 C 86.139 80.418 99.880 99.093 120.000 103.200 ZM 128.000 40.000 C 141.255 40.000 152.000 50.745 152.000 64.000 C 152.000 77.255 141.255 88.000 128.000 88.000 C 114.745 88.000 104.000 77.255 104.000 64.000 C 104.000 50.745 114.745 40.000 128.000 40.000 ZM 240.000 176.000 C 240.000 207.180 182.290 224.000 128.000 224.000 C 73.710 224.000 16.000 207.180 16.000 176.000 C 16.000 168.260 19.810 156.870 38.000 146.590 C 50.260 139.650 67.120 134.320 86.770 131.170 C 91.141 130.480 95.245 133.464 95.935 137.835 C 96.625 142.206 93.641 146.310 89.270 147.000 C 71.730 149.820 56.270 154.630 45.850 160.550 C 37.050 165.500 32.000 171.140 32.000 176.000 C 32.000 189.360 68.520 208.000 128.000 208.000 C 187.480 208.000 224.000 189.360 224.000 176.000 C 224.000 171.140 218.950 165.500 210.150 160.510 C 199.690 154.590 184.270 149.780 166.730 146.960 C 163.840 146.582 161.384 144.663 160.319 141.950 C 159.254 139.237 159.749 136.159 161.611 133.917 C 163.473 131.674 166.407 130.622 169.270 131.170 C 188.920 134.320 205.780 139.650 218.040 146.590 C 236.190 156.870 240.000 168.260 240.000 176.000 Z"),
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
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
