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
                pathData = parseSvgPathData("M 15.000 3.000 L 15.000 5.000 L 13.000 5.000 L 13.000 6.049 C 18.053 6.551 22.000 10.815 22.000 16.000 L 2.000 16.000 C 2.000 10.815 5.947 6.551 11.000 6.049 L 11.000 5.000 L 9.000 5.000 L 9.000 3.000 L 15.000 3.000 ZM 23.000 20.000 L 23.000 18.000 L 1.000 18.000 L 1.000 20.000 L 23.000 20.000 Z"),
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
