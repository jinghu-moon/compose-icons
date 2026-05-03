package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SwapBoxLine: ImageVector
    get() {
        if (_swapBoxLine != null) return _swapBoxLine!!
        _swapBoxLine = remixIcon(
            name = "SwapBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.005 5.003 L 4.005 19.003 L 20.005 19.003 L 20.005 5.003 L 4.005 5.003 ZM 3.005 3.003 L 21.005 3.003 C 21.557 3.003 22.005 3.450 22.005 4.003 L 22.005 20.003 C 22.005 20.555 21.557 21.003 21.005 21.003 L 3.005 21.003 C 2.453 21.003 2.005 20.555 2.005 20.003 L 2.005 4.003 C 2.005 3.450 2.453 3.003 3.005 3.003 ZM 15.005 7.003 L 18.505 10.003 L 15.005 13.003 L 15.005 11.003 L 11.005 11.003 L 11.005 9.003 L 15.005 9.003 L 15.005 7.003 ZM 9.005 17.003 L 5.505 14.003 L 9.005 11.003 L 9.005 13.003 L 13.005 13.003 L 13.005 15.003 L 9.005 15.003 L 9.005 17.003 Z"),
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
        return _swapBoxLine!!
    }

private var _swapBoxLine: ImageVector? = null
