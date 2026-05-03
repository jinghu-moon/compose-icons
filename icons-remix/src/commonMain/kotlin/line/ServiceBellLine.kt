package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ServiceBellLine: ImageVector
    get() {
        if (_serviceBellLine != null) return _serviceBellLine!!
        _serviceBellLine = remixIcon(
            name = "ServiceBellLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 3.000 L 9.000 3.000 L 9.000 5.000 L 11.000 5.000 L 11.000 6.049 C 5.947 6.551 2.000 10.815 2.000 16.000 L 2.000 17.000 L 22.000 17.000 L 22.000 16.000 C 22.000 10.815 18.053 6.551 13.000 6.049 L 13.000 5.000 L 15.000 5.000 L 15.000 3.000 ZM 12.000 8.000 C 16.080 8.000 19.446 11.054 19.938 15.000 L 4.062 15.000 C 4.554 11.054 7.920 8.000 12.000 8.000 ZM 23.000 20.000 L 23.000 18.000 L 1.000 18.000 L 1.000 20.000 L 23.000 20.000 Z"),
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
        return _serviceBellLine!!
    }

private var _serviceBellLine: ImageVector? = null
