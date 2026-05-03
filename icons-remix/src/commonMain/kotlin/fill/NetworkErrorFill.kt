package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NetworkErrorFill: ImageVector
    get() {
        if (_networkErrorFill != null) return _networkErrorFill!!
        _networkErrorFill = remixIcon(
            name = "NetworkErrorFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.207 16.207 L 18.414 18.000 L 20.207 19.793 L 18.793 21.207 L 17.000 19.414 L 15.207 21.207 L 13.793 19.793 L 15.586 18.000 L 13.793 16.207 L 15.207 14.793 L 17.000 16.586 L 18.793 14.793 L 20.207 16.207 ZM 14.000 3.000 C 14.552 3.000 15.000 3.448 15.000 4.000 L 15.000 8.000 C 15.000 8.552 14.552 9.000 14.000 9.000 L 13.000 9.000 L 13.000 11.000 L 21.000 11.000 L 21.000 13.000 L 18.000 13.000 L 18.000 14.500 L 16.000 14.500 L 16.000 13.000 L 8.000 13.000 L 8.000 15.000 L 9.000 15.000 C 9.552 15.000 10.000 15.448 10.000 16.000 L 10.000 20.000 C 10.000 20.552 9.552 21.000 9.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 16.000 L 4.005 15.898 C 4.056 15.393 4.482 15.000 5.000 15.000 L 6.000 15.000 L 6.000 13.000 L 3.000 13.000 L 3.000 11.000 L 11.000 11.000 L 11.000 9.000 L 10.000 9.000 C 9.448 9.000 9.000 8.552 9.000 8.000 L 9.000 4.000 C 9.000 3.448 9.448 3.000 10.000 3.000 L 14.000 3.000 Z"),
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
        return _networkErrorFill!!
    }

private var _networkErrorFill: ImageVector? = null
