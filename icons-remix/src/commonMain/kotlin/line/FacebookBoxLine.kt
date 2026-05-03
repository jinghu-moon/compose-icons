package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FacebookBoxLine: ImageVector
    get() {
        if (_facebookBoxLine != null) return _facebookBoxLine!!
        _facebookBoxLine = remixIcon(
            name = "FacebookBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 19.000 L 19.000 19.000 L 19.000 5.000 L 5.000 5.000 L 5.000 19.000 L 12.000 19.000 L 12.000 14.000 L 10.000 14.000 L 10.000 12.000 L 12.000 12.000 L 12.000 10.346 C 12.000 9.009 12.139 8.524 12.401 8.035 C 12.662 7.546 13.046 7.162 13.535 6.901 C 13.917 6.696 14.392 6.573 15.222 6.520 C 15.551 6.499 15.977 6.525 16.500 6.600 L 16.500 8.500 L 16.000 8.500 C 15.083 8.500 14.704 8.543 14.478 8.664 C 14.338 8.739 14.239 8.838 14.164 8.978 C 14.043 9.204 14.000 9.429 14.000 10.346 L 14.000 12.000 L 16.500 12.000 L 16.000 14.000 L 14.000 14.000 L 14.000 19.000 ZM 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 Z"),
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
        return _facebookBoxLine!!
    }

private var _facebookBoxLine: ImageVector? = null
