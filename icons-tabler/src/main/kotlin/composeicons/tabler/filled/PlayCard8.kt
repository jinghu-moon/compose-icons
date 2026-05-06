package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard8: ImageVector
    get() {
        if (_playCard8 != null) return _playCard8!!
        _playCard8 = tablerFilledIcon(
            name = "PlayCard8",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM17.01 18h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1M13 8h-2C9.895 8 9 8.895 9 10v1c0 .365 .098 .707 .268 1.001C9.098 12.294 9 12.636 9 13v1c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-1c-0-.351-.092-.696-.268-1 .17-.293 .268-.635 .268-1v-1C15 8.895 14.105 8 13 8M13 13v1h-2v-1ZM13 10v1h-2v-1ZM7.01 4h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052L7.01 6c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _playCard8!!
    }

private var _playCard8: ImageVector? = null
