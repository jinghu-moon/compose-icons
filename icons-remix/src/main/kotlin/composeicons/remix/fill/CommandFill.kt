package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CommandFill: ImageVector
    get() {
        if (_commandFill != null) return _commandFill!!
        _commandFill = remixIcon(
            name = "CommandFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 8h4v-1.5C14 4.567 15.567 3 17.5 3 19.433 3 21 4.567 21 6.5 21 8.433 19.433 10 17.5 10h-1.5v4h1.5C19.433 14 21 15.567 21 17.5 21 19.433 19.433 21 17.5 21 15.567 21 14 19.433 14 17.5v-1.5h-4v1.5C10 19.433 8.433 21 6.5 21 4.567 21 3 19.433 3 17.5 3 15.567 4.567 14 6.5 14h1.5v-4h-1.5C4.567 10 3 8.433 3 6.5 3 4.567 4.567 3 6.5 3 8.433 3 10 4.567 10 6.5v1.5ZM8 8v-1.5C8 5.672 7.328 5 6.5 5 5.672 5 5 5.672 5 6.5 5 7.328 5.672 8 6.5 8h1.5ZM8 16h-1.5C5.672 16 5 16.672 5 17.5 5 18.328 5.672 19 6.5 19 7.328 19 8 18.328 8 17.5v-1.5ZM16 8h1.5C18.328 8 19 7.328 19 6.5 19 5.672 18.328 5 17.5 5 16.672 5 16 5.672 16 6.5v1.5ZM16 16v1.5c0 .828 .672 1.5 1.5 1.5C18.328 19 19 18.328 19 17.5 19 16.672 18.328 16 17.5 16h-1.5ZM10 10v4h4v-4h-4Z"),
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
        return _commandFill!!
    }

private var _commandFill: ImageVector? = null
