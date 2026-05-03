package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SnowflakeFill: ImageVector
    get() {
        if (_snowflakeFill != null) return _snowflakeFill!!
        _snowflakeFill = remixIcon(
            name = "SnowflakeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.001 3.298 L 14.446 1.668 L 15.555 3.332 L 13.001 5.035 L 13.001 10.268 L 17.532 7.651 L 17.730 4.587 L 19.726 4.716 L 19.537 7.649 L 22.171 8.952 L 21.285 10.744 L 18.532 9.384 L 14.001 12.000 L 18.533 14.616 L 21.285 13.255 L 22.171 15.048 L 19.537 16.351 L 19.726 19.283 L 17.730 19.412 L 17.533 16.348 L 13.001 13.731 L 13.001 18.965 L 15.555 20.668 L 14.446 22.332 L 12.001 20.702 L 9.555 22.332 L 8.446 20.668 L 11.001 18.965 L 11.001 13.732 L 6.469 16.348 L 6.271 19.412 L 4.275 19.284 L 4.465 16.351 L 1.830 15.048 L 2.717 13.255 L 5.469 14.616 L 10.001 12.000 L 5.469 9.383 L 2.717 10.744 L 1.830 8.951 L 4.465 7.649 L 4.276 4.716 L 6.272 4.587 L 6.469 7.651 L 11.001 10.267 L 11.001 5.035 L 8.446 3.332 L 9.555 1.668 L 12.001 3.298 Z"),
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
        return _snowflakeFill!!
    }

private var _snowflakeFill: ImageVector? = null
