package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SurroundSoundFill: ImageVector
    get() {
        if (_surroundSoundFill != null) return _surroundSoundFill!!
        _surroundSoundFill = remixIcon(
            name = "SurroundSoundFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM7.05 7.121C5.784 8.388 5 10.138 5 12.071c0 1.933 .784 3.683 2.05 4.95L8.464 15.607C7.56 14.702 7 13.452 7 12.071 7 10.69 7.56 9.44 8.464 8.536L7.05 7.121ZM16.95 7.121 15.535 8.536c.905 .905 1.465 2.155 1.465 3.536 0 1.381-.56 2.631-1.465 3.535l1.414 1.414C18.216 15.754 19 14.004 19 12.071 19 10.138 18.216 8.388 16.95 7.121ZM12 15.071c1.657 0 3-1.343 3-3C15 10.414 13.657 9.071 12 9.071c-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3ZM12 13.071c-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1Z"),
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
        return _surroundSoundFill!!
    }

private var _surroundSoundFill: ImageVector? = null
