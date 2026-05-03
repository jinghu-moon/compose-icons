package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleUp: ImageVector
    get() {
        if (_caretCircleUp != null) return _caretCircleUp!!
        _caretCircleUp = phosphorBoldIcon(
            name = "CaretCircleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 176.490 135.510 C 181.184 140.204 181.184 147.816 176.490 152.510 C 171.796 157.204 164.184 157.204 159.490 152.510 L 128.000 121.000 L 96.490 152.490 C 91.796 157.184 84.184 157.184 79.490 152.490 C 74.796 147.796 74.796 140.184 79.490 135.490 L 119.490 95.490 C 121.742 93.231 124.800 91.961 127.990 91.961 C 131.180 91.961 134.238 93.231 136.490 95.490 Z"),
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
        return _caretCircleUp!!
    }

private var _caretCircleUp: ImageVector? = null
