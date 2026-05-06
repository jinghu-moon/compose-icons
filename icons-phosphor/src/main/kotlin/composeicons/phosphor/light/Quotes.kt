package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorLightIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 58h-60C32.268 58 26 64.268 26 72v64c0 7.732 6.268 14 14 14h62v10c0 18.778-15.222 34-34 34-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 25.391-.033 45.967-20.609 46-46v-88c0-7.732-6.268-14-14-14ZM102 138h-62c-1.105 0-2-.895-2-2v-64c0-1.105 .895-2 2-2h60c1.105 0 2 .895 2 2ZM216 58h-60c-7.732 0-14 6.268-14 14v64c0 7.732 6.268 14 14 14h62v10c0 18.778-15.222 34-34 34-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 25.391-.033 45.967-20.609 46-46v-88c0-7.732-6.268-14-14-14ZM218 138h-62c-1.105 0-2-.895-2-2v-64c0-1.105 .895-2 2-2h60c1.105 0 2 .895 2 2Z"),
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
        return _quotes!!
    }

private var _quotes: ImageVector? = null
