package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpeedFill: ImageVector
    get() {
        if (_speedFill != null) return _speedFill!!
        _speedFill = remixIcon(
            name = "SpeedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 13.333 2.777 19.482c-.23 .153-.54 .091-.693-.139C2.029 19.261 2 19.164 2 19.066v-14.131c0-.276 .224-.5 .5-.5 .099 0 .195 .029 .277 .084L12 10.667v-5.732c0-.276 .224-.5 .5-.5 .099 0 .195 .029 .277 .084l10.599 7.066c.23 .153 .292 .464 .139 .693-.037 .055-.084 .102-.139 .139L12.777 19.482c-.23 .153-.54 .091-.693-.139C12.029 19.261 12 19.164 12 19.066v-5.732Z"),
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
        return _speedFill!!
    }

private var _speedFill: ImageVector? = null
