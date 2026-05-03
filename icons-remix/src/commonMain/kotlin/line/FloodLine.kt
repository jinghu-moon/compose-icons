package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FloodLine: ImageVector
    get() {
        if (_floodLine != null) return _floodLine!!
        _floodLine = remixIcon(
            name = "FloodLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 17.472 C 17.062 18.422 18.463 19.000 20.000 19.000 L 22.000 19.000 L 22.000 21.000 L 20.000 21.000 C 18.543 21.000 17.177 20.610 16.000 19.930 C 14.824 20.610 13.458 21.000 12.000 21.000 C 10.543 21.000 9.177 20.610 8.000 19.930 C 6.824 20.610 5.458 21.000 4.000 21.000 L 2.000 21.000 L 2.000 19.000 L 4.000 19.000 C 5.537 19.000 6.939 18.422 8.000 17.472 C 9.062 18.422 10.463 19.000 12.000 19.000 C 13.537 19.000 14.939 18.422 16.000 17.472 ZM 12.573 1.532 L 12.673 1.612 L 23.000 11.000 L 20.000 11.000 L 20.000 17.000 C 19.299 17.000 18.626 16.880 18.000 16.659 L 18.000 9.157 L 12.000 3.702 L 6.000 9.156 L 6.001 16.658 C 5.465 16.848 4.893 16.963 4.299 16.993 L 4.000 17.000 L 4.000 11.000 L 1.000 11.000 L 11.327 1.612 C 11.677 1.294 12.196 1.267 12.573 1.532 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _floodLine!!
    }

private var _floodLine: ImageVector? = null
