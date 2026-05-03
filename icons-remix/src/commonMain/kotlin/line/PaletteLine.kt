package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PaletteLine: ImageVector
    get() {
        if (_paletteLine != null) return _paletteLine!!
        _paletteLine = remixIcon(
            name = "PaletteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.522 2.000 22.000 5.978 22.000 10.889 C 22.000 13.956 19.511 16.444 16.444 16.444 L 14.478 16.444 C 13.556 16.444 12.811 17.189 12.811 18.111 C 12.811 18.533 12.978 18.922 13.233 19.211 C 13.500 19.511 13.667 19.900 13.667 20.333 C 13.667 21.256 12.900 22.000 12.000 22.000 C 6.478 22.000 2.000 17.522 2.000 12.000 C 2.000 6.478 6.478 2.000 12.000 2.000 ZM 10.811 18.111 C 10.811 16.084 12.451 14.444 14.478 14.444 L 16.444 14.444 C 18.406 14.444 20.000 12.851 20.000 10.889 C 20.000 7.139 16.468 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.190 7.223 19.628 11.324 19.972 C 10.995 19.417 10.811 18.776 10.811 18.111 ZM 7.500 12.000 C 6.672 12.000 6.000 11.328 6.000 10.500 C 6.000 9.672 6.672 9.000 7.500 9.000 C 8.328 9.000 9.000 9.672 9.000 10.500 C 9.000 11.328 8.328 12.000 7.500 12.000 ZM 16.500 12.000 C 15.672 12.000 15.000 11.328 15.000 10.500 C 15.000 9.672 15.672 9.000 16.500 9.000 C 17.328 9.000 18.000 9.672 18.000 10.500 C 18.000 11.328 17.328 12.000 16.500 12.000 ZM 12.000 9.000 C 11.172 9.000 10.500 8.328 10.500 7.500 C 10.500 6.672 11.172 6.000 12.000 6.000 C 12.828 6.000 13.500 6.672 13.500 7.500 C 13.500 8.328 12.828 9.000 12.000 9.000 Z"),
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
        return _paletteLine!!
    }

private var _paletteLine: ImageVector? = null
