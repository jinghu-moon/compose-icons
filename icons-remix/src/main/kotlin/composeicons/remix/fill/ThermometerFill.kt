package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ThermometerFill: ImageVector
    get() {
        if (_thermometerFill != null) return _thermometerFill!!
        _thermometerFill = remixIcon(
            name = "ThermometerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.556 3.444c1.562 1.562 1.562 4.095 0 5.657l-8.2 8.2c-.642 .642-1.484 1.047-2.387 1.147l-3.379 .374L4.293 21.121c-.391 .391-1.024 .391-1.414 0-.391-.39-.391-1.024 0-1.414L5.177 17.408l.375-3.378c.1-.903 .505-1.744 1.147-2.387L14.9 3.444c1.562-1.562 4.095-1.562 5.657 0ZM11.364 12.636 9.95 14.05l2.121 2.121 1.414-1.414L11.364 12.636ZM14.193 9.808l-1.414 1.414 2.121 2.121 1.414-1.414L14.193 9.808ZM17.021 6.979 15.607 8.393l2.121 2.121L19.142 9.101 17.021 6.979Z"),
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
        return _thermometerFill!!
    }

private var _thermometerFill: ImageVector? = null
