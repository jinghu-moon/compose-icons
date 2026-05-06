package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChristmasTree: ImageVector
    get() {
        if (_christmasTree != null) return _christmasTree!!
        _christmasTree = tablerFilledIcon(
            name = "ChristmasTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 19v1c0 1.105-.895 2-2 2h-2C9.895 22 9 21.105 9 20v-1ZM5 18C4.11 18 3.663 16.923 4.293 16.293L7.148 13.436 5.684 12.949c-.309-.103-.548-.349-.642-.66-.094-.311-.031-.649 .17-.905l.08-.091L8.311 8.273 7.553 7.894C7.285 7.76 7.092 7.513 7.025 7.222c-.066-.292 .001-.598 .185-.835l.083-.094 4-4c.391-.39 1.023-.39 1.414 0l4 4c.227 .227 .331 .55 .28 .867-.052 .317-.252 .59-.54 .734l-.759 .379 3.02 3.02c.23 .23 .333 .557 .278 .877-.055 .32-.263 .593-.557 .733l-.113 .046-1.465 .487 2.856 2.857c.603 .602 .22 1.614-.593 1.701L19 18Z"),
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
        return _christmasTree!!
    }

private var _christmasTree: ImageVector? = null
