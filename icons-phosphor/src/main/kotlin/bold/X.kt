package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = phosphorBoldIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.490 191.510 C 213.184 196.204 213.184 203.816 208.490 208.510 C 203.796 213.204 196.184 213.204 191.490 208.510 L 128.000 145.000 L 64.490 208.490 C 59.796 213.184 52.184 213.184 47.490 208.490 C 42.796 203.796 42.796 196.184 47.490 191.490 L 111.000 128.000 L 47.510 64.490 C 42.816 59.796 42.816 52.184 47.510 47.490 C 52.204 42.796 59.816 42.796 64.510 47.490 L 128.000 111.000 L 191.510 47.480 C 196.204 42.786 203.816 42.786 208.510 47.480 C 213.204 52.174 213.204 59.786 208.510 64.480 L 145.000 128.000 Z"),
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
        return _x!!
    }

private var _x: ImageVector? = null
