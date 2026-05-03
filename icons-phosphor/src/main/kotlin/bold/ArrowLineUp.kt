package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineUp: ImageVector
    get() {
        if (_arrowLineUp != null) return _arrowLineUp!!
        _arrowLineUp = phosphorBoldIcon(
            name = "ArrowLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.490 143.510 C 213.184 148.204 213.184 155.816 208.490 160.510 C 203.796 165.204 196.184 165.204 191.490 160.510 L 140.000 109.000 L 140.000 224.000 C 140.000 230.627 134.627 236.000 128.000 236.000 C 121.373 236.000 116.000 230.627 116.000 224.000 L 116.000 109.000 L 64.490 160.490 C 59.796 165.184 52.184 165.184 47.490 160.490 C 42.796 155.796 42.796 148.184 47.490 143.490 L 119.490 71.490 C 121.742 69.231 124.800 67.961 127.990 67.961 C 131.180 67.961 134.238 69.231 136.490 71.490 ZM 216.000 28.000 L 40.000 28.000 C 33.373 28.000 28.000 33.373 28.000 40.000 C 28.000 46.627 33.373 52.000 40.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 46.627 228.000 40.000 C 228.000 33.373 222.627 28.000 216.000 28.000 Z"),
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
        return _arrowLineUp!!
    }

private var _arrowLineUp: ImageVector? = null
