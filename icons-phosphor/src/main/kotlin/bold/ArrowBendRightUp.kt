package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorBoldIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.490 88.490 C 206.238 90.749 203.180 92.019 199.990 92.019 C 196.800 92.019 193.742 90.749 191.490 88.490 L 164.000 61.000 L 164.000 128.000 C 163.934 187.619 115.619 235.934 56.000 236.000 C 49.373 236.000 44.000 230.627 44.000 224.000 C 44.000 217.373 49.373 212.000 56.000 212.000 C 102.371 211.950 139.950 174.371 140.000 128.000 L 140.000 61.000 L 112.490 88.490 C 107.796 93.184 100.184 93.184 95.490 88.490 C 90.796 83.796 90.796 76.184 95.490 71.490 L 143.490 23.490 C 145.742 21.231 148.800 19.961 151.990 19.961 C 155.180 19.961 158.238 21.231 160.490 23.490 L 208.490 71.490 C 210.749 73.742 212.019 76.800 212.019 79.990 C 212.019 83.180 210.749 86.238 208.490 88.490 Z"),
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
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
