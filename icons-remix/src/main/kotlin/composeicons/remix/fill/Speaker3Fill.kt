package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Speaker3Fill: ImageVector
    get() {
        if (_speaker3Fill != null) return _speaker3Fill!!
        _speaker3Fill = remixIcon(
            name = "Speaker3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3ZM12 16C9.791 16 8 14.209 8 12 8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM12 18c3.314 0 6-2.686 6-6C18 8.686 15.314 6 12 6 8.686 6 6 8.686 6 12c0 3.314 2.686 6 6 6ZM6 7C6.552 7 7 6.552 7 6 7 5.448 6.552 5 6 5 5.448 5 5 5.448 5 6c0 .552 .448 1 1 1ZM18 7c.552 0 1-.448 1-1C19 5.448 18.552 5 18 5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1ZM18 19c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1ZM6 19c.552 0 1-.448 1-1C7 17.448 6.552 17 6 17c-.552 0-1 .448-1 1 0 .552 .448 1 1 1ZM12 13.5c.828 0 1.5-.672 1.5-1.5 0-.828-.672-1.5-1.5-1.5-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5Z"),
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
        return _speaker3Fill!!
    }

private var _speaker3Fill: ImageVector? = null
