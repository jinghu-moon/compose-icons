package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SwapFill: ImageVector
    get() {
        if (_swapFill != null) return _swapFill!!
        _swapFill = remixIcon(
            name = "SwapFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.005 22.003 C 6.482 22.003 2.005 17.526 2.005 12.003 C 2.005 6.480 6.482 2.003 12.005 2.003 C 17.528 2.003 22.005 6.480 22.005 12.003 C 22.005 17.526 17.528 22.003 12.005 22.003 ZM 7.005 9.003 L 9.005 9.003 L 9.005 13.003 L 11.005 13.003 L 11.005 9.003 L 13.005 9.003 L 10.005 5.503 L 7.005 9.003 ZM 17.005 15.003 L 15.005 15.003 L 15.005 11.003 L 13.005 11.003 L 13.005 15.003 L 11.005 15.003 L 14.005 18.503 L 17.005 15.003 Z"),
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
        return _swapFill!!
    }

private var _swapFill: ImageVector? = null
