package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorBoldIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.150 179.170 L 177.320 132.350 L 215.250 118.840 L 216.010 118.540 C 223.570 115.201 228.297 107.557 227.907 99.302 C 227.517 91.047 222.091 83.882 214.250 81.270 L 54.160 29.000 C 47.022 26.706 39.200 28.597 33.899 33.899 C 28.597 39.200 26.706 47.022 29.000 54.160 L 81.270 214.240 C 83.882 222.081 91.047 227.507 99.302 227.897 C 107.557 228.287 115.201 223.560 118.540 216.000 C 118.650 215.750 118.750 215.500 118.840 215.240 L 132.350 177.320 L 179.180 224.140 C 186.990 231.948 199.650 231.948 207.460 224.140 L 224.150 207.460 C 227.902 203.709 230.011 198.621 230.011 193.315 C 230.011 188.009 227.902 182.921 224.150 179.170 ZM 193.320 204.340 L 144.840 155.860 C 141.090 152.109 136.004 150.001 130.700 150.000 C 129.445 150.003 128.193 150.120 126.960 150.350 C 120.464 151.580 114.995 155.940 112.350 162.000 C 112.240 162.250 112.140 162.500 112.050 162.760 L 100.400 195.500 L 54.290 54.290 L 195.500 100.390 L 162.790 112.050 C 162.530 112.140 162.280 112.240 162.030 112.350 C 155.962 114.989 151.592 120.458 150.357 126.959 C 149.122 133.459 151.182 140.150 155.860 144.830 L 155.860 144.830 L 204.350 193.310 Z"),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
