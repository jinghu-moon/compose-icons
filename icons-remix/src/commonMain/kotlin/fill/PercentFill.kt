package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PercentFill: ImageVector
    get() {
        if (_percentFill != null) return _percentFill!!
        _percentFill = remixIcon(
            name = "PercentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.505 21.003 C 15.572 21.003 14.005 19.436 14.005 17.503 C 14.005 15.570 15.572 14.003 17.505 14.003 C 19.438 14.003 21.005 15.570 21.005 17.503 C 21.005 19.436 19.438 21.003 17.505 21.003 ZM 6.505 10.003 C 4.572 10.003 3.005 8.436 3.005 6.503 C 3.005 4.570 4.572 3.003 6.505 3.003 C 8.438 3.003 10.005 4.570 10.005 6.503 C 10.005 8.436 8.438 10.003 6.505 10.003 ZM 19.076 3.517 L 20.490 4.932 L 4.934 20.488 L 3.520 19.074 L 19.076 3.517 Z"),
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
        return _percentFill!!
    }

private var _percentFill: ImageVector? = null
