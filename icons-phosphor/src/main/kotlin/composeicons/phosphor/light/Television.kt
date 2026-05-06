package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Television: ImageVector
    get() {
        if (_television != null) return _television!!
        _television = phosphorLightIcon(
            name = "Television",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 66h-73.52L180.24 28.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L128 63.51 84.24 19.76C82.744 18.155 80.492 17.494 78.366 18.037c-2.126 .543-3.786 2.203-4.329 4.329-.543 2.126 .118 4.379 1.723 5.874L113.52 66h-73.52C32.268 66 26 72.268 26 80v120c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-120c0-7.732-6.268-14-14-14ZM38 200v-120c0-1.105 .895-2 2-2h106v124h-106c-1.105 0-2-.895-2-2ZM218 200c0 1.105-.895 2-2 2h-58v-124h58c1.105 0 2 .895 2 2ZM198 116c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM198 164c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _television!!
    }

private var _television: ImageVector? = null
