package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorBoldIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 112v96c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-73.58L206.66 138c-5.523 3.678-12.982 2.183-16.66-3.34-3.678-5.523-2.183-12.982 3.34-16.66l24-16c3.685-2.458 8.424-2.687 12.328-.595 3.904 2.092 6.338 6.165 6.332 10.595ZM144 44c-6.627 0-12 5.373-12 12v48h-80v-48C52 49.373 46.627 44 40 44 33.373 44 28 49.373 28 56v120c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48h80v48c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-120c0-6.627-5.373-12-12-12Z"),
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
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
