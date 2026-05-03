package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorFillIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 231.880 175.080 C 228.191 203.111 204.273 224.051 176.000 224.000 C 96.600 224.000 32.000 159.400 32.000 80.000 C 31.949 51.727 52.889 27.809 80.920 24.120 C 87.957 23.261 94.721 27.135 97.540 33.640 L 118.660 80.790 L 118.660 80.910 C 120.794 85.835 120.318 91.501 117.390 96.000 C 117.210 96.270 117.020 96.520 116.820 96.770 L 96.000 121.450 C 103.490 136.670 119.410 152.450 134.830 159.960 L 159.170 139.250 C 159.409 139.049 159.659 138.862 159.920 138.690 C 164.416 135.691 170.121 135.165 175.090 137.290 L 175.220 137.350 L 222.330 158.460 C 228.847 161.269 232.735 168.035 231.880 175.080 Z"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
