package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorThinIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 171.920 112.340 C 171.663 111.078 170.814 110.018 169.640 109.490 L 116.640 85.710 L 131.070 24.920 C 131.491 23.150 130.665 21.319 129.060 20.464 C 127.455 19.608 125.474 19.943 124.240 21.280 L 29.060 124.140 C 28.184 125.086 27.817 126.396 28.075 127.659 C 28.332 128.922 29.183 129.983 30.360 130.510 L 83.360 154.290 L 68.910 215.070 C 68.485 216.838 69.307 218.671 70.910 219.530 C 71.488 219.841 72.134 220.002 72.790 220.000 C 73.906 220.002 74.971 219.538 75.730 218.720 L 170.930 115.860 C 171.808 114.915 172.177 113.604 171.920 112.340 ZM 80.210 202.100 L 91.890 152.920 C 92.332 151.054 91.388 149.137 89.640 148.350 L 38.720 125.490 L 119.790 37.900 L 108.110 87.080 C 107.668 88.946 108.612 90.863 110.360 91.650 L 161.280 114.510 ZM 235.580 214.210 L 199.580 142.210 C 198.903 140.852 197.517 139.994 196.000 139.994 C 194.483 139.994 193.097 140.852 192.420 142.210 L 156.420 214.210 C 155.431 216.187 156.233 218.591 158.210 219.580 C 160.187 220.569 162.591 219.767 163.580 217.790 L 174.470 196.000 L 217.530 196.000 L 228.420 217.790 C 229.098 219.145 230.484 220.001 232.000 220.000 C 232.621 219.997 233.233 219.853 233.790 219.580 C 234.740 219.106 235.462 218.273 235.798 217.266 C 236.134 216.259 236.055 215.159 235.580 214.210 ZM 178.470 188.000 L 196.000 152.940 L 213.530 188.000 Z"),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
