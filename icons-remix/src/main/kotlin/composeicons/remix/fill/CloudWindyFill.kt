package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CloudWindyFill: ImageVector
    get() {
        if (_cloudWindyFill != null) return _cloudWindyFill!!
        _cloudWindyFill = remixIcon(
            name = "CloudWindyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 19v-3.993h-11.926C1.391 13.829 1 12.46 1 11 1 6.582 4.582 3 9 3c3.395 0 6.296 2.115 7.458 5.099C16.795 8.034 17.144 8 17.5 8 20.538 8 23 10.462 23 13.5 23 16.538 20.538 19 17.5 19h-3.5ZM6 21h10v2h-10v-2ZM2 17h10v2h-10v-2Z"),
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
        return _cloudWindyFill!!
    }

private var _cloudWindyFill: ImageVector? = null
