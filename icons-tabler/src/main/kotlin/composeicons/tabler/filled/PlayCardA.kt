package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCardA: ImageVector
    get() {
        if (_playCardA != null) return _playCardA!!
        _playCardA = tablerFilledIcon(
            name = "PlayCardA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM17.01 18h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1M12 8C10.343 8 9 9.343 9 11v4c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1h2v1c0 .507 .38 .934 .883 .993L14 16c.552 0 1-.448 1-1v-4C15 9.343 13.657 8 12 8M12 10c.552 0 1 .448 1 1v1h-2v-1c0-.507 .38-.934 .883-.993ZM7.01 4h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052L7.01 6c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _playCardA!!
    }

private var _playCardA: ImageVector? = null
