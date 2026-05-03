package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorBoldIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 212.000 128.000 C 211.993 132.943 211.551 137.875 210.680 142.740 C 205.457 131.713 199.259 121.174 192.160 111.250 C 198.620 112.764 204.991 114.640 211.240 116.870 C 211.737 120.559 211.991 124.277 212.000 128.000 ZM 202.390 89.060 C 192.540 86.492 182.512 84.663 172.390 83.590 C 171.317 73.468 169.488 63.440 166.920 53.590 C 182.060 61.552 194.428 73.920 202.390 89.060 ZM 139.130 44.760 C 141.360 51.009 143.236 57.380 144.750 63.840 C 134.826 56.741 124.287 50.543 113.260 45.320 C 121.800 43.774 130.531 43.585 139.130 44.760 ZM 81.070 58.360 C 98.872 64.074 115.674 72.529 130.870 83.420 C 100.732 86.335 71.619 95.916 45.640 111.470 C 50.023 89.803 62.748 70.728 81.070 58.360 ZM 45.000 140.650 C 75.450 118.610 112.031 106.645 149.620 106.430 C 149.405 144.019 137.440 180.600 115.400 211.050 C 79.090 205.451 50.599 176.960 45.000 140.650 ZM 144.580 210.360 C 160.134 184.381 169.715 155.268 172.630 125.130 C 183.521 140.326 191.976 157.128 197.690 174.930 C 185.310 193.262 166.215 205.989 144.530 210.360 Z"),
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
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
