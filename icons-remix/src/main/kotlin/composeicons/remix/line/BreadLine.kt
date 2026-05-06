package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BreadLine: ImageVector
    get() {
        if (_breadLine != null) return _breadLine!!
        _breadLine = remixIcon(
            name = "BreadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 3C2.791 3 1 4.791 1 7c0 1.482 .805 2.773 2 3.465v8.535c0 1.657 1.343 3 3 3h12c1.657 0 3-1.343 3-3v-8.535C22.195 9.773 23 8.482 23 7 23 4.791 21.209 3 19 3h-14ZM7 20C6.448 20 6 19.552 6 19v-9.878L5.333 8.886C4.555 8.611 4 7.869 4 7 4 5.895 4.895 5 6 5h13c1.105 0 2 .895 2 2 0 .869-.555 1.611-1.333 1.886L19 9.122v9.878c0 .552-.448 1-1 1h-11Z"),
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
        return _breadLine!!
    }

private var _breadLine: ImageVector? = null
