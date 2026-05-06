package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InkBottleLine: ImageVector
    get() {
        if (_inkBottleLine != null) return _inkBottleLine!!
        _inkBottleLine = remixIcon(
            name = "InkBottleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 8.997l4.371 1.749c.38 .152 .629 .519 .629 .928v9.323c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-9.323c0-.409 .249-.777 .629-.928L8 8.997h8ZM15.615 10.997h-7.23L5 12.351v7.646h14v-1h-11v-5h11v-1.646L15.615 10.997ZM16 2.997c.552 0 1 .448 1 1v4h-10v-4c0-.552 .448-1 1-1h8ZM15 4.997h-6v1h6v-1Z"),
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
        return _inkBottleLine!!
    }

private var _inkBottleLine: ImageVector? = null
