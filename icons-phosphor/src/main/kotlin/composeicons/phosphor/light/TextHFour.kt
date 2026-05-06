package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorLightIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M150 56v120c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-54h-92v54c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-120c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v54h92v-54c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM254 184c0 3.314-2.686 6-6 6h-10v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-50c-2.291 0-4.382-1.304-5.39-3.361-1.008-2.058-.755-4.509 .65-6.319l56-72c1.572-2.026 4.259-2.829 6.685-1.997 2.426 .831 4.056 3.113 4.055 5.677v66h10c3.314 0 6 2.686 6 6ZM226 129.49 188.27 178h37.73Z"),
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
