package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorBoldIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.490 160.490 L 184.490 208.490 C 179.796 213.184 172.184 213.184 167.490 208.490 C 162.796 203.796 162.796 196.184 167.490 191.490 L 195.000 164.000 L 128.000 164.000 C 68.381 163.934 20.066 115.619 20.000 56.000 C 20.000 49.373 25.373 44.000 32.000 44.000 C 38.627 44.000 44.000 49.373 44.000 56.000 C 44.050 102.371 81.629 139.950 128.000 140.000 L 195.000 140.000 L 167.480 112.490 C 162.786 107.796 162.786 100.184 167.480 95.490 C 172.174 90.796 179.786 90.796 184.480 95.490 L 232.480 143.490 C 234.741 145.740 236.013 148.798 236.014 151.988 C 236.016 155.178 234.748 158.237 232.490 160.490 Z"),
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
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
