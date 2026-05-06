package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DirectionArrows: ImageVector
    get() {
        if (_directionArrows != null) return _directionArrows!!
        _directionArrows = tablerFilledIcon(
            name = "DirectionArrows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12l.004-.28C2.152 6.327 6.57 2 12 2M11.707 15.293c-.392-.379-1.016-.374-1.402 .012-.386 .386-.391 1.009-.012 1.402l1 1c.391 .39 1.023 .39 1.414 0l1-1c.39-.391 .39-1.024 0-1.414l-.094-.083c-.398-.309-.964-.273-1.32 .083L12 15.585ZM8.707 10.293c-.391-.39-1.023-.39-1.414 0l-1 1c-.39 .391-.39 1.023 0 1.414l1 1c.39 .39 1.023 .39 1.414 0l.083-.094c.309-.398 .273-.964-.083-1.32L8.415 12l.292-.293c.39-.391 .39-1.023 0-1.414M16.707 10.293c-.391-.39-1.024-.39-1.414 0l-.083 .094c-.309 .398-.273 .964 .083 1.32l.292 .292-.292 .294c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l1-1c.39-.391 .39-1.023 0-1.414ZM12.707 6.293c-.391-.39-1.023-.39-1.414 0l-1 1c-.39 .39-.39 1.023 0 1.414l.094 .083c.398 .309 .964 .273 1.32-.083L12 8.415l.293 .292c.392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402Z"),
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
        return _directionArrows!!
    }

private var _directionArrows: ImageVector? = null
