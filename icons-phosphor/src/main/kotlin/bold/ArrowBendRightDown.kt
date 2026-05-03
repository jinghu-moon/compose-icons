package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorBoldIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.490 184.490 L 160.490 232.490 C 158.238 234.749 155.180 236.019 151.990 236.019 C 148.800 236.019 145.742 234.749 143.490 232.490 L 95.490 184.490 C 90.796 179.796 90.796 172.184 95.490 167.490 C 100.184 162.796 107.796 162.796 112.490 167.490 L 140.000 195.000 L 140.000 128.000 C 139.950 81.629 102.371 44.050 56.000 44.000 C 49.373 44.000 44.000 38.627 44.000 32.000 C 44.000 25.373 49.373 20.000 56.000 20.000 C 115.619 20.066 163.934 68.381 164.000 128.000 L 164.000 195.000 L 191.510 167.480 C 196.204 162.786 203.816 162.786 208.510 167.480 C 213.204 172.174 213.204 179.786 208.510 184.480 Z"),
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
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null
