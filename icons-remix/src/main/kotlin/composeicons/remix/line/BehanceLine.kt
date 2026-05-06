package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BehanceLine: ImageVector
    get() {
        if (_behanceLine != null) return _behanceLine!!
        _behanceLine = remixIcon(
            name = "BehanceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 11c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2h-4.5v4h4.5ZM8.5 13h-5.5v4h5.5c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2ZM10.563 11.573c1.161 .7 1.937 1.973 1.937 3.427 0 2.209-1.791 4-4 4h-7.5v-14h6.5c2.209 0 4 1.791 4 4 0 .98-.352 1.877-.937 2.573ZM15.5 6h5.5v1.5h-5.5v-1.5ZM23 14.5h-7.5v.25c0 1.519 1.231 2.75 2.75 2.75 1.069 0 1.995-.61 2.45-1.5h2.134c-.549 2.017-2.393 3.5-4.584 3.5-2.623 0-4.75-2.127-4.75-4.75v-1.5c0-2.623 2.127-4.75 4.75-4.75 2.623 0 4.75 2.127 4.75 4.75v1.25ZM20.896 12.5c-.326-1.154-1.388-2-2.646-2-1.259 0-2.32 .846-2.646 2h5.293Z"),
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
        return _behanceLine!!
    }

private var _behanceLine: ImageVector? = null
