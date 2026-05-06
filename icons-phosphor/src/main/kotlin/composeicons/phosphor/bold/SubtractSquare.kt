package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SubtractSquare: ImageVector
    get() {
        if (_subtractSquare != null) return _subtractSquare!!
        _subtractSquare = phosphorBoldIcon(
            name = "SubtractSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 160v-64c0-6.627-5.373-12-12-12h-44v-44c0-6.627-5.373-12-12-12h-120C33.373 28 28 33.373 28 40v120c0 6.627 5.373 12 12 12h44v44c0 6.627 5.373 12 12 12h120c6.627 0 12-5.373 12-12v-56ZM165 204 133 172h22l32 32ZM172 155v-22l32 32v22ZM204 131 181 108h23ZM52 52h96v52h0v44h-96ZM108 181l23 23h-23Z"),
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
        return _subtractSquare!!
    }

private var _subtractSquare: ImageVector? = null
