package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorBoldIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.490 88.490 L 176.490 136.490 C 171.796 141.184 164.184 141.184 159.490 136.490 C 154.796 131.796 154.796 124.184 159.490 119.490 L 187.000 92.000 L 84.000 92.000 L 84.000 224.000 C 84.000 230.627 78.627 236.000 72.000 236.000 C 65.373 236.000 60.000 230.627 60.000 224.000 L 60.000 80.000 C 60.000 73.373 65.373 68.000 72.000 68.000 L 187.000 68.000 L 159.510 40.490 C 154.816 35.796 154.816 28.184 159.510 23.490 C 164.204 18.796 171.816 18.796 176.510 23.490 L 224.510 71.490 C 226.767 73.744 228.033 76.804 228.029 79.994 C 228.026 83.184 226.752 86.241 224.490 88.490 Z"),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null
