package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorBoldIcon(
            name = "ArrowElbowRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.490 168.490 L 184.490 216.490 C 182.238 218.749 179.180 220.019 175.990 220.019 C 172.800 220.019 169.742 218.749 167.490 216.490 L 119.490 168.490 C 114.796 163.796 114.796 156.184 119.490 151.490 C 124.184 146.796 131.796 146.796 136.490 151.490 L 164.000 179.000 L 164.000 76.000 L 32.000 76.000 C 25.373 76.000 20.000 70.627 20.000 64.000 C 20.000 57.373 25.373 52.000 32.000 52.000 L 176.000 52.000 C 182.627 52.000 188.000 57.373 188.000 64.000 L 188.000 179.000 L 215.510 151.480 C 220.204 146.786 227.816 146.786 232.510 151.480 C 237.204 156.174 237.204 163.786 232.510 168.480 Z"),
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
        return _arrowElbowRightDown!!
    }

private var _arrowElbowRightDown: ImageVector? = null
