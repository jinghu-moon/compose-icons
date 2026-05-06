package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorBoldIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 180c0 22.091-17.909 40-40 40-10.701 .16-21.01-4.025-28.57-11.6-4.639-4.733-4.563-12.331 .17-16.97 4.733-4.639 12.331-4.563 16.97 .17 3.047 2.97 7.178 4.56 11.43 4.4 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-4.252-.16-8.383 1.43-11.43 4.4-3.669 3.752-9.352 4.685-14.028 2.302-4.676-2.383-7.261-7.528-6.382-12.702l8-48c.976-5.777 5.981-10.004 11.84-10h40c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-29.83l-2.71 16.23c1.509-.152 3.024-.229 4.54-.23 22.091 0 40 17.909 40 40ZM144 44c-6.627 0-12 5.373-12 12v48h-80v-48C52 49.373 46.627 44 40 44 33.373 44 28 49.373 28 56v120c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48h80v48c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-120c0-6.627-5.373-12-12-12Z"),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
