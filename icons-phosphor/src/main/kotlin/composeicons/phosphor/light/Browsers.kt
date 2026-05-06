package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Browsers: ImageVector
    get() {
        if (_browsers != null) return _browsers!!
        _browsers = phosphorLightIcon(
            name = "Browsers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-144C64.268 42 58 48.268 58 56v18h-18C32.268 74 26 80.268 26 88v112c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-18h18c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14ZM40 86h144c1.105 0 2 .895 2 2v18h-148v-18c0-1.105 .895-2 2-2ZM186 200c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-82h148ZM218 168c0 1.105-.895 2-2 2h-18v-82c0-7.732-6.268-14-14-14h-114v-18c0-1.105 .895-2 2-2h144c1.105 0 2 .895 2 2Z"),
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
        return _browsers!!
    }

private var _browsers: ImageVector? = null
