package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CirclePercentage: ImageVector
    get() {
        if (_circlePercentage != null) return _circlePercentage!!
        _circlePercentage = tablerFilledIcon(
            name = "CirclePercentage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12l.004-.28C2.152 6.327 6.57 2 12 2M15 14.12c-.552 0-1 .448-1 1v.015c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.015c0-.552-.448-1-1-1M15.707 8.368c-.391-.39-1.023-.39-1.414 0l-6 6c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l6-6c.39-.39 .39-1.023 0-1.414M9 8.105c-.552 0-1 .448-1 1v.015c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.015c0-.552-.448-1-1-1"),
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
        return _circlePercentage!!
    }

private var _circlePercentage: ImageVector? = null
