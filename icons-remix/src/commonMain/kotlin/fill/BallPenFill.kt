package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BallPenFill: ImageVector
    get() {
        if (_ballPenFill != null) return _ballPenFill!!
        _ballPenFill = remixIcon(
            name = "BallPenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.849 11.805 L 17.142 11.098 L 7.243 20.997 L 3.000 20.997 L 3.000 16.755 L 14.314 5.441 L 19.971 11.098 C 20.361 11.488 20.361 12.122 19.971 12.512 L 12.899 19.583 L 11.485 18.169 L 17.849 11.805 ZM 18.556 2.613 L 21.385 5.441 C 21.775 5.832 21.775 6.465 21.385 6.855 L 19.971 8.269 L 15.728 4.027 L 17.142 2.613 C 17.533 2.222 18.166 2.222 18.556 2.613 Z"),
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
        return _ballPenFill!!
    }

private var _ballPenFill: ImageVector? = null
