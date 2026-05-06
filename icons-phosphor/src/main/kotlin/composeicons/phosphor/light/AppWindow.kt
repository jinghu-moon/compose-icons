package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AppWindow: ImageVector
    get() {
        if (_appWindow != null) return _appWindow!!
        _appWindow = phosphorLightIcon(
            name = "AppWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v144c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-144c0-7.732-6.268-14-14-14ZM218 200c0 1.105-.895 2-2 2h-176c-1.105 0-2-.895-2-2v-144c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2ZM78 84c0 5.523-4.477 10-10 10C62.477 94 58 89.523 58 84 58 78.477 62.477 74 68 74c5.523 0 10 4.477 10 10ZM118 84c0 5.523-4.477 10-10 10C102.477 94 98 89.523 98 84c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _appWindow!!
    }

private var _appWindow: ImageVector? = null
