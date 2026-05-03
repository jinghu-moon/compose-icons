package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleRight: ImageVector
    get() {
        if (_caretCircleRight != null) return _caretCircleRight!!
        _caretCircleRight = phosphorBoldIcon(
            name = "CaretCircleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 160.490 119.510 C 162.749 121.762 164.019 124.820 164.019 128.010 C 164.019 131.200 162.749 134.258 160.490 136.510 L 120.490 176.510 C 115.796 181.204 108.184 181.204 103.490 176.510 C 98.796 171.816 98.796 164.204 103.490 159.510 L 135.000 128.000 L 103.510 96.490 C 98.816 91.796 98.816 84.184 103.510 79.490 C 108.204 74.796 115.816 74.796 120.510 79.490 Z"),
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
        return _caretCircleRight!!
    }

private var _caretCircleRight: ImageVector? = null
