package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = phosphorBoldIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.490 136.490 L 152.490 208.490 C 147.796 213.184 140.184 213.184 135.490 208.490 C 130.796 203.796 130.796 196.184 135.490 191.490 L 187.000 140.000 L 40.000 140.000 C 33.373 140.000 28.000 134.627 28.000 128.000 C 28.000 121.373 33.373 116.000 40.000 116.000 L 187.000 116.000 L 135.510 64.480 C 130.816 59.786 130.816 52.174 135.510 47.480 C 140.204 42.786 147.816 42.786 152.510 47.480 L 224.510 119.480 C 226.770 121.735 228.038 124.797 228.034 127.989 C 228.031 131.181 226.755 134.241 224.490 136.490 Z"),
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
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
