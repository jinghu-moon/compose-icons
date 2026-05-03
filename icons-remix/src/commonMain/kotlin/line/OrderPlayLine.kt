package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.OrderPlayLine: ImageVector
    get() {
        if (_orderPlayLine != null) return _orderPlayLine!!
        _orderPlayLine = remixIcon(
            name = "OrderPlayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 4.000 L 17.000 2.068 C 17.000 1.791 17.224 1.567 17.500 1.567 C 17.617 1.567 17.730 1.609 17.820 1.683 L 21.939 5.116 C 22.151 5.293 22.180 5.608 22.003 5.820 C 21.908 5.934 21.767 6.000 21.619 6.000 L 2.000 6.000 L 2.000 4.000 L 17.000 4.000 ZM 2.000 18.000 L 22.000 18.000 L 22.000 20.000 L 2.000 20.000 L 2.000 18.000 ZM 2.000 11.000 L 22.000 11.000 L 22.000 13.000 L 2.000 13.000 L 2.000 11.000 Z"),
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
        return _orderPlayLine!!
    }

private var _orderPlayLine: ImageVector? = null
