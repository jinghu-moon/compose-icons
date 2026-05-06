package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AnticlockwiseLine: ImageVector
    get() {
        if (_anticlockwiseLine != null) return _anticlockwiseLine!!
        _anticlockwiseLine = remixIcon(
            name = "AnticlockwiseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 9h10c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-10c-.552 0-1-.448-1-1v-10c0-.552 .448-1 1-1ZM12 11v8h8v-8h-8ZM6 10.586 7.828 8.757l1.414 1.414L5 14.414 .757 10.172 2.172 8.757l1.828 1.828v-2.586c0-2.761 2.239-5 5-5h4v2h-4c-1.657 0-3 1.343-3 3v2.586Z"),
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
        return _anticlockwiseLine!!
    }

private var _anticlockwiseLine: ImageVector? = null
