package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShirtLine: ImageVector
    get() {
        if (_shirtLine != null) return _shirtLine!!
        _shirtLine = remixIcon(
            name = "ShirtLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.998 20h6v-4h-4v-2h4v-8h-2v5L12.998 9.4v10.6ZM10.998 20v-10.6L6.998 11v-5h-2v14h6ZM6.998 4v-1h10v1h3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h3ZM11.998 8 15.498 5h-7l3.5 3Z"),
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
        return _shirtLine!!
    }

private var _shirtLine: ImageVector? = null
