package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowDownBoxLine: ImageVector
    get() {
        if (_arrowDownBoxLine != null) return _arrowDownBoxLine!!
        _arrowDownBoxLine = remixIcon(
            name = "ArrowDownBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 3h-16C3.448 3 3 3.448 3 4v16c0 .552 .448 1 1 1h16c.552 0 1-.448 1-1v-16C21 3.448 20.552 3 20 3ZM5 19v-14h14v14h-14ZM11 6.344v7.485L7.758 10.586 6.344 12.001l5.657 5.657 5.657-5.657L16.243 10.586l-3.243 3.243v-7.485h-2Z"),
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
        return _arrowDownBoxLine!!
    }

private var _arrowDownBoxLine: ImageVector? = null
