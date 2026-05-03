package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NetworkOffFill: ImageVector
    get() {
        if (_networkOffFill != null) return _networkOffFill!!
        _networkOffFill = remixIcon(
            name = "NetworkOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.606 20.192 L 20.192 21.606 L 19.468 20.882 C 19.328 20.956 19.169 21.000 19.000 21.000 L 15.000 21.000 C 14.448 21.000 14.000 20.552 14.000 20.000 L 14.000 16.000 C 14.000 15.830 14.043 15.671 14.117 15.531 L 11.586 13.000 L 8.000 13.000 L 8.000 15.000 L 9.000 15.000 C 9.552 15.000 10.000 15.448 10.000 16.000 L 10.000 20.000 C 10.000 20.552 9.552 21.000 9.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 16.000 L 4.005 15.898 C 4.056 15.393 4.482 15.000 5.000 15.000 L 6.000 15.000 L 6.000 13.000 L 3.000 13.000 L 3.000 11.000 L 9.586 11.000 L 2.394 3.808 L 3.808 2.394 L 21.606 20.192 ZM 21.000 13.000 L 18.000 13.000 L 18.000 13.758 L 15.242 11.000 L 21.000 11.000 L 21.000 13.000 ZM 14.000 3.000 C 14.552 3.000 15.000 3.448 15.000 4.000 L 15.000 8.000 C 15.000 8.552 14.552 9.000 14.000 9.000 L 13.242 9.000 L 9.000 4.758 L 9.000 4.000 C 9.000 3.448 9.448 3.000 10.000 3.000 L 14.000 3.000 Z"),
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
        return _networkOffFill!!
    }

private var _networkOffFill: ImageVector? = null
