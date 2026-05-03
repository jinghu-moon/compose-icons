package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) return _arrowLineRight!!
        _arrowLineRight = phosphorBoldIcon(
            name = "ArrowLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.490 119.510 C 186.749 121.762 188.019 124.820 188.019 128.010 C 188.019 131.200 186.749 134.258 184.490 136.510 L 112.490 208.510 C 107.796 213.204 100.184 213.204 95.490 208.510 C 90.796 203.816 90.796 196.204 95.490 191.510 L 147.000 140.000 L 32.000 140.000 C 25.373 140.000 20.000 134.627 20.000 128.000 C 20.000 121.373 25.373 116.000 32.000 116.000 L 147.000 116.000 L 95.510 64.490 C 90.816 59.796 90.816 52.184 95.510 47.490 C 100.204 42.796 107.816 42.796 112.510 47.490 ZM 216.000 28.000 C 209.373 28.000 204.000 33.373 204.000 40.000 L 204.000 216.000 C 204.000 222.627 209.373 228.000 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 L 228.000 40.000 C 228.000 33.373 222.627 28.000 216.000 28.000 Z"),
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
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null
