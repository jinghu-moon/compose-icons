package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard5: ImageVector
    get() {
        if (_playCard5 != null) return _playCard5!!
        _playCard5 = tablerFilledIcon(
            name = "PlayCard5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM17.01 18h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14 8h-4C9.448 8 9 8.448 9 9v3c0 .552 .448 1 1 1h3v1h-3c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h3c1.105 0 2-.895 2-2v-1l-.005-.15C14.917 11.806 14.047 11 13 11h-2v-1h3c.552 0 1-.448 1-1C15 8.448 14.552 8 14 8M7.01 4h-.01C6.448 4 6 4.448 6 5c0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _playCard5!!
    }

private var _playCard5: ImageVector? = null
