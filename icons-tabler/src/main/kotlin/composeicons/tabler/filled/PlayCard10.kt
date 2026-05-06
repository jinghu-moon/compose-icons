package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard10: ImageVector
    get() {
        if (_playCard10 != null) return _playCard10!!
        _playCard10 = tablerFilledIcon(
            name = "PlayCard10",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM17.01 18h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1M9 8C8.448 8 8 8.448 8 9v6c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-6C10 8.448 9.552 8 9 8M13.5 8C12.047 8 11 9.395 11 11v2c0 1.605 1.047 3 2.5 3C14.953 16 16 14.605 16 13v-2C16 9.395 14.953 8 13.5 8M13.5 10c.203 0 .5 .395 .5 1v2c0 .605-.297 1-.5 1C13.297 14 13 13.605 13 13v-2c0-.605 .297-1 .5-1M7.01 4h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052L7.01 6c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _playCard10!!
    }

private var _playCard10: ImageVector? = null
