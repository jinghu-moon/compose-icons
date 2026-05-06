package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Brush4Line: ImageVector
    get() {
        if (_brush4Line != null) return _brush4Line!!
        _brush4Line = remixIcon(
            name = "Brush4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 4.997v6.273h-2v-6.273h-2v9h14v-9h-10ZM20 15.997h-16v2h16v-2ZM3 13.997v-10c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1v10h1v5c0 .552-.448 1-1 1h-8v3h-2v-3h-8c-.552 0-1-.448-1-1v-5h1Z"),
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
        return _brush4Line!!
    }

private var _brush4Line: ImageVector? = null
