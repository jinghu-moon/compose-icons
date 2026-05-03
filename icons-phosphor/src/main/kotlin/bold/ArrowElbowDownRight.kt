package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) return _arrowElbowDownRight!!
        _arrowElbowDownRight = phosphorBoldIcon(
            name = "ArrowElbowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.490 184.490 L 176.490 232.490 C 171.796 237.184 164.184 237.184 159.490 232.490 C 154.796 227.796 154.796 220.184 159.490 215.490 L 187.000 188.000 L 72.000 188.000 C 65.373 188.000 60.000 182.627 60.000 176.000 L 60.000 32.000 C 60.000 25.373 65.373 20.000 72.000 20.000 C 78.627 20.000 84.000 25.373 84.000 32.000 L 84.000 164.000 L 187.000 164.000 L 159.480 136.490 C 154.786 131.796 154.786 124.184 159.480 119.490 C 164.174 114.796 171.786 114.796 176.480 119.490 L 224.480 167.490 C 226.741 169.740 228.013 172.798 228.014 175.988 C 228.016 179.178 226.748 182.237 224.490 184.490 Z"),
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
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
