package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorThinIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.160 189.540 L 176.160 124.000 L 208.000 124.000 C 209.524 124.000 210.916 123.134 211.589 121.767 C 212.262 120.399 212.100 118.768 211.170 117.560 L 131.170 13.560 C 130.413 12.576 129.242 11.999 128.000 11.999 C 126.758 11.999 125.587 12.576 124.830 13.560 L 44.830 117.560 C 43.900 118.768 43.738 120.399 44.411 121.767 C 45.084 123.134 46.476 124.000 48.000 124.000 L 79.820 124.000 L 28.820 189.540 C 27.877 190.749 27.708 192.391 28.385 193.767 C 29.063 195.142 30.467 196.010 32.000 196.000 L 124.000 196.000 L 124.000 240.000 C 124.000 242.209 125.791 244.000 128.000 244.000 C 130.209 244.000 132.000 242.209 132.000 240.000 L 132.000 196.000 L 224.000 196.000 C 225.530 196.002 226.927 195.132 227.599 193.758 C 228.271 192.383 228.101 190.746 227.160 189.540 ZM 40.180 188.000 L 91.180 122.460 C 92.123 121.251 92.292 119.609 91.615 118.233 C 90.937 116.858 89.533 115.990 88.000 116.000 L 56.120 116.000 L 128.000 22.560 L 199.880 116.000 L 168.000 116.000 C 166.470 115.998 165.073 116.868 164.401 118.242 C 163.729 119.617 163.899 121.254 164.840 122.460 L 215.840 188.000 Z"),
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
