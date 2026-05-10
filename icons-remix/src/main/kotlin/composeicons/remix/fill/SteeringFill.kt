package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SteeringFill: ImageVector
    get() {
        if (_steeringFill != null) return _steeringFill!!
        _steeringFill = remixIcon(
            name = "SteeringFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.799 14.001c-.836 4.116-4.2 7.314-8.4 7.902l0-2.025c3.093-.546 5.574-2.869 6.348-5.878l2.052 .001ZM4.252 14c.766 2.976 3.201 5.281 6.247 5.859v2.029C6.346 21.263 3.029 18.084 2.2 14.001l2.052-.001ZM17.999 11v2h-1c-2.142 0-3.891 1.684-3.995 3.8L12.999 17v1h-2v-1c0-2.142-1.684-3.891-3.8-3.995L6.999 13h-1v-2h12ZM11.999 2c5.185 0 9.449 3.947 9.951 9L19.938 11C19.445 7.054 16.079 4 11.999 4 7.92 4 4.553 7.054 4.061 11L2.049 11C2.551 5.947 6.814 2 11.999 2Z"),
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
        return _steeringFill!!
    }

private var _steeringFill: ImageVector? = null
