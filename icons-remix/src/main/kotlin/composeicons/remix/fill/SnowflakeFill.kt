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
                pathData = parseSvgPathData("M12.001 3.298 14.446 1.668l1.109 1.664L13.001 5.035v5.233L17.532 7.651l.198-3.064 1.996 .129-.189 2.933 2.634 1.303-.886 1.793L18.532 9.384l-4.531 2.616 4.532 2.616 2.752-1.361 .886 1.793-2.634 1.303 .189 2.933-1.996 .129-.198-3.064L13.001 13.731v5.233l2.555 1.703-1.109 1.664L12.001 20.702 9.555 22.332 8.446 20.668l2.555-1.703v-5.233L6.469 16.348l-.198 3.064L4.275 19.284l.189-2.933L1.83 15.048l.886-1.793 2.752 1.361 4.532-2.617L5.469 9.383 2.717 10.744 1.83 8.951 4.465 7.649 4.276 4.716 6.272 4.587l.198 3.064 4.531 2.616v-5.232L8.446 3.332 9.555 1.668l2.445 1.63Z"),
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
