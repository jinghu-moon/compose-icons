package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GameLine: ImageVector
    get() {
        if (_gameLine != null) return _gameLine!!
        _gameLine = remixIcon(
            name = "GameLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c3.122 0 5.909 1.43 7.743 3.671L13.414 12l6.329 6.329C17.909 20.57 15.122 22 12 22 6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 4C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 1.723 0 3.355-.547 4.697-1.523l.208-.157L10.586 12 16.905 5.679l-.208-.156C15.434 4.604 13.914 4.066 12.303 4.006L12 4ZM12 5c.828 0 1.5 .672 1.5 1.5C13.5 7.328 12.828 8 12 8 11.172 8 10.5 7.328 10.5 6.5 10.5 5.672 11.172 5 12 5Z"),
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
        return _gameLine!!
    }

private var _gameLine: ImageVector? = null
