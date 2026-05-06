package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronRight: ImageVector
    get() {
        if (_circleChevronRight != null) return _circleChevronRight!!
        _circleChevronRight = tablerFilledIcon(
            name = "CircleChevronRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M11.707 8.293c-.391-.39-1.023-.39-1.414 0l-.083 .094c-.309 .398-.273 .964 .083 1.32L12.585 12l-2.292 2.293c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l3-3c.39-.391 .39-1.023 0-1.414Z"),
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
        return _circleChevronRight!!
    }

private var _circleChevronRight: ImageVector? = null
