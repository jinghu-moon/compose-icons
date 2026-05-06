package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ClockwiseLine: ImageVector
    get() {
        if (_clockwiseLine != null) return _clockwiseLine!!
        _clockwiseLine = remixIcon(
            name = "ClockwiseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 10.586 21.828 8.757l1.414 1.414L19 14.414 14.757 10.172 16.172 8.757 18 10.586v-2.586C18 6.343 16.657 5 15 5h-4v-2h4c2.761 0 5 2.239 5 5v2.586ZM13 9c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-10C2.448 21 2 20.552 2 20v-10C2 9.448 2.448 9 3 9h10ZM12 11h-8v8h8v-8Z"),
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
        return _clockwiseLine!!
    }

private var _clockwiseLine: ImageVector? = null
