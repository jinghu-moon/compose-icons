package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronLeft: ImageVector
    get() {
        if (_squareChevronLeft != null) return _squareChevronLeft!!
        _squareChevronLeft = tablerFilledIcon(
            name = "SquareChevronLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM13.707 8.293c-.391-.39-1.023-.39-1.414 0l-3 3-.083 .094c-.309 .398-.273 .964 .083 1.32l3 3 .094 .083c.398 .309 .964 .273 1.32-.083l.083-.094c.309-.398 .273-.964-.083-1.32L11.415 12 13.707 9.707l.083-.094c.309-.398 .273-.964-.083-1.32Z"),
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
        return _squareChevronLeft!!
    }

private var _squareChevronLeft: ImageVector? = null
