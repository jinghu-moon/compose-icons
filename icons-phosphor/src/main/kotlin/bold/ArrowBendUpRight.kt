package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) return _arrowBendUpRight!!
        _arrowBendUpRight = phosphorBoldIcon(
            name = "ArrowBendUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.490 112.490 L 184.490 160.490 C 179.796 165.184 172.184 165.184 167.490 160.490 C 162.796 155.796 162.796 148.184 167.490 143.490 L 195.000 116.000 L 128.000 116.000 C 81.629 116.050 44.050 153.629 44.000 200.000 C 44.000 206.627 38.627 212.000 32.000 212.000 C 25.373 212.000 20.000 206.627 20.000 200.000 C 20.066 140.381 68.381 92.066 128.000 92.000 L 195.000 92.000 L 167.510 64.480 C 162.816 59.786 162.816 52.174 167.510 47.480 C 172.204 42.786 179.816 42.786 184.510 47.480 L 232.510 95.480 C 234.770 97.735 236.038 100.797 236.034 103.989 C 236.031 107.181 234.755 110.241 232.490 112.490 Z"),
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
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null
