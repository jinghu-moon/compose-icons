package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PencilAi2Fill: ImageVector
    get() {
        if (_pencilAi2Fill != null) return _pencilAi2Fill!!
        _pencilAi2Fill = remixIcon(
            name = "PencilAi2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.529 15.319c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.875 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.759 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .566c-.181 .414-.753 .414-.934 0l-.247-.566c-.44-1.008-1.231-1.812-2.219-2.251l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611ZM17.143 11.097 7.242 20.996h-4.242v-4.242L12.899 6.855l4.243 4.242ZM16.435 3.318c.39-.391 1.024-.391 1.415 0l2.828 2.829c.39 .391 .39 1.024 0 1.414L18.557 9.683 14.314 5.44 16.435 3.318Z"),
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
        return _pencilAi2Fill!!
    }

private var _pencilAi2Fill: ImageVector? = null
