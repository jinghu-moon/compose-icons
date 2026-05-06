package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoneyEuroCircleFill: ImageVector
    get() {
        if (_moneyEuroCircleFill != null) return _moneyEuroCircleFill!!
        _moneyEuroCircleFill = remixIcon(
            name = "MoneyEuroCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 22.003C6.482 22.003 2.005 17.526 2.005 12.003 2.005 6.48 6.482 2.003 12.005 2.003c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM10.055 11.003c.232-1.141 1.24-2 2.45-2 .615 0 1.179 .222 1.614 .591L15.82 8.46C14.997 7.564 13.817 7.003 12.505 7.003c-2.316 0-4.224 1.75-4.473 4h-1.027v2h1.027c.249 2.25 2.156 4 4.473 4 1.312 0 2.492-.561 3.315-1.457L14.119 14.412c-.436 .369-.999 .591-1.614 .591-1.21 0-2.218-.859-2.45-2h4.95v-2h-4.95Z"),
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
        return _moneyEuroCircleFill!!
    }

private var _moneyEuroCircleFill: ImageVector? = null
