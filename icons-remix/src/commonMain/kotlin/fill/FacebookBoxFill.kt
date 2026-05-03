package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FacebookBoxFill: ImageVector
    get() {
        if (_facebookBoxFill != null) return _facebookBoxFill!!
        _facebookBoxFill = remixIcon(
            name = "FacebookBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.402 21.000 L 15.402 14.034 L 17.735 14.034 L 18.084 11.326 L 15.402 11.326 L 15.402 9.598 C 15.402 8.814 15.620 8.279 16.744 8.279 L 18.178 8.279 L 18.178 5.857 C 17.930 5.824 17.079 5.750 16.089 5.750 C 14.021 5.750 12.606 7.012 12.606 9.330 L 12.606 11.326 L 10.268 11.326 L 10.268 14.034 L 12.606 14.034 L 12.606 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 15.402 21.000 Z"),
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
        return _facebookBoxFill!!
    }

private var _facebookBoxFill: ImageVector? = null
