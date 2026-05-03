package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) return _phoneOutgoing!!
        _phoneOutgoing = phosphorFillIcon(
            name = "PhoneOutgoing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 146.340 109.660 C 144.838 108.159 143.994 106.123 143.994 104.000 C 143.994 101.877 144.838 99.841 146.340 98.340 L 180.690 64.000 L 160.000 64.000 C 155.582 64.000 152.000 60.418 152.000 56.000 C 152.000 51.582 155.582 48.000 160.000 48.000 L 200.000 48.000 C 204.418 48.000 208.000 51.582 208.000 56.000 L 208.000 96.000 C 208.000 100.418 204.418 104.000 200.000 104.000 C 195.582 104.000 192.000 100.418 192.000 96.000 L 192.000 75.310 L 157.660 109.660 C 156.159 111.162 154.123 112.006 152.000 112.006 C 149.877 112.006 147.841 111.162 146.340 109.660 ZM 214.340 166.460 L 167.230 145.350 L 167.100 145.290 C 162.131 143.165 156.426 143.691 151.930 146.690 C 151.669 146.862 151.419 147.049 151.180 147.250 L 126.870 168.000 C 111.450 160.510 95.530 144.710 88.040 129.490 L 108.820 104.780 C 109.020 104.530 109.210 104.280 109.390 104.010 C 112.323 99.528 112.819 93.874 110.710 88.950 L 110.710 88.830 L 89.540 41.640 C 86.721 35.135 79.957 31.261 72.920 32.120 C 44.889 35.809 23.949 59.727 24.000 88.000 C 24.000 167.400 88.600 232.000 168.000 232.000 C 196.273 232.051 220.191 211.111 223.880 183.080 C 224.741 176.045 220.871 169.282 214.370 166.460 Z"),
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
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
