package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GasStation: ImageVector
    get() {
        if (_gasStation != null) return _gasStation!!
        _gasStation = tablerFilledIcon(
            name = "GasStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 21C2.448 21 2 20.552 2 20c0-.552 .448-1 1-1v-13C3 4.343 4.343 3 6 3h6c1.657 0 3 1.343 3 3v4c1.657 0 3 1.343 3 3v3c0 .276 .224 .5 .5 .5 .276 0 .5-.224 .5-.5v-6C17.895 10 17 9.105 17 8v-.585l-.707-.708c-.356-.356-.392-.922-.083-1.32l.083-.094c.391-.39 1.024-.39 1.414 0l3.003 3.002 .095 .112 .028 .04 .044 .073 .052 .11 .031 .09 .02 .076 .012 .078L21 9v7c0 1.381-1.119 2.5-2.5 2.5C17.119 18.5 16 17.381 16 16v-3c0-.552-.448-1-1-1v7c.552 0 1 .448 1 1 0 .552-.448 1-1 1ZM12 5h-6C5.448 5 5 5.448 5 6v4h8v-4C13 5.448 12.552 5 12 5"),
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
        return _gasStation!!
    }

private var _gasStation: ImageVector? = null
