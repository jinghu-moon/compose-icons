package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineLeft: ImageVector
    get() {
        if (_arrowLineLeft != null) return _arrowLineLeft!!
        _arrowLineLeft = phosphorBoldIcon(
            name = "ArrowLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 128.000 C 236.000 134.627 230.627 140.000 224.000 140.000 L 109.000 140.000 L 160.520 191.510 C 165.214 196.204 165.214 203.816 160.520 208.510 C 155.826 213.204 148.214 213.204 143.520 208.510 L 71.520 136.510 C 69.261 134.258 67.991 131.200 67.991 128.010 C 67.991 124.820 69.261 121.762 71.520 119.510 L 143.520 47.510 C 148.214 42.816 155.826 42.816 160.520 47.510 C 165.214 52.204 165.214 59.816 160.520 64.510 L 109.000 116.000 L 224.000 116.000 C 230.627 116.000 236.000 121.373 236.000 128.000 ZM 40.000 28.000 C 33.373 28.000 28.000 33.373 28.000 40.000 L 28.000 216.000 C 28.000 222.627 33.373 228.000 40.000 228.000 C 46.627 228.000 52.000 222.627 52.000 216.000 L 52.000 40.000 C 52.000 33.373 46.627 28.000 40.000 28.000 Z"),
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
        return _arrowLineLeft!!
    }

private var _arrowLineLeft: ImageVector? = null
