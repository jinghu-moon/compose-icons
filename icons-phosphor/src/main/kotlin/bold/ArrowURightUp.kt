package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorBoldIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.490 88.490 C 222.238 90.749 219.180 92.019 215.990 92.019 C 212.800 92.019 209.742 90.749 207.490 88.490 L 180.000 61.000 L 180.000 168.000 C 180.000 205.555 149.555 236.000 112.000 236.000 C 74.445 236.000 44.000 205.555 44.000 168.000 L 44.000 80.000 C 44.000 73.373 49.373 68.000 56.000 68.000 C 62.627 68.000 68.000 73.373 68.000 80.000 L 68.000 168.000 C 68.000 192.301 87.699 212.000 112.000 212.000 C 136.301 212.000 156.000 192.301 156.000 168.000 L 156.000 61.000 L 128.490 88.490 C 123.796 93.184 116.184 93.184 111.490 88.490 C 106.796 83.796 106.796 76.184 111.490 71.490 L 159.490 23.490 C 161.742 21.231 164.800 19.961 167.990 19.961 C 171.180 19.961 174.238 21.231 176.490 23.490 L 224.490 71.490 C 226.749 73.742 228.019 76.800 228.019 79.990 C 228.019 83.180 226.749 86.238 224.490 88.490 Z"),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
