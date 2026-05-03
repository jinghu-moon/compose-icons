package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FacebookCircleLine: ImageVector
    get() {
        if (_facebookCircleLine != null) return _facebookCircleLine!!
        _facebookCircleLine = remixIcon(
            name = "FacebookCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.001 19.938 C 16.947 19.446 20.001 16.080 20.001 12.000 C 20.001 7.582 16.419 4.000 12.001 4.000 C 7.583 4.000 4.001 7.582 4.001 12.000 C 4.001 16.080 7.055 19.446 11.001 19.938 L 11.001 14.000 L 9.001 14.000 L 9.001 12.000 L 11.001 12.000 L 11.001 10.346 C 11.001 9.009 11.140 8.524 11.402 8.035 C 11.663 7.546 12.047 7.162 12.536 6.901 C 12.918 6.696 13.393 6.573 14.223 6.520 C 14.552 6.499 14.978 6.525 15.501 6.600 L 15.501 8.500 L 15.001 8.500 C 14.084 8.500 13.705 8.543 13.479 8.664 C 13.339 8.739 13.240 8.838 13.165 8.978 C 13.044 9.204 13.001 9.429 13.001 10.346 L 13.001 12.000 L 15.501 12.000 L 15.001 14.000 L 13.001 14.000 L 13.001 19.938 ZM 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 Z"),
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
        return _facebookCircleLine!!
    }

private var _facebookCircleLine: ImageVector? = null
