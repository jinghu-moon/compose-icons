package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HomeHeartLine: ImageVector
    get() {
        if (_homeHeartLine != null) return _homeHeartLine!!
        _homeHeartLine = remixIcon(
            name = "HomeHeartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 20.000 C 20.000 20.552 19.552 21.000 19.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 11.000 L 1.000 11.000 L 11.327 1.612 C 11.709 1.265 12.291 1.265 12.673 1.612 L 23.000 11.000 L 20.000 11.000 L 20.000 20.000 ZM 18.000 19.000 L 18.000 9.157 L 12.000 3.703 L 6.000 9.157 L 6.000 19.000 L 18.000 19.000 ZM 12.000 17.000 L 8.641 13.641 C 7.763 12.762 7.763 11.338 8.641 10.459 C 9.520 9.581 10.944 9.581 11.823 10.459 L 12.000 10.636 L 12.177 10.459 C 13.056 9.581 14.480 9.581 15.359 10.459 C 16.237 11.338 16.237 12.762 15.359 13.641 L 12.000 17.000 Z"),
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
        return _homeHeartLine!!
    }

private var _homeHeartLine: ImageVector? = null
