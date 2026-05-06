package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorBoldIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 88v64c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h34.9L187.42 124.63C163.402 100.593 127.268 93.394 95.871 106.391 64.475 119.388 44.002 150.02 44 184c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12C19.998 140.317 46.311 100.934 86.67 84.216c40.358-16.717 86.813-7.476 117.7 23.414L220 123.16v-35.16c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
