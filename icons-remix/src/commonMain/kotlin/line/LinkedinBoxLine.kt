package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LinkedinBoxLine: ImageVector
    get() {
        if (_linkedinBoxLine != null) return _linkedinBoxLine!!
        _linkedinBoxLine = remixIcon(
            name = "LinkedinBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.001 3.000 L 20.001 3.000 C 20.553 3.000 21.001 3.448 21.001 4.000 L 21.001 20.000 C 21.001 20.552 20.553 21.000 20.001 21.000 L 4.001 21.000 C 3.449 21.000 3.001 20.552 3.001 20.000 L 3.001 4.000 C 3.001 3.448 3.449 3.000 4.001 3.000 ZM 5.001 5.000 L 5.001 19.000 L 19.001 19.000 L 19.001 5.000 L 5.001 5.000 ZM 7.501 9.000 C 6.673 9.000 6.001 8.328 6.001 7.500 C 6.001 6.672 6.673 6.000 7.501 6.000 C 8.329 6.000 9.001 6.672 9.001 7.500 C 9.001 8.328 8.329 9.000 7.501 9.000 ZM 6.501 10.000 L 8.501 10.000 L 8.501 17.500 L 6.501 17.500 L 6.501 10.000 ZM 12.001 10.429 C 12.585 9.865 13.267 9.500 14.001 9.500 C 16.072 9.500 17.501 11.179 17.501 13.250 L 17.501 17.500 L 15.501 17.500 L 15.501 13.250 C 15.501 12.283 14.717 11.500 13.751 11.500 C 12.785 11.500 12.001 12.283 12.001 13.250 L 12.001 17.500 L 10.001 17.500 L 10.001 10.000 L 12.001 10.000 L 12.001 10.429 Z"),
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
        return _linkedinBoxLine!!
    }

private var _linkedinBoxLine: ImageVector? = null
