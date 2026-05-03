package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendLeftDown: ImageVector
    get() {
        if (_arrowBendLeftDown != null) return _arrowBendLeftDown!!
        _arrowBendLeftDown = phosphorBoldIcon(
            name = "ArrowBendLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 32.000 C 212.000 38.627 206.627 44.000 200.000 44.000 C 153.629 44.050 116.050 81.629 116.000 128.000 L 116.000 195.000 L 143.510 167.480 C 148.204 162.786 155.816 162.786 160.510 167.480 C 165.204 172.174 165.204 179.786 160.510 184.480 L 112.510 232.480 C 110.258 234.739 107.200 236.009 104.010 236.009 C 100.820 236.009 97.762 234.739 95.510 232.480 L 47.510 184.480 C 42.816 179.786 42.816 172.174 47.510 167.480 C 52.204 162.786 59.816 162.786 64.510 167.480 L 92.000 195.000 L 92.000 128.000 C 92.066 68.381 140.381 20.066 200.000 20.000 C 206.627 20.000 212.000 25.373 212.000 32.000 Z"),
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
        return _arrowBendLeftDown!!
    }

private var _arrowBendLeftDown: ImageVector? = null
