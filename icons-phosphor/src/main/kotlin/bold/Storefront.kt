package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorBoldIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 96.000 C 236.007 94.885 235.859 93.774 235.560 92.700 L 221.200 42.510 C 218.728 33.949 210.911 28.041 202.000 28.000 L 54.000 28.000 C 45.089 28.041 37.272 33.949 34.800 42.510 L 20.460 92.700 C 20.154 93.773 19.999 94.884 20.000 96.000 L 20.000 96.000 L 20.000 112.000 C 19.998 125.129 25.867 137.572 36.000 145.920 L 36.000 216.000 C 36.000 222.627 41.373 228.000 48.000 228.000 L 208.000 228.000 C 214.627 228.000 220.000 222.627 220.000 216.000 L 220.000 145.920 C 230.133 137.572 236.002 125.129 236.000 112.000 L 236.000 96.000 ZM 57.050 52.000 L 199.000 52.000 L 208.140 84.000 L 47.910 84.000 ZM 148.050 108.000 L 148.050 112.000 C 148.050 123.046 139.096 132.000 128.050 132.000 C 117.004 132.000 108.050 123.046 108.050 112.000 L 108.050 108.000 ZM 53.000 128.710 C 47.380 125.009 43.998 118.729 44.000 112.000 L 44.000 108.000 L 84.000 108.000 L 84.000 112.000 C 84.000 123.046 75.046 132.000 64.000 132.000 C 60.844 132.001 57.734 131.247 54.930 129.800 C 54.323 129.376 53.677 129.011 53.000 128.710 ZM 196.000 204.000 L 60.000 204.000 L 60.000 155.810 C 61.320 155.930 62.650 156.000 64.000 156.000 C 76.122 156.004 87.706 150.990 96.000 142.150 C 104.296 150.988 115.878 156.001 128.000 156.001 C 140.122 156.001 151.704 150.988 160.000 142.150 C 168.294 150.990 179.878 156.004 192.000 156.000 C 193.350 156.000 194.680 155.930 196.000 155.810 ZM 212.000 112.000 C 212.002 118.729 208.620 125.009 203.000 128.710 C 202.341 129.014 201.711 129.379 201.120 129.800 C 194.920 132.977 187.513 132.698 181.569 129.065 C 175.625 125.431 172.000 118.967 172.000 112.000 L 172.000 108.000 L 212.000 108.000 Z"),
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
        return _storefront!!
    }

private var _storefront: ImageVector? = null
