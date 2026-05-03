package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = phosphorBoldIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 128.000 C 228.000 134.627 222.627 140.000 216.000 140.000 L 69.000 140.000 L 120.520 191.510 C 125.214 196.204 125.214 203.816 120.520 208.510 C 115.826 213.204 108.214 213.204 103.520 208.510 L 31.520 136.510 C 29.261 134.258 27.991 131.200 27.991 128.010 C 27.991 124.820 29.261 121.762 31.520 119.510 L 103.520 47.510 C 108.214 42.816 115.826 42.816 120.520 47.510 C 125.214 52.204 125.214 59.816 120.520 64.510 L 69.000 116.000 L 216.000 116.000 C 222.627 116.000 228.000 121.373 228.000 128.000 Z"),
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
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
