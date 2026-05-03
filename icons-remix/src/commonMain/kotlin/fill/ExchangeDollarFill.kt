package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExchangeDollarFill: ImageVector
    get() {
        if (_exchangeDollarFill != null) return _exchangeDollarFill!!
        _exchangeDollarFill = remixIcon(
            name = "ExchangeDollarFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.378 4.513 C 7.143 2.951 9.463 2.003 12.005 2.003 C 17.528 2.003 22.005 6.480 22.005 12.003 C 22.005 14.128 21.342 16.098 20.212 17.718 L 17.505 12.003 L 20.005 12.003 C 20.005 7.584 16.423 4.003 12.005 4.003 C 9.761 4.003 7.732 4.927 6.279 6.415 L 5.378 4.513 ZM 18.631 19.492 C 16.867 21.054 14.547 22.003 12.005 22.003 C 6.482 22.003 2.005 17.526 2.005 12.003 C 2.005 9.878 2.668 7.908 3.798 6.288 L 6.505 12.003 L 4.005 12.003 C 4.005 16.421 7.587 20.003 12.005 20.003 C 14.249 20.003 16.278 19.079 17.730 17.590 L 18.631 19.492 ZM 8.505 14.003 L 14.005 14.003 C 14.281 14.003 14.505 13.779 14.505 13.503 C 14.505 13.227 14.281 13.003 14.005 13.003 L 10.005 13.003 C 8.624 13.003 7.505 11.884 7.505 10.503 C 7.505 9.122 8.624 8.003 10.005 8.003 L 11.005 8.003 L 11.005 7.003 L 13.005 7.003 L 13.005 8.003 L 15.505 8.003 L 15.505 10.003 L 10.005 10.003 C 9.729 10.003 9.505 10.227 9.505 10.503 C 9.505 10.779 9.729 11.003 10.005 11.003 L 14.005 11.003 C 15.386 11.003 16.505 12.122 16.505 13.503 C 16.505 14.884 15.386 16.003 14.005 16.003 L 13.005 16.003 L 13.005 17.003 L 11.005 17.003 L 11.005 16.003 L 8.505 16.003 L 8.505 14.003 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _exchangeDollarFill!!
    }

private var _exchangeDollarFill: ImageVector? = null
