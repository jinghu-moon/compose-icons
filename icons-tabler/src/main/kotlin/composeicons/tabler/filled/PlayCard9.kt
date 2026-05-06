package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard9: ImageVector
    get() {
        if (_playCard9 != null) return _playCard9!!
        _playCard9 = tablerFilledIcon(
            name = "PlayCard9",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM17.01 18h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M13 8h-2C9.895 8 9 8.895 9 10v1l.005 .15C9.083 12.194 9.953 13 11 13h2v1h-3c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h3c1.105 0 2-.895 2-2v-4C15 8.895 14.105 8 13 8M13 10v1h-2v-1ZM7.01 4h-.01C6.448 4 6 4.448 6 5c0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _playCard9!!
    }

private var _playCard9: ImageVector? = null
