package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorLightIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 180c0 18.778-15.222 34-34 34-9.089 .154-17.852-3.382-24.29-9.8-2.32-2.369-2.279-6.17 .09-8.49 2.369-2.32 6.17-2.279 8.49 .09 4.181 4.108 9.85 6.345 15.71 6.2 12.15 0 22-9.85 22-22 0-12.15-9.85-22-22-22-5.86-.145-11.529 2.092-15.71 6.2-1.834 1.881-4.678 2.35-7.019 1.158-2.341-1.192-3.634-3.768-3.191-6.358l8-48c.488-2.888 2.991-5.002 5.92-5h40c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-34.92l-5 30c3.832-1.334 7.862-2.01 11.92-2 18.778 0 34 15.222 34 34ZM144 50c-3.314 0-6 2.686-6 6v54h-92v-54c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v120c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-54h92v54c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-120c0-3.314-2.686-6-6-6Z"),
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
