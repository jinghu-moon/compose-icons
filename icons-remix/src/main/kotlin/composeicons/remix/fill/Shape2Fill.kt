package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Shape2Fill: ImageVector
    get() {
        if (_shape2Fill != null) return _shape2Fill!!
        _shape2Fill = remixIcon(
            name = "Shape2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 2h5v5h-5v-5ZM2 17h5v5h-5v-5ZM17 2h5v5h-5v-5ZM17 17h5v5h-5v-5ZM8 4h8v2h-8v-2ZM4 8h2v8h-2v-8ZM18 8h2v8h-2v-8ZM8 18h8v2h-8v-2Z"),
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
        return _shape2Fill!!
    }

private var _shape2Fill: ImageVector? = null
