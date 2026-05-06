package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCardQ: ImageVector
    get() {
        if (_playCardQ != null) return _playCardQ!!
        _playCardQ = tablerFilledIcon(
            name = "PlayCardQ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM17.01 18h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1M12 8C10.343 8 9 9.343 9 11v2c-0 1.03 .528 1.989 1.399 2.538 .871 .55 1.964 .614 2.894 .17l.5 .5c.391 .39 1.024 .39 1.415-0 .39-.391 .39-1.024-.001-1.415l-.499-.5C14.895 13.901 15 13.463 15 13v-2C15 9.343 13.657 8 12 8M12 10c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1M7.01 4h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052L7.01 6c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _playCardQ!!
    }

private var _playCardQ: ImageVector? = null
