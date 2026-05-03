package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorBoldIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.490 152.490 L 136.490 224.490 C 134.238 226.749 131.180 228.019 127.990 228.019 C 124.800 228.019 121.742 226.749 119.490 224.490 L 47.490 152.490 C 42.796 147.796 42.796 140.184 47.490 135.490 C 52.184 130.796 59.796 130.796 64.490 135.490 L 116.000 187.000 L 116.000 40.000 C 116.000 33.373 121.373 28.000 128.000 28.000 C 134.627 28.000 140.000 33.373 140.000 40.000 L 140.000 187.000 L 191.510 135.480 C 196.204 130.786 203.816 130.786 208.510 135.480 C 213.204 140.174 213.204 147.786 208.510 152.480 Z"),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
