package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorLightIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.740 188.320 L 180.270 126.000 L 208.000 126.000 C 210.287 126.002 212.377 124.704 213.388 122.652 C 214.399 120.600 214.155 118.152 212.760 116.340 L 132.760 12.340 C 131.624 10.860 129.865 9.993 128.000 9.993 C 126.135 9.993 124.376 10.860 123.240 12.340 L 43.240 116.340 C 41.845 118.152 41.601 120.600 42.612 122.652 C 43.623 124.704 45.713 126.002 48.000 126.000 L 75.730 126.000 L 27.260 188.320 C 25.855 190.129 25.603 192.581 26.610 194.639 C 27.618 196.696 29.709 198.000 32.000 198.000 L 122.000 198.000 L 122.000 240.000 C 122.000 243.314 124.686 246.000 128.000 246.000 C 131.314 246.000 134.000 243.314 134.000 240.000 L 134.000 198.000 L 224.000 198.000 C 226.291 198.000 228.382 196.696 229.390 194.639 C 230.397 192.581 230.145 190.129 228.740 188.320 ZM 44.270 186.000 L 92.740 123.680 C 94.145 121.871 94.397 119.419 93.390 117.361 C 92.382 115.304 90.291 114.000 88.000 114.000 L 60.190 114.000 L 128.000 25.840 L 195.810 114.000 L 168.000 114.000 C 165.709 114.000 163.618 115.304 162.610 117.361 C 161.603 119.419 161.855 121.871 163.260 123.680 L 211.730 186.000 Z"),
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
