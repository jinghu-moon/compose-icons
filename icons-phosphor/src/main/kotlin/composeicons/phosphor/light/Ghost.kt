package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorLightIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M110 116c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM156 106c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM222 120v96c-.001 2.318-1.338 4.428-3.432 5.42-2.095 .992-4.574 .688-6.368-.78L186.67 199.75l-25.54 20.89c-2.21 1.809-5.39 1.809-7.6 0L128 199.75l-25.53 20.89c-2.21 1.809-5.39 1.809-7.6 0L69.33 199.75 43.8 220.64c-1.794 1.468-4.273 1.771-6.368 .78C35.338 220.428 34.001 218.318 34 216v-96C34 68.085 76.085 26 128 26c51.915 0 94 42.085 94 94ZM210 120C210 74.713 173.287 38 128 38 82.713 38 46 74.713 46 120v83.34l19.53-16c2.21-1.809 5.39-1.809 7.6 0l25.54 20.89 25.53-20.89c2.21-1.809 5.39-1.809 7.6 0l25.53 20.89 25.54-20.89c2.21-1.809 5.39-1.809 7.6 0l19.53 16Z"),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
