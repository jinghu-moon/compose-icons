package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorBoldIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.490 200.490 L 200.490 232.490 C 195.796 237.184 188.184 237.184 183.490 232.490 C 178.796 227.796 178.796 220.184 183.490 215.490 L 195.000 204.000 L 80.000 204.000 C 73.373 204.000 68.000 198.627 68.000 192.000 L 68.000 69.000 L 56.490 80.490 C 51.796 85.184 44.184 85.184 39.490 80.490 C 34.796 75.796 34.796 68.184 39.490 63.490 L 71.490 31.490 C 73.742 29.231 76.800 27.961 79.990 27.961 C 83.180 27.961 86.238 29.231 88.490 31.490 L 120.490 63.490 C 125.184 68.184 125.184 75.796 120.490 80.490 C 115.796 85.184 108.184 85.184 103.490 80.490 L 92.000 69.000 L 92.000 180.000 L 195.000 180.000 L 183.480 168.490 C 178.786 163.796 178.786 156.184 183.480 151.490 C 188.174 146.796 195.786 146.796 200.480 151.490 L 232.480 183.490 C 234.741 185.740 236.013 188.798 236.014 191.988 C 236.016 195.178 234.748 198.237 232.490 200.490 Z"),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
