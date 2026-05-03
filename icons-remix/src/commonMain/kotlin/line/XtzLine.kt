package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.XtzLine: ImageVector
    get() {
        if (_xtzLine != null) return _xtzLine!!
        _xtzLine = remixIcon(
            name = "XtzLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 6.000 L 9.000 2.000 L 7.000 2.000 L 7.000 6.000 L 4.500 6.000 L 4.500 8.000 L 7.000 8.000 L 7.000 13.000 C 7.000 15.209 8.791 17.000 11.000 17.000 C 12.024 17.000 12.960 16.614 13.667 15.981 L 12.333 14.491 C 11.979 14.808 11.513 15.000 11.000 15.000 C 9.895 15.000 9.000 14.105 9.000 13.000 L 9.000 8.000 L 15.625 8.000 L 11.500 11.975 L 11.500 13.500 L 12.500 13.500 C 15.567 13.500 17.500 15.679 17.500 17.500 C 17.500 19.383 15.873 21.000 13.750 21.000 C 11.927 21.000 10.457 19.798 10.090 18.267 L 8.145 18.733 C 8.739 21.210 11.051 23.000 13.750 23.000 C 16.874 23.000 19.500 20.588 19.500 17.500 C 19.500 14.935 17.466 12.568 14.586 11.778 L 19.000 7.525 L 19.000 6.000 L 9.000 6.000 Z"),
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
        return _xtzLine!!
    }

private var _xtzLine: ImageVector? = null
