package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorBoldIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.490 107.510 C 250.238 105.251 247.180 103.981 243.990 103.981 C 240.800 103.981 237.742 105.251 235.490 107.510 L 192.000 151.000 L 113.000 72.000 L 156.520 28.490 C 161.214 23.796 161.214 16.184 156.520 11.490 C 151.826 6.796 144.214 6.796 139.520 11.490 L 93.170 57.860 C 87.754 63.290 85.920 71.340 88.450 78.580 L 69.170 97.860 C 61.362 105.670 61.362 118.330 69.170 126.140 L 71.000 128.000 L 15.510 183.510 C 12.569 186.452 11.362 190.707 12.319 194.756 C 13.277 198.804 16.263 202.067 20.210 203.380 L 92.210 227.380 C 93.431 227.792 94.711 228.002 96.000 228.000 C 99.185 228.000 102.239 226.734 104.490 224.480 L 136.000 193.000 L 137.860 194.860 C 145.670 202.668 158.330 202.668 166.140 194.860 L 185.410 175.590 C 187.529 176.329 189.756 176.711 192.000 176.720 C 197.307 176.734 202.399 174.624 206.140 170.860 L 252.490 124.520 C 254.753 122.268 256.024 119.207 256.024 116.015 C 256.024 112.823 254.753 109.762 252.490 107.510 ZM 92.760 202.270 L 46.210 186.760 L 88.000 145.000 L 119.000 176.000 ZM 152.000 175.000 L 96.490 119.520 L 96.490 119.520 L 89.000 112.000 L 104.000 97.000 L 167.000 160.000 Z"),
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
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
