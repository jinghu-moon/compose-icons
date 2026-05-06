package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BallPenLine: ImageVector
    get() {
        if (_ballPenLine != null) return _ballPenLine!!
        _ballPenLine = remixIcon(
            name = "BallPenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.849 11.698l-.707-.707L7.243 20.891h-4.243v-4.243L14.314 5.334l5.657 5.657c.39 .39 .39 1.024 0 1.414l-7.071 7.071L11.485 18.062l6.364-6.364ZM15.728 9.577 14.314 8.163 5 17.476v1.414h1.414L15.728 9.577ZM18.556 2.506l2.829 2.828c.39 .391 .39 1.024 0 1.414L19.971 8.163 15.728 3.92 17.142 2.506c.391-.391 1.024-.391 1.414 0Z"),
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
        return _ballPenLine!!
    }

private var _ballPenLine: ImageVector? = null
