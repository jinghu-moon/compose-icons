package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SkullLine: ImageVector
    get() {
        if (_skullLine != null) return _skullLine!!
        _skullLine = remixIcon(
            name = "SkullLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 12C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12v4h3c.552 0 1 .448 1 1v3h8v-3c0-.552 .448-1 1-1h3v-4ZM18 18v3c0 .552-.448 1-1 1h-10C6.448 22 6 21.552 6 21v-3h-3C2.448 18 2 17.552 2 17v-5C2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10v5c0 .552-.448 1-1 1h-3ZM7.5 14C6.672 14 6 13.328 6 12.5 6 11.672 6.672 11 7.5 11 8.328 11 9 11.672 9 12.5 9 13.328 8.328 14 7.5 14ZM16.5 14C15.672 14 15 13.328 15 12.5 15 11.672 15.672 11 16.5 11c.828 0 1.5 .672 1.5 1.5C18 13.328 17.328 14 16.5 14Z"),
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
        return _skullLine!!
    }

private var _skullLine: ImageVector? = null
