package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorDuotoneIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 180.750 104.750 L 204.000 128.000 L 121.940 209.940 C 103.152 228.425 72.973 228.302 54.335 209.665 C 35.698 191.027 35.575 160.848 54.060 142.060 L 153.370 41.370 C 165.868 28.872 186.132 28.872 198.630 41.370 C 211.128 53.868 211.128 74.132 198.630 86.630 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 209.660 122.340 C 211.162 123.841 212.006 125.877 212.006 128.000 C 212.006 130.123 211.162 132.159 209.660 133.660 L 127.610 215.660 C 105.737 237.530 70.275 237.528 48.405 215.655 C 26.535 193.782 26.537 158.320 48.410 136.450 L 147.670 35.730 C 163.286 20.098 188.618 20.084 204.250 35.700 C 219.882 51.316 219.896 76.648 204.280 92.280 L 105.000 193.000 C 95.611 202.389 80.389 202.389 71.000 193.000 C 61.611 183.611 61.611 168.389 71.000 159.000 L 154.300 74.380 C 156.286 72.261 159.265 71.385 162.083 72.092 C 164.900 72.798 167.113 74.976 167.864 77.782 C 168.616 80.588 167.787 83.580 165.700 85.600 L 82.390 170.310 C 79.253 173.422 79.233 178.488 82.345 181.625 C 85.457 184.762 90.523 184.782 93.660 181.670 L 192.930 81.000 C 202.319 71.630 202.335 56.424 192.965 47.035 C 183.595 37.646 168.389 37.630 159.000 47.000 L 59.760 147.680 C 44.125 163.290 44.105 188.620 59.715 204.255 C 75.325 219.890 100.655 219.910 116.290 204.300 L 198.350 122.300 C 201.485 119.189 206.547 119.207 209.660 122.340 Z"),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
