package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorLightIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 112v96c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-84.79L203.33 133c-2.761 1.839-6.491 1.091-8.33-1.67-1.839-2.761-1.091-6.491 1.67-8.33l24-16c1.842-1.229 4.212-1.344 6.164-.297 1.952 1.046 3.169 3.083 3.166 5.297ZM144 50c-3.314 0-6 2.686-6 6v54h-92v-54c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v120c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-54h92v54c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-120c0-3.314-2.686-6-6-6Z"),
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
