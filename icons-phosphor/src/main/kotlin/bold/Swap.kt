package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorBoldIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 48.000 L 228.000 152.000 C 228.000 163.046 219.046 172.000 208.000 172.000 L 112.920 172.000 C 117.150 176.850 116.801 184.174 112.128 188.599 C 107.456 193.025 100.124 192.977 95.510 188.490 L 75.510 168.490 C 73.251 166.238 71.981 163.180 71.981 159.990 C 71.981 156.800 73.251 153.742 75.510 151.490 L 95.510 131.490 C 100.104 126.866 107.550 126.755 112.280 131.240 C 117.010 135.726 117.294 143.167 112.920 148.000 L 204.000 148.000 L 204.000 52.000 L 100.000 52.000 C 100.000 58.627 94.627 64.000 88.000 64.000 C 81.373 64.000 76.000 58.627 76.000 52.000 L 76.000 48.000 C 76.000 36.954 84.954 28.000 96.000 28.000 L 208.000 28.000 C 219.046 28.000 228.000 36.954 228.000 48.000 ZM 168.000 192.000 C 161.373 192.000 156.000 197.373 156.000 204.000 L 52.000 204.000 L 52.000 108.000 L 143.080 108.000 C 138.850 112.850 139.199 120.174 143.872 124.599 C 148.544 129.025 155.876 128.977 160.490 124.490 L 180.490 104.490 C 182.749 102.238 184.019 99.180 184.019 95.990 C 184.019 92.800 182.749 89.742 180.490 87.490 L 160.490 67.490 C 155.896 62.866 148.450 62.755 143.720 67.240 C 138.990 71.726 138.706 79.167 143.080 84.000 L 48.000 84.000 C 36.954 84.000 28.000 92.954 28.000 104.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 160.000 228.000 C 171.046 228.000 180.000 219.046 180.000 208.000 L 180.000 204.000 C 180.000 197.373 174.627 192.000 168.000 192.000 Z"),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
