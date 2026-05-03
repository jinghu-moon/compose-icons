package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = phosphorBoldIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.490 120.490 C 206.238 122.749 203.180 124.019 199.990 124.019 C 196.800 124.019 193.742 122.749 191.490 120.490 L 140.000 69.000 L 140.000 216.000 C 140.000 222.627 134.627 228.000 128.000 228.000 C 121.373 228.000 116.000 222.627 116.000 216.000 L 116.000 69.000 L 64.490 120.490 C 59.796 125.184 52.184 125.184 47.490 120.490 C 42.796 115.796 42.796 108.184 47.490 103.490 L 119.490 31.490 C 121.742 29.231 124.800 27.961 127.990 27.961 C 131.180 27.961 134.238 29.231 136.490 31.490 L 208.490 103.490 C 210.749 105.742 212.019 108.800 212.019 111.990 C 212.019 115.180 210.749 118.238 208.490 120.490 Z"),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
