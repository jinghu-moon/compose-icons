package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Dashboard3Line: ImageVector
    get() {
        if (_dashboard3Line != null) return _dashboard3Line!!
        _dashboard3Line = remixIcon(
            name = "Dashboard3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 4C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4ZM15.833 7.337c.237-.166 .559-.138 .763 .066 .204 .204 .23 .526 .062 .76-2.18 3.045-3.379 4.678-3.598 4.897-.586 .586-1.536 .586-2.121 0-.586-.586-.586-1.536 0-2.121 .373-.373 2.005-1.574 4.894-3.602ZM17.5 11c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1ZM6.5 11c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1ZM8.818 7.404c.391 .391 .391 1.024 0 1.414-.391 .391-1.024 .391-1.414 0-.391-.391-.391-1.024 0-1.414 .391-.391 1.024-.391 1.414 0ZM12 5.5c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1Z"),
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
        return _dashboard3Line!!
    }

private var _dashboard3Line: ImageVector? = null
