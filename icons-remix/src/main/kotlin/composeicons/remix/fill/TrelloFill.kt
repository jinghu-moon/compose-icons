package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TrelloFill: ImageVector
    get() {
        if (_trelloFill != null) return _trelloFill!!
        _trelloFill = remixIcon(
            name = "TrelloFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.251 3h13.5c1.242 0 2.25 1.007 2.25 2.25v13.5c0 1.242-1.007 2.25-2.25 2.25h-13.5C4.009 21 3.001 19.993 3.001 18.75v-13.5C3.001 4.008 4.008 3 5.251 3ZM13.171 6.421v5.759c0 .597 .484 1.081 1.08 1.081h3.33c.596 0 1.08-.484 1.08-1.081v-5.759c0-.597-.484-1.081-1.08-1.081h-3.33c-.596 0-1.08 .483-1.08 1.081ZM5.341 6.42v10.259c0 .597 .484 1.08 1.08 1.08h3.331c.596 0 1.08-.483 1.08-1.08v-10.259c0-.597-.484-1.08-1.08-1.08h-3.331c-.596 0-1.08 .483-1.08 1.08Z"),
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
        return _trelloFill!!
    }

private var _trelloFill: ImageVector? = null
