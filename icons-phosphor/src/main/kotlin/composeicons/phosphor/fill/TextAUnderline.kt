package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorFillIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148.73 120h-41.46L128 75.09ZM216 32v192c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-192c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8ZM76.65 167.26c4.01 1.848 8.758 .098 10.61-3.91L99.89 136h56.22l12.63 27.35c1.937 3.856 6.583 5.482 10.501 3.674 3.918-1.808 5.697-6.398 4.019-10.374l-48-104C133.951 49.821 131.117 48.01 128 48.01c-3.117 0-5.951 1.811-7.26 4.64l-48 104c-1.848 4.01-.098 8.758 3.91 10.61ZM200 192c0-4.418-3.582-8-8-8h-128c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h128c4.418 0 8-3.582 8-8Z"),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
