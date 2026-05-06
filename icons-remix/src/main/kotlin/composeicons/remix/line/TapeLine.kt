package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TapeLine: ImageVector
    get() {
        if (_tapeLine != null) return _tapeLine!!
        _tapeLine = remixIcon(
            name = "TapeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.829 13h2.341C13.06 12.687 13 12.351 13 12c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-8C6.343 15 5 13.657 5 12 5 10.343 6.343 9 8 9c1.657 0 3 1.343 3 3 0 .351-.06 .687-.171 1ZM4 5v14h16v-14h-16ZM3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM8 13c.552 0 1-.448 1-1C9 11.448 8.552 11 8 11c-.552 0-1 .448-1 1 0 .552 .448 1 1 1ZM16 13c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _tapeLine!!
    }

private var _tapeLine: ImageVector? = null
