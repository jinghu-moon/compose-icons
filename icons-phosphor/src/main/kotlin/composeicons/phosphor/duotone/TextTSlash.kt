package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorDuotoneIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 56v144h-128c-8.837 0-16-7.163-16-16v-128Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M213.38 221.92c-3.27 2.971-8.329 2.729-11.3-.54L136 148.69v43.31h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24v-60.91L64 69.49v18.51c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32c.001-1.142 .246-2.271 .72-3.31L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515l160 176c2.971 3.27 2.729 8.329-.54 11.3ZM105.79 64h14.21v16.43c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16.43h56v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8h-94.21c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8Z"),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
