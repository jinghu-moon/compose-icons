package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronsLeft: ImageVector
    get() {
        if (_squareChevronsLeft != null) return _squareChevronsLeft!!
        _squareChevronsLeft = tablerFilledIcon(
            name = "SquareChevronsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM16.707 8.293c-.391-.39-1.024-.39-1.414 0l-3 3-.083 .094c-.309 .398-.273 .964 .083 1.32l3 3 .094 .083c.398 .309 .964 .273 1.32-.083l.083-.094c.309-.398 .273-.964-.083-1.32L14.415 12 16.707 9.707l.083-.094c.309-.398 .273-.964-.083-1.32ZM11.707 8.293c-.391-.39-1.023-.39-1.414 0l-3 3-.083 .094c-.309 .398-.273 .964 .083 1.32l3 3 .094 .083c.398 .309 .964 .273 1.32-.083l.083-.094c.309-.398 .273-.964-.083-1.32L9.415 12 11.707 9.707l.083-.094c.309-.398 .273-.964-.083-1.32Z"),
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
        return _squareChevronsLeft!!
    }

private var _squareChevronsLeft: ImageVector? = null
