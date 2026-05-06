package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorLightIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.05 212.77 135.12 53.5 157.05 19.24c1.394-1.793 1.657-4.219 .678-6.269-.979-2.05-3.031-3.371-5.302-3.413-2.271-.043-4.371 1.201-5.426 3.212L128 42.37 109 12.77c-1.013-2.086-3.138-3.402-5.457-3.379-2.319 .023-4.417 1.381-5.389 3.486-.971 2.106-.642 4.583 .846 6.362l21.88 34.26L19 212.77c-1.175 1.839-1.259 4.17-.219 6.088 1.039 1.918 3.038 3.121 5.219 3.142h208c2.191-.002 4.206-1.198 5.257-3.12 1.051-1.922 .972-4.264-.207-6.11ZM82.64 210 128 139.13 173.36 210ZM187.64 210 133.09 124.77c-1.103-1.72-3.006-2.76-5.05-2.76-2.044 0-3.947 1.04-5.05 2.76L68.4 210h-33.4L128 64.63 221 210Z"),
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
        return _tipi!!
    }

private var _tipi: ImageVector? = null
