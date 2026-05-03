package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorBoldIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 233.470 184.630 L 192.540 132.000 L 208.000 132.000 C 212.573 132.000 216.748 129.402 218.768 125.300 C 220.787 121.197 220.299 116.303 217.510 112.680 L 137.510 8.680 C 135.238 5.736 131.729 4.011 128.010 4.011 C 124.291 4.011 120.782 5.736 118.510 8.680 L 38.510 112.680 C 35.723 116.301 35.234 121.190 37.248 125.291 C 39.262 129.392 43.431 131.993 48.000 132.000 L 63.460 132.000 L 22.530 184.630 C 19.715 188.247 19.206 193.153 21.220 197.271 C 23.233 201.389 27.416 204.000 32.000 204.000 L 116.000 204.000 L 116.000 240.000 C 116.000 246.627 121.373 252.000 128.000 252.000 C 134.627 252.000 140.000 246.627 140.000 240.000 L 140.000 204.000 L 224.000 204.000 C 228.584 204.000 232.767 201.389 234.780 197.271 C 236.794 193.153 236.285 188.247 233.470 184.630 ZM 56.540 180.000 L 97.470 127.370 C 100.285 123.753 100.794 118.847 98.780 114.729 C 96.767 110.611 92.584 108.000 88.000 108.000 L 72.370 108.000 L 128.000 35.680 L 183.630 108.000 L 168.000 108.000 C 163.416 108.000 159.233 110.611 157.220 114.729 C 155.206 118.847 155.715 123.753 158.530 127.370 L 199.460 180.000 Z"),
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
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
