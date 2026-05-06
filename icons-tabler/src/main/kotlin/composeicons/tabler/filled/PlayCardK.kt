package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCardK: ImageVector
    get() {
        if (_playCardK != null) return _playCardK!!
        _playCardK = tablerFilledIcon(
            name = "PlayCardK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM17.01 18h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1M10 8C9.448 8 9 8.448 9 9v6c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1.585l2.293 2.292c.356 .356 .922 .392 1.32 .083l.094-.083 .083-.094c.309-.398 .273-.964-.083-1.32L12.415 12 14.707 9.707c.26-.251 .364-.623 .273-.973-.092-.35-.365-.623-.714-.714-.35-.092-.721 .013-.973 .273L11 10.584v-1.584c-0-.507-.38-.934-.883-.993ZM7.01 4h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052L7.01 6c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _playCardK!!
    }

private var _playCardK: ImageVector? = null
