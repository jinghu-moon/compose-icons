package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PencilAi2Line: ImageVector
    get() {
        if (_pencilAi2Line != null) return _pencilAi2Line!!
        _pencilAi2Line = remixIcon(
            name = "PencilAi2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.529 15.319c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.875 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.759 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .566c-.181 .414-.753 .414-.934 0l-.247-.566c-.44-1.008-1.231-1.812-2.219-2.251l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611ZM16.435 3.212c.39-.391 1.024-.391 1.415 0l2.828 2.829c.39 .391 .39 1.024 0 1.414L7.242 20.89h-4.242v-4.242L16.435 3.212ZM5 17.476v1.414h1.414L15.727 9.576 14.314 8.162 5 17.476ZM15.727 6.748l1.415 1.414L18.557 6.748 17.143 5.334 15.727 6.748Z"),
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
        return _pencilAi2Line!!
    }

private var _pencilAi2Line: ImageVector? = null
