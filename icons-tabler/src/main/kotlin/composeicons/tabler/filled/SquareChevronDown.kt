package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronDown: ImageVector
    get() {
        if (_squareChevronDown != null) return _squareChevronDown!!
        _squareChevronDown = tablerFilledIcon(
            name = "SquareChevronDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM9.613 10.21C9.196 9.887 8.6 9.944 8.251 10.34c-.349 .395-.33 .994 .042 1.367l3 3 .094 .083c.398 .309 .964 .273 1.32-.083l3-3 .083-.094c.309-.398 .273-.964-.083-1.32l-.094-.083c-.398-.309-.964-.273-1.32 .083L12 12.585 9.707 10.293Z"),
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
        return _squareChevronDown!!
    }

private var _squareChevronDown: ImageVector? = null
