package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GooglePlayFill: ImageVector
    get() {
        if (_googlePlayFill != null) return _googlePlayFill!!
        _googlePlayFill = remixIcon(
            name = "GooglePlayFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.61 1.814 13.793 12 3.611 22.186c-.193-.082-.362-.224-.475-.42-.088-.152-.135-.325-.135-.501v-18.531c0-.413 .251-.768 .609-.921ZM14.5 12.707l2.302 2.302L5.865 21.342l8.635-8.635ZM17.699 9.509l2.807 1.626c.478 .277 .641 .889 .364 1.366-.087 .151-.213 .277-.364 .364l-2.808 1.625L15.207 12 17.699 9.509ZM5.865 2.658 16.803 8.99l-2.303 2.303L5.865 2.658Z"),
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
        return _googlePlayFill!!
    }

private var _googlePlayFill: ImageVector? = null
