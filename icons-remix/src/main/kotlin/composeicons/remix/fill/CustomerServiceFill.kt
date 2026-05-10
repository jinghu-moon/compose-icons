package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CustomerServiceFill: ImageVector
    get() {
        if (_customerServiceFill != null) return _customerServiceFill!!
        _customerServiceFill = remixIcon(
            name = "CustomerServiceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 17.002c-.001 2.871-2.018 5.27-4.713 5.859l-.638-1.914c1.204-.196 2.227-.931 2.816-1.948h-2.465c-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2h2.938C19.446 7.054 16.08 4 12 4 7.92 4 4.554 7.054 4.062 11h2.938c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-3C2.895 19 2 18.105 2 17v-5C2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10v.999 .001 4 .001 .001Z"),
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
        return _customerServiceFill!!
    }

private var _customerServiceFill: ImageVector? = null
