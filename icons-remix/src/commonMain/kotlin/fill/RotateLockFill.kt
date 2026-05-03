package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RotateLockFill: ImageVector
    get() {
        if (_rotateLockFill != null) return _rotateLockFill!!
        _rotateLockFill = remixIcon(
            name = "RotateLockFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 14.136 21.330 16.116 20.189 17.741 L 17.000 12.000 L 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 14.150 20.000 16.102 19.152 17.540 17.772 L 18.538 19.567 C 16.785 21.083 14.500 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 7.000 C 13.657 7.000 15.000 8.343 15.000 10.000 L 15.000 11.000 L 16.000 11.000 L 16.000 16.000 L 8.000 16.000 L 8.000 11.000 L 9.000 11.000 L 9.000 10.000 C 9.000 8.343 10.343 7.000 12.000 7.000 ZM 12.000 9.000 C 11.487 9.000 11.064 9.386 11.007 9.883 L 11.000 10.000 L 11.000 11.000 L 13.000 11.000 L 13.000 10.000 C 13.000 9.487 12.614 9.064 12.117 9.007 L 12.000 9.000 Z"),
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
        return _rotateLockFill!!
    }

private var _rotateLockFill: ImageVector? = null
