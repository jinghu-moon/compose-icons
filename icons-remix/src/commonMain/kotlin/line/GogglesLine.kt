package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GogglesLine: ImageVector
    get() {
        if (_gogglesLine != null) return _gogglesLine!!
        _gogglesLine = remixIcon(
            name = "GogglesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.718 10.147 C 3.285 10.701 3.000 11.446 3.000 12.500 C 3.000 13.515 3.371 14.552 3.964 15.322 C 4.560 16.095 5.294 16.500 6.000 16.500 C 6.762 16.500 7.514 16.066 8.538 15.408 C 9.587 14.735 10.706 14.000 12.000 14.000 C 13.294 14.000 14.413 14.735 15.462 15.408 C 16.486 16.066 17.238 16.500 18.000 16.500 C 18.706 16.500 19.440 16.095 20.036 15.322 C 20.629 14.552 21.000 13.515 21.000 12.500 C 21.000 11.446 20.715 10.701 20.282 10.147 C 19.839 9.580 19.183 9.139 18.326 8.808 C 16.581 8.132 14.251 8.000 12.000 8.000 C 9.749 8.000 7.419 8.132 5.673 8.808 C 4.817 9.139 4.161 9.580 3.718 10.147 ZM 4.952 6.942 C 7.081 6.118 9.751 6.000 12.000 6.000 C 14.249 6.000 16.919 6.118 19.049 6.942 C 20.130 7.361 21.129 7.983 21.858 8.916 C 22.597 9.862 23.000 11.054 23.000 12.500 C 23.000 13.970 22.475 15.433 21.621 16.542 C 20.769 17.647 19.503 18.500 18.000 18.500 C 16.575 18.500 15.344 17.709 14.425 17.120 C 13.719 16.667 12.883 16.000 12.000 16.000 C 11.117 16.000 10.280 16.667 9.575 17.120 C 8.656 17.709 7.425 18.500 6.000 18.500 C 4.497 18.500 3.231 17.647 2.379 16.542 C 1.525 15.433 1.000 13.970 1.000 12.500 C 1.000 11.054 1.402 9.862 2.142 8.916 C 2.871 7.983 3.870 7.361 4.952 6.942 Z"),
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
        return _gogglesLine!!
    }

private var _gogglesLine: ImageVector? = null
