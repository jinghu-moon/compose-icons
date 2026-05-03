package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = phosphorBoldIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 168.490 C 214.238 170.749 211.180 172.019 207.990 172.019 C 204.800 172.019 201.742 170.749 199.490 168.490 L 128.000 97.000 L 56.490 168.490 C 51.796 173.184 44.184 173.184 39.490 168.490 C 34.796 163.796 34.796 156.184 39.490 151.490 L 119.490 71.490 C 121.742 69.231 124.800 67.961 127.990 67.961 C 131.180 67.961 134.238 69.231 136.490 71.490 L 216.490 151.490 C 218.749 153.742 220.019 156.800 220.019 159.990 C 220.019 163.180 218.749 166.238 216.490 168.490 Z"),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
