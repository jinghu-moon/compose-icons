package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorBoldIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.490 128.490 C 206.238 130.749 203.180 132.019 199.990 132.019 C 196.800 132.019 193.742 130.749 191.490 128.490 L 128.000 65.000 L 64.490 128.490 C 59.796 133.184 52.184 133.184 47.490 128.490 C 42.796 123.796 42.796 116.184 47.490 111.490 L 119.490 39.490 C 121.742 37.231 124.800 35.961 127.990 35.961 C 131.180 35.961 134.238 37.231 136.490 39.490 L 208.490 111.490 C 210.749 113.742 212.019 116.800 212.019 119.990 C 212.019 123.180 210.749 126.238 208.490 128.490 Z"),
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
        return _control!!
    }

private var _control: ImageVector? = null
