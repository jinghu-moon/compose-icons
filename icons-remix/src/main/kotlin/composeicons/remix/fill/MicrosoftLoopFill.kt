package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MicrosoftLoopFill: ImageVector
    get() {
        if (_microsoftLoopFill != null) return _microsoftLoopFill!!
        _microsoftLoopFill = remixIcon(
            name = "MicrosoftLoopFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12c0 5.523-4.477 10-10 10h-5.335C8.685 20.548 10 18.178 10 15.5h2c1.933 0 3.5-1.567 3.5-3.5C15.5 10.067 13.933 8.5 12 8.5 10.067 8.5 8.5 10.067 8.5 12v3.5C8.5 19.09 5.59 22 2 22v-10C2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z"),
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
        return _microsoftLoopFill!!
    }

private var _microsoftLoopFill: ImageVector? = null
