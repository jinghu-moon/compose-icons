package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MastercardFill: ImageVector
    get() {
        if (_mastercardFill != null) return _mastercardFill!!
        _mastercardFill = remixIcon(
            name = "MastercardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 6.654c1.581 1.245 2.595 3.176 2.595 5.344 0 2.168-1.015 4.099-2.595 5.344C10.42 16.097 9.405 14.166 9.405 11.998c0-2.168 1.015-4.099 2.596-5.344ZM11.132 6.072C9.46 7.502 8.401 9.627 8.401 12c0 2.371 1.058 4.495 2.728 5.926-.984 .554-2.12 .87-3.33 .87-3.754 0-6.798-3.043-6.798-6.798C1.001 8.243 4.044 5.2 7.799 5.2c1.211 0 2.348 .317 3.333 .872ZM12.873 17.926C14.543 16.495 15.601 14.371 15.601 12c0-2.373-1.059-4.498-2.731-5.928 .985-.555 2.122-.872 3.333-.872 3.754 0 6.798 3.043 6.798 6.798 0 3.754-3.043 6.798-6.798 6.798-1.21 0-2.346-.316-3.33-.87Z"),
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
        return _mastercardFill!!
    }

private var _mastercardFill: ImageVector? = null
