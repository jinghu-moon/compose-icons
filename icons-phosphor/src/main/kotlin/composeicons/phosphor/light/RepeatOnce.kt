package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) return _repeatOnce!!
        _repeatOnce = phosphorLightIcon(
            name = "RepeatOnce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M26 128C26.044 89.358 57.358 58.044 96 58h113.51L195.76 44.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147l24 24c2.34 2.343 2.34 6.137 0 8.48l-24 24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L209.51 70h-113.51C63.983 70.039 38.039 95.983 38 128c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM224 122c-3.314 0-6 2.686-6 6-.039 32.017-25.983 57.961-58 58h-113.51L60.24 172.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147l-24 24c-2.34 2.343-2.34 6.137 0 8.48l24 24c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L46.49 198h113.51c38.642-.044 69.956-31.358 70-70 0-3.314-2.686-6-6-6ZM136 158c3.314 0 6-2.686 6-6v-48c.001-2.079-1.075-4.01-2.843-5.104-1.768-1.094-3.977-1.194-5.837-.266l-16 8c-1.986 .917-3.317 2.842-3.471 5.024-.154 2.182 .891 4.276 2.729 5.463 1.838 1.187 4.176 1.28 6.102 .243L130 113.7v38.3c0 3.314 2.686 6 6 6Z"),
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
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
