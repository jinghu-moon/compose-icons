package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = phosphorLightIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 34h-112C55.431 34 42 47.431 42 64v144c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-18h68v18c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-144C214 47.431 200.569 34 184 34ZM54 178v-60h148v60ZM54 78h148v28h-148ZM72 46h112c9.941 0 18 8.059 18 18v2h-148v-2C54 54.059 62.059 46 72 46ZM82 208c0 1.105-.895 2-2 2h-24c-1.105 0-2-.895-2-2v-18h28ZM200 210h-24c-1.105 0-2-.895-2-2v-18h28v18c0 1.105-.895 2-2 2ZM102 148c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM174 148c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM246 80v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-24c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM22 80v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-24c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
