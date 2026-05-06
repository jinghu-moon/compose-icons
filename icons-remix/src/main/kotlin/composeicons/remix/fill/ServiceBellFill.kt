package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ServiceBellFill: ImageVector
    get() {
        if (_serviceBellFill != null) return _serviceBellFill!!
        _serviceBellFill = remixIcon(
            name = "ServiceBellFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 3v2h-2v1.049c5.053 .502 9 4.765 9 9.951h-20C2 10.815 5.947 6.551 11 6.049v-1.049h-2v-2h6ZM23 20v-2h-22v2h22Z"),
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
        return _serviceBellFill!!
    }

private var _serviceBellFill: ImageVector? = null
