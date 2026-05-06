package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BreadFill: ImageVector
    get() {
        if (_breadFill != null) return _breadFill!!
        _breadFill = remixIcon(
            name = "BreadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 7C1 4.791 2.791 3 5 3h2C4.791 3 3 4.791 3 7c0 1.482 .805 2.773 2 3.465v8.535c0 1.657 1.343 3 3 3h-2C4.343 22 3 20.657 3 19v-8.535C1.805 9.773 1 8.482 1 7ZM8 22v-2C7.448 20 7 19.552 7 19v-9.878L6.333 8.886C5.555 8.611 5 7.869 5 7 5 5.895 5.895 5 7 5v-2h12c2.209 0 4 1.791 4 4 0 1.482-.805 2.773-2 3.465v8.535c0 1.657-1.343 3-3 3h-10Z"),
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
        return _breadFill!!
    }

private var _breadFill: ImageVector? = null
