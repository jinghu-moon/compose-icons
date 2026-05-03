package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShareFill: ImageVector
    get() {
        if (_shareFill != null) return _shareFill!!
        _shareFill = remixIcon(
            name = "ShareFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.576 17.271 L 8.466 14.484 C 7.833 15.112 6.962 15.500 6.000 15.500 C 4.067 15.500 2.500 13.933 2.500 12.000 C 2.500 10.067 4.067 8.500 6.000 8.500 C 6.962 8.500 7.833 8.888 8.466 9.516 L 13.576 6.729 C 13.526 6.494 13.500 6.250 13.500 6.000 C 13.500 4.067 15.067 2.500 17.000 2.500 C 18.933 2.500 20.500 4.067 20.500 6.000 C 20.500 7.933 18.933 9.500 17.000 9.500 C 16.038 9.500 15.167 9.112 14.534 8.484 L 9.424 11.271 C 9.474 11.506 9.500 11.750 9.500 12.000 C 9.500 12.250 9.474 12.493 9.424 12.729 L 14.534 15.516 C 15.167 14.888 16.038 14.500 17.000 14.500 C 18.933 14.500 20.500 16.067 20.500 18.000 C 20.500 19.933 18.933 21.500 17.000 21.500 C 15.067 21.500 13.500 19.933 13.500 18.000 C 13.500 17.750 13.526 17.506 13.576 17.271 Z"),
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
        return _shareFill!!
    }

private var _shareFill: ImageVector? = null
