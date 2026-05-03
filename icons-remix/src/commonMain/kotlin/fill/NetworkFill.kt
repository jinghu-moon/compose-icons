package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NetworkFill: ImageVector
    get() {
        if (_networkFill != null) return _networkFill!!
        _networkFill = remixIcon(
            name = "NetworkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 3.000 C 14.552 3.000 15.000 3.448 15.000 4.000 L 15.000 8.000 C 15.000 8.552 14.552 9.000 14.000 9.000 L 13.000 9.000 L 13.000 11.000 L 21.000 11.000 L 21.000 13.000 L 18.000 13.000 L 18.000 15.000 L 19.000 15.000 C 19.552 15.000 20.000 15.448 20.000 16.000 L 20.000 20.000 C 20.000 20.552 19.552 21.000 19.000 21.000 L 15.000 21.000 C 14.448 21.000 14.000 20.552 14.000 20.000 L 14.000 16.000 C 14.000 15.448 14.448 15.000 15.000 15.000 L 16.000 15.000 L 16.000 13.000 L 8.000 13.000 L 8.000 15.000 L 9.000 15.000 C 9.552 15.000 10.000 15.448 10.000 16.000 L 10.000 20.000 C 10.000 20.552 9.552 21.000 9.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 16.000 L 4.005 15.898 C 4.056 15.393 4.482 15.000 5.000 15.000 L 6.000 15.000 L 6.000 13.000 L 3.000 13.000 L 3.000 11.000 L 11.000 11.000 L 11.000 9.000 L 10.000 9.000 C 9.448 9.000 9.000 8.552 9.000 8.000 L 9.000 4.000 C 9.000 3.448 9.448 3.000 10.000 3.000 L 14.000 3.000 Z"),
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
        return _networkFill!!
    }

private var _networkFill: ImageVector? = null
