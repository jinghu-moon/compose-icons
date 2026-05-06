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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.849 11.805l-.707-.707L7.243 20.997h-4.243v-4.243L14.314 5.441l5.657 5.657c.39 .391 .39 1.024 0 1.414l-7.071 7.071L11.485 18.169l6.364-6.364ZM18.556 2.613l2.829 2.828c.39 .391 .39 1.024 0 1.414L19.971 8.269 15.728 4.027 17.142 2.613c.391-.391 1.024-.391 1.414 0Z"),
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
        return _ballPenFill!!
    }

private var _ballPenFill: ImageVector? = null
