package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorBoldIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 56v120c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-48h-80v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-120C28 49.373 33.373 44 40 44c6.627 0 12 5.373 12 12v48h80v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM256 184c0 6.627-5.373 12-12 12v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-40c-4.498-.006-8.614-2.527-10.664-6.53-2.05-4.003-1.689-8.817 .934-12.47l52-72c3.044-4.217 8.459-5.994 13.409-4.399 4.951 1.595 8.31 6.197 8.321 11.399v60c6.627 0 12 5.373 12 12ZM220 149.11 203.47 172h16.53Z"),
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
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
