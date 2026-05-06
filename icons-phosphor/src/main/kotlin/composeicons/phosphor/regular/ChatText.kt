package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatText: ImageVector
    get() {
        if (_chatText != null) return _chatText!!
        _chatText = phosphorRegularIcon(
            name = "ChatText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48h-176C31.163 48 24 55.163 24 64v160c-.037 6.229 3.578 11.902 9.24 14.5 2.118 .983 4.425 1.495 6.76 1.5 3.756-.009 7.387-1.348 10.25-3.78l.09-.07L83 208h133c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM40 224h0ZM216 192h-136c-1.921 .001-3.777 .693-5.23 1.95L40 224v-160h176ZM88 112c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8ZM88 144c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8Z"),
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
        return _chatText!!
    }

private var _chatText: ImageVector? = null
