package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextAlignLeft: ImageVector
    get() {
        if (_textAlignLeft != null) return _textAlignLeft!!
        _textAlignLeft = phosphorRegularIcon(
            name = "TextAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M32 64c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8ZM40 112h128c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-128c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM216 136h-176c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM168 176h-128c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h128c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _textAlignLeft!!
    }

private var _textAlignLeft: ImageVector? = null
