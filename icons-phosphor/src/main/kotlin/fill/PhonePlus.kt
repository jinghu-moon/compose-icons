package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhonePlus: ImageVector
    get() {
        if (_phonePlus != null) return _phonePlus!!
        _phonePlus = phosphorFillIcon(
            name = "PhonePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 223.880 183.080 C 220.191 211.111 196.273 232.051 168.000 232.000 C 88.600 232.000 24.000 167.400 24.000 88.000 C 23.949 59.727 44.889 35.809 72.920 32.120 C 79.957 31.261 86.721 35.135 89.540 41.640 L 110.660 88.790 C 110.656 88.830 110.656 88.870 110.660 88.910 C 112.794 93.835 112.318 99.501 109.390 104.000 C 109.210 104.270 109.020 104.520 108.820 104.770 L 88.000 129.450 C 95.490 144.670 111.410 160.450 126.830 167.960 L 151.170 147.250 C 151.409 147.049 151.659 146.862 151.920 146.690 C 156.418 143.688 162.129 143.161 167.100 145.290 L 167.220 145.350 L 214.320 166.460 C 220.841 169.266 224.733 176.033 223.880 183.080 ZM 144.000 88.000 L 168.000 88.000 L 168.000 112.000 C 168.000 116.418 171.582 120.000 176.000 120.000 C 180.418 120.000 184.000 116.418 184.000 112.000 L 184.000 88.000 L 208.000 88.000 C 212.418 88.000 216.000 84.418 216.000 80.000 C 216.000 75.582 212.418 72.000 208.000 72.000 L 184.000 72.000 L 184.000 48.000 C 184.000 43.582 180.418 40.000 176.000 40.000 C 171.582 40.000 168.000 43.582 168.000 48.000 L 168.000 72.000 L 144.000 72.000 C 139.582 72.000 136.000 75.582 136.000 80.000 C 136.000 84.418 139.582 88.000 144.000 88.000 Z"),
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
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
