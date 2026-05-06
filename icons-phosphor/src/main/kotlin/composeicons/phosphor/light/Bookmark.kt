package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bookmark: ImageVector
    get() {
        if (_bookmark != null) return _bookmark!!
        _bookmark = phosphorLightIcon(
            name = "Bookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 34h-112C64.268 34 58 40.268 58 48v176c-.001 2.182 1.183 4.192 3.091 5.249 1.908 1.058 4.24 .997 6.089-.159l60.81-38 60.83 38c1.85 1.156 4.182 1.217 6.089 .159 1.908-1.058 3.091-3.068 3.091-5.249v-176c0-7.732-6.268-14-14-14ZM72 46h112c1.105 0 2 .895 2 2v117.18L131.17 130.91c-1.946-1.216-4.414-1.216-6.36 0L70 165.17v-117.17c0-1.105 .895-2 2-2ZM131.17 178.91c-1.946-1.216-4.414-1.216-6.36 0L70 213.17v-33.84l58-36.25 58 36.25v33.84Z"),
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
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
