package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronLeft: ImageVector
    get() {
        if (_circleChevronLeft != null) return _circleChevronLeft!!
        _circleChevronLeft = tablerFilledIcon(
            name = "CircleChevronLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c3.094 1.786 5 5.087 5 8.66 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 8.427 3.906 5.126 7 3.34 10.094 1.554 13.906 1.554 17 3.34M13.707 8.293c-.391-.39-1.023-.39-1.414 0l-3 3c-.39 .391-.39 1.023 0 1.414l3 3c.391 .39 1.023 .39 1.414 0l.083-.094c.309-.398 .273-.964-.083-1.32L11.415 12 13.707 9.707c.39-.391 .39-1.023 0-1.414"),
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
        return _circleChevronLeft!!
    }

private var _circleChevronLeft: ImageVector? = null
